package com.amazon.alexa.presence.service;

import android.util.Log;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.marketplace.api.CountryCode;
import com.amazon.alexa.marketplace.api.Marketplace;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceServiceConfiguration {
    public static final String ALL = "*";
    public static final String ALPHA = "alpha";
    public static final String BETA = "beta";
    private static final Configuration DEFAULT_CONFIG;
    private static final String DEFAULT_ENDPOINT = "https://api.amazonalexa.com";
    private static final String DEFAULT_MARKETPLACE = "us";
    private static final String DEFAULT_STAGE_KEY = "prod";
    public static final String FOREGROUND_SERVICE_ENABLED = "foregroundService.enabled";
    public static final String FOREGROUND_SERVICE_ENABLED_DEE_FEATURE = "ALEXA_PRESENCE_BLECONN_LAUNCH";
    public static final String FOREGROUND_SERVICE_ENABLED_DEE_FEATURE_2 = "ALEXA_MOBILE_PRESENCE_BLE_V2_ANDROID";
    public static final String FOREGROUND_SERVICE_ENABLED_GATING_KEY = "foregroundService.feature";
    public static final String GAMMA = "gamma";
    public static final String IDENTITY_CLIENT_ENDPOINT = "identityClient.endpoint";
    public static final String IDENTITY_CLIENT_USE_LOCAL_SHIM = "identityClient.useLocalShim";
    public static final String PROD = "prod";
    private static final String TAG = "com.amazon.alexa.presence.service.PresenceServiceConfiguration";
    public static final String US = "us";
    private final Configuration config;
    private final String marketplace;
    private final String stage;

    static {
        Configuration configuration = new Configuration();
        DEFAULT_CONFIG = configuration;
        configuration.set("*", "*", FOREGROUND_SERVICE_ENABLED, "false");
        configuration.set("*", "us", FOREGROUND_SERVICE_ENABLED, "true");
        configuration.set("*", "*", IDENTITY_CLIENT_ENDPOINT, "https://api.amazonalexa.com");
        configuration.set("alpha", "us", IDENTITY_CLIENT_ENDPOINT, "https://aprs-q9g-na-pdx-pd-tcp.integ.amazon.com");
        configuration.set("beta", "us", IDENTITY_CLIENT_ENDPOINT, "https://aprs-q9g-na-pdx-d-tcp.integ.amazon.com");
        configuration.set("gamma", "us", IDENTITY_CLIENT_ENDPOINT, "https://aprs-q9g-main-na-pp-tcp.iad.amazon.com");
        configuration.set("beta", "us", IDENTITY_CLIENT_USE_LOCAL_SHIM, false);
        configuration.set("*", "*", FOREGROUND_SERVICE_ENABLED_GATING_KEY, FOREGROUND_SERVICE_ENABLED_DEE_FEATURE);
    }

    public PresenceServiceConfiguration(String str, String str2, Configuration configuration) {
        this.stage = str.toLowerCase();
        this.marketplace = str2.toLowerCase();
        this.config = configuration;
    }

    public static PresenceServiceConfiguration defaultConfiguration() {
        return new PresenceServiceConfiguration(findStage(), findMarketplace(), DEFAULT_CONFIG);
    }

    private static String findMarketplace() {
        try {
            IdentityService identityService = (IdentityService) ComponentRegistry.getInstance().get(IdentityService.class).orNull();
            CountryCode countryCode = null;
            UserIdentity user = identityService == null ? null : identityService.getUser(PresenceServiceConfiguration.class.getName());
            Marketplace marketplace = user == null ? null : user.getMarketplace();
            if (marketplace != null) {
                countryCode = marketplace.getCountryCode();
            }
            if (countryCode != null) {
                return countryCode.getCountryCode();
            }
            Log.w(TAG, "Unable to locate IdentityService, using default marketplace configuration");
            return "us";
        } catch (Throwable th) {
            Log.w(TAG, th);
            return "us";
        }
    }

    private static String findStage() {
        try {
            EnvironmentService environmentService = (EnvironmentService) ComponentRegistry.getInstance().get(EnvironmentService.class).orNull();
            if (environmentService != null) {
                return environmentService.getBuildStage();
            }
            Log.w(TAG, "Unable to locate EnvironmentService, using default stage configuration.");
            return "prod";
        } catch (Throwable th) {
            Log.w(TAG, th);
            return "prod";
        }
    }

    public String foregroundServiceFeature() {
        return this.config.getString(this.stage, this.marketplace, FOREGROUND_SERVICE_ENABLED_GATING_KEY);
    }

    public String getIdentityEndpoint() {
        return this.config.getString(this.stage, this.marketplace, IDENTITY_CLIENT_ENDPOINT);
    }

    public String getMarketplace() {
        return this.marketplace;
    }

    public String getStage() {
        return this.stage;
    }

    public boolean isForegroundServiceEnabled() {
        return this.config.getBoolean(this.stage, this.marketplace, FOREGROUND_SERVICE_ENABLED).booleanValue();
    }

    public boolean shouldUseLocalShim() {
        return this.config.getBoolean(this.stage, this.marketplace, IDENTITY_CLIENT_USE_LOCAL_SHIM).booleanValue();
    }

    public String toString() {
        return this.config.dump();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Configuration {
        private static final List<String> KEY_ORDER = Collections.unmodifiableList(Arrays.asList("#{stage}.#{marketplace}", "#{stage}.*", "*.#{marketplace}", "*.*"));
        private final Map<String, String> configuration = new HashMap();

        private String get(String str, String str2, String str3) {
            Iterator<String> it2 = KEY_ORDER.iterator();
            while (it2.hasNext()) {
                String str4 = this.configuration.get(indexingKeyFrom(templateKeyBase(it2.next(), str, str2), str3));
                if (str4 != null) {
                    return str4;
                }
            }
            return null;
        }

        private static String indexingKeyFrom(String str, String str2, String str3) {
            return ParcelCompat$$ExternalSyntheticOutline0.m(str.toLowerCase(), ".", str2.toLowerCase(), ".", str3);
        }

        private static String templateKeyBase(String str, String str2, String str3) {
            return str.replace("#{stage}", str2.toLowerCase()).replace("#{marketplace}", str3.toLowerCase());
        }

        public String dump() {
            StringBuilder sb = new StringBuilder();
            for (String str : this.configuration.keySet()) {
                sb.append(String.format("%s=%s\n", str, this.configuration.get(str)));
            }
            return sb.toString();
        }

        public Boolean getBoolean(String str, String str2, String str3) {
            return Boolean.valueOf(Boolean.parseBoolean(get(str, str2, str3)));
        }

        public String getString(String str, String str2, String str3) {
            return get(str, str2, str3);
        }

        public String set(String str, String str2, String str3, String str4) {
            return this.configuration.put(indexingKeyFrom(str.toLowerCase(), str2.toLowerCase(), str3), str4);
        }

        private static String indexingKeyFrom(String str, String str2) {
            return a$$ExternalSyntheticOutline0.m$1(str.toLowerCase(), ".", str2);
        }

        public String set(String str, String str2, String str3, boolean z) {
            return this.configuration.put(indexingKeyFrom(str, str2, str3), Boolean.toString(z));
        }
    }

    public PresenceServiceConfiguration(String str, String str2) {
        this(str, str2, DEFAULT_CONFIG);
    }

    public PresenceServiceConfiguration() {
        this(findStage(), findMarketplace(), DEFAULT_CONFIG);
    }
}
