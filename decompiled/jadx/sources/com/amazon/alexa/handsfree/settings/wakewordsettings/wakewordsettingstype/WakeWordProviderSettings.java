package com.amazon.alexa.handsfree.settings.wakewordsettings.wakewordsettingstype;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class WakeWordProviderSettings<T> {
    private static final String TAG = "WakeWordProviderSettings";
    private final ResultCallback<T> mCallback;

    public WakeWordProviderSettings(@NonNull ResultCallback<T> resultCallback) {
        this.mCallback = resultCallback;
    }

    public abstract T apply() throws RemoteException;

    public void applySetting() {
        try {
            this.mCallback.onResult(apply());
        } catch (Exception e) {
            Log.e(TAG, "Exception in applying wake word settings ", e, new Object[0]);
            this.mCallback.onError(new CallbackErrorMetadata(e.getMessage()));
        }
    }

    public ResultCallback<T> getCallback() {
        return this.mCallback;
    }
}
