package com.amazon.alexa.accessory.notificationpublisher.providers;

import com.amazon.alexa.accessory.notificationpublisher.providers.AccessoryProvider;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryProvider$5$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccessoryProvider$5$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                AccessoryProvider.AnonymousClass5.lambda$accept$1((Throwable) obj);
                break;
            case 1:
                BaseTemplateProvider.lambda$create$1((Boolean) obj);
                break;
            default:
                BaseTemplateProvider.lambda$create$2((Throwable) obj);
                break;
        }
    }
}
