package com.amazon.alexa.accessory.avsclient.context;

import com.amazon.alexa.accessory.User;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AlexaIOComponentsSupplier$$ExternalSyntheticLambda11 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaIOComponentsSupplier f$0;

    public /* synthetic */ AlexaIOComponentsSupplier$$ExternalSyntheticLambda11(AlexaIOComponentsSupplier alexaIOComponentsSupplier, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaIOComponentsSupplier;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AlexaIOComponentsSupplier alexaIOComponentsSupplier = this.f$0;
        switch (i) {
            case 0:
                alexaIOComponentsSupplier.lambda$cacheIOComponents$16((List) obj);
                break;
            case 1:
                alexaIOComponentsSupplier.lambda$observeDeviceInformation$4((Set) obj);
                break;
            case 2:
                alexaIOComponentsSupplier.lambda$observeUserChanges$8((User) obj);
                break;
            case 3:
                alexaIOComponentsSupplier.lambda$observeUserChanges$10((User) obj);
                break;
            default:
                alexaIOComponentsSupplier.lambda$observeRegistrations$5((Set) obj);
                break;
        }
    }
}
