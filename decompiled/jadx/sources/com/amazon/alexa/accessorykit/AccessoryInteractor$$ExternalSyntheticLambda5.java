package com.amazon.alexa.accessorykit;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessoryclient.common.api.ConnectionStatus;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.functions.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryInteractor$$ExternalSyntheticLambda5 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryInteractor f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Accessory f$2;

    public /* synthetic */ AccessoryInteractor$$ExternalSyntheticLambda5(AccessoryInteractor accessoryInteractor, String str, Accessory accessory, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryInteractor;
        this.f$1 = str;
        this.f$2 = accessory;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        CompletableSource lambda$createSessionClient$8;
        CompletableSource lambda$createSessionClient$7;
        switch (this.$r8$classId) {
            case 0:
                lambda$createSessionClient$8 = this.f$0.lambda$createSessionClient$8(this.f$1, this.f$2, (ConnectionStatus) obj);
                return lambda$createSessionClient$8;
            default:
                lambda$createSessionClient$7 = this.f$0.lambda$createSessionClient$7(this.f$1, this.f$2, (Boolean) obj);
                return lambda$createSessionClient$7;
        }
    }
}
