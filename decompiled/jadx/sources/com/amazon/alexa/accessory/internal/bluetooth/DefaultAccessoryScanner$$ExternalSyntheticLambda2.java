package com.amazon.alexa.accessory.internal.bluetooth;

import android.util.Pair;
import com.amazon.alexa.accessory.AccessoryScannerListener;
import com.amazon.alexa.accessory.internal.util.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class DefaultAccessoryScanner$$ExternalSyntheticLambda2 implements Predicate, Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultAccessoryScanner$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.accessory.internal.util.functions.Consumer
    public void accept(Object obj) {
        ((AccessoryScannerListener) obj).onAccessoryScanCancelled();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$filterOutKnownAccessory$0;
        boolean booleanValue;
        boolean lambda$queryRemovedCompanionDevices$6;
        boolean lambda$queryNewCompanionDevices$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$filterOutKnownAccessory$0 = DefaultAccessoryScanner.lambda$filterOutKnownAccessory$0((Boolean) obj);
                return lambda$filterOutKnownAccessory$0;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return booleanValue;
            case 2:
            default:
                lambda$queryNewCompanionDevices$4 = DefaultCompanionDeviceModule.lambda$queryNewCompanionDevices$4((Pair) obj);
                return lambda$queryNewCompanionDevices$4;
            case 3:
                lambda$queryRemovedCompanionDevices$6 = DefaultCompanionDeviceModule.lambda$queryRemovedCompanionDevices$6((Pair) obj);
                return lambda$queryRemovedCompanionDevices$6;
        }
    }
}
