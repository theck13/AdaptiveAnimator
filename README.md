# Adaptive Animator

An application to illustrate the animation behavior of adaptive icons.

## Application

The app cycles through six shapes when the icon is double-tapped and demonstrates the parallax effect between foreground and background layers when the icon is dragged.  See the screenshots and video below for illustration.

<details>
<summary>
    <h3>Screenshots</h3>
</summary>
<table>
    <tr>
        <th
            width="16%">
            Circle
        </th>
        <th
            width="16%">
            Squircle
        </th>
        <th
            width="16%">
            Corners Rounded
        </th>
        <th
            width="16%">
            Corners Squared
        </th>
        <th
            width="16%">
            Teardrop End
        </th>
        <th
            width="16%">
            Teardrop Start
        </th>
    </tr>
    <tr>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Circle Shape"
                src="https://github.com/user-attachments/assets/f951a626-7ee0-4e9b-a2c1-f289440575cd"
                height="2424"
                width="1080"
            />
        </td>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Squircle Shape"
                src="https://github.com/user-attachments/assets/1a92f099-0dc2-4399-882f-30d16adfa3ad"
                height="2424"
                width="1080"
            />
        </td>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Corners Rounded Shape"
                src="https://github.com/user-attachments/assets/05c2a52d-fc38-4218-af19-630a162b170f"
                height="2424"
                width="1080"
            />
        </td>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Corners Squared Shape"
                src="https://github.com/user-attachments/assets/8f9b82b5-dcaf-442b-ad1a-e4c119f43fb5"
                height="2424"
                width="1080"
            />
        </td>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Teardrop End Shape"
                src="https://github.com/user-attachments/assets/5ab84c02-2e42-42d5-9355-1c1c64a94ecd"
                height="2424"
                width="1080"
            />
        </td>
        <td>
            <img
                alt="Screenshot of Device with Alpenglow Wallpaper and App Icon with Teardrop Start Shape"
                src="https://github.com/user-attachments/assets/c6ed11e2-f51c-45ea-8028-4d230e6f11ba"
                height="2424"
                width="1080"
            />
        </td>
    </tr>
</table>
</details>

<details>
<summary>
    <h3>Video</h3>
</summary>
    <video
        alt="Video of Device with Alpenglow Wallpaper and App Icon Changing Shapes"
        src="https://github.com/user-attachments/assets/307f3dae-8e44-4bd8-9e0c-66c87a7e38db"
        style="width:33%;"
    />
</details>

Follow the steps below to test adaptive icon animations with the Adaptive Animator app.

### Debug

