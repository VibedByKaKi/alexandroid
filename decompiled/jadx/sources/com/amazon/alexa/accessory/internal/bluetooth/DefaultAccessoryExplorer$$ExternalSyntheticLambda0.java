package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryExplorer$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAccessoryExplorer f$0;

    public /* synthetic */ DefaultAccessoryExplorer$$ExternalSyntheticLambda0(DefaultAccessoryExplorer defaultAccessoryExplorer, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAccessoryExplorer;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        List lambda$observeAccessoriesPersistenceChanges$6;
        ObservableSource lambda$startObservingLeDevices$19;
        MaybeSource lambda$startObservingLeDevices$16;
        int i = this.$r8$classId;
        DefaultAccessoryExplorer defaultAccessoryExplorer = this.f$0;
        switch (i) {
            case 0:
                lambda$observeAccessoriesPersistenceChanges$6 = defaultAccessoryExplorer.lambda$observeAccessoriesPersistenceChanges$6((List) obj);
                return lambda$observeAccessoriesPersistenceChanges$6;
            case 1:
                lambda$startObservingLeDevices$19 = defaultAccessoryExplorer.lambda$startObservingLeDevices$19((List) obj);
                return lambda$startObservingLeDevices$19;
            default:
                lambda$startObservingLeDevices$16 = defaultAccessoryExplorer.lambda$startObservingLeDevices$16((DeviceGroup) obj);
                return lambda$startObservingLeDevices$16;
        }
    }
}
