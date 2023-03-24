// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Config.ClassPath.gradleBuildTools)
        classpath(Config.ClassPath.kotlinGradlePlugin)
        // classpath("com.diffplug.spotless:spotless-plugin-gradle:5.15.0")
        // NOTE: Do not place your application dependencies here;
        // they belong in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}