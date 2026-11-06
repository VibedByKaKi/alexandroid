package chip.devicecontroller;

import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum CommissioningWindowStatus {
    WindowNotOpen(0),
    EnhancedWindowOpen(1),
    BasicWindowOpen(2);

    private final int value;

    CommissioningWindowStatus(int i) {
        this.value = i;
    }

    public static CommissioningWindowStatus value(int i) {
        for (CommissioningWindowStatus commissioningWindowStatus : values()) {
            if (commissioningWindowStatus.value == i) {
                return commissioningWindowStatus;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid value: "));
        return null;
    }
}
