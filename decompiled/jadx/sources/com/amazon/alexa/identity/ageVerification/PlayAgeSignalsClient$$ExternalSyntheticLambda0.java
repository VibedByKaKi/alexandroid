package com.amazon.alexa.identity.ageVerification;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.agesignals.AgeSignalsResult;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class PlayAgeSignalsClient$$ExternalSyntheticLambda0 implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ PlayAgeSignalsClient f$0;
    public final /* synthetic */ CompletableFuture f$1;

    public /* synthetic */ PlayAgeSignalsClient$$ExternalSyntheticLambda0(PlayAgeSignalsClient playAgeSignalsClient, CompletableFuture completableFuture) {
        this.f$0 = playAgeSignalsClient;
        this.f$1 = completableFuture;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f$0.lambda$fetchFromRealManager$1(this.f$1, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f$0.lambda$fetchFromRealManager$0(this.f$1, (AgeSignalsResult) obj);
    }
}
