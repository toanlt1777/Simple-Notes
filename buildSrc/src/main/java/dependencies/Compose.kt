package dependencies

object Compose {
    const val composeVersion = "1.2.0"
    private const val activityComposeVersion = "1.3.1"
    private const val viewModelComposeVersion = "2.4.0"

    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val composeUI = "androidx.compose.ui:ui:$composeVersion"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val composeMaterial = "androidx.compose.material:material:$composeVersion"
    const val viewModelCompose =
        "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelComposeVersion"
}