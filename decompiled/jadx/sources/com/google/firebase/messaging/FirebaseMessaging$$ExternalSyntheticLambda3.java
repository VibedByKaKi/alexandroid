package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class FirebaseMessaging$$ExternalSyntheticLambda3 implements OnSuccessListener, FirebaseInstanceIdInternal.NewTokenListener {
    public final /* synthetic */ FirebaseMessaging f$0;

    public /* synthetic */ FirebaseMessaging$$ExternalSyntheticLambda3(FirebaseMessaging firebaseMessaging) {
        this.f$0 = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.f$0.lambda$new$0(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f$0.lambda$new$2((TopicsSubscriber) obj);
    }
}
