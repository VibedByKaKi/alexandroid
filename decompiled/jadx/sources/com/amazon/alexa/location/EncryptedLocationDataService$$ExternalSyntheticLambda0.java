package com.amazon.alexa.location;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class EncryptedLocationDataService$$ExternalSyntheticLambda0 implements SingleOnSubscribe, Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EncryptedLocationDataService f$0;

    public /* synthetic */ EncryptedLocationDataService$$ExternalSyntheticLambda0(EncryptedLocationDataService encryptedLocationDataService, int i) {
        this.$r8$classId = i;
        this.f$0 = encryptedLocationDataService;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        int i = this.$r8$classId;
        EncryptedLocationDataService encryptedLocationDataService = this.f$0;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 1:
                encryptedLocationDataService.lambda$saveGeofences$0(th);
                break;
            default:
                encryptedLocationDataService.lambda$getGeofences$2(th);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        this.f$0.lambda$getGeofences$3(singleEmitter);
    }
}
