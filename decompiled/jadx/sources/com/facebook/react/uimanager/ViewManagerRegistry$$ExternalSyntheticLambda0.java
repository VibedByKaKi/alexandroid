package com.facebook.react.uimanager;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ViewManagerRegistry$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ ViewManagerRegistry$$ExternalSyntheticLambda0(ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invalidate$lambda$9;
        Unit onTrimMemory$lambda$12;
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        switch (i) {
            case 0:
                invalidate$lambda$9 = ViewManagerRegistry.invalidate$lambda$9(arrayList);
                return invalidate$lambda$9;
            default:
                onTrimMemory$lambda$12 = ViewManagerRegistry.onTrimMemory$lambda$12(arrayList);
                return onTrimMemory$lambda$12;
        }
    }
}
