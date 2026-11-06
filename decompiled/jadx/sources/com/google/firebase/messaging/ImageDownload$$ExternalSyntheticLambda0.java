package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ImageDownload$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ TaskCompletionSource f$1;

    public /* synthetic */ ImageDownload$$ExternalSyntheticLambda0(Object obj, TaskCompletionSource taskCompletionSource, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ImageDownload) this.f$0).lambda$start$0(this.f$1);
                break;
            case 1:
                ((FirebaseMessaging) this.f$0).lambda$getToken$4(this.f$1);
                break;
            case 2:
                ((FirebaseMessaging) this.f$0).lambda$deleteToken$5(this.f$1);
                break;
            default:
                ((FirebaseMessaging) this.f$0).lambda$deleteToken$6(this.f$1);
                break;
        }
    }
}
