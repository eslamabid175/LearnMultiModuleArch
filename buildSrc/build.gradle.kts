plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}
// those deps are for shared build.gradle.kts
dependencies{
//gradle plugins for kotlin and android
    api(kotlin("gradle-plugin:1.9.0"))
    implementation("com.android.tools.build:gradle:8.1.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
    implementation("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.9.0-1.0.13")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.51.0")

}