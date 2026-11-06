package com.amazon.deecomms.nativemodules.cvf;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CvfOtpReader$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CvfOtpReader$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object lambda$new$0;
        Object lambda$new$02;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = ((CvfOtpReader) obj).lambda$new$0();
                return lambda$new$0;
            default:
                lambda$new$02 = ((CvfPhoneNumberPicker) obj).lambda$new$0();
                return lambda$new$02;
        }
    }
}
