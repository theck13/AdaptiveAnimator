package com.heckofanapp.adaptiveanimator

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

private const val SCALE_DEFAULT = 1.50f
private const val SCALE_PRESSED = 1.20f

private val SIZE_FULL = 240.dp

private enum class Clip(
    val bottomEnd: Dp,
    val bottomStart: Dp,
    val topEnd: Dp,
    val topStart: Dp,
) {
    Circle(
        bottomEnd = SIZE_FULL / 2,
        bottomStart = SIZE_FULL / 2,
        topEnd = SIZE_FULL / 2,
        topStart = SIZE_FULL / 2,
    ),
    Squircle(
        bottomEnd = SIZE_FULL / 2.5f,
        bottomStart = SIZE_FULL / 2.5f,
        topEnd = SIZE_FULL / 2.5f,
        topStart = SIZE_FULL / 2.5f,
    ),
    Rounded(
        bottomEnd = SIZE_FULL / 10,
        bottomStart = SIZE_FULL / 10,
        topEnd = SIZE_FULL / 10,
        topStart = SIZE_FULL / 10,
    ),
    Square(
        bottomEnd = SIZE_FULL / 60,
        bottomStart = SIZE_FULL / 60,
        topEnd = SIZE_FULL / 60,
        topStart = SIZE_FULL / 60,
    ),
    TeardropEnd(
        bottomEnd = SIZE_FULL / 10,
        bottomStart = SIZE_FULL / 2,
        topEnd = SIZE_FULL / 2,
        topStart = SIZE_FULL / 2,
    ),
    TeardropStart(
        bottomEnd = SIZE_FULL / 2,
        bottomStart = SIZE_FULL / 10,
        topEnd = SIZE_FULL / 2,
        topStart = SIZE_FULL / 2,
    ),
}

class Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        // Set navigation bar transparent.
        if (Build.VERSION.SDK_INT >= 29) {
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            val background = colorResource(R.color.background)

            MaterialTheme(
                colorScheme =
                    if (isSystemInDarkTheme()) {
                        darkColorScheme(
                            background = background,
                        )
                    } else {
                        lightColorScheme(
                            background = background,
                        )
                    },
            ) {
                Scaffold { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(
                                paddingValues = innerPadding,
                            ),
                        contentAlignment = Alignment.Center,
                    ) {
                        Images()
                    }
                }
            }
        }
    }

    @Composable
    private fun Images() {
        var isDragging by remember { mutableStateOf(false) }
        var offsetX by remember { mutableFloatStateOf(0f) }
        var offsetY by remember { mutableFloatStateOf(0f) }
        var selectedClip by rememberSaveable { mutableStateOf(Clip.Circle) }

        val animationStiffnessHigh: AnimationSpec<Float> = spring(
            dampingRatio = Spring.DampingRatioNoBouncy,
            stiffness = Spring.StiffnessHigh,
        )
        val animationStiffnessMedium: AnimationSpec<Float> = spring(
            dampingRatio = Spring.DampingRatioNoBouncy,
            stiffness = Spring.StiffnessMedium,
        )
        val animationStiffnessMediumLow: AnimationSpec<Float> = spring(
            dampingRatio = Spring.DampingRatioNoBouncy,
            stiffness = Spring.StiffnessMediumLow,
        )
        val interactionSource = remember { MutableInteractionSource() }
        val isPressed by interactionSource.collectIsPressedAsState()
        val offsetXStateBackground = animateFloatAsState(
            animationSpec = if (isDragging) animationStiffnessHigh else animationStiffnessMediumLow,
            targetValue = offsetX,
        )
        val offsetXStateForeground = animateFloatAsState(
            animationSpec = if (isDragging) animationStiffnessMedium else animationStiffnessMediumLow,
            targetValue = offsetX,
        )
        val offsetYStateBackground = animateFloatAsState(
            animationSpec = if (isDragging) animationStiffnessHigh else animationStiffnessMediumLow,
            targetValue = offsetY,
        )
        val offsetYStateForeground = animateFloatAsState(
            animationSpec = if (isDragging) animationStiffnessMedium else animationStiffnessMediumLow,
            targetValue = offsetY,
        )
        val scaleBackground = animateFloatAsState(
            targetValue = if (isPressed) 1.75f else SCALE_DEFAULT,
        )
        val scaleForeground = animateFloatAsState(
            targetValue = if (isPressed) 1.60f else SCALE_DEFAULT,
        )
        val scalePressed = animateFloatAsState(
            targetValue = if (isPressed) SCALE_PRESSED else 1.00f,
        )
        val shape = RoundedCornerShape(
            bottomEnd = animateDpAsState(
                targetValue = selectedClip.bottomEnd,
            ).value,
            bottomStart = animateDpAsState(
                targetValue = selectedClip.bottomStart,
            ).value,
            topEnd = animateDpAsState(
                targetValue = selectedClip.topEnd,
            ).value,
            topStart = animateDpAsState(
                targetValue = selectedClip.topStart,
            ).value,
        )

        Box(
            modifier = Modifier
                .combinedClickable(
                    indication = null,
                    interactionSource = interactionSource,
                    onClick = {
                    },
                    onDoubleClick = {
                        selectedClip = Clip.entries[(selectedClip.ordinal + 1) % Clip.entries.size]
                    },
                )
                .offset {
                    IntOffset(
                        x = offsetXStateBackground.value.roundToInt(),
                        y = offsetYStateBackground.value.roundToInt(),
                    )
                }
                .pointerInput(Unit) {
                    detectDragGestures(
                        onDragStart = {
                            if (isPressed) {
                                isDragging = true
                            }
                        },
                        onDragEnd = {
                            isDragging = false
                            offsetX = 0f
                            offsetY = 0f
                        },
                    ) { change, dragAmount ->
                        change.consume()

                        if (isDragging) {
                            offsetX += dragAmount.x
                            offsetY += dragAmount.y
                        }
                    }
                }
                .scale(
                    scale = scalePressed.value,
                )
                .clip(
                    shape = shape,
                )
                .size(
                    size = SIZE_FULL,
                ),
        ) {
            Image(
                modifier = Modifier
                    .background(
                        color = if (isSystemInDarkTheme()) Color.Black else Color.White
                    )
                    .scale(
                        scale = scaleBackground.value,
                    )
                    .size(
                        size = SIZE_FULL,
                    ),
                contentDescription = stringResource(R.string.description_background),
                imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_background),
            )

            Image(
                modifier = Modifier
                    .offset {
                        IntOffset(
                            x = offsetXStateForeground.value.roundToInt() - offsetXStateBackground.value.roundToInt(),
                            y = offsetYStateForeground.value.roundToInt() - offsetYStateBackground.value.roundToInt(),
                        )
                    }
                    .scale(
                        scale = scaleForeground.value,
                    )
                    .size(
                        size = SIZE_FULL,
                    ),
                contentDescription = stringResource(R.string.description_foreground),
                imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_foreground),
            )
        }
    }
}
