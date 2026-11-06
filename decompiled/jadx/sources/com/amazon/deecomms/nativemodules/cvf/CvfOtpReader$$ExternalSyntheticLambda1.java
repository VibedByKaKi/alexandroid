package com.amazon.deecomms.nativemodules.cvf;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CvfOtpReader$$ExternalSyntheticLambda1 implements OnFailureListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CvfOtpReader$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((CvfOtpReader) obj).lambda$startSmsConsentListener$2(exc);
                break;
            default:
                ((CvfPhoneNumberPicker) obj).handleHintIntentFailure(exc);
                break;
        }
    }
}
