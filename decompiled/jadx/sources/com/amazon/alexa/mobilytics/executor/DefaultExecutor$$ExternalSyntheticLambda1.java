package com.amazon.alexa.mobilytics.executor;

import com.amazon.alexa.mobilytics.connector.ConnectorExecutor;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class DefaultExecutor$$ExternalSyntheticLambda1 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Action1 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ DefaultExecutor$$ExternalSyntheticLambda1(Action1 action1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = action1;
        this.f$1 = i;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                DefaultExecutor.lambda$runOnConnectors$20(this.f$0, this.f$1, (ConnectorExecutor) obj);
                break;
            case 1:
                DefaultExecutor.lambda$runOnBIConnectors$22(this.f$0, this.f$1, (ConnectorExecutor) obj);
                break;
            default:
                DefaultExecutor.lambda$runOnOEConnectors$21(this.f$0, this.f$1, (ConnectorExecutor) obj);
                break;
        }
    }
}
