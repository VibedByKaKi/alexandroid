package com.amazon.alexa.handsfree.settings.client.settings;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.audioproviderservice.AlexaAudioProviderServiceMessageSender;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.client.callback.SuccessCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class AlexaAudioProviderSettingRunnable<T> implements Runnable {
    private static final String TAG = "AlexaAudioProviderSettingRunnable";
    private final AlexaAudioProviderSetting<T> mAlexaAudioProviderSetting;
    private Handler mHandler;
    private AlexaAudioProviderServiceMessageSender mMessageSender;
    private final SuccessCallback<Void> mSettingCompleteCb;

    public AlexaAudioProviderSettingRunnable(@NonNull AlexaAudioProviderServiceMessageSender alexaAudioProviderServiceMessageSender, @NonNull SuccessCallback<Void> successCallback, @NonNull AlexaAudioProviderSetting<T> alexaAudioProviderSetting) {
        this(alexaAudioProviderServiceMessageSender, successCallback, alexaAudioProviderSetting, new Handler(Looper.getMainLooper()));
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                final T apply = this.mAlexaAudioProviderSetting.apply(this.mMessageSender);
                this.mHandler.post(new Runnable() { // from class: com.amazon.alexa.handsfree.settings.client.settings.AlexaAudioProviderSettingRunnable.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        AlexaAudioProviderSettingRunnable.this.mAlexaAudioProviderSetting.getCallback().onResult(apply);
                        AlexaAudioProviderSettingRunnable.this.mSettingCompleteCb.onSuccess(null);
                    }
                });
            } catch (RemoteException e) {
                this.mHandler.post(new Runnable() { // from class: com.amazon.alexa.handsfree.settings.client.settings.AlexaAudioProviderSettingRunnable.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AlexaAudioProviderSettingRunnable.this.mAlexaAudioProviderSetting.getCallback().onError(new CallbackErrorMetadata(e.getMessage()));
                        AlexaAudioProviderSettingRunnable.this.mSettingCompleteCb.onSuccess(null);
                    }
                });
            } catch (Exception e2) {
                this.mHandler.post(new Runnable() { // from class: com.amazon.alexa.handsfree.settings.client.settings.AlexaAudioProviderSettingRunnable.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.w(AlexaAudioProviderSettingRunnable.TAG, String.format("Failed to apply setting %s: %s", AlexaAudioProviderSettingRunnable.this.mAlexaAudioProviderSetting, e2));
                        AlexaAudioProviderSettingRunnable.this.mAlexaAudioProviderSetting.getCallback().onError(new CallbackErrorMetadata(e2.getMessage()));
                        AlexaAudioProviderSettingRunnable.this.mSettingCompleteCb.onSuccess(null);
                    }
                });
            }
        } finally {
            this.mMessageSender.release();
        }
    }

    @VisibleForTesting
    public AlexaAudioProviderSettingRunnable(@NonNull AlexaAudioProviderServiceMessageSender alexaAudioProviderServiceMessageSender, @NonNull SuccessCallback<Void> successCallback, @NonNull AlexaAudioProviderSetting<T> alexaAudioProviderSetting, @NonNull Handler handler) {
        this.mMessageSender = alexaAudioProviderServiceMessageSender;
        this.mAlexaAudioProviderSetting = alexaAudioProviderSetting;
        this.mHandler = handler;
        this.mSettingCompleteCb = successCallback;
    }
}
