package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.amazon.alexa.ra.android.smartfragment.bridge.ReactHostBridge;
import com.amazon.alexa.ra.android.smartfragment.react.DestroyCompletion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ReactHostBridge$$ExternalSyntheticLambda10 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ReactHostBridge$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invalidate$lambda$27;
        Unit create$lambda$0;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                invalidate$lambda$27 = ReactHostBridge.invalidate$lambda$27((DestroyCompletion) obj2, ((Boolean) obj).booleanValue());
                return invalidate$lambda$27;
            default:
                create$lambda$0 = ReactHostBridge.Companion.create$lambda$0((MessageRouter) obj2, (Exception) obj);
                return create$lambda$0;
        }
    }
}
