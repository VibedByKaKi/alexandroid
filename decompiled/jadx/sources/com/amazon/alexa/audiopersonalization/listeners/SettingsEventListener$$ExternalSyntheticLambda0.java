package com.amazon.alexa.audiopersonalization.listeners;

import com.amazon.alexa.accessory.protocol.Hearing;
import com.amazon.alexa.audiopersonalization.api.ErrorDelegate;
import com.amazon.alexa.audiopersonalization.api.ErrorMessageDelegate;
import com.amazon.alexa.audiopersonalization.api.SuccessDelegate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SettingsEventListener$$ExternalSyntheticLambda0 implements SuccessDelegate, ErrorMessageDelegate, ErrorDelegate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SettingsEventListener f$0;

    public /* synthetic */ SettingsEventListener$$ExternalSyntheticLambda0(SettingsEventListener settingsEventListener, int i) {
        this.$r8$classId = i;
        this.f$0 = settingsEventListener;
    }

    @Override // com.amazon.alexa.audiopersonalization.api.ErrorMessageDelegate
    public void onError(Throwable th) {
        int i = this.$r8$classId;
        SettingsEventListener settingsEventListener = this.f$0;
        switch (i) {
            case 1:
                settingsEventListener.lambda$sendAudioProfileStatus$5(th);
                break;
            default:
                settingsEventListener.lambda$sendFeatureStatus$1(th);
                break;
        }
    }

    @Override // com.amazon.alexa.audiopersonalization.api.SuccessDelegate
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        SettingsEventListener settingsEventListener = this.f$0;
        switch (i) {
            case 0:
                settingsEventListener.lambda$sendPersonalizationLevel$2((Integer) obj);
                break;
            case 3:
                settingsEventListener.lambda$sendFeatureStatus$0((Boolean) obj);
                break;
            default:
                settingsEventListener.lambda$sendAudioProfileStatus$4((Hearing.Audiogram) obj);
                break;
        }
    }

    @Override // com.amazon.alexa.audiopersonalization.api.ErrorDelegate
    public void onError() {
        this.f$0.lambda$sendPersonalizationLevel$3();
    }
}
