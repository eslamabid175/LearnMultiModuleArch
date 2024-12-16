package test

import deps.DependenciesVersions

object TestDependencies {
    const val ANDROIDX_JUNIT = "androidx.test.ext:junit:${DependenciesVersions.JUNIT_VERSION}"
    const val ANDROIDX_ESPRESSO_CORE =
        "androidx.test.espresso:espresso-core:${DependenciesVersions.ESPRESSO_CORE}"
    const val ANDROIDX_COMPOSE_UI_TEST =
        "androidx.compose.ui:ui-test-junit4:${DependenciesVersions.COMPOSE_UI}"
    const val ANDROIDX_COMPOSE_UI_TEST_MANIFEST ="androidx.compose.ui:ui-test-manifest:${DependenciesVersions.COMPOSE_UI}"

    const val koinTest = "io.insert-koin:koin-test:${DependenciesVersions.KOIN}"
    const val koinTestJunit = "io.insert-koin:koin-test-junit4:${DependenciesVersions.KOIN}"
    const val koinTestMock = "io.insert-koin:koin-test-mock:${DependenciesVersions.KOIN}"

}