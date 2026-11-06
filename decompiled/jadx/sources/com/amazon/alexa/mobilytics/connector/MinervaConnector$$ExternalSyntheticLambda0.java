package com.amazon.alexa.mobilytics.connector;

import java.util.Map;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class MinervaConnector$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MinervaEventChecker f$0;

    public /* synthetic */ MinervaConnector$$ExternalSyntheticLambda0(MinervaEventChecker minervaEventChecker, int i) {
        this.$r8$classId = i;
        this.f$0 = minervaEventChecker;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        int i = this.$r8$classId;
        MinervaEventChecker minervaEventChecker = this.f$0;
        Map.Entry entry = (Map.Entry) obj;
        switch (i) {
            case 0:
                MinervaConnector.lambda$recordEvent$0(minervaEventChecker, entry);
                break;
            default:
                MinervaConnector.lambda$processMethods$13(minervaEventChecker, entry);
                break;
        }
    }
}
