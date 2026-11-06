package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DMSRegistrationExecutor$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ DMSRegistrationExecutor$$ExternalSyntheticLambda4(String str, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = z;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.f$1;
                Automotive$$ExternalSyntheticOutline0.m(this.f$0, (String) obj, z, (Map) null);
                break;
            case 1:
                boolean z2 = this.f$1;
                Automotive$$ExternalSyntheticOutline0.m(this.f$0, (String) obj, z2, (Map) null);
                break;
            case 2:
                DMSRegistrationExecutor.lambda$recordDeviceRegistrationMetric$9(this.f$0, this.f$1, (Throwable) obj);
                break;
            case 3:
                DMSRegistrationExecutor.lambda$recordDeviceDeRegistrationMetric$11(this.f$0, this.f$1, (Throwable) obj);
                break;
            case 4:
                boolean z3 = this.f$1;
                Automotive$$ExternalSyntheticOutline0.m(this.f$0, (String) obj, z3, (Map) null);
                break;
            default:
                Automotive$$ExternalSyntheticOutline0.m(this.f$0, "Unknown", this.f$1, (Map) null);
                break;
        }
    }
}
