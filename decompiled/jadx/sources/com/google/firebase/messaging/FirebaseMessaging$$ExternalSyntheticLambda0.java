package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class FirebaseMessaging$$ExternalSyntheticLambda0 implements SuccessContinuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ FirebaseMessaging$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        Task lambda$subscribeToTopic$7;
        Task lambda$unsubscribeFromTopic$8;
        int i = this.$r8$classId;
        String str = this.f$0;
        TopicsSubscriber topicsSubscriber = (TopicsSubscriber) obj;
        switch (i) {
            case 0:
                lambda$subscribeToTopic$7 = FirebaseMessaging.lambda$subscribeToTopic$7(str, topicsSubscriber);
                return lambda$subscribeToTopic$7;
            default:
                lambda$unsubscribeFromTopic$8 = FirebaseMessaging.lambda$unsubscribeFromTopic$8(str, topicsSubscriber);
                return lambda$unsubscribeFromTopic$8;
        }
    }
}
