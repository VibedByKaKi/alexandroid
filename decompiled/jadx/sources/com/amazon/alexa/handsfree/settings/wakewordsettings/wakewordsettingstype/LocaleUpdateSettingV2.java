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
final class LocaleUpdateSettingV2 extends WakeWordProviderSettings<Void> {
    private static final String TAG = "LocaleUpdateSettingV2";
    private final String mLocale;
    private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

    public LocaleUpdateSettingV2(@NonNull String str, @NonNull ResultCallback<Void> resultCallback, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection) {
        super(resultCallback);
        this.mLocale = str;
        this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
    }

    @VisibleForTesting
    public void setLocale() throws RemoteException {
        try {
            try {
                this.mWakeWordSettingsServiceConnection.setLocale(this.mLocale, getCallback());
            } catch (Exception e) {
                Log.i(TAG, "Exception in setLocale ", e);
                throw new RemoteException();
            }
        } finally {
            this.mWakeWordSettingsServiceConnection.endConnection();
        }
    }

    @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
    public Void apply() throws RemoteException {
        setLocale();
        return null;
    }
}
