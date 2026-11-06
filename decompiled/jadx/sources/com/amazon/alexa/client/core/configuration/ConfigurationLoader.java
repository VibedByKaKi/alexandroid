package com.amazon.alexa.client.core.configuration;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ConfigurationLoader implements Loader<ClientConfiguration.Builder> {
    private static final Map<String, Feature> PROPERTIES_KEY_TO_FEATURE_MAP;
    private static final String SLASH_SEPARATOR_REGEX = "\\s*\\/\\s*";
    public static final String UNKNOWN_APP = "UnknownApp";

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("wakeword_activation_sound_enabled", Feature.WAKEWORD_ACTIVATION_SOUND);
        hashMap.put("touch_initiated_activation_sound_enabled", Feature.TOUCH_ACTIVATION_SOUND);
        PROPERTIES_KEY_TO_FEATURE_MAP = Collections.unmodifiableMap(hashMap);
    }

    private Set<SDKFeature> getFeaturesToDisable() {
        Set<String> stringSet = getStringSet("features_to_disable");
        HashSet hashSet = new HashSet();
        if (stringSet != null && !stringSet.isEmpty()) {
            Iterator<String> it2 = stringSet.iterator();
            while (it2.hasNext()) {
                hashSet.add(SDKFeature.from(it2.next()));
            }
        }
        return hashSet;
    }

    private Set<List<Locale>> getLocaleCombinations(String str) {
        Set<String> stringSet = getStringSet(str);
        if (stringSet == null || stringSet.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            String[] split = it2.next().trim().split(SLASH_SEPARATOR_REGEX);
            if (split.length != 2) {
                return null;
            }
            hashSet.add(Arrays.asList(Locale.forLanguageTag(split[0]), Locale.forLanguageTag(split[1])));
        }
        return hashSet;
    }

    private Set<Locale> getLocaleSet(String str) {
        Set<String> stringSet = getStringSet(str);
        if (stringSet == null || stringSet.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            hashSet.add(Locale.forLanguageTag(it2.next()));
        }
        return hashSet;
    }

    private void loadFeatures(ClientConfiguration.Builder builder) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Map.Entry<String, Feature> entry : PROPERTIES_KEY_TO_FEATURE_MAP.entrySet()) {
            Boolean bool = getBoolean(entry.getKey());
            if (bool != null) {
                if (bool.booleanValue()) {
                    hashSet.add(entry.getValue());
                } else {
                    hashSet2.add(entry.getValue());
                }
            }
        }
        builder.enableFeatures(hashSet).disableFeatures(hashSet2);
    }

    public abstract Boolean getBoolean(String str);

    public abstract Long getLong(String str);

    public abstract String getString(String str);

    public abstract Set<String> getStringSet(String str);

    @Override // com.amazon.alexa.client.core.configuration.Loader
    public void load(ClientConfiguration.Builder builder) {
        loadFeatures(builder);
        Stage from = Stage.from(getString("stage"));
        if (from != null) {
            builder.setStage(from);
        }
        String string = getString("avs_endpoint");
        if (string != null) {
            builder.setAvsEndpoint(Uri.parse(string));
        }
        String string2 = getString("capabilities_endpoint");
        if (string2 != null) {
            builder.setCapabilitiesEndpoint(Uri.parse(string2));
        }
        Set<Locale> localeSet = getLocaleSet("supported_locales");
        if (localeSet != null) {
            builder.setSupportedLocales(localeSet);
        }
        Set<Locale> localeSet2 = getLocaleSet("actual_supported_locales");
        if (localeSet2 != null) {
            builder.setActualSupportedLocales(localeSet2);
        }
        Set<List<Locale>> localeCombinations = getLocaleCombinations("supported_locale_combinations");
        if (localeCombinations != null) {
            builder.setSupportedLocaleCombinations(localeCombinations);
        }
        Long l = getLong("network_total_write_timeout_seconds");
        if (l != null) {
            builder.setNetworkTotalWriteTimeout(l);
        }
        Long l2 = getLong("first_turn_network_total_write_timeout_seconds");
        if (l2 != null) {
            builder.setFirstTurnNetworkTotalWriteTimeout(l2);
        }
        Long l3 = getLong("network_write_bytes_timeout_milliseconds");
        if (l3 != null) {
            builder.setNetworkWriteBytesTimeout(l3);
        }
        Long l4 = getLong("max_utterance_duration");
        if (l4 != null) {
            builder.setMaxUtteranceDuration(l4);
        }
        String string3 = getString("aws_ma_application_id");
        if (string3 != null) {
            builder.setAwsMobileAnalyticsApplicationId(string3);
        }
        String string4 = getString("aws_ma_identity_pool_id");
        if (string4 != null) {
            builder.setAwsMobileAnalyticsIdentityPoolId(string4);
        }
        String string5 = getString("metrics_kinesis_stream_name");
        if (string5 != null) {
            builder.setMobilyticsKinesisStreamName(string5);
        }
        String string6 = getString("metrics_kinesis_cognito_pool_id");
        if (string6 != null) {
            builder.setMobilyticsKinesisCognitoIdentityPoolId(string6);
        }
        String string7 = getString("metrics_kinesis_region");
        if (string7 != null) {
            builder.setMobilyticsKinesisRegion(string7);
        }
        Long l5 = getLong("playback_resuming_timeout");
        if (l5 != null) {
            builder.setPlaybackResumingTimeout(l5);
        }
        Boolean bool = getBoolean("remove_notification_on_teardown");
        if (bool != null) {
            builder.setRemoveNotificationOnTeardown(bool);
        }
        String string8 = getString("metrics_service_name");
        if (!TextUtils.isEmpty(string8)) {
            builder.setMetricsServiceName(string8);
        }
        String string9 = getString("backup_ww_model");
        if (!TextUtils.isEmpty(string9)) {
            builder.setBackupWakeWordModelAssetFileName(string9);
        }
        String string10 = getString("alexa_profile_override");
        if (!TextUtils.isEmpty(string10)) {
            builder.setAlexaProfileOverride(string10);
        }
        Boolean bool2 = getBoolean("location_permissions_allowed");
        if (bool2 != null) {
            builder.setLocationPermissionsAllowed(bool2);
        }
        Boolean bool3 = getBoolean("transport_bar_custom_actions_enabled");
        if (bool3 != null) {
            builder.setTransportBarCustomActionsEnabled(bool3);
        }
        Boolean bool4 = getBoolean("multi_ww_enabled");
        if (bool4 != null) {
            builder.setMultiWwEnabled(bool4);
        }
        Boolean bool5 = getBoolean("hardcoded_capabilities_disabled");
        if (bool5 != null) {
            builder.setHardcodedCapabilitiesDisabled(bool5);
        }
        String string11 = getString("datamart_namespace");
        if (!TextUtils.isEmpty(string11)) {
            builder.setDatamartNamespace(string11);
        }
        Boolean bool6 = getBoolean("supports_pfm_changed");
        if (bool6 != null) {
            builder.setSupportsPfmChanged(bool6);
        }
        String string12 = getString("alexa_product_id");
        if (string12 != null) {
            builder.setAlexaProductId(string12);
        }
        Set<SDKFeature> featuresToDisable = getFeaturesToDisable();
        if (!featuresToDisable.isEmpty()) {
            builder.setFeaturesToDisable(featuresToDisable);
        }
        String string13 = getString("host_app_name");
        if (TextUtils.isEmpty(string13)) {
            return;
        }
        builder.setHostAppName(string13);
    }
}
