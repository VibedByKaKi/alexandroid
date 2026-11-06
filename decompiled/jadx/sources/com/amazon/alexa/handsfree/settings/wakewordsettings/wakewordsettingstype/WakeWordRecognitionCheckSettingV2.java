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
final class WakeWordRecognitionCheckSettingV2 extends WakeWordProviderSettings<Boolean> {
    private static final String TAG = "WakeWordRecognitionCheckSettingV2";
    private final WakeWordSettingsServiceConnection mWakeWordSettingsServiceConnection;

    public WakeWordRecognitionCheckSettingV2(@NonNull ResultCallback<Boolean> resultCallback, @Nullable WakeWordSettingsServiceConnection wakeWordSettingsServiceConnection) {
        super(resultCallback);
        this.mWakeWordSettingsServiceConnection = wakeWordSettingsServiceConnection;
    }

    @VisibleForTesting
    public Boolean isWakeWordRecognitionEnabled() throws RemoteException {
        try {
            try {
                return Boolean.valueOf(this.mWakeWordSettingsServiceConnection.isWakeWordRecognitionEnabled());
            } catch (Exception e) {
                Log.e(TAG, "Exception invoking isWakeWordRecognitionEnabled ", e, new Object[0]);
                throw new RemoteException("RemoteException invoking isWakeWordRecognitionEnabled");
            }
        } finally {
            this.mWakeWordSettingsServiceConnection.endConnection();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype.WakeWordProviderSettings
    public Boolean apply() throws RemoteException {
        return isWakeWordRecognitionEnabled();
    }
}
