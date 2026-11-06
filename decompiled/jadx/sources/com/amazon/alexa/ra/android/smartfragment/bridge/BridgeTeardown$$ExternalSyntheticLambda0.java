package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class BridgeTeardown$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BridgeTeardown$$ExternalSyntheticLambda0(AtomicBoolean atomicBoolean, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicBoolean;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit destroy$lambda$6$lambda$5;
        Unit authorize$lambda$12;
        switch (this.$r8$classId) {
            case 0:
                destroy$lambda$6$lambda$5 = BridgeTeardown.destroy$lambda$6$lambda$5(this.f$0, this.f$1, ((Boolean) obj).booleanValue());
                return destroy$lambda$6$lambda$5;
            default:
                authorize$lambda$12 = AuthorizationDelegateAdapter.authorize$lambda$12(this.f$0, this.f$1, (Result) obj);
                return authorize$lambda$12;
        }
    }
}
