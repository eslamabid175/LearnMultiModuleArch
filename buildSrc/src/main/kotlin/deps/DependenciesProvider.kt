package deps


import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project
import test.TestDependencies


fun DependencyHandler.room(){
    implementation(Dependencies.roomKtx)
    implementation(Dependencies.roomRuntime)
    ksp(Dependencies.roomCompiler)
}


fun DependencyHandler.ktor() {
implementation(Dependencies.ktorCore)
    implementation(Dependencies.ktorAndroid)
    implementation(Dependencies.ktorClientCio)
    implementation(Dependencies.ktorLogging)
    implementation(Dependencies.ktorSerialization)
    implementation(Dependencies.KtorClientContentNegotiation)
}



fun DependencyHandler.koin() {
implementation(Dependencies.koinAndroid)
    implementation(Dependencies.koinCore)
    implementation(Dependencies.koinAndroidCompose)
}

fun DependencyHandler.androidx() {
    implementation(Dependencies.ANDROIDX_CORE)
    implementation(Dependencies.ANDROIDX_LIFECYCLE_RUNTIME_KTX)
    implementation(Dependencies.ANDROIDX_ACTIVITY_COMPOSE)
    implementation(Dependencies.ANDROIDX_UI)
    implementation(Dependencies.ANDROIDX_UI_GRAPHICS)
    implementation(Dependencies.ANDROIDX_UI_TOOLING_PREVIEW)
    implementation(Dependencies.ANDROIDX_MATERIAL3)
    implementation(Dependencies.AndroidX_Navigation_Compose)
    implementation(Dependencies.coilCompose)
}

fun DependencyHandler.loginModule() {
    moduleImplementation(project(":features:login"))
}

fun DependencyHandler.homeModule() {
    moduleImplementation(project(":features:home"))
}


fun DependencyHandler.testDeps() {
    testImplementation(TestDependencies.ANDROIDX_JUNIT)
}

fun DependencyHandler.testImplDeps() {
    androidTestImplementation(TestDependencies.ANDROIDX_JUNIT)
    androidTestImplementation(TestDependencies.ANDROIDX_ESPRESSO_CORE)
    androidTestImplementation(TestDependencies.ANDROIDX_COMPOSE_UI_TEST)
}

fun DependencyHandler.testDebugDeps() {
    debugImplementation(Dependencies.ANDROIDX_UI_TOOLING_PREVIEW)
    debugImplementation(TestDependencies.ANDROIDX_COMPOSE_UI_TEST_MANIFEST)
}