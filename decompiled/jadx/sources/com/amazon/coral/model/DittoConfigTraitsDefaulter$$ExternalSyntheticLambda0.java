package com.amazon.coral.model;

import com.amazon.coral.model.DittoConfigTraitsDefaulter;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DittoConfigTraitsDefaulter$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DittoConfigTraitsDefaulter$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((DittoConfigTraitsDefaulter) this.f$0).lambda$onServiceModel$1((ServiceModel) this.f$1, (Map) obj);
                break;
            default:
                DittoConfigTraitsDefaulter.lambda$createDittoConfigTrait$0((HashMap) this.f$0, (DittoConfigTraitsDefaulter.TraitsConstructorFunction) this.f$1, (String) obj);
                break;
        }
    }
}
