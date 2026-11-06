package com.amazon.alexa.accessorykit.internal.rxreactnative;

import com.amazon.alexa.accessorykit.accessories.ArrayModelTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class RxRN$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayModelTransformer f$0;

    public /* synthetic */ RxRN$$ExternalSyntheticLambda3(ArrayModelTransformer arrayModelTransformer, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayModelTransformer;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        int i = this.$r8$classId;
        ArrayModelTransformer arrayModelTransformer = this.f$0;
        switch (i) {
            case 0:
                return arrayModelTransformer.transformToArray(obj);
            default:
                return arrayModelTransformer.transformToArray((List) obj);
        }
    }
}
