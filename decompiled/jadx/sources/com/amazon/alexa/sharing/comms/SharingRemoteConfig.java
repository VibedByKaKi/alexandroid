package com.amazon.alexa.sharing.comms;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.sharing.Constants;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SharingRemoteConfig {
    private static final String TAG = "SharingRemoteConfig";
    private static SharingRemoteConfig instance;
    Lazy<AlexaCommsCoreRemoteConfigurationService> commsConfigService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum RemoteKey {
        ALEXA_SERVICE_HOST("ACMS.Endpoints.PFM.US", "https://alexa-comms-mobile-service.amazon.com"),
        ACMS_SEND_MSG_TIMEOUT("ACMS.TimeoutsSec.SendMessages", Constants.DEFAULT_SENDMSG_TIMEOUT),
        ACMS_GET_SINGLE_MSG_RETRY_BACKOFF_TIME("ACMS.BackOffTimeMs.GetSingleMessage", "200");

        public final Object defaultValue;
        public final String remoteKey;

        RemoteKey(String str, Object obj) {
            this.remoteKey = str;
            this.defaultValue = obj;
        }

        @Nullable
        public static RemoteKey getKeyByName(@NonNull String str) {
            for (RemoteKey remoteKey : values()) {
                if (str.equals(remoteKey.name())) {
                    return remoteKey;
                }
            }
            return null;
        }

        @NonNull
        public String getConfigKey() {
            return this.remoteKey;
        }

        @NonNull
        public Object getDefault() {
            return this.defaultValue;
        }
    }

    private SharingRemoteConfig(Lazy<AlexaCommsCoreRemoteConfigurationService> lazy) {
        this.commsConfigService = lazy;
    }

    @VisibleForTesting
    public static void clearInstance() {
        instance = null;
    }

    public static SharingRemoteConfig getInstance(Lazy<AlexaCommsCoreRemoteConfigurationService> lazy) {
        if (instance == null) {
            instance = new SharingRemoteConfig(lazy);
        }
        return instance;
    }

    @NonNull
    public String getStringValue(@NonNull RemoteKey remoteKey) {
        AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService = this.commsConfigService.get();
        if (alexaCommsCoreRemoteConfigurationService == null) {
            return (String) remoteKey.getDefault();
        }
        try {
            return alexaCommsCoreRemoteConfigurationService.getRemoteConfiguration(remoteKey.getConfigKey(), remoteKey.getDefault()).toString();
        } catch (Exception unused) {
            Log.w(TAG, "Config Service failed to retrieve key " + remoteKey.getConfigKey() + ". Using default values.");
            return (String) remoteKey.getDefault();
        }
    }

    @NonNull
    public Object getValue(@NonNull RemoteKey remoteKey) {
        AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService = this.commsConfigService.get();
        if (alexaCommsCoreRemoteConfigurationService == null) {
            return remoteKey.getDefault();
        }
        try {
            return alexaCommsCoreRemoteConfigurationService.getRemoteConfiguration(remoteKey.getConfigKey(), remoteKey.getDefault()).getRawValue();
        } catch (Exception unused) {
            Log.w(TAG, "Config Service failed to retrieve key " + remoteKey.getConfigKey() + ". Using default values.");
            return remoteKey.getDefault();
        }
    }

    @Nullable
    public Object getValueByName(@NonNull String str) {
        return getValue(RemoteKey.getKeyByName(str));
    }
}
