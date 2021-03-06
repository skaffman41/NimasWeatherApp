object Compose {
    private const val activityComposeVersion = "1.3.0-rc01"
    const val activity = "androidx.activity:activity-compose:$activityComposeVersion"

    const val composeVersion = "1.0.5"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"

    private const val navigationVersion = "2.4.0-alpha04"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val lifecycle_version = "2.4.0"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version"

    private const val accompanistVersion = "0.20.3"
    const val accompanist = "com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion"
}

object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeVersion}"
}