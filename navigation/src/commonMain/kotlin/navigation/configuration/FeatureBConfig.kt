package navigation.configuration

import kotlinx.serialization.Serializable

object FeatureBConfig {
    @Serializable
    data object HomeB : Configuration
    @Serializable
    data object EndFeature : Configuration
}
