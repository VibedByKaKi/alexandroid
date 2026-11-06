package com.amazon.alexa.accessory.avsclient;

import com.amazon.alexa.accessory.io.Source;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AccessoryDiagnostics$$ExternalSyntheticLambda6 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessoryDiagnostics$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        SingleSource lambda$uploadLogSource$17;
        ObservableSource lambda$cacheAccessorySessionsScoPreference$0;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                lambda$uploadLogSource$17 = AccessoryDiagnostics.lambda$uploadLogSource$17((Source) obj);
                return lambda$uploadLogSource$17;
            default:
                lambda$cacheAccessorySessionsScoPreference$0 = ((AlexaScoSessionCache) obj).lambda$cacheAccessorySessionsScoPreference$0();
                return lambda$cacheAccessorySessionsScoPreference$0;
        }
    }
}
