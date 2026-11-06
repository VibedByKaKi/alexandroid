package com.amazon.alexa.accessory.notificationpublisher.voice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class NotificationUploadTracker$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NotificationUploadTracker f$0;

    public /* synthetic */ NotificationUploadTracker$$ExternalSyntheticLambda0(NotificationUploadTracker notificationUploadTracker, int i) {
        this.$r8$classId = i;
        this.f$0 = notificationUploadTracker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        NotificationUploadTracker notificationUploadTracker = this.f$0;
        switch (i) {
            case 0:
                notificationUploadTracker.loadFromSharedPreferences();
                break;
            default:
                notificationUploadTracker.lambda$saveToSharedPreferences$0();
                break;
        }
    }
}
