package com.amazon.alexa.app.notification.nc;

import com.amazon.alexa.app.notification.nc.server.NCItem;
import com.amazon.alexa.app.notification.nc.server.NotificationStatus;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class DefaultNotificationCenterLocalImpl$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultNotificationCenterLocalImpl f$0;

    public /* synthetic */ DefaultNotificationCenterLocalImpl$$ExternalSyntheticLambda4(DefaultNotificationCenterLocalImpl defaultNotificationCenterLocalImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultNotificationCenterLocalImpl;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DefaultNotificationCenterLocalImpl defaultNotificationCenterLocalImpl = this.f$0;
        switch (i) {
            case 0:
                defaultNotificationCenterLocalImpl.lambda$store$3((NCItem) obj);
                break;
            default:
                defaultNotificationCenterLocalImpl.logAndRecordStatus((NotificationStatus) obj);
                break;
        }
    }
}
