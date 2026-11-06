package com.amazon.alexa.client.core.configuration;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ClientConfiguration extends ClientConfiguration {

    @Nullable
    private final Set<Locale> actualSupportedLocales;

    @Nullable
    private final String alexaProductId;

    @Nullable
    private final String alexaProfileOverride;

    @Nullable
    private final Uri avsEndpoint;

    @Nullable
    private final String awsMobileAnalyticsApplicationId;

    @Nullable
    private final String awsMobileAnalyticsIdentityPoolId;

    @Nullable
    private final String backupWakeWordModelAssetFileName;

    @Nullable
    private final Uri capabilitiesEndpoint;

    @Nullable
    private final String datamartNamespace;

    @Nullable
    private final Set<Feature> enabledFeatures;

    @Nullable
    private final Set<ExperimentalLocaleCombination> experimentalLocaleCombinations;

    @Nullable
    private final Set<ExperimentalLocale> experimentalLocales;
    private final Set<SDKFeature> featuresToDisable;

    @Nullable
    private final Long firstTurnNetworkTotalWriteTimeout;

    @Nullable
    private final Boolean hardcodedCapabilitiesDisabled;

    @Nullable
    private final String hostAppName;

    @Nullable
    private final Boolean locationPermissionsAllowed;

    @Nullable
    private final Long maxUtteranceDuration;

    @Nullable
    private final String metricsServiceName;

    @Nullable
    private final String mobilyticsKinesisCognitoIdentityPoolId;

    @Nullable
    private final String mobilyticsKinesisRegion;

    @Nullable
    private final String mobilyticsKinesisStreamName;

    @Nullable
    private final Boolean multiWwEnabled;

    @Nullable
    private final Long networkTotalWriteTimeout;

    @Nullable
    private final Long networkWriteBytesTimeout;

    @Nullable
    private final Long playbackResumingTimeout;

    @Nullable
    private final Boolean removeNotificationOnTeardown;

    @Nullable
    private final Stage stage;

    @Nullable
    private final Set<List<Locale>> supportedLocaleCombinations;

    @Nullable
    private final Set<Locale> supportedLocales;

    @Nullable
    private final Boolean supportsPfmChanged;

    @Nullable
    private final Boolean transportBarCustomActionsEnabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ClientConfiguration.Builder {
        private Set<Locale> actualSupportedLocales;
        private String alexaProductId;
        private String alexaProfileOverride;
        private Uri avsEndpoint;
        private String awsMobileAnalyticsApplicationId;
        private String awsMobileAnalyticsIdentityPoolId;
        private String backupWakeWordModelAssetFileName;
        private Uri capabilitiesEndpoint;
        private String datamartNamespace;
        private Set<Feature> enabledFeatures;
        private Set<ExperimentalLocaleCombination> experimentalLocaleCombinations;
        private Set<ExperimentalLocale> experimentalLocales;
        private Set<SDKFeature> featuresToDisable;
        private Long firstTurnNetworkTotalWriteTimeout;
        private Boolean hardcodedCapabilitiesDisabled;
        private String hostAppName;
        private Boolean locationPermissionsAllowed;
        private Long maxUtteranceDuration;
        private String metricsServiceName;
        private String mobilyticsKinesisCognitoIdentityPoolId;
        private String mobilyticsKinesisRegion;
        private String mobilyticsKinesisStreamName;
        private Boolean multiWwEnabled;
        private Long networkTotalWriteTimeout;
        private Long networkWriteBytesTimeout;
        private Long playbackResumingTimeout;
        private Boolean removeNotificationOnTeardown;
        private Stage stage;
        private Set<List<Locale>> supportedLocaleCombinations;
        private Set<Locale> supportedLocales;
        private Boolean supportsPfmChanged;
        private Boolean transportBarCustomActionsEnabled;

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration autoBuild() {
            Set<SDKFeature> set = this.featuresToDisable;
            if (set != null) {
                return new AutoValue_ClientConfiguration(this.enabledFeatures, this.stage, this.avsEndpoint, this.capabilitiesEndpoint, this.supportedLocales, this.supportedLocaleCombinations, this.actualSupportedLocales, this.experimentalLocales, this.experimentalLocaleCombinations, this.networkTotalWriteTimeout, this.firstTurnNetworkTotalWriteTimeout, this.networkWriteBytesTimeout, this.maxUtteranceDuration, this.awsMobileAnalyticsApplicationId, this.awsMobileAnalyticsIdentityPoolId, this.mobilyticsKinesisStreamName, this.mobilyticsKinesisCognitoIdentityPoolId, this.mobilyticsKinesisRegion, this.playbackResumingTimeout, this.removeNotificationOnTeardown, this.metricsServiceName, this.backupWakeWordModelAssetFileName, this.alexaProfileOverride, this.locationPermissionsAllowed, this.multiWwEnabled, this.hardcodedCapabilitiesDisabled, this.transportBarCustomActionsEnabled, this.datamartNamespace, this.supportsPfmChanged, this.alexaProductId, set, this.hostAppName, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: featuresToDisable");
            return null;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<Locale> getActualSupportedLocales() {
            return this.actualSupportedLocales;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<Feature> getEnabledFeatures() {
            return this.enabledFeatures;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<ExperimentalLocaleCombination> getExperimentalLocaleCombinations() {
            return this.experimentalLocaleCombinations;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<ExperimentalLocale> getExperimentalLocales() {
            return this.experimentalLocales;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<List<Locale>> getSupportedLocaleCombinations() {
            return this.supportedLocaleCombinations;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        @Nullable
        public Set<Locale> getSupportedLocales() {
            return this.supportedLocales;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setActualSupportedLocales(Set<Locale> set) {
            this.actualSupportedLocales = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setAlexaProductId(String str) {
            this.alexaProductId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setAlexaProfileOverride(String str) {
            this.alexaProfileOverride = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setAvsEndpoint(Uri uri) {
            this.avsEndpoint = uri;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setAwsMobileAnalyticsApplicationId(String str) {
            this.awsMobileAnalyticsApplicationId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setAwsMobileAnalyticsIdentityPoolId(String str) {
            this.awsMobileAnalyticsIdentityPoolId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setBackupWakeWordModelAssetFileName(String str) {
            this.backupWakeWordModelAssetFileName = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setCapabilitiesEndpoint(Uri uri) {
            this.capabilitiesEndpoint = uri;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setDatamartNamespace(String str) {
            this.datamartNamespace = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setEnabledFeatures(Set<Feature> set) {
            this.enabledFeatures = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setExperimentalLocaleCombinations(Set<ExperimentalLocaleCombination> set) {
            this.experimentalLocaleCombinations = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setExperimentalLocales(Set<ExperimentalLocale> set) {
            this.experimentalLocales = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setFeaturesToDisable(Set<SDKFeature> set) {
            if (set != null) {
                this.featuresToDisable = set;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null featuresToDisable");
            return null;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setFirstTurnNetworkTotalWriteTimeout(Long l) {
            this.firstTurnNetworkTotalWriteTimeout = l;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setHardcodedCapabilitiesDisabled(Boolean bool) {
            this.hardcodedCapabilitiesDisabled = bool;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setHostAppName(String str) {
            this.hostAppName = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setLocationPermissionsAllowed(Boolean bool) {
            this.locationPermissionsAllowed = bool;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMaxUtteranceDuration(Long l) {
            this.maxUtteranceDuration = l;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMetricsServiceName(String str) {
            this.metricsServiceName = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMobilyticsKinesisCognitoIdentityPoolId(String str) {
            this.mobilyticsKinesisCognitoIdentityPoolId = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMobilyticsKinesisRegion(String str) {
            this.mobilyticsKinesisRegion = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMobilyticsKinesisStreamName(String str) {
            this.mobilyticsKinesisStreamName = str;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setMultiWwEnabled(Boolean bool) {
            this.multiWwEnabled = bool;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setNetworkTotalWriteTimeout(Long l) {
            this.networkTotalWriteTimeout = l;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setNetworkWriteBytesTimeout(Long l) {
            this.networkWriteBytesTimeout = l;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setPlaybackResumingTimeout(Long l) {
            this.playbackResumingTimeout = l;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setRemoveNotificationOnTeardown(Boolean bool) {
            this.removeNotificationOnTeardown = bool;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setStage(Stage stage) {
            this.stage = stage;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setSupportedLocaleCombinations(Set<List<Locale>> set) {
            this.supportedLocaleCombinations = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setSupportedLocales(Set<Locale> set) {
            this.supportedLocales = set;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setSupportsPfmChanged(Boolean bool) {
            this.supportsPfmChanged = bool;
            return this;
        }

        @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration.Builder
        public ClientConfiguration.Builder setTransportBarCustomActionsEnabled(Boolean bool) {
            this.transportBarCustomActionsEnabled = bool;
            return this;
        }
    }

    private AutoValue_ClientConfiguration(@Nullable Set<Feature> set, @Nullable Stage stage, @Nullable Uri uri, @Nullable Uri uri2, @Nullable Set<Locale> set2, @Nullable Set<List<Locale>> set3, @Nullable Set<Locale> set4, @Nullable Set<ExperimentalLocale> set5, @Nullable Set<ExperimentalLocaleCombination> set6, @Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l5, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable String str9, @Nullable Boolean bool6, @Nullable String str10, Set<SDKFeature> set7, @Nullable String str11) {
        this.enabledFeatures = set;
        this.stage = stage;
        this.avsEndpoint = uri;
        this.capabilitiesEndpoint = uri2;
        this.supportedLocales = set2;
        this.supportedLocaleCombinations = set3;
        this.actualSupportedLocales = set4;
        this.experimentalLocales = set5;
        this.experimentalLocaleCombinations = set6;
        this.networkTotalWriteTimeout = l;
        this.firstTurnNetworkTotalWriteTimeout = l2;
        this.networkWriteBytesTimeout = l3;
        this.maxUtteranceDuration = l4;
        this.awsMobileAnalyticsApplicationId = str;
        this.awsMobileAnalyticsIdentityPoolId = str2;
        this.mobilyticsKinesisStreamName = str3;
        this.mobilyticsKinesisCognitoIdentityPoolId = str4;
        this.mobilyticsKinesisRegion = str5;
        this.playbackResumingTimeout = l5;
        this.removeNotificationOnTeardown = bool;
        this.metricsServiceName = str6;
        this.backupWakeWordModelAssetFileName = str7;
        this.alexaProfileOverride = str8;
        this.locationPermissionsAllowed = bool2;
        this.multiWwEnabled = bool3;
        this.hardcodedCapabilitiesDisabled = bool4;
        this.transportBarCustomActionsEnabled = bool5;
        this.datamartNamespace = str9;
        this.supportsPfmChanged = bool6;
        this.alexaProductId = str10;
        this.featuresToDisable = set7;
        this.hostAppName = str11;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClientConfiguration) {
            ClientConfiguration clientConfiguration = (ClientConfiguration) obj;
            Set<Feature> set = this.enabledFeatures;
            if (set != null ? set.equals(clientConfiguration.getEnabledFeatures()) : clientConfiguration.getEnabledFeatures() == null) {
                Stage stage = this.stage;
                if (stage != null ? stage.equals(clientConfiguration.getStage()) : clientConfiguration.getStage() == null) {
                    Uri uri = this.avsEndpoint;
                    if (uri != null ? uri.equals(clientConfiguration.getAvsEndpoint()) : clientConfiguration.getAvsEndpoint() == null) {
                        Uri uri2 = this.capabilitiesEndpoint;
                        if (uri2 != null ? uri2.equals(clientConfiguration.getCapabilitiesEndpoint()) : clientConfiguration.getCapabilitiesEndpoint() == null) {
                            Set<Locale> set2 = this.supportedLocales;
                            if (set2 != null ? set2.equals(clientConfiguration.getSupportedLocales()) : clientConfiguration.getSupportedLocales() == null) {
                                Set<List<Locale>> set3 = this.supportedLocaleCombinations;
                                if (set3 != null ? set3.equals(clientConfiguration.getSupportedLocaleCombinations()) : clientConfiguration.getSupportedLocaleCombinations() == null) {
                                    Set<Locale> set4 = this.actualSupportedLocales;
                                    if (set4 != null ? set4.equals(clientConfiguration.getActualSupportedLocales()) : clientConfiguration.getActualSupportedLocales() == null) {
                                        Set<ExperimentalLocale> set5 = this.experimentalLocales;
                                        if (set5 != null ? set5.equals(clientConfiguration.getExperimentalLocales()) : clientConfiguration.getExperimentalLocales() == null) {
                                            Set<ExperimentalLocaleCombination> set6 = this.experimentalLocaleCombinations;
                                            if (set6 != null ? set6.equals(clientConfiguration.getExperimentalLocaleCombinations()) : clientConfiguration.getExperimentalLocaleCombinations() == null) {
                                                Long l = this.networkTotalWriteTimeout;
                                                if (l != null ? l.equals(clientConfiguration.getNetworkTotalWriteTimeout()) : clientConfiguration.getNetworkTotalWriteTimeout() == null) {
                                                    Long l2 = this.firstTurnNetworkTotalWriteTimeout;
                                                    if (l2 != null ? l2.equals(clientConfiguration.getFirstTurnNetworkTotalWriteTimeout()) : clientConfiguration.getFirstTurnNetworkTotalWriteTimeout() == null) {
                                                        Long l3 = this.networkWriteBytesTimeout;
                                                        if (l3 != null ? l3.equals(clientConfiguration.getNetworkWriteBytesTimeout()) : clientConfiguration.getNetworkWriteBytesTimeout() == null) {
                                                            Long l4 = this.maxUtteranceDuration;
                                                            if (l4 != null ? l4.equals(clientConfiguration.getMaxUtteranceDuration()) : clientConfiguration.getMaxUtteranceDuration() == null) {
                                                                String str2 = this.awsMobileAnalyticsApplicationId;
                                                                if (str2 != null ? str2.equals(clientConfiguration.getAwsMobileAnalyticsApplicationId()) : clientConfiguration.getAwsMobileAnalyticsApplicationId() == null) {
                                                                    String str3 = this.awsMobileAnalyticsIdentityPoolId;
                                                                    if (str3 != null ? str3.equals(clientConfiguration.getAwsMobileAnalyticsIdentityPoolId()) : clientConfiguration.getAwsMobileAnalyticsIdentityPoolId() == null) {
                                                                        String str4 = this.mobilyticsKinesisStreamName;
                                                                        if (str4 != null ? str4.equals(clientConfiguration.getMobilyticsKinesisStreamName()) : clientConfiguration.getMobilyticsKinesisStreamName() == null) {
                                                                            String str5 = this.mobilyticsKinesisCognitoIdentityPoolId;
                                                                            if (str5 != null ? str5.equals(clientConfiguration.getMobilyticsKinesisCognitoIdentityPoolId()) : clientConfiguration.getMobilyticsKinesisCognitoIdentityPoolId() == null) {
                                                                                String str6 = this.mobilyticsKinesisRegion;
                                                                                if (str6 != null ? str6.equals(clientConfiguration.getMobilyticsKinesisRegion()) : clientConfiguration.getMobilyticsKinesisRegion() == null) {
                                                                                    Long l5 = this.playbackResumingTimeout;
                                                                                    if (l5 != null ? l5.equals(clientConfiguration.getPlaybackResumingTimeout()) : clientConfiguration.getPlaybackResumingTimeout() == null) {
                                                                                        Boolean bool = this.removeNotificationOnTeardown;
                                                                                        if (bool != null ? bool.equals(clientConfiguration.getRemoveNotificationOnTeardown()) : clientConfiguration.getRemoveNotificationOnTeardown() == null) {
                                                                                            String str7 = this.metricsServiceName;
                                                                                            if (str7 != null ? str7.equals(clientConfiguration.getMetricsServiceName()) : clientConfiguration.getMetricsServiceName() == null) {
                                                                                                String str8 = this.backupWakeWordModelAssetFileName;
                                                                                                if (str8 != null ? str8.equals(clientConfiguration.getBackupWakeWordModelAssetFileName()) : clientConfiguration.getBackupWakeWordModelAssetFileName() == null) {
                                                                                                    String str9 = this.alexaProfileOverride;
                                                                                                    if (str9 != null ? str9.equals(clientConfiguration.getAlexaProfileOverride()) : clientConfiguration.getAlexaProfileOverride() == null) {
                                                                                                        Boolean bool2 = this.locationPermissionsAllowed;
                                                                                                        if (bool2 != null ? bool2.equals(clientConfiguration.getLocationPermissionsAllowed()) : clientConfiguration.getLocationPermissionsAllowed() == null) {
                                                                                                            Boolean bool3 = this.multiWwEnabled;
                                                                                                            if (bool3 != null ? bool3.equals(clientConfiguration.getMultiWwEnabled()) : clientConfiguration.getMultiWwEnabled() == null) {
                                                                                                                Boolean bool4 = this.hardcodedCapabilitiesDisabled;
                                                                                                                if (bool4 != null ? bool4.equals(clientConfiguration.getHardcodedCapabilitiesDisabled()) : clientConfiguration.getHardcodedCapabilitiesDisabled() == null) {
                                                                                                                    Boolean bool5 = this.transportBarCustomActionsEnabled;
                                                                                                                    if (bool5 != null ? bool5.equals(clientConfiguration.getTransportBarCustomActionsEnabled()) : clientConfiguration.getTransportBarCustomActionsEnabled() == null) {
                                                                                                                        String str10 = this.datamartNamespace;
                                                                                                                        if (str10 != null ? str10.equals(clientConfiguration.getDatamartNamespace()) : clientConfiguration.getDatamartNamespace() == null) {
                                                                                                                            Boolean bool6 = this.supportsPfmChanged;
                                                                                                                            if (bool6 != null ? bool6.equals(clientConfiguration.getSupportsPfmChanged()) : clientConfiguration.getSupportsPfmChanged() == null) {
                                                                                                                                String str11 = this.alexaProductId;
                                                                                                                                if (str11 != null ? str11.equals(clientConfiguration.getAlexaProductId()) : clientConfiguration.getAlexaProductId() == null) {
                                                                                                                                    if (this.featuresToDisable.equals(clientConfiguration.getFeaturesToDisable()) && ((str = this.hostAppName) != null ? str.equals(clientConfiguration.getHostAppName()) : clientConfiguration.getHostAppName() == null)) {
                                                                                                                                        return true;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<Locale> getActualSupportedLocales() {
        return this.actualSupportedLocales;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getAlexaProductId() {
        return this.alexaProductId;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getAlexaProfileOverride() {
        return this.alexaProfileOverride;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Uri getAvsEndpoint() {
        return this.avsEndpoint;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getAwsMobileAnalyticsApplicationId() {
        return this.awsMobileAnalyticsApplicationId;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getAwsMobileAnalyticsIdentityPoolId() {
        return this.awsMobileAnalyticsIdentityPoolId;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getBackupWakeWordModelAssetFileName() {
        return this.backupWakeWordModelAssetFileName;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Uri getCapabilitiesEndpoint() {
        return this.capabilitiesEndpoint;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getDatamartNamespace() {
        return this.datamartNamespace;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<Feature> getEnabledFeatures() {
        return this.enabledFeatures;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<ExperimentalLocaleCombination> getExperimentalLocaleCombinations() {
        return this.experimentalLocaleCombinations;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<ExperimentalLocale> getExperimentalLocales() {
        return this.experimentalLocales;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    public Set<SDKFeature> getFeaturesToDisable() {
        return this.featuresToDisable;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Long getFirstTurnNetworkTotalWriteTimeout() {
        return this.firstTurnNetworkTotalWriteTimeout;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getHardcodedCapabilitiesDisabled() {
        return this.hardcodedCapabilitiesDisabled;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getHostAppName() {
        return this.hostAppName;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getLocationPermissionsAllowed() {
        return this.locationPermissionsAllowed;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Long getMaxUtteranceDuration() {
        return this.maxUtteranceDuration;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getMetricsServiceName() {
        return this.metricsServiceName;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getMobilyticsKinesisCognitoIdentityPoolId() {
        return this.mobilyticsKinesisCognitoIdentityPoolId;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getMobilyticsKinesisRegion() {
        return this.mobilyticsKinesisRegion;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public String getMobilyticsKinesisStreamName() {
        return this.mobilyticsKinesisStreamName;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getMultiWwEnabled() {
        return this.multiWwEnabled;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Long getNetworkTotalWriteTimeout() {
        return this.networkTotalWriteTimeout;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Long getNetworkWriteBytesTimeout() {
        return this.networkWriteBytesTimeout;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Long getPlaybackResumingTimeout() {
        return this.playbackResumingTimeout;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getRemoveNotificationOnTeardown() {
        return this.removeNotificationOnTeardown;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Stage getStage() {
        return this.stage;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<List<Locale>> getSupportedLocaleCombinations() {
        return this.supportedLocaleCombinations;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Set<Locale> getSupportedLocales() {
        return this.supportedLocales;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getSupportsPfmChanged() {
        return this.supportsPfmChanged;
    }

    @Override // com.amazon.alexa.client.core.configuration.ClientConfiguration
    @Nullable
    public Boolean getTransportBarCustomActionsEnabled() {
        return this.transportBarCustomActionsEnabled;
    }

    public int hashCode() {
        Set<Feature> set = this.enabledFeatures;
        int hashCode = ((set == null ? 0 : set.hashCode()) ^ 1000003) * 1000003;
        Stage stage = this.stage;
        int hashCode2 = (hashCode ^ (stage == null ? 0 : stage.hashCode())) * 1000003;
        Uri uri = this.avsEndpoint;
        int hashCode3 = (hashCode2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.capabilitiesEndpoint;
        int hashCode4 = (hashCode3 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        Set<Locale> set2 = this.supportedLocales;
        int hashCode5 = (hashCode4 ^ (set2 == null ? 0 : set2.hashCode())) * 1000003;
        Set<List<Locale>> set3 = this.supportedLocaleCombinations;
        int hashCode6 = (hashCode5 ^ (set3 == null ? 0 : set3.hashCode())) * 1000003;
        Set<Locale> set4 = this.actualSupportedLocales;
        int hashCode7 = (hashCode6 ^ (set4 == null ? 0 : set4.hashCode())) * 1000003;
        Set<ExperimentalLocale> set5 = this.experimentalLocales;
        int hashCode8 = (hashCode7 ^ (set5 == null ? 0 : set5.hashCode())) * 1000003;
        Set<ExperimentalLocaleCombination> set6 = this.experimentalLocaleCombinations;
        int hashCode9 = (hashCode8 ^ (set6 == null ? 0 : set6.hashCode())) * 1000003;
        Long l = this.networkTotalWriteTimeout;
        int hashCode10 = (hashCode9 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.firstTurnNetworkTotalWriteTimeout;
        int hashCode11 = (hashCode10 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.networkWriteBytesTimeout;
        int hashCode12 = (hashCode11 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Long l4 = this.maxUtteranceDuration;
        int hashCode13 = (hashCode12 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003;
        String str = this.awsMobileAnalyticsApplicationId;
        int hashCode14 = (hashCode13 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.awsMobileAnalyticsIdentityPoolId;
        int hashCode15 = (hashCode14 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.mobilyticsKinesisStreamName;
        int hashCode16 = (hashCode15 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.mobilyticsKinesisCognitoIdentityPoolId;
        int hashCode17 = (hashCode16 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.mobilyticsKinesisRegion;
        int hashCode18 = (hashCode17 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        Long l5 = this.playbackResumingTimeout;
        int hashCode19 = (hashCode18 ^ (l5 == null ? 0 : l5.hashCode())) * 1000003;
        Boolean bool = this.removeNotificationOnTeardown;
        int hashCode20 = (hashCode19 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str6 = this.metricsServiceName;
        int hashCode21 = (hashCode20 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.backupWakeWordModelAssetFileName;
        int hashCode22 = (hashCode21 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.alexaProfileOverride;
        int hashCode23 = (hashCode22 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        Boolean bool2 = this.locationPermissionsAllowed;
        int hashCode24 = (hashCode23 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.multiWwEnabled;
        int hashCode25 = (hashCode24 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Boolean bool4 = this.hardcodedCapabilitiesDisabled;
        int hashCode26 = (hashCode25 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.transportBarCustomActionsEnabled;
        int hashCode27 = (hashCode26 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        String str9 = this.datamartNamespace;
        int hashCode28 = (hashCode27 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        Boolean bool6 = this.supportsPfmChanged;
        int hashCode29 = (hashCode28 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        String str10 = this.alexaProductId;
        int hashCode30 = (((hashCode29 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003) ^ this.featuresToDisable.hashCode()) * 1000003;
        String str11 = this.hostAppName;
        return hashCode30 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientConfiguration{enabledFeatures=");
        sb.append(this.enabledFeatures);
        sb.append(", stage=");
        sb.append(this.stage);
        sb.append(", avsEndpoint=");
        sb.append(this.avsEndpoint);
        sb.append(", capabilitiesEndpoint=");
        sb.append(this.capabilitiesEndpoint);
        sb.append(", supportedLocales=");
        sb.append(this.supportedLocales);
        sb.append(", supportedLocaleCombinations=");
        sb.append(this.supportedLocaleCombinations);
        sb.append(", actualSupportedLocales=");
        sb.append(this.actualSupportedLocales);
        sb.append(", experimentalLocales=");
        sb.append(this.experimentalLocales);
        sb.append(", experimentalLocaleCombinations=");
        sb.append(this.experimentalLocaleCombinations);
        sb.append(", networkTotalWriteTimeout=");
        sb.append(this.networkTotalWriteTimeout);
        sb.append(", firstTurnNetworkTotalWriteTimeout=");
        sb.append(this.firstTurnNetworkTotalWriteTimeout);
        sb.append(", networkWriteBytesTimeout=");
        sb.append(this.networkWriteBytesTimeout);
        sb.append(", maxUtteranceDuration=");
        sb.append(this.maxUtteranceDuration);
        sb.append(", awsMobileAnalyticsApplicationId=");
        sb.append(this.awsMobileAnalyticsApplicationId);
        sb.append(", awsMobileAnalyticsIdentityPoolId=");
        sb.append(this.awsMobileAnalyticsIdentityPoolId);
        sb.append(", mobilyticsKinesisStreamName=");
        sb.append(this.mobilyticsKinesisStreamName);
        sb.append(", mobilyticsKinesisCognitoIdentityPoolId=");
        sb.append(this.mobilyticsKinesisCognitoIdentityPoolId);
        sb.append(", mobilyticsKinesisRegion=");
        sb.append(this.mobilyticsKinesisRegion);
        sb.append(", playbackResumingTimeout=");
        sb.append(this.playbackResumingTimeout);
        sb.append(", removeNotificationOnTeardown=");
        sb.append(this.removeNotificationOnTeardown);
        sb.append(", metricsServiceName=");
        sb.append(this.metricsServiceName);
        sb.append(", backupWakeWordModelAssetFileName=");
        sb.append(this.backupWakeWordModelAssetFileName);
        sb.append(", alexaProfileOverride=");
        sb.append(this.alexaProfileOverride);
        sb.append(", locationPermissionsAllowed=");
        sb.append(this.locationPermissionsAllowed);
        sb.append(", multiWwEnabled=");
        sb.append(this.multiWwEnabled);
        sb.append(", hardcodedCapabilitiesDisabled=");
        sb.append(this.hardcodedCapabilitiesDisabled);
        sb.append(", transportBarCustomActionsEnabled=");
        sb.append(this.transportBarCustomActionsEnabled);
        sb.append(", datamartNamespace=");
        sb.append(this.datamartNamespace);
        sb.append(", supportsPfmChanged=");
        sb.append(this.supportsPfmChanged);
        sb.append(", alexaProductId=");
        sb.append(this.alexaProductId);
        sb.append(", featuresToDisable=");
        sb.append(this.featuresToDisable);
        sb.append(", hostAppName=");
        return a$$ExternalSyntheticOutline0.m(sb, this.hostAppName, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_ClientConfiguration(Set set, Stage stage, Uri uri, Uri uri2, Set set2, Set set3, Set set4, Set set5, Set set6, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, Long l5, Boolean bool, String str6, String str7, String str8, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str9, Boolean bool6, String str10, Set set7, String str11, int i) {
        this(set, stage, uri, uri2, set2, set3, set4, set5, set6, l, l2, l3, l4, str, str2, str3, str4, str5, l5, bool, str6, str7, str8, bool2, bool3, bool4, bool5, str9, bool6, str10, set7, str11);
    }
}
