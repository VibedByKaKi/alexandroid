package com.amazon.alexa.accessory.internal.interactor;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class ConnectivityInteractor$$ExternalSyntheticLambda8 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConnectivityInteractor f$0;

    public /* synthetic */ ConnectivityInteractor$$ExternalSyntheticLambda8(ConnectivityInteractor connectivityInteractor, int i) {
        this.$r8$classId = i;
        this.f$0 = connectivityInteractor;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        ConnectivityInteractor connectivityInteractor = this.f$0;
        switch (i) {
            case 0:
                connectivityInteractor.lambda$internalActivate$1((Accessory) obj);
                break;
            default:
                connectivityInteractor.userChanged((User) obj);
                break;
        }
    }
}
