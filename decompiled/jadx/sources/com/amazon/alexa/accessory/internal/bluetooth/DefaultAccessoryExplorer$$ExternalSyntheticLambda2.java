package com.amazon.alexa.accessory.internal.bluetooth;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessoryExplorer f$0;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda2(DefaultAccessoryExplorer defaultAccessoryExplorer, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAccessoryExplorer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DefaultAccessoryExplorer defaultAccessoryExplorer = this.f$0;
        switch (i) {
            case 0:
                defaultAccessoryExplorer.lambda$observeAccessoriesPersistenceChanges$14((Set) obj);
                break;
            case 1:
                defaultAccessoryExplorer.observeLeDevice((String) obj);
                break;
            case 2:
                defaultAccessoryExplorer.observeLeDevices((List) obj);
                break;
            default:
                defaultAccessoryExplorer.stopObservingLeDevice((String) obj);
                break;
        }
    }
}
