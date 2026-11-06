package com.amazon.alexa.enrollment.unified.speakerid;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SpeakerIDEnrollmentProvider$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpeakerIDEnrollmentProvider f$0;

    public /* synthetic */ SpeakerIDEnrollmentProvider$$ExternalSyntheticLambda7(SpeakerIDEnrollmentProvider speakerIDEnrollmentProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = speakerIDEnrollmentProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SpeakerIDEnrollmentProvider speakerIDEnrollmentProvider = this.f$0;
        switch (i) {
            case 0:
                speakerIDEnrollmentProvider.lambda$timeoutReschedule$8();
                break;
            default:
                speakerIDEnrollmentProvider.lambda$startSpeechletTimer$4();
                break;
        }
    }
}
