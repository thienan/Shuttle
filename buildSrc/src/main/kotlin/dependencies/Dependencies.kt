package dependencies

object Dependencies {

    const val minSdk = 21
    const val targetSdk = 27
    const val compileSdk = 27

    const val buildTools = "27.0.3"

    object Versions {
        const val nanoHttp = "2.3.1"
        const val crashlytics = "2.9.0"
        const val dashClockApi = "2.0.0"
        const val fastScroll = "1.0.16"
        const val glide = "3.8.0-SNAPSHOT"
        const val glideOkhttp = "1.4.0@aar"
        const val materialDialogs = "0.9.6.0"
        const val permiso = "0.3.0"
        const val streams = "1.1.9"
        const val butterknife = "8.8.1"
        const val butterknifeAnnotationProcessor = "8.8.1"
        const val dagger = "2.14.1"
        const val daggerAnnotationProcessor = "2.14.1"
        const val expandableRecyclerView = "3.0.0-RC1"
        const val billing = "1.0"
    }

    // Kotlin

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Plugins.Versions.kotlin}"

    // NanoHttp - https://github.com/NanoHttpd/nanohttpd (Various)
    const val nanoHttp = "org.nanohttpd:nanohttpd-webserver:${Versions.nanoHttp}"

    // Crashlytics - https://fabric.io/kits/android/crashlytics
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Versions.crashlytics}"

    // Dashclock - https://git.io/vix9g (Roman Nurik)
    const val dashClockApi = "com.google.android.apps.dashclock:dashclock-api:${Versions.dashClockApi}"

    // RecyclerView-FastScroll - https://git.io/vix5z
    const val fastScroll = "com.simplecityapps:recyclerview-fastscroll:${Versions.fastScroll}"

    // Glide - https://git.io/vtn9K (Bump)
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"

    // Glide - OkHttp  integration - https://git.io/vihvW (Bump)
    const val glideOkhttp = "com.github.bumptech.glide:okhttp3-integration:${Versions.glideOkhttp}"

    // Material Dialogs - https://git.io/vixHf (Aidan Follestad)
    const val materialDialogs = "com.afollestad.material-dialogs:core:${Versions.materialDialogs}"
    const val materialDialogCommons = "com.afollestad.material-dialogs:commons:${Versions.materialDialogs}"

    // Permiso - https://git.io/vixQ4 (Greyson Parrelli)
    const val permiso = "com.greysonparrelli.permiso:permiso:${Versions.permiso}"

    // Streams Backport - https://git.io/vCazA (Victor Melnik)
    const val streams = "com.annimon:stream:${Versions.streams}"

    // Butterknife
    const val butterknife = "com.jakewharton:butterknife:${Versions.butterknife}"
    const val butterknifeAnnotationProcessor = "com.jakewharton:butterknife-compiler:${Versions.butterknifeAnnotationProcessor}"

    // Dagger
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerAnnotationProcessor = "com.google.dagger:dagger-compiler:${Versions.daggerAnnotationProcessor}"

    // Expandable Recycler View - https://github.com/thoughtbot/expandable-recycler-view
    const val expandableRecyclerView = "com.bignerdranch.android:expandablerecyclerview:${Versions.expandableRecyclerView}"

    // In app purchases
    const val billing = "com.android.billingclient:billing:${Versions.billing}"


    object Plugins {

        object Versions {
            const val androidGradlePlugin = "3.2.0-beta01"
            const val kotlin = "1.2.30"
            const val dexcountGradlePlugin = "0.8.2"
            const val fabricGradlePlugin = "1.+"
            const val playPublisher = "1.2.0"
            const val gradleVersions = "0.17.0"
            const val playServices = "3.2.0"
        }

        const val android = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val dexcount = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:${Versions.dexcountGradlePlugin}"
        const val fabric = "io.fabric.tools:gradle:${Versions.fabricGradlePlugin}"
        const val playPublisher = "com.github.triplet.gradle:play-publisher:${Versions.playPublisher}"
        const val gradleVersions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersions}"
        const val playServices = "com.google.gms:google-services:${Versions.playServices}"
    }

    object Google {

        object Versions {
            const val supportLib = "27.1.0"
            const val firebaseCore = "11.8.0"
            const val firebaseRemoteConfig = "11.8.0"
            const val chromecast = "11.8.0"
            const val constraintLayout = "1.1.0-beta5"
        }

        const val cardView = "com.android.support:cardview-v7:${Versions.supportLib}"
        const val design = "com.android.support:design:${Versions.supportLib}"
        const val palette = "com.android.support:palette-v7:${Versions.supportLib}"
        const val recyclerView = "com.android.support:recyclerview-v7:${Versions.supportLib}"
        const val supportv4 = "com.android.support:support-v4:${Versions.supportLib}"
        const val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
        const val firebaseRemoteConfig = "com.google.firebase:firebase-config:${Versions.firebaseRemoteConfig}"
        const val appcompat = "com.android.support:appcompat-v7:${Versions.supportLib}"
        const val mediarouter = "com.android.support:mediarouter-v7:${Versions.supportLib}"
        const val chromecast = "com.google.android.gms:play-services-cast:${Versions.chromecast}"
        const val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
        const val prefCompat = "com.android.support:preference-v7:${Versions.supportLib}"
        const val prefCompatv14 = "com.android.support:preference-v14:${Versions.supportLib}"
    }

    object Square {

        object Versions {
            const val haha = "2.0.3"
            const val leakCanary = "1.5.1"
            const val okio = "1.14.0"
            const val okhttp = "3.9.1"
            const val retrofit = "2.3.0"
            const val retrofitGson = "2.3.0"
            const val sqlBrite = "2.0.0"
        }

        const val haha = "com.squareup.haha:haha:${Versions.haha}"
        const val leakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
        const val leakCanaryRel = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"
        const val okio = "com.squareup.okio:okio:${Versions.okio}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGson}"
        const val sqlBrite = "com.squareup.sqlbrite2:sqlbrite:${Versions.sqlBrite}"
    }


    object Rx {

        object Versions {
            const val rxAndroid = "2.0.2"
            const val rxBinding = "2.1.1"
            const val rxBindingAppCompat = "2.1.1"
            const val rxJava = "2.1.9"
            const val rxRelay = "2.0.0"
            const val rxBroadcast = "2.0.0"
            const val rxPrefs = "2.0.0-RC3"
            const val traceur = "1.0.1"
        }

        // RxJava - https://git.io/vihv0 (ReactiveX)
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

        // rxBinding - https://git.io/vix5y (Jake Wharton)
        const val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding}"

        // rxBinding AppCompat - https://git.io/vix5y (Jake Wharton)
        const val rxBindingAppCompat = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Versions.rxBindingAppCompat}"

        // RxJava - https://git.io/rxjava (ReactiveX)
        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

        // RX Image Picker - https://git.io/vix5H (MLSDev )
        const val rxImagePicker = "com.github.timusus:RxImagePicker:permission-check-fix-SNAPSHOT"

        // RX Relay - https://github.com/JakeWharton/RxRelay
        const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxRelay}"

        // Rx Receivers - https://github.com/f2prateek/rx-receivers
        const val rxBroadcast = "com.cantrowitz:rxbroadcast:${Versions.rxBroadcast}"

        // Rx Prefs - https://github.com/f2prateek/rx-preferences
        const val rxPrefs = "com.f2prateek.rx.preferences2:rx-preferences:${Versions.rxPrefs}"

        const val traceur = "com.tspoon.traceur:traceur:${Versions.traceur}"
    }


    object Testing {

        object Versions {
            const val junit = "4.12"
            const val espressoCore = "3.0.0"
            const val assertj = "3.9.0"

            // Mockito version restriction -- PowerMock does not fully support Mockito2 yet.
            // https://github.com/powermock/powermock/wiki/Mockito2_maven
            const val mockito = "2.8.47"
            const val powermock = "1.7.1"

            // Future note: PowerMock and Robolectric can't work together until Robolectric 3.3 is released
            // https://github.com/robolectric/robolectric/wiki/Using-PowerMock
            const val robolectric = "3.6.1"
        }

        // JUnit
        const val junit = "junit:junit:${Versions.junit}"

        // Espresso
        const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espressoCore}"

        // Mockito - https://github.com/mockito/mockito
        const val mockito = "org.mockito:mockito-core:${Versions.mockito}"

        // Powermock - https://github.com/powermock/powermock
        const val powermock = "org.powermock:powermock-api-mockito2:${Versions.powermock}"
        const val powermockjunit = "org.powermock:powermock-module-junit4:${Versions.powermock}"

        // Robolectric - https://github.com/robolectric/robolectric
        const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

        // AssertJ - http://joel-costigliola.github.io/assertj/
        const val assertj = "org.assertj:assertj-core:${Versions.assertj}"
    }


    object Projects {

        // Cast Companion Library
        val ccl = ":libraries:ccl"

        // Glide Palette - https://git.io/vix57 (Florent Champigny)
        val glidePalette = ":libraries:glidepalette"

        // Internal navigation library
        val navigation = ":libraries:navigation"

        // Internal recycler adapter library
        val recyclerAdapter = ":libraries:recycler-adapter"

        // Multi Sheet View
        val multiSheetView = ":libraries:multisheetview"

        // Aesthetic - Theming Engine
        val aesthetic = ":libraries:aesthetic"
    }

    object BuildPlugins {

        const val androidApplication = "com.android.application"
        const val androidLibrary = "com.android.library"
        const val kotlin = "kotlin-android"
        const val dexCount = "com.getkeepsafe.dexcount"
        const val fabric = "io.fabric"
        const val playPublisher = "com.github.triplet.play"
        const val gradleVersions = "com.github.ben-manes.versions"
        const val playServices = "com.google.gms.google-services"
    }
}

