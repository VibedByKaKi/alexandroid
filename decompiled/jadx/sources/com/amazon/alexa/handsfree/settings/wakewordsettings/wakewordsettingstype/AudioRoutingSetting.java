package com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceConnection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class AudioRoutingSetting {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class HandsFreeCapableAppDeregisterSetting extends WakeWordProviderSettings<Void> {
        private final String mCapableApp;
        private final String mTag;
        private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

        public HandsFreeCapableAppDeregisterSetting(@NonNull String str, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection, @NonNull ResultCallback<Void> resultCallback) {
            super(resultCallback);
            this.mTag = HandsFreeCapableAppDeregisterSetting.class.getSimpleName();
            this.mCapableApp = str;
            this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
        }

        @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
        public Void apply() throws RemoteException {
            WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection = this.mWakeWordSettingsServiceConnection;
            if (wakeWordSettingsServiceConnection == null) {
                Log.e(this.mTag, "WakeWordSettingsServiceConnection is null");
                return null;
            }
            wakeWordSettingsServiceConnection.deregisterHandsFreeCapableApp(this.mCapableApp, getCallback());
            this.mWakeWordSettingsServiceConnection.endConnection();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class HandsFreeCapableAppListCheckSetting extends WakeWordProviderSettings<List<String>> {
        private final String mTag;
        private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

        public HandsFreeCapableAppListCheckSetting(@Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection, @NonNull ResultCallback<List<String>> resultCallback) {
            super(resultCallback);
            this.mTag = HandsFreeCapableAppListCheckSetting.class.getSimpleName();
            this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
        }

        @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
        public List<String> apply() throws RemoteException {
            WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection = this.mWakeWordSettingsServiceConnection;
            if (wakeWordSettingsServiceConnection == null) {
                Log.e(this.mTag, "WakeWordSettingsServiceConnection is null");
                return null;
            }
            List<String> handsFreeCapableAppList = wakeWordSettingsServiceConnection.getHandsFreeCapableAppList();
            this.mWakeWordSettingsServiceConnection.endConnection();
            return handsFreeCapableAppList;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class HandsFreeCapableAppRegisterSetting extends WakeWordProviderSettings<Void> {
        private final String mCapableApp;
        private final String mTag;
        private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

        public HandsFreeCapableAppRegisterSetting(@NonNull String str, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection, @NonNull ResultCallback<Void> resultCallback) {
            super(resultCallback);
            this.mTag = HandsFreeCapableAppRegisterSetting.class.getSimpleName();
            this.mCapableApp = str;
            this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
        }

        @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
        public Void apply() throws RemoteException {
            WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection = this.mWakeWordSettingsServiceConnection;
            if (wakeWordSettingsServiceConnection == null) {
                Log.e(this.mTag, "WakeWordSettingsServiceConnection is null");
                return null;
            }
            wakeWordSettingsServiceConnection.registerHandsFreeCapableApp(this.mCapableApp, getCallback());
            this.mWakeWordSettingsServiceConnection.endConnection();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PreferredAmazonAppCheckSetting extends WakeWordProviderSettings<String> {
        private final String mTag;
        private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

        public PreferredAmazonAppCheckSetting(@Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection, @NonNull ResultCallback<String> resultCallback) {
            super(resultCallback);
            this.mTag = PreferredAmazonAppCheckSetting.class.getSimpleName();
            this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
        }

        @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
        public String apply() throws RemoteException {
            WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection = this.mWakeWordSettingsServiceConnection;
            if (wakeWordSettingsServiceConnection == null) {
                Log.e(this.mTag, "WakeWordSettingsServiceConnection is null");
                return null;
            }
            String preferredAmazonApp = wakeWordSettingsServiceConnection.getPreferredAmazonApp();
            this.mWakeWordSettingsServiceConnection.endConnection();
            return preferredAmazonApp;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PreferredAmazonAppUpdaterSetting extends WakeWordProviderSettings<Void> {
        private final String mPreferredApp;
        private final String mTag;
        private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

        public PreferredAmazonAppUpdaterSetting(@NonNull String str, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection, @NonNull ResultCallback<Void> resultCallback) {
            super(resultCallback);
            this.mTag = PreferredAmazonAppUpdaterSetting.class.getSimpleName();
            this.mPreferredApp = str;
            this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
        }

        @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
        public Void apply() throws RemoteException {
            WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection = this.mWakeWordSettingsServiceConnection;
            if (wakeWordSettingsServiceConnection == null) {
                Log.e(this.mTag, "WakeWordSettingsServiceConnection is null");
                return null;
            }
            wakeWordSettingsServiceConnection.setPreferredAmazonApp(this.mPreferredApp, getCallback());
            this.mWakeWordSettingsServiceConnection.endConnection();
            return null;
        }
    }
}
