package com.amazon.deecomms.nativemodules.cvf;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CvfOtpReader$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ CvfOtpReader$$ExternalSyntheticLambda0(Object obj, Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = context;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((CvfOtpReader) this.f$0).lambda$startSmsConsentListener$1(this.f$1, (Void) obj);
                break;
            default:
                ((CvfPhoneNumberPicker) this.f$0).lambda$showPhoneNumberHint$1((Activity) this.f$1, (PendingIntent) obj);
                break;
        }
    }
}
