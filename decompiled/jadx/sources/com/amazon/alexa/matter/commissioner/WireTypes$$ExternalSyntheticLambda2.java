package com.amazon.alexa.matter.commissioner;

import chip.devicecontroller.ThreadScanResult;
import chip.devicecontroller.WiFiScanResult;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class WireTypes$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WireTypes$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Object obj2;
        switch (this.$r8$classId) {
            case 0:
                return Objects.nonNull(obj);
            case 1:
                obj2 = (ThreadScanResult) obj;
                break;
            default:
                obj2 = (WiFiScanResult) obj;
                break;
        }
        return Objects.nonNull(obj2);
    }
}
