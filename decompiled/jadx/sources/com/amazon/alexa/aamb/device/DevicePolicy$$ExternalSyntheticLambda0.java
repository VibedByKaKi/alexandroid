package com.amazon.alexa.aamb.device;

import android.content.Context;
import com.amazon.alexa.accessory.notificationpublisher.reply.ReplyServiceHelper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DevicePolicy$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ DevicePolicy$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Map lambda$fetchBlockedDevices$0;
        Set lambda$init$0;
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                lambda$fetchBlockedDevices$0 = DevicePolicy.lambda$fetchBlockedDevices$0(context);
                return lambda$fetchBlockedDevices$0;
            default:
                lambda$init$0 = ReplyServiceHelper.lambda$init$0(context);
                return lambda$init$0;
        }
    }
}
