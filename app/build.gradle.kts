import dependencies.*

plugins {
    id(Config.Plugins.AndroidApplication)
    id(Config.Plugins.KotlinAndroid)
}

android {
    compileSdk = Config.Android.compileSdk

    defaultConfig {
        applicationId = Environments.appId
        minSdk = Config.Android.minSdk
        targetSdk = Config.Android.targetSdk
        versionCode = Environments.Debug.versionCode
        versionName = Environments.Debug.versionName

        testInstrumentationRunner = Environments.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName(Environments.Debug.name) {
            isDebuggable = true
            isMinifyEnabled = false
            isShrinkResources = false
        }
        getByName(Environments.Release.name) {
            isDebuggable = false
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // AndroidX
    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.lifeCycleKtx)

    // Compose
    implementation(Compose.activityCompose)
    implementation(Compose.composeUI)
    implementation(Compose.toolingPreview)
    implementation(Compose.composeMaterial)
    implementation(Compose.viewModelCompose)
}