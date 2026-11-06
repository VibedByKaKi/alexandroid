package com.amazon.alexa.ra.ui;

import android.content.Intent;
import com.amazon.alexa.mosaic.apl.interfaces.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class RaViewFragment$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RaViewFragment f$0;

    public /* synthetic */ RaViewFragment$$ExternalSyntheticLambda0(RaViewFragment raViewFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = raViewFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onCreateView$lambda$15;
        Unit deepBrowseViewModel_delegate$lambda$12$lambda$11;
        int i = this.$r8$classId;
        RaViewFragment raViewFragment = this.f$0;
        switch (i) {
            case 0:
                onCreateView$lambda$15 = RaViewFragment.onCreateView$lambda$15(raViewFragment, (Intent) obj);
                return onCreateView$lambda$15;
            default:
                deepBrowseViewModel_delegate$lambda$12$lambda$11 = RaViewFragment.deepBrowseViewModel_delegate$lambda$12$lambda$11(raViewFragment, (IEvent) obj);
                return deepBrowseViewModel_delegate$lambda$12$lambda$11;
        }
    }
}
