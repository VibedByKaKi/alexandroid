package com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class LocaleCheckSettingV2 extends WakeWordProviderSettings<String> {
    private static final String TAG = "LocaleCheckSettingV2";
    private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

    public LocaleCheckSettingV2(@NonNull ResultCallback<String> resultCallback, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection) {
        super(resultCallback);
        this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
    }

    @VisibleForTesting
    public String getLocale() throws RemoteException {
        try {
            try {
                String locale = this.mWakeWordSettingsServiceConnection.getLocale();
                Log.d(TAG, "Got currentLocale = " + locale);
                return locale;
            } catch (Exception e) {
                Log.e(TAG, "Exception in getLocale ", e, new Object[0]);
                throw new RemoteException();
            }
        } finally {
            this.mWakeWordSettingsServiceConnection.endConnection();
        }
    }

    @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
    public String apply() throws RemoteException {
        return getLocale();
    }
}
