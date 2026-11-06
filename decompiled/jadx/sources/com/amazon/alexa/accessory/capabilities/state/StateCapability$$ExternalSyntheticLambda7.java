package com.amazon.alexa.accessory.capabilities.state;

import com.amazon.alexa.accessory.registration.DMSRegistrationExecutor;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class StateCapability$$ExternalSyntheticLambda7 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ StateCapability$$ExternalSyntheticLambda7(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((StateCapability) this.f$0).lambda$getGetPhoneStateHandler$5(this.f$1, (Throwable) obj);
                break;
            case 1:
                DMSRegistrationExecutor.lambda$recordRegistrationStatusCode$12((String) this.f$0, this.f$1, (String) obj);
                break;
            default:
                DMSRegistrationExecutor.lambda$recordRegistrationStatusCode$13((String) this.f$0, this.f$1, (Throwable) obj);
                break;
        }
    }
}
