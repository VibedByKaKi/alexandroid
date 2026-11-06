plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "net.kaki87.alexandroid"
    compileSdk = 35

    defaultConfig {
        applicationId = "net.kaki87.alexandroid"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    signingConfigs {
        val store = System.getenv("ALEXA_KEYSTORE")
        if (store != null) {
            create("release") {
                storeFile = file(store)
                storePassword = System.getenv("ALEXA_KEYSTORE_PASSWORD")
                keyAlias = System.getenv("ALEXA_KEY_ALIAS")
                keyPassword = System.getenv("ALEXA_KEY_PASSWORD")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfigs.findByName("release")?.let { signingConfig = it }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}
