package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.MobilyticsDynamicConfigProvider;
import com.amazon.alexa.mobilytics.configuration.MigrationBypassPolicyConfig;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.integration.ama.MinervaMigrationPolicy;
import com.amazon.alexa.mobilytics.internal.JsonConverter;
import com.amazon.alexa.mobilytics.util.Log;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class ConfigManager {
    public static final String DENYLIST_DEFAULT_VALUE = "";
    public static final String DENYLIST_KEY = "denylist_config";
    public static final String MIGRATION_BYPASS_POLICY_KEY = "migration_bypass_policy";
    public static final String MIGRATION_CONFIG_KEY = "migration_config";
    private static final String TAG = Log.tag((Class<?>) ConfigManager.class);
    public static final String THROTTLE_CONFIG = "throttle_config";
    private Config config;
    private MobilyticsConfiguration configuration;
    private final JsonConverter converter;
    private DCMDeprecationListConfigV2 dcmDeprecationListConfigV2;
    private final Config defaultConfig;
    private DenylistConfig denylistConfig;
    private int domain;
    private ThrottleConfig throttleConfig = new ThrottleConfig();
    private volatile MigrationConfig migrationConfig = new MigrationConfig();
    private volatile MigrationBypassPolicyConfig migrationBypassPolicyConfig = new MigrationBypassPolicyConfig();
    private volatile Map<String, MinervaMigrationPolicy.BypassMatcher> bypassMatchers = Collections.EMPTY_MAP;

    @Inject
    public ConfigManager(@NonNull @Named("DEFAULT_JSON_CONVERTER") JsonConverter jsonConverter, @NonNull Config config) {
        this.converter = (JsonConverter) Preconditions.checkNotNull(jsonConverter);
        Config config2 = (Config) Preconditions.checkNotNull(config);
        this.defaultConfig = config2;
        this.config = config2;
    }

    private static Map<String, MinervaMigrationPolicy.BypassMatcher> compileBypassMatchers(@Nullable MigrationBypassPolicyConfig migrationBypassPolicyConfig) {
        if (migrationBypassPolicyConfig == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, MigrationBypassPolicyConfig.BypassRule> entry : migrationBypassPolicyConfig.bypass().entrySet()) {
            MinervaMigrationPolicy.BypassMatcher from = MinervaMigrationPolicy.BypassMatcher.from(entry.getValue());
            if (entry.getKey() != null && from != null) {
                hashMap.put(entry.getKey(), from);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Nullable
    private DenylistConfig updatedDenylist() {
        MobilyticsDynamicConfigProvider dynamicConfigProvider;
        if (this.configuration.userProvider().user() == null || !this.configuration.userProvider().user().hasFeature("ALEXA_MOBILE_ANALYTICS#ALEXA_MOBILYTICS_DYNAMIC_DENYLIST_ANDROID") || (dynamicConfigProvider = this.configuration.dynamicConfigProvider()) == null) {
            return null;
        }
        return (DenylistConfig) dynamicConfigProvider.dynamicConfig(DENYLIST_KEY, new DenylistConfig());
    }

    @Nullable
    public MinervaMigrationPolicy.BypassMatcher bypassMatcher(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.bypassMatchers.get(str);
    }

    public Config config() {
        return this.config;
    }

    public DCMDeprecationListConfigV2 dcmDeprecationListConfigV2() {
        return this.dcmDeprecationListConfigV2;
    }

    @NonNull
    public Config defaultConfig() {
        return this.defaultConfig;
    }

    public DenylistConfig denylistConfig() {
        return this.denylistConfig;
    }

    public void initialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        this.configuration = mobilyticsConfiguration;
    }

    public MigrationConfig migrationConfig() {
        return this.migrationConfig;
    }

    public void onUserChanged(@Nullable MobilyticsUser mobilyticsUser) {
        Log.enter();
        Log.leave();
    }

    public boolean readDenylistConfig() {
        DenylistConfig updatedDenylist = updatedDenylist();
        if (updatedDenylist == null) {
            return false;
        }
        this.denylistConfig = updatedDenylist;
        return true;
    }

    public boolean readMigrationConfig() {
        MobilyticsDynamicConfigProvider dynamicConfigProvider = this.configuration.dynamicConfigProvider();
        if (dynamicConfigProvider == null) {
            return false;
        }
        MigrationBypassPolicyConfig migrationBypassPolicyConfig = (MigrationBypassPolicyConfig) dynamicConfigProvider.dynamicConfig(MIGRATION_BYPASS_POLICY_KEY, this.migrationBypassPolicyConfig);
        if (migrationBypassPolicyConfig == null) {
            migrationBypassPolicyConfig = new MigrationBypassPolicyConfig();
        }
        this.migrationBypassPolicyConfig = migrationBypassPolicyConfig;
        this.bypassMatchers = compileBypassMatchers(this.migrationBypassPolicyConfig);
        this.migrationConfig = (MigrationConfig) dynamicConfigProvider.dynamicConfig(MIGRATION_CONFIG_KEY, this.migrationConfig);
        return true;
    }

    public boolean readThrottleConfig() {
        MobilyticsDynamicConfigProvider dynamicConfigProvider;
        if (this.configuration.userProvider().user() == null || !this.configuration.userProvider().user().hasAccessToExperiment("ALEXA_MOBILE_ANALYTICS#ALEXA_MOBILYTICS_THROTTLE_CONFIG_ANDROID") || (dynamicConfigProvider = this.configuration.dynamicConfigProvider()) == null) {
            Log.d(TAG, "Throttle feature is off, we are not reading");
            return false;
        }
        ThrottleConfig throttleConfig = (ThrottleConfig) dynamicConfigProvider.dynamicConfig(THROTTLE_CONFIG, this.throttleConfig);
        this.throttleConfig = throttleConfig;
        Log.d(TAG, "Throttle feature is on, initThrottleCredit is %d", Integer.valueOf(throttleConfig.initThrottleCredit()));
        return true;
    }

    public ThrottleConfig throttleConfig() {
        return this.throttleConfig;
    }
}
