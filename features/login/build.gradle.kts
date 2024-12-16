import deps.androidx
import deps.koin
import deps.ktor
import deps.room
import deps.testDebugDeps
import deps.testDeps
import deps.testImplDeps
import plugs.Sharedplugin

plugins {
    id(plugs.BuildPlugins.ANDROID_LIBRARY)

}
apply<Sharedplugin>()

android {
    namespace = "com.android.login"

}

dependencies {
androidx()
    koin()
    room()
    ktor()
    testDeps()
    testDebugDeps()
    testImplDeps()


}