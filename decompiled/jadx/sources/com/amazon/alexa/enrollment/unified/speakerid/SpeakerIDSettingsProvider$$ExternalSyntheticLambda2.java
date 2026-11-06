package com.amazon.alexa.enrollment.unified.speakerid;

import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SpeakerIDSettingsProvider$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpeakerIDSettingsProvider f$0;
    public final /* synthetic */ ResultCallback f$1;

    public /* synthetic */ SpeakerIDSettingsProvider$$ExternalSyntheticLambda2(SpeakerIDSettingsProvider speakerIDSettingsProvider, ResultCallback resultCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = speakerIDSettingsProvider;
        this.f$1 = resultCallback;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$hasUserOptedInForVoicePrivacySettings$4(this.f$1, (Boolean) obj);
                break;
            case 1:
                this.f$0.lambda$hasUserOptedInForVoicePrivacySettings$5(this.f$1, (Throwable) obj);
                break;
            case 2:
                this.f$0.lambda$isUVREnrolled$0(this.f$1, (Boolean) obj);
                break;
            default:
                this.f$0.lambda$isUVREnrolled$1(this.f$1, (Throwable) obj);
                break;
        }
    }
}
