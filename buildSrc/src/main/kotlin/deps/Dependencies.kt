package deps

object Dependencies {

    const val ANDROIDX_CORE = "androidx.core:core-ktx:${DependenciesVersions.CORE_KTX}"
    const val ANDROIDX_LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${DependenciesVersions.LIFE_CYCLE_RUNTIME_KTX}"
    const val ANDROIDX_ACTIVITY_COMPOSE =
        "androidx.activity:activity-compose:${DependenciesVersions.ACTIVITY_COMPOSE}"
    const val ANDROIDX_UI = "androidx.compose.ui:ui:${DependenciesVersions.COMPOSE_UI}"
    const val ANDROIDX_UI_GRAPHICS = "androidx.compose.ui:ui-graphics:${DependenciesVersions.COMPOSE_UI}"
    const val ANDROIDX_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview:${DependenciesVersions.COMPOSE_UI}"
    const val ANDROIDX_MATERIAL3= "androidx.compose.material3:material3:${DependenciesVersions.MATERIAL_3}"



    //deps

    const val koinAndroid = "io.insert-koin:koin-android:${DependenciesVersions.KOIN}"
    const val koinCore = "io.insert-koin:koin-core:koin-core:${DependenciesVersions.KOIN}"
    const val koinAndroidCompose = "io.insert-koin:koin-androidx-compose:${DependenciesVersions.KOIN}"

    const val ktorCore = "io.ktor:ktor-client-core:${DependenciesVersions.KTOR}"
    const val ktorAndroid = "io.ktor:ktor-client-android:${DependenciesVersions.KTOR}"
const val ktorClientCio = "io.ktor:ktor-client-cio:${DependenciesVersions.KTOR}"
    const val ktorLogging = "io.ktor:ktor-client-logging:${DependenciesVersions.KTOR}"
    const val ktorSerialization = "io.ktor:ktor-serialization-kotlinx-json:${DependenciesVersions.KTOR}"
const val KtorClientContentNegotiation = "io.ktor:ktor-client-content-negotiation:${DependenciesVersions.KTOR}"


const val AndroidX_Navigation_Compose = "androidx.navigation:navigation-compose:${DependenciesVersions.NAVIGATION_COMPOSE}"

    const val roomRuntime = "androidx.room:room-runtime:${DependenciesVersions.ROOM}"
    const val roomCompiler = "androidx.room:room-compiler:${DependenciesVersions.ROOM}"
    const val roomKtx = "androidx.room:room-ktx:${DependenciesVersions.ROOM}"
    const val roomTesting = "androidx.room:room-testing:${DependenciesVersions.ROOM}"
    const val roomPaging = "androidx.room:room-paging:${DependenciesVersions.ROOM}"
    const val coilCompose = "io.coil-kt:coil-compose:${DependenciesVersions.COIL_COMPOSE}"


    const val ksp = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspCompiler = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspTest = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspTestCompiler = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspTestPlugin = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspTestPluginGradle = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"
    const val kspTestPluginGradlePlugin = "com.google.devtools.ksp:symbol-processing-api:${DependenciesVersions.KSP}"


}
