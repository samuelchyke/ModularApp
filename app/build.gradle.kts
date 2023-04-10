plugins {
    id ("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id ("androidx.navigation.safeargs")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 33
    namespace = "com.example.w40k"

    defaultConfig {
        applicationId = "com.example.w40k"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-beta01"
    }
    packagingOptions {
        resources {
            exclude("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.compose.ui:ui:1.2.0-beta01")
    implementation("androidx.compose.material:material:1.2.0-beta01")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.0-beta01")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.test.ext:junit-ktx:1.1.3")

    val compose = "1.2.0-beta01"
    implementation("androidx.compose.foundation:foundation:$compose")
    implementation("androidx.compose.runtime:runtime-livedata:$compose")
    implementation("androidx.compose.runtime:runtime-rxjava2:$compose")
    implementation("androidx.compose.material:material:$compose")
    implementation("androidx.compose.material:material-icons-core:$compose")
    implementation("androidx.compose.material:material-icons-extended:$compose")

    // Appcompat
    val appcompat_version = "1.5.1"
    implementation("androidx.appcompat:appcompat:$appcompat_version")
    implementation("androidx.fragment:fragment-ktx:$appcompat_version")
    implementation("androidx.appcompat:appcompat-resources:$appcompat_version")

    // Navigation
    val nav_version = "2.3.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation("androidx.navigation:navigation-compose:2.5.3")

    // Coroutine
    val coroutine_version = "1.6.1"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version")

    // Room Database
    val room_version = "2.4.3"
    implementation("androidx.room:room-runtime:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

    // Lifecycle
    val lifecycle_version = "2.4.3"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    // lifecycleScope:
    val scope_version = "2.6.0-alpha01"
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$scope_version")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$scope_version")

    // Hilt
    val hilt_version = "2.42"
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-android-compiler:$hilt_version")

    // Retrofit Network
    val retrofit_version = "2.9.0"
    implementation("com.google.code.gson:gson:$retrofit_version")
    implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")

    // Okhttp
    val okhttp_version = "4.9.3"
    implementation("com.squareup.okhttp3:okhttp:$okhttp_version")
    implementation("com.squareup.okhttp3:logging-interceptor:$okhttp_version")

    //Image Loading
    val landscape_version = "2.0.0"
    implementation("com.github.skydoves:landscapist-glide:$landscape_version")
    implementation("com.github.skydoves:landscapist-placeholder:$landscape_version")

    kapt("com.github.bumptech.glide:compiler:4.13.0")
}