package com.amazon.alexa.app.notification.messaging.receivers;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.notification.api.actions.model.NotificationAction;
import com.amazon.alexa.notification.api.actions.model.NotificationActionList;
import java.util.List;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class ApplicationMessagingReceiver$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ApplicationMessagingReceiver f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ Bundle f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ ApplicationMessagingReceiver$$ExternalSyntheticLambda0(ApplicationMessagingReceiver applicationMessagingReceiver, Context context, Bundle bundle, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = applicationMessagingReceiver;
        this.f$1 = context;
        this.f$2 = bundle;
        this.f$3 = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        NotificationCompat.Action lambda$createNotificationActions$0;
        List lambda$createNotificationActions$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$createNotificationActions$0 = this.f$0.lambda$createNotificationActions$0(this.f$1, this.f$2, this.f$3, (NotificationAction) obj);
                return lambda$createNotificationActions$0;
            default:
                lambda$createNotificationActions$1 = this.f$0.lambda$createNotificationActions$1(this.f$1, this.f$2, this.f$3, (NotificationActionList) obj);
                return lambda$createNotificationActions$1;
        }
    }
}
