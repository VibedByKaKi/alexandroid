package com.google.firebase;

import android.content.Context;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatInfoStorage;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class FirebaseApp$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Context f$1;

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(Context context, String str) {
        this.f$1 = context;
        this.f$0 = str;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        DataCollectionConfigStorage lambda$new$0;
        HeartBeatInfoStorage lambda$new$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$new$0 = ((FirebaseApp) this.f$0).lambda$new$0(this.f$1);
                return lambda$new$0;
            default:
                lambda$new$2 = DefaultHeartBeatController.lambda$new$2(this.f$1, (String) this.f$0);
                return lambda$new$2;
        }
    }

    public /* synthetic */ FirebaseApp$$ExternalSyntheticLambda0(FirebaseApp firebaseApp, Context context) {
        this.f$0 = firebaseApp;
        this.f$1 = context;
    }
}
