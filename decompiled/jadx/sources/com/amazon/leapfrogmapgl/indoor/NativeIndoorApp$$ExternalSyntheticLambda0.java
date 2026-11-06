package com.amazon.leapfrogmapgl.indoor;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorApp$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NativeIndoorApp$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int supportsRequiredGlEs$lambda$0;
        List heroBoundsPoints;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                supportsRequiredGlEs$lambda$0 = NativeIndoorApp.supportsRequiredGlEs$lambda$0((Context) obj);
                return Integer.valueOf(supportsRequiredGlEs$lambda$0);
            default:
                heroBoundsPoints = ((IndoorMapViewHandle) obj).getHeroBoundsPoints();
                return heroBoundsPoints;
        }
    }
}
