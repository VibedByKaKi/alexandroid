package com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.wakewordsettings.connection.WakeWordSettingsServiceConnection;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class LocaleSupportedSettingV2 extends WakeWordProviderSettings<List<String>> {
    private static final String TAG = "LocaleSupportedSettingV2";
    private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

    public LocaleSupportedSettingV2(@NonNull ResultCallback<List<String>> resultCallback, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection) {
        super(resultCallback);
        this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
    }

    @VisibleForTesting
    public List<String> getSupportedLocales() throws RemoteException {
        try {
            try {
                return this.mWakeWordSettingsServiceConnection.getSupportedLocales();
            } catch (Exception e) {
                Log.e(TAG, "Exception in getSupportedLocales ", e, new Object[0]);
                throw new RemoteException();
            }
        } finally {
            this.mWakeWordSettingsServiceConnection.endConnection();
        }
    }

    @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
    public List<String> apply() throws RemoteException {
        return getSupportedLocales();
    }
}
