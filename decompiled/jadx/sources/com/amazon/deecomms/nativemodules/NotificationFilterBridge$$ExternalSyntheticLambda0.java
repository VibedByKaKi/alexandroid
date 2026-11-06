package com.amazon.deecomms.nativemodules;

import com.amazon.deecomms.nativemodules.CommsMessagingMediaBridge;
import com.amazon.deecomms.nativemodules.CommsMessagingMediaDelegate;
import com.amazon.deecomms.util.Consumer;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NotificationFilterBridge$$ExternalSyntheticLambda0 implements Action1, Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ NotificationFilterBridge$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.deecomms.util.Consumer
    public void accept(Object obj) {
        String str = (String) obj;
        switch (this.$r8$classId) {
            case 0:
                NotificationFilterBridge.lambda$resumeNotifications$1(str);
                break;
            case 1:
            case 2:
            default:
                NotificationFilterBridge.lambda$suppressNotifications$0(str);
                break;
            case 3:
                CommsNotificationFilterDelegate.lambda$resumeNotifications$1(str);
                break;
            case 4:
                CommsNotificationFilterDelegate.lambda$suppressNotifications$0(str);
                break;
        }
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.$r8$classId) {
            case 1:
                CommsMessagingMediaBridge.AnonymousClass1.lambda$onFeatureUpdate$1(th);
                break;
            default:
                CommsMessagingMediaDelegate.AnonymousClass1.lambda$onFeatureUpdate$1(th);
                break;
        }
    }
}
