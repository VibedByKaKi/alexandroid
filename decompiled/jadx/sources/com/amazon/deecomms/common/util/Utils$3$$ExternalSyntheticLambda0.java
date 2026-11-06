package com.amazon.deecomms.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.amazon.deecomms.common.util.Utils;
import rx.functions.Action0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class Utils$3$$ExternalSyntheticLambda0 implements Action0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ BroadcastReceiver f$1;

    public /* synthetic */ Utils$3$$ExternalSyntheticLambda0(Context context, BroadcastReceiver broadcastReceiver, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = broadcastReceiver;
    }

    @Override // rx.functions.Action0
    public final void call() {
        switch (this.$r8$classId) {
            case 0:
                Utils.AnonymousClass3.lambda$call$0(this.f$0, this.f$1);
                break;
            default:
                this.f$0.unregisterReceiver(this.f$1);
                break;
        }
    }
}
