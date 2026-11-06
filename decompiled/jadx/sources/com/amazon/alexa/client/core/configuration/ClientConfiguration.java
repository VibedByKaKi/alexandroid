package com.amazon.alexa.client.core.configuration;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.core.configuration.AutoValue_ClientConfiguration;
import com.amazon.alexa.utils.validation.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ClientConfiguration {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ClientConfiguration autoBuild();

        public ClientConfiguration build() {
            Set<Feature> enabledFeatures = getEnabledFeatures();
            Set<Locale> supportedLocales = getSupportedLocales();
            Set<Locale> actualSupportedLocales = getActualSupportedLocales();
            Set<List<Locale>> supportedLocaleCombinations = getSupportedLocaleCombinations();
            Set<ExperimentalLocale> experimentalLocales = getExperimentalLocales();
            Set<ExperimentalLocaleCombination> experimentalLocaleCombinations = getExperimentalLocaleCombinations();
            if (enabledFeatures == null) {
                enabledFeatures = new HashSet<>();
            }
            setEnabledFeatures(Collections.unmodifiableSet(enabledFeatures));
            if (supportedLocales == null) {
                supportedLocales = new HashSet<>();
            }
            setSupportedLocales(Collections.unmodifiableSet(supportedLocales));
            if (actualSupportedLocales == null) {
                actualSupportedLocales = new HashSet<>();
            }
            setActualSupportedLocales(Collections.unmodifiableSet(actualSupportedLocales));
            if (supportedLocaleCombinations == null) {
                supportedLocaleCombinations = new HashSet<>();
            }
            setSupportedLocaleCombinations(Collections.unmodifiableSet(supportedLocaleCombinations));
            if (experimentalLocales == null) {
                experimentalLocales = new HashSet<>();
            }
            setExperimentalLocales(Collections.unmodifiableSet(experimentalLocales));
            if (experimentalLocaleCombinations == null) {
                experimentalLocaleCombinations = new HashSet<>();
            }
            setExperimentalLocaleCombinations(Collections.unmodifiableSet(experimentalLocaleCombinations));
            return ClientConfiguration.validate(autoBuild());
        }

        public Builder disableFeatures(Set<Feature> set) {
            Set<Feature> enabledFeatures = getEnabledFeatures();
            if (enabledFeatures == null) {
                enabledFeatures = new HashSet<>();
            } else {
                enabledFeatures.removeAll(set);
            }
            setEnabledFeatures(enabledFeatures);
            return this;
        }

        public Builder enableFeatures(Set<Feature> set) {
            Set<Feature> enabledFeatures = getEnabledFeatures();
            if (enabledFeatures == null) {
                enabledFeatures = new HashSet<>();
            }
            enabledFeatures.addAll(set);
            setEnabledFeatures(enabledFeatures);
            return this;
        }

        public abstract Set<Locale> getActualSupportedLocales();

        public abstract Set<Feature> getEnabledFeatures();

        public abstract Set<ExperimentalLocaleCombination> getExperimentalLocaleCombinations();

        public abstract Set<ExperimentalLocale> getExperimentalLocales();

        public abstract Set<List<Locale>> getSupportedLocaleCombinations();

        public abstract Set<Locale> getSupportedLocales();

        public abstract Builder setActualSupportedLocales(Set<Locale> set);

        public abstract Builder setAlexaProductId(String str);

        public abstract Builder setAlexaProfileOverride(String str);

        public abstract Builder setAvsEndpoint(Uri uri);

        public abstract Builder setAwsMobileAnalyticsApplicationId(String str);

        public abstract Builder setAwsMobileAnalyticsIdentityPoolId(String str);

        public abstract Builder setBackupWakeWordModelAssetFileName(String str);

        public abstract Builder setCapabilitiesEndpoint(Uri uri);

        public abstract Builder setDatamartNamespace(String str);

        public abstract Builder setEnabledFeatures(Set<Feature> set);

        public abstract Builder setExperimentalLocaleCombinations(Set<ExperimentalLocaleCombination> set);

        public abstract Builder setExperimentalLocales(Set<ExperimentalLocale> set);

        public abstract Builder setFeaturesToDisable(Set<SDKFeature> set);

        public abstract Builder setFirstTurnNetworkTotalWriteTimeout(Long l);

        public abstract Builder setHardcodedCapabilitiesDisabled(Boolean bool);

        public abstract Builder setHostAppName(String str);

        public abstract Builder setLocationPermissionsAllowed(Boolean bool);

        public abstract Builder setMaxUtteranceDuration(Long l);

        public abstract Builder setMetricsServiceName(String str);

        public abstract Builder setMobilyticsKinesisCognitoIdentityPoolId(String str);

        public abstract Builder setMobilyticsKinesisRegion(String str);

        public abstract Builder setMobilyticsKinesisStreamName(String str);

        public abstract Builder setMultiWwEnabled(Boolean bool);

        public abstract Builder setNetworkTotalWriteTimeout(Long l);

        public abstract Builder setNetworkWriteBytesTimeout(Long l);

        public abstract Builder setPlaybackResumingTimeout(Long l);

        public abstract Builder setRemoveNotificationOnTeardown(Boolean bool);

        public abstract Builder setStage(Stage stage);

        public abstract Builder setSupportedLocaleCombinations(Set<List<Locale>> set);

        public abstract Builder setSupportedLocales(Set<Locale> set);

        public abstract Builder setSupportsPfmChanged(Boolean bool);

        public abstract Builder setTransportBarCustomActionsEnabled(Boolean bool);
    }

    public static Builder builder() {
        return new AutoValue_ClientConfiguration.Builder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ClientConfiguration validate(ClientConfiguration clientConfiguration) {
        Preconditions.notNull(clientConfiguration.getStage(), "stage == null");
        Preconditions.notNull(clientConfiguration.getAvsEndpoint(), "avs endpoint == null");
        Preconditions.notNull(clientConfiguration.getCapabilitiesEndpoint(), "capabilities endpoint == null");
        Preconditions.notNull(clientConfiguration.getSupportedLocales(), "supportedLocales == null");
        Preconditions.isFalse(clientConfiguration.getSupportedLocales().isEmpty(), "Must support at least one locale.");
        Preconditions.notNull(clientConfiguration.getActualSupportedLocales(), "actualSupportedLocales == null");
        Preconditions.isFalse(clientConfiguration.getActualSupportedLocales().isEmpty(), "Must support at least one locale.");
        Preconditions.notNull(clientConfiguration.getNetworkTotalWriteTimeout(), "networkTotalWriteTimeout == null.");
        Preconditions.notNull(clientConfiguration.getNetworkWriteBytesTimeout(), "networkWriteBytesTimeout == null.");
        Preconditions.notNull(clientConfiguration.getAwsMobileAnalyticsApplicationId(), "awsMobileAnalyticsApplicationId == null.");
        Preconditions.notNull(clientConfiguration.getAwsMobileAnalyticsIdentityPoolId(), "awsMobileAnalyticsIdentityPoolId == null.");
        Preconditions.notNull(clientConfiguration.getMobilyticsKinesisStreamName(), "mobilyticsKinesisStreamName == null");
        Preconditions.notNull(clientConfiguration.getMobilyticsKinesisCognitoIdentityPoolId(), "mobilyticsKinesisCognitoIdentityPoolId == null");
        Preconditions.notNull(clientConfiguration.getMobilyticsKinesisRegion(), "mobilyticsKinesisRegion == null");
        Preconditions.notNull(clientConfiguration.getPlaybackResumingTimeout(), "playbackResumingTimeout == null");
        Preconditions.notNull(clientConfiguration.shouldRemoveNotificationOnTeardown(), "removeNotificationOnTeardown == null");
        Preconditions.notNull(clientConfiguration.getExperimentalLocales(), "experimentalLocales == null");
        Preconditions.notNull(clientConfiguration.getExperimentalLocaleCombinations(), "experimentalLocaleCombinations == null");
        Preconditions.notNull(clientConfiguration.getFeaturesToDisable(), "featuresToDisable == null");
        Preconditions.notNull(clientConfiguration.getHostAppName(), "hostAppName == null");
        return clientConfiguration;
    }

    @Nullable
    public abstract Set<Locale> getActualSupportedLocales();

    @Nullable
    public abstract String getAlexaProductId();

    @Nullable
    public abstract String getAlexaProfileOverride();

    @Nullable
    public abstract Uri getAvsEndpoint();

    @Nullable
    public abstract String getAwsMobileAnalyticsApplicationId();

    @Nullable
    public abstract String getAwsMobileAnalyticsIdentityPoolId();

    @Nullable
    public abstract String getBackupWakeWordModelAssetFileName();

    @Nullable
    public abstract Uri getCapabilitiesEndpoint();

    @Nullable
    public abstract String getDatamartNamespace();

    @Nullable
    public abstract Set<Feature> getEnabledFeatures();

    @Nullable
    public abstract Set<ExperimentalLocaleCombination> getExperimentalLocaleCombinations();

    @Nullable
    public abstract Set<ExperimentalLocale> getExperimentalLocales();

    public abstract Set<SDKFeature> getFeaturesToDisable();

    @Nullable
    public abstract Long getFirstTurnNetworkTotalWriteTimeout();

    @Nullable
    public abstract Boolean getHardcodedCapabilitiesDisabled();

    @Nullable
    public abstract String getHostAppName();

    @Nullable
    public abstract Boolean getLocationPermissionsAllowed();

    @Nullable
    public abstract Long getMaxUtteranceDuration();

    @Nullable
    public abstract String getMetricsServiceName();

    @Nullable
    public abstract String getMobilyticsKinesisCognitoIdentityPoolId();

    @Nullable
    public abstract String getMobilyticsKinesisRegion();

    @Nullable
    public abstract String getMobilyticsKinesisStreamName();

    @Nullable
    public abstract Boolean getMultiWwEnabled();

    @Nullable
    public abstract Long getNetworkTotalWriteTimeout();

    @Nullable
    public abstract Long getNetworkWriteBytesTimeout();

    @Nullable
    public abstract Long getPlaybackResumingTimeout();

    @Nullable
    public abstract Boolean getRemoveNotificationOnTeardown();

    @Nullable
    public abstract Stage getStage();

    @Nullable
    public abstract Set<List<Locale>> getSupportedLocaleCombinations();

    @Nullable
    public abstract Set<Locale> getSupportedLocales();

    @Nullable
    public abstract Boolean getSupportsPfmChanged();

    @Nullable
    public abstract Boolean getTransportBarCustomActionsEnabled();

    public boolean isEnabled(Feature feature) {
        Set<Feature> enabledFeatures = getEnabledFeatures();
        return enabledFeatures != null && enabledFeatures.contains(feature);
    }

    @Nullable
    public Boolean shouldRemoveNotificationOnTeardown() {
        return getRemoveNotificationOnTeardown();
    }
}
