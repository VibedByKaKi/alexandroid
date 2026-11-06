package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class RequestDeduplicator$$ExternalSyntheticLambda0 implements Continuation, OnCompleteListener {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RequestDeduplicator$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f$0).lambda$onStartCommand$1((Intent) this.f$1, task);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$getOrStartGetTokenRequest$0;
        lambda$getOrStartGetTokenRequest$0 = ((RequestDeduplicator) this.f$0).lambda$getOrStartGetTokenRequest$0((String) this.f$1, task);
        return lambda$getOrStartGetTokenRequest$0;
    }
}
