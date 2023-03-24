object Config {
    object Android {
        const val compileSdk = 33
        const val minSdk = 24
        const val targetSdk = 33
    }

    object Plugins {
        const val AndroidApplication = "com.android.application";
        const val KotlinAndroid = "org.jetbrains.kotlin.android";
        const val KotlinJVM = "org.jetbrains.kotlin.jvm";
    }

    object ClassPath {
        const val gradleBuildTools = "com.android.tools.build:gradle:${Versions.gradleBuildVersion}"
        const val kotlinGradlePlugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }
}