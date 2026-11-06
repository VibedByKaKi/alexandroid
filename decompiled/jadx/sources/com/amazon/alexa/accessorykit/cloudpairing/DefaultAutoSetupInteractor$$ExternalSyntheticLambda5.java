package com.amazon.alexa.accessorykit.cloudpairing;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class DefaultAutoSetupInteractor$$ExternalSyntheticLambda5 implements CompletableOnSubscribe {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ DefaultAutoSetupInteractor f$0;
    public final /* synthetic */ Accessory f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ DefaultAutoSetupInteractor$$ExternalSyntheticLambda5(DefaultAutoSetupInteractor defaultAutoSetupInteractor, long j, Accessory accessory) {
        this.f$0 = defaultAutoSetupInteractor;
        this.f$2 = j;
        this.f$1 = accessory;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public final void subscribe(CompletableEmitter completableEmitter) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createSession$1(this.f$1, this.f$2, completableEmitter);
                break;
            default:
                this.f$0.lambda$createSession$2(this.f$2, this.f$1, completableEmitter);
                break;
        }
    }

    public /* synthetic */ DefaultAutoSetupInteractor$$ExternalSyntheticLambda5(DefaultAutoSetupInteractor defaultAutoSetupInteractor, Accessory accessory, long j) {
        this.f$0 = defaultAutoSetupInteractor;
        this.f$1 = accessory;
        this.f$2 = j;
    }
}
