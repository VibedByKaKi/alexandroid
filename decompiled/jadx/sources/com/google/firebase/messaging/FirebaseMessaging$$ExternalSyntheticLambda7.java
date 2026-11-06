package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class FirebaseMessaging$$ExternalSyntheticLambda7 implements SuccessContinuation, RequestDeduplicator.GetTokenRequest {
    public final /* synthetic */ FirebaseMessaging f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Store.Token f$2;

    public /* synthetic */ FirebaseMessaging$$ExternalSyntheticLambda7(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f$0 = firebaseMessaging;
        this.f$1 = str;
        this.f$2 = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public Task start() {
        Task lambda$blockingGetToken$10;
        lambda$blockingGetToken$10 = this.f$0.lambda$blockingGetToken$10(this.f$1, this.f$2);
        return lambda$blockingGetToken$10;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Task lambda$blockingGetToken$9;
        lambda$blockingGetToken$9 = this.f$0.lambda$blockingGetToken$9(this.f$1, this.f$2, (String) obj);
        return lambda$blockingGetToken$9;
    }
}