1. Clone repository with [HTTPS](https://github.com/theck13/AdaptiveAnimator.git) or [SSH](git@github.com:theck13/AdaptiveAnimator.git).
2. Open repository with [Android Studio Otter | 2025.2.1 Patch 1](https://developer.android.com/studio/archive).
3. Connect device or emulator.
4. Run `app` configuration.

### Release

1. Go to [all](https://github.com/theck13/AdaptiveAnimator/releases) or [latest](https://github.com/theck13/AdaptiveAnimator/releases/latest) release page.
2. Download `com.heckofanapp.adaptiveanimator.apk` file.
3. Install app on device or emulator.
4. Open app from launcher.

## Alteration

To test another adaptive launcher icon, edit the [`app/src/main/res/drawable/ic_launcher_background.xml`](app/src/main/res/drawable/ic_launcher_background.xml) and/or [`app/src/main/res/drawable/ic_launcher_foreground.xml`](app/src/main/res/drawable/ic_launcher_foreground.xml) file(s).  Then, follow the steps in the [***Debug*** section](#debug) above to run the updated app on a device or emulator.  Use the files below to try out some  and see how adaptive icons can add delightful animations to an app.

<details>
<summary>
    <h3>Automattic</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ff010101"
        android:pathData="M59.0426,46.2195c1.3935,0.8882,1.8032,2.7378,0.915,4.1313c-0.0158,0.0248-0.032,0.0494-0.0485,0.0738l-7.0238,10.8823c-0.888,1.3936-2.7375,1.8035-4.1312,0.9156c-0.0015-0.001-0.003-0.002-0.0046-0.0029l0,0c-1.3862-0.9092-1.7784-2.7669-0.878-4.1588l7.0238-10.8823c0.8973-1.3928,2.7529-1.796,4.1473-0.9011V46.2195z">
    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ffffffff"
        android:pathData="M0,0L0,108L108,108L108,0L0,0Z">
    </path>

    <path
        android:fillColor="#ff3499cd"
        android:pathData="M53.9596,76.0592C39.4267,76.0592,30,65.5812,30,54.6758v-1.3516c0-11.0903,9.4267-21.3834,23.9596-21.3834S78,42.2339,78,53.3242v1.3516C78,65.5812,68.5733,76.0592,53.9596,76.0592z M70.2253,53.4397c0-7.948-5.7762-15.018-16.2657-15.018s-16.1733,7.0816-16.1733,15.018v0.9935c0,7.948,5.7762,15.1567,16.1733,15.1567s16.2657-7.2087,16.2657-15.1567V53.4397L70.2253,53.4397z">
    </path>

</vector>
```

</details>

<details>
<summary>
    <h3>Block</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ff000000"
        android:pathData="M32.1819,30.0001h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273C30.9769,43.091,30,42.1142,30,40.9092v-8.7273C30,30.9769,30.9769,30.0001,32.1819,30.0001z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M49.6364,30.0001h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,30.9769,48.4314,30.0001,49.6364,30.0001z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M67.0909,30.0001h8.7273c1.205,0,2.1818,0.9769,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7272c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C64.9091,30.9769,65.8859,30.0001,67.0909,30.0001z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M32.1819,47.4545h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C30,48.4314,30.9769,47.4545,32.1819,47.4545z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M49.6364,47.4545h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,48.4314,48.4314,47.4545,49.6364,47.4545z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M67.0909,47.4545h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C64.9091,48.4314,65.8859,47.4545,67.0909,47.4545z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M32.1819,64.9091h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273C30.9769,78,30,77.0232,30,75.8182v-8.7272C30,65.8859,30.9769,64.9091,32.1819,64.9091z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M49.6364,64.9091h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,65.8859,48.4314,64.9091,49.6364,64.9091z">
    </path>

    <path
        android:fillColor="#ff000000"
        android:pathData="M67.0909,64.9091h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273C78,77.0232,77.0232,78,75.8182,78h-8.7272c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7272C64.9091,65.8859,65.8859,64.9091,67.0909,64.9091z">
    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ffffffff"
        android:pathData="M0,0L0,108L108,108L108,0L0,0Z">
    </path>

    <path
        android:fillColor="#fff44336"
        android:pathData="M32.1819,30.0001h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273C30.9769,43.091,30,42.1142,30,40.9092v-8.7273C30,30.9769,30.9769,30.0001,32.1819,30.0001z">
    </path>

    <path
        android:fillColor="#ffff5722"
        android:pathData="M49.6364,30.0001h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,30.9769,48.4314,30.0001,49.6364,30.0001z">
    </path>

    <path
        android:fillColor="#ffff9800"
        android:pathData="M67.0909,30.0001h8.7273c1.205,0,2.1818,0.9769,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7272c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C64.9091,30.9769,65.8859,30.0001,67.0909,30.0001z">
    </path>

    <path
        android:fillColor="#ffffeb3b"
        android:pathData="M32.1819,47.4545h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C30,48.4314,30.9769,47.4545,32.1819,47.4545z">
    </path>

    <path
        android:fillColor="#ff4caf50"
        android:pathData="M49.6364,47.4545h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,48.4314,48.4314,47.4545,49.6364,47.4545z">
    </path>

    <path
        android:fillColor="#ff2196f3"
        android:pathData="M67.0909,47.4545h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.205-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7273C64.9091,48.4314,65.8859,47.4545,67.0909,47.4545z">
    </path>

    <path
        android:fillColor="#ff3f51b5"
        android:pathData="M32.1819,64.9091h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273C30.9769,78,30,77.0232,30,75.8182v-8.7272C30,65.8859,30.9769,64.9091,32.1819,64.9091z">
    </path>

    <path
        android:fillColor="#ff673ab7"
        android:pathData="M49.6364,64.9091h8.7273c1.205,0,2.1818,0.9768,2.1818,2.1818v8.7273c0,1.2049-0.9768,2.1818-2.1818,2.1818h-8.7273c-1.205,0-2.1818-0.9768-2.1818-2.1818v-8.7273C47.4545,65.8859,48.4314,64.9091,49.6364,64.9091z">
    </path>

    <path
        android:fillColor="#ff9c27b0"
        android:pathData="M67.0909,64.9091h8.7273c1.2049,0,2.1818,0.9768,2.1818,2.1818v8.7273C78,77.0232,77.0232,78,75.8182,78h-8.7272c-1.2049,0-2.1818-0.9768-2.1818-2.1818v-8.7272C64.9091,65.8859,65.8859,64.9091,67.0909,64.9091z">
    </path>

</vector>
```

</details>

<details>
<summary>
    <h3>DuckDuckGo</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ff3ca82b"
        android:pathData="M65.4083,69.0174c-0.7689-0.3562-3.7249,1.7637-5.6868,3.3909c-0.41-0.58-1.1829-1.0015-2.9271-0.699c-1.5257,0.2662-2.3686,0.6338-2.745,1.2683c-2.4089-0.9134-6.4618-2.3229-7.4404-0.9612c-1.0707,1.4881,0.2668,8.5273,1.6884,9.4414c0.742,0.4772,4.2922-1.8047,6.1459-3.3781c0.2991,0.4214,0.781,0.6627,1.7704,0.6399c1.4975-0.035,3.9259-0.3831,4.3023-1.0808c0.0229-0.0423,0.043-0.0921,0.0598-0.1492c1.9055,0.7125,5.2587,1.4652,6.0081,1.3537C68.5364,78.5496,66.3116,69.4361,65.4083,69.0174z">
    </path>

    <path
        android:fillColor="#ff4cba3c"
        android:pathData="M59.9009,72.6174c0.0813,0.1438,0.1459,0.2957,0.2016,0.4503c0.2715,0.7595,0.7138,3.1765,0.3791,3.7734c-0.3347,0.5968-2.5084,0.8852-3.8493,0.908s-1.6427-0.4671-1.9142-1.2266c-0.2178-0.6076-0.3246-2.0366-0.3219-2.8545c-0.0551-1.2139,0.3885-1.64,2.4378-1.972c1.517-0.2453,2.3188,0.0403,2.7812,0.5283c2.1535-1.6064,5.746-3.8748,6.0962-3.4601c1.7475,2.0668,1.968,6.9861,1.5896,8.9662c-0.1237,0.6466-5.9086-0.6419-5.9086-1.3396c0-2.8976-0.7521-3.6927-1.4914-3.774L59.9009,72.6174z M47.228,71.712c0.4745-0.7501,4.3164,0.1828,6.4255,1.1211c0,0-0.4328,1.964,0.2568,4.2774c0.2016,0.6768-4.8527,3.6887-5.5121,3.1704c-0.7622-0.5989-2.1656-6.9929-1.1695-8.5697L47.228,71.712z">
    </path>

    <path
        android:fillColor="#ffffcc33"
        android:pathData="M49.0898,56.4788c0.3105-1.3523,1.759-3.8997,6.9296-3.8379c2.6146-0.0108,5.8623-0.0007,8.0158-0.2453c2.4507-0.2717,4.8564-0.8568,7.1581-1.7408c2.2388-0.8536,3.0333-0.6641,3.3116-0.1526c0.3065,0.5612-0.0544,1.5311-0.8368,2.4237c-1.4941,1.7045-4.1799,3.0259-8.9238,3.4178c-4.7439,0.3918-7.8867-0.8805-9.239,1.191c-0.5834,0.8939-0.1324,2.9997,4.4548,3.6631c6.199,0.8939,11.2903-1.0781,11.9195,0.1129c0.6291,1.191-2.9943,3.6161-9.2034,3.6665c-6.2098,0.0511-10.0879-2.1737-11.4631-3.28c-1.7455-1.4027-2.5258-3.4494-2.1239-5.2184L49.0898,56.4788L49.0898,56.4788z">
    </path>

    <path
        android:fillColor="#ff14307e"
        android:pathData="M56.9967,41.6966c0.3468-0.5673,1.1144-1.0048,2.3713-1.0048s1.8483,0.5001,2.2577,1.0573c0.0834,0.1143-0.043,0.2473-0.1721,0.1916l-0.0941-0.041c-0.4597-0.201-1.0243-0.4476-1.9915-0.4611c-1.0337-0.0148-1.6857,0.244-2.097,0.4671C57.1331,41.9809,56.9147,41.8311,56.9967,41.6966z M42.8464,42.4219c1.2206-0.5101,2.1797-0.4436,2.8579-0.2836c0.1432,0.0336,0.242-0.1196,0.1277-0.2117c-0.5263-0.4248-1.7038-0.9517-3.2403-0.3791c-1.3705,0.5108-2.0164,1.5728-2.0204,2.2711c-0.0007,0.1647,0.3381,0.1781,0.4255,0.039C41.2333,43.4812,41.6265,42.932,42.8464,42.4219z">
    </path>

    <path
        android:fillColor="#ff14307e"
        android:pathData="M60.4359,49.4551c-1.0794,0-1.9545-0.8731-1.9545-1.9472s0.8751-1.9472,1.9545-1.9472c1.0788,0,1.9539,0.8731,1.9539,1.9472S61.5147,49.4551,60.4359,49.4551z M61.8118,46.8626c0-0.2793-0.2264-0.5058-0.5058-0.5058c-0.2793,0-0.5058,0.2264-0.5058,0.5058l0,0c0,0.2793,0.2264,0.5058,0.5058,0.5058C61.5853,47.3684,61.8118,47.142,61.8118,46.8626z M47.4888,48.8555c-0.0019,1.2558-1.0214,2.2723-2.2772,2.2705c-0.0002,0-0.0005,0-0.0007,0c-1.2569,0-2.2778-1.0169-2.2778-2.2705c0-1.2535,1.0216-2.2711,2.2778-2.2711C46.467,46.5829,47.4866,47.5995,47.4888,48.8555z M46.8173,48.1027c-0.011-0.3257-0.284-0.5809-0.6097-0.5699c-0.3103,0.0105-0.5593,0.2596-0.5699,0.5699c0,0.3257,0.2641,0.5898,0.5898,0.5898C46.5533,48.6925,46.8173,48.4285,46.8173,48.1027z">
    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ffde5833"
        android:pathData="M0,0L0,108L108,108L108,0L0,0Z">
    </path>

    <path
        android:fillColor="#ffdddddd"
        android:pathData="M59.0628,80.859c0-0.281,0.0692-0.3448-0.8247-2.1273c-2.376-4.758-4.764-11.4659-3.6779-15.7917c0.1976-0.7864-2.2382-29.106-3.9602-30.018c-1.9142-1.0203-4.2687-2.6381-6.4228-2.9977c-1.0929-0.1748-2.5259-0.0928-3.6463,0.0585c-0.1989,0.0269-0.207,0.3845-0.0168,0.449c0.7353,0.2487,1.6286,0.6815,2.1548,1.3362c0.0995,0.1237-0.0343,0.3186-0.1929,0.324c-0.496,0.0188-1.396,0.2265-2.5836,1.2354c-0.1371,0.1163-0.0235,0.3327,0.1532,0.2978c2.552-0.5041,5.1579-0.2554,6.6944,1.1399c0.0995,0.0907,0.0471,0.2534-0.0827,0.289c-13.3289,3.6208-10.6895,15.215-7.1413,29.442c3.1281,12.546,4.3251,16.6756,4.7129,17.964c0.0413,0.1434,0.1465,0.2597,0.285,0.3152c4.604,1.8127,14.5488,1.8853,14.5488-1.2132L59.0628,80.859z">
    </path>

    <path
        android:fillColor="#ffffffff"
        android:pathData="M60.8909,83.5314c-1.6171,0.6325-4.7815,0.9141-6.609,0.9141c-2.6804,0-6.5398-0.4221-7.9452-1.0553c-0.8691-2.6724-3.4682-10.9577-6.0343-21.4786l-0.2514-1.0284l-0.002-0.0081c-3.0514-12.4627-5.5437-22.6421,8.1152-25.8401c0.1243-0.0289,0.1855-0.1781,0.1028-0.2762c-1.5667-1.8591-4.5032-2.4687-8.2147-1.1883c-0.1526,0.0531-0.285-0.1008-0.1902-0.2312c0.7279-1.0035,2.1508-1.7744,2.8525-2.1132c0.1452-0.0699,0.1364-0.2823-0.0168-0.33c-0.6945-0.2178-1.4032-0.3869-2.1212-0.5061c-0.2083-0.0336-0.2272-0.3898-0.0181-0.4187c5.2627-0.7078,10.758,0.8724,13.5157,4.346c0.0263,0.0329,0.0631,0.0556,0.1042,0.0645c10.098,2.1683,10.8212,18.1321,9.6578,18.8593c-0.2292,0.1432-0.9638,0.0605-1.9337-0.0471c-3.9292-0.4402-11.7098-1.3107-5.2883,10.6573c0.0632,0.1183-0.0202,0.2749-0.1532,0.2957C52.8396,64.7097,57.4806,76.0566,60.8909,83.5314L60.8909,83.5314z">
    </path>

    <path
        android:fillColor="#ffffffff"
        android:fillType="evenOdd"
        android:pathData="M54.0003,84.2345c16.6976,0,30.2342-13.5367,30.2342-30.2345S70.6979,23.7655,54.0003,23.7655S23.7662,37.3022,23.7662,54S37.3027,84.2345,54.0003,84.2345z M54.0003,87.0467c18.2509,0,33.0464-14.7956,33.0464-33.0467S72.2512,20.9533,54.0003,20.9533S20.9547,35.749,20.9547,53.9993S35.7501,87.046,54.001,87.046L54.0003,87.0467z">
    </path>

</vector>
```

</details>

<details>
<summary>
    <h3>Reddit</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:aapt="http://schemas.android.com/aapt"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:pathData="M61.12,59.16c0.14,3.03 2.16,4.13 4.52,4.13c2.36,0 4.15,-1.64 4.01,-4.67C69.51,55.59 67.49,53.61 65.13,53.61c-2.36,0 -4.15,2.53 -4.01,5.55V59.16z">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="65.19"
                android:centerY="60.5"
                android:gradientRadius="4.580"
                android:type="radial">

                <item
                    android:color="#ffff6600"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#ffff4500"
                    android:offset="0.50">
                </item>

                <item
                    android:color="#fffc4301"
                    android:offset="0.70">
                </item>

                <item
                    android:color="#fff43f07"
                    android:offset="0.82">
                </item>

                <item
                    android:color="#ffe53812"
                    android:offset="0.92">
                </item>

                <item
                    android:color="#ffd4301f"
                    android:offset="1.00">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:fillColor="#ffffc49c"
        android:pathData="M65.8,56.79a0.93,1.02 0,1 0,1.87 0a0.93,1.02 0,1 0,-1.87 0z">
    </path>

    <path
        android:pathData="M46.93,59.16c-0.14,3.03 -2.16,4.13 -4.52,4.13s-4.15,-1.64 -4.01,-4.67c0.14,-3.03 2.16,-5.01 4.52,-5.01s4.15,2.53 4.01,5.55V59.16z">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="42.88"
                android:centerY="60.5"
                android:gradientRadius="4.580"
                android:type="radial">

                <item
                    android:color="#ffff6600"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#ffff4500"
                    android:offset="0.50">
                </item>

                <item
                    android:color="#fffc4301"
                    android:offset="0.70">
                </item>

                <item
                    android:color="#fff43f07"
                    android:offset="0.82">
                </item>

                <item
                    android:color="#ffe53812"
                    android:offset="0.92">
                </item>

                <item
                    android:color="#ffd4301f"
                    android:offset="1.00">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:fillColor="#ffffc49c"
        android:pathData="M43.61,56.79a0.93,1.02 0,1 0,1.87 0a0.93,1.02 0,1 0,-1.87 0z">
    </path>

    <path
        android:fillColor="#ff842123"
        android:pathData="M38.94,58.88c0.13,-2.85 2.03,-4.72 4.23,-4.72c2.09,0 3.7,2.13 3.76,4.78c0.06,-2.96 -1.71,-5.33 -4.02,-5.33c-2.31,0 -4.38,2.02 -4.52,5.07s1.66,4.61 4.01,4.61H42.58c-2.15,-0.05 -3.77,-1.6 -3.64,-4.4L38.94,58.88zM69.1,58.88c-0.13,-2.85 -2.03,-4.72 -4.23,-4.72c-2.09,0 -3.7,2.13 -3.76,4.78c-0.06,-2.96 1.71,-5.33 4.02,-5.33c2.36,0 4.38,2.02 4.52,5.07s-1.66,4.61 -4.01,4.61H65.46c2.15,-0.05 3.77,-1.6 3.64,-4.4L69.1,58.88z">
    </path>

    <path
        android:pathData="M54.02,65.64c-2.92,0 -5.72,0.14 -8.31,0.41C45.27,66.09 44.99,66.55 45.16,66.96c1.45,3.46 4.87,5.9 8.86,5.9s7.41,-2.43 8.86,-5.9c0.17,-0.41 -0.11,-0.87 -0.55,-0.91C59.74,65.78 56.94,65.64 54.02,65.64L54.02,65.64z">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="53.98"
                android:centerY="73.86"
                android:gradientRadius="15.100"
                android:type="radial">

                <item
                    android:color="#ff172e35"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#ff0e1c21"
                    android:offset="0.29">
                </item>

                <item
                    android:color="#ff030708"
                    android:offset="0.73">
                </item>

                <item
                    android:color="#ff000000"
                    android:offset="1.00">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:pathData="M67.16,34.48m-5.96,0a5.96,5.96 0,1 1,11.91 0a5.96,5.96 0,1 1,-11.91 0">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="67.29"
                android:centerY="28.94"
                android:gradientRadius="13.26"
                android:type="radial">

                <item
                    android:color="#fffeffff"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#fffeffff"
                    android:offset="0.40">
                </item>

                <item
                    android:color="#fff9fcfc"
                    android:offset="0.51">
                </item>

                <item
                    android:color="#ffedf3f5"
                    android:offset="0.62">
                </item>

                <item
                    android:color="#ffdee9ec"
                    android:offset="0.7">
                </item>

                <item
                    android:color="#ffd8e4e8"
                    android:offset="0.72">
                </item>

                <item
                    android:color="#ffccd8df"
                    android:offset="0.76">
                </item>

                <item
                    android:color="#ffc8d5dd"
                    android:offset="0.80">
                </item>

                <item
                    android:color="#ffccd6de"
                    android:offset="0.83">
                </item>

                <item
                    android:color="#ffd8dbe2"
                    android:offset="0.85">
                </item>

                <item
                    android:color="#ffede3e9"
                    android:offset="0.88">
                </item>

                <item
                    android:color="#ffffebef"
                    android:offset="0.90">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:pathData="M53.93,43.64c-0.71,0 -1.29,-0.3 -1.29,-0.76c0,-5.34 4.34,-9.68 9.68,-9.68c0.71,0 1.29,0.58 1.29,1.29s-0.58,1.29 -1.29,1.29c-3.91,0 -7.1,3.18 -7.1,7.1c0,0.46 -0.58,0.76 -1.29,0.76L53.93,43.64z">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="61.77"
                android:centerY="42.36"
                android:gradientRadius="10.870"
                android:type="radial">

                <item
                    android:color="#ff7a9299"
                    android:offset="0.48">
                </item>

                <item
                    android:color="#ff172e35"
                    android:offset="0.67">
                </item>

                <item
                    android:color="#ff000000"
                    android:offset="0.75">
                </item>

                <item
                    android:color="#ff172e35"
                    android:offset="0.82">
                </item>

            </gradient>

        </aapt:attr>

    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:aapt="http://schemas.android.com/aapt"
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ffff4500"
        android:pathData="M0,0v108h108V0H0z">
    </path>

    <path
        android:pathData="M74.41,53.66m-8.41,0a8.41,8.41 0,1 1,16.81 0a8.41,8.41 0,1 1,-16.81 0">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="74.58"
                android:centerY="48.62"
                android:gradientRadius="16.990"
                android:type="radial">

                <item
                    android:color="#fffeffff"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#fffeffff"
                    android:offset="0.40">
                </item>

                <item
                    android:color="#fff9fcfc"
                    android:offset="0.51">
                </item>

                <item
                    android:color="#ffedf3f5"
                    android:offset="0.62">
                </item>

                <item
                    android:color="#ffdee9ec"
                    android:offset="0.70">
                </item>

                <item
                    android:color="#ffd8e4e8"
                    android:offset="0.72">
                </item>

                <item
                    android:color="#ffccd8df"
                    android:offset="0.76">
                </item>

                <item
                    android:color="#ffc8d5dd"
                    android:offset="0.80">
                </item>

                <item
                    android:color="#ffccd6de"
                    android:offset="0.83">
                </item>

                <item
                    android:color="#ffd8dbe2"
                    android:offset="0.85">
                </item>

                <item
                    android:color="#ffede3e9"
                    android:offset="0.88">
                </item>

                <item
                    android:color="#ffffebef"
                    android:offset="0.90">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:pathData="M33.59,53.66m-8.41,0a8.41,8.41 0,1 1,16.81 0a8.41,8.41 0,1 1,-16.81 0">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="33.77"
                android:centerY="48.73"
                android:gradientRadius="16.99"
                android:type="radial">

                <item
                    android:color="#fffeffff"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#fffeffff"
                    android:offset="0.40">
                </item>

                <item
                    android:color="#fff9fcfc"
                    android:offset="0.51">
                </item>

                <item
                    android:color="#ffedf3f5"
                    android:offset="0.62">
                </item>

                <item
                    android:color="#ffdee9ec"
                    android:offset="0.70">
                </item>

                <item
                    android:color="#ffd8e4e8"
                    android:offset="0.72">
                </item>

                <item
                    android:color="#ffccd8df"
                    android:offset="0.76">
                </item>

                <item
                    android:color="#ffc8d5dd"
                    android:offset="0.80">
                </item>

                <item
                    android:color="#ffccd6de"
                    android:offset="0.83">
                </item>

                <item
                    android:color="#ffd8dbe2"
                    android:offset="0.85">
                </item>

                <item
                    android:color="#ffede3e9"
                    android:offset="0.88">
                </item>

                <item
                    android:color="#ffffebef"
                    android:offset="0.90">
                </item>

            </gradient>

        </aapt:attr>

    </path>

    <path
        android:pathData="M30.02,60.88a24,18 0,1 0,48 0a24,18 0,1 0,-48 0z">

        <aapt:attr
            name="android:fillColor">

            <gradient
                android:centerX="54.54"
                android:centerY="46.49"
                android:gradientRadius="51.260"
                android:type="radial">

                <item
                    android:color="#fffeffff"
                    android:offset="0.00">
                </item>

                <item
                    android:color="#fffeffff"
                    android:offset="0.40">
                </item>

                <item
                    android:color="#fff9fcfc"
                    android:offset="0.51">
                </item>

                <item
                    android:color="#ffedf3f5"
                    android:offset="0.62">
                </item>

                <item
                    android:color="#ffdee9ec"
                    android:offset="0.70">
                </item>

                <item
                    android:color="#ffd8e4e8"
                    android:offset="0.72">
                </item>

                <item
                    android:color="#ffccd8df"
                    android:offset="0.76">
                </item>

                <item
                    android:color="#ffc8d5dd"
                    android:offset="0.80">
                </item>

                <item
                    android:color="#ffccd6de"
                    android:offset="0.83">
                </item>

                <item
                    android:color="#ffd8dbe2"
                    android:offset="0.85">
                </item>

                <item
                    android:color="#ffede3e9"
                    android:offset="0.88">
                </item>

                <item
                    android:color="#ffffebef"
                    android:offset="0.90">
                </item>

            </gradient>

        </aapt:attr>

    </path>

</vector>
```

</details>

<details>
<summary>
    <h3>Secret Hitler</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#fff0e2c4"
        android:pathData="M36.2,37.1l-5.4-5.4l0.6-0.6l0.6-0.6l5.4,5.4c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9S45,37.9,44.6,38l-1.9,0.5c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.8,1.8c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9s-0.2,0.7-0.6,0.8L47.4,43c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.9,1.9c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9s-0.2,0.7-0.6,0.8l-1.9,0.5c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.8,1.8c1-0.6,2.1-0.6,3.2-0.4c0.3,0,0.5,0.1,0.8,0.1c0.1,0,0.1,0,0.2,0l0,0c0.1,0,0.1,0,0.2,0.1l-6.5,6.5c0-0.1-0.1-0.3-0.1-0.4l-0.1,0.1c-0.3-1.3-0.1-2.6,0.4-3.7c0.1-0.2,0.2-0.4,0.3-0.7l-1.8-1.8c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6l-0.7-1.9c-0.8-1.9-0.6-3.9,0.3-5.4l-1.9-1.9c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6L40.6,47c-0.8-1.9-0.6-3.9,0.3-5.4L39,40.1c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6L36,42.6C35,40.7,35.2,38.7,36.2,37.1z M58.5,52.3c0.4-0.1,0.6-0.4,0.6-0.8c0-0.1,0-0.2,0-0.3l-1.4,1.4L58.5,52.3z M51,59.2c0.1,0,0.2,0.1,0.3,0.1c0.4,0,0.7-0.3,0.8-0.6l0.2-0.8L51,59.2z M77.3,76.5l-1-2.7c-1.1-2.2-3.3-4.3-5.7-4.9L69,67.3c0.1,0,0.1,0,0.2,0c0.4,0,0.9-0.1,1.4-0.2l1.5-0.4c0.4-0.1,0.6-0.4,0.6-0.8s-0.2-0.7-0.6-0.9l-1.6-0.6c-1.5-0.6-3.1-0.5-4.4,0.2l-2.2-2.2c0.2,0,0.4,0,0.6,0c0.5,0,1-0.1,1.5-0.2l1.7-0.5c0.4-0.1,0.6-0.4,0.6-0.8c0-0.4-0.2-0.7-0.6-0.9l-1.8-0.7c-1.7-0.7-3.5-0.5-5,0.3l-1.7-1.7c0.2,0,0.4,0.1,0.6,0.1c0.5,0,1-0.1,1.6-0.2l1.9-0.5c0.2-0.1,0.4-0.2,0.5-0.3c0.2-0.2,0.3-0.4,0.3-0.6c0-0.4-0.2-0.7-0.6-0.9l-1.9-0.7c-0.3-0.1-0.7-0.2-1.1-0.2c-1.6-0.4-3.1-0.2-4.3,0.6l0.1-0.1l-0.2-0.2l-1.4,1.4l0.2,0.2c-0.9,1.6-1.1,3.5-0.3,5.4l1,1.8c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.5-1.9c0.2-0.8,0.3-1.7,0.2-2.5l1.9,1.9c-0.8,1.5-1,3.3-0.3,5l0.7,1.8c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.5-1.7c0.2-0.7,0.2-1.5,0.2-2.1l2.2,2.2c-0.7,1.3-0.8,2.9-0.2,4.4l0.6,1.6c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.4-1.5c0.1-0.5,0.2-1,0.2-1.6l1.6,1.6c0.6,2.4,2.3,4.5,4.5,5.6l2.5,1.4c0.2,0.1,0.4,0.1,0.5,0.1c0.4,0,0.7-0.4,0.8-0.6C77.3,77.1,77.4,76.9,77.3,76.5z"
        tools:ignore="VectorPath" >
    </path>

    <path
        android:fillColor="#fff0e2c4"
        android:pathData="M78,34.3L73.7,30l-1.5,2.6l-6.1,6.1l-2.9-1.5l-1.9,3l1.4,0.7L34.6,69.1c-1.5,1.5-2.6,3.3-3.3,5.5L30,78l3.5-1.2c2-0.7,3.8-1.8,5.3-3.2l27.7-28.2l0.8,1.4l3-1.9l-1.1-3l6.1-6.1L78,34.3z M37.8,72.4c-1.3,1.3-2.8,2.2-4.8,2.9l-0.7,0.3l0.2-0.7c0.7-1.9,1.6-3.5,3-5l28.4-28.4l0.9,0.5l1,1l0.4,0.8L37.8,72.4z"
        tools:ignore="VectorPath" >
    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ff383634"
        android:pathData="M0,0h108v108h-108z" >
    </path>

    <path
        android:fillColor="#ff61c8d9"
        android:pathData="M36.2,37.1l-5.4-5.4l0.6-0.6l0.6-0.6l5.4,5.4c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9S45,37.9,44.6,38l-1.9,0.5c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.8,1.8c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9s-0.2,0.7-0.6,0.8L47.4,43c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.9,1.9c1.5-0.9,3.4-1,5.3-0.3l1.9,0.7c0.4,0.2,0.6,0.5,0.6,0.9s-0.2,0.7-0.6,0.8l-1.9,0.5c-0.5,0.1-1,0.2-1.6,0.2c-0.2,0-0.5-0.1-0.8-0.1l1.8,1.8c1-0.6,2.1-0.6,3.2-0.4c0.3,0,0.5,0.1,0.8,0.1c0.1,0,0.1,0,0.2,0l0,0c0.1,0,0.1,0,0.2,0.1l-6.5,6.5c0-0.1-0.1-0.3-0.1-0.4l-0.1,0.1c-0.3-1.3-0.1-2.6,0.4-3.7c0.1-0.2,0.2-0.4,0.3-0.7l-1.8-1.8c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6l-0.7-1.9c-0.8-1.9-0.6-3.9,0.3-5.4l-1.9-1.9c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6L40.6,47c-0.8-1.9-0.6-3.9,0.3-5.4L39,40.1c0.1,0.8,0,1.7-0.2,2.5l-0.5,1.9c-0.1,0.3-0.4,0.6-0.8,0.6c-0.3,0-0.7-0.3-0.8-0.6L36,42.6C35,40.7,35.2,38.7,36.2,37.1z M58.5,52.3c0.4-0.1,0.6-0.4,0.6-0.8c0-0.1,0-0.2,0-0.3l-1.4,1.4L58.5,52.3z M51,59.2c0.1,0,0.2,0.1,0.3,0.1c0.4,0,0.7-0.3,0.8-0.6l0.2-0.8L51,59.2z M77.3,76.5l-1-2.7c-1.1-2.2-3.3-4.3-5.7-4.9L69,67.3c0.1,0,0.1,0,0.2,0c0.4,0,0.9-0.1,1.4-0.2l1.5-0.4c0.4-0.1,0.6-0.4,0.6-0.8s-0.2-0.7-0.6-0.9l-1.6-0.6c-1.5-0.6-3.1-0.5-4.4,0.2l-2.2-2.2c0.2,0,0.4,0,0.6,0c0.5,0,1-0.1,1.5-0.2l1.7-0.5c0.4-0.1,0.6-0.4,0.6-0.8c0-0.4-0.2-0.7-0.6-0.9l-1.8-0.7c-1.7-0.7-3.5-0.5-5,0.3l-1.7-1.7c0.2,0,0.4,0.1,0.6,0.1c0.5,0,1-0.1,1.6-0.2l1.9-0.5c0.2-0.1,0.4-0.2,0.5-0.3c0.2-0.2,0.3-0.4,0.3-0.6c0-0.4-0.2-0.7-0.6-0.9l-1.9-0.7c-0.3-0.1-0.7-0.2-1.1-0.2c-1.6-0.4-3.1-0.2-4.3,0.6l0.1-0.1l-0.2-0.2l-1.4,1.4l0.2,0.2c-0.9,1.6-1.1,3.5-0.3,5.4l1,1.8c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.5-1.9c0.2-0.8,0.3-1.7,0.2-2.5l1.9,1.9c-0.8,1.5-1,3.3-0.3,5l0.7,1.8c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.5-1.7c0.2-0.7,0.2-1.5,0.2-2.1l2.2,2.2c-0.7,1.3-0.8,2.9-0.2,4.4l0.6,1.6c0.1,0.3,0.5,0.6,0.8,0.6c0.4,0,0.7-0.3,0.8-0.6l0.4-1.5c0.1-0.5,0.2-1,0.2-1.6l1.6,1.6c0.6,2.4,2.3,4.5,4.5,5.6l2.5,1.4c0.2,0.1,0.4,0.1,0.5,0.1c0.4,0,0.7-0.4,0.8-0.6C77.3,77.1,77.4,76.9,77.3,76.5z"
        tools:ignore="VectorPath" >
    </path>

    <path
        android:fillColor="#ffff7054"
        android:pathData="M78,34.3L73.7,30l-1.5,2.6l-6.1,6.1l-2.9-1.5l-1.9,3l1.4,0.7L34.6,69.1c-1.5,1.5-2.6,3.3-3.3,5.5L30,78l3.5-1.2c2-0.7,3.8-1.8,5.3-3.2l27.7-28.2l0.8,1.4l3-1.9l-1.1-3l6.1-6.1L78,34.3z M37.8,72.4c-1.3,1.3-2.8,2.2-4.8,2.9l-0.7,0.3l0.2-0.7c0.7-1.9,1.6-3.5,3-5l28.4-28.4l0.9,0.5l1,1l0.4,0.8L37.8,72.4z"
        tools:ignore="VectorPath" >
    </path>

</vector>
```

</details>

<details>
<summary>
    <h3>YouTube Music</h3>
</summary>

#### `ic_launcher_foreground.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#33666666"
        android:pathData="M0,86.4V22.25l61.25,31.67L0,86.4z">
    </path>

    <path
        android:fillColor="#ffffff"
        android:pathData="M48.75,60.54V47.46l12.49,6.46L48.75,60.54z">
    </path>

</vector>
```

#### `ic_launcher_background.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>

<vector
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:height="108dp"
    android:viewportHeight="108"
    android:viewportWidth="108"
    android:width="108dp"
    tools:ignore="VectorPath">

    <path
        android:fillColor="#ff333333"
        android:pathData="M0,0L0,108L108,108L108,0L0,0Z">
    </path>

    <path
        android:fillColor="#ffe23229"
        android:pathData="M70.5,54c0,9.11 -7.39,16.5 -16.5,16.5S37.5,63.11 37.5,54S44.89,37.5 54,37.5S70.5,44.89 70.5,54z">
    </path>

</vector>
```
</details>
