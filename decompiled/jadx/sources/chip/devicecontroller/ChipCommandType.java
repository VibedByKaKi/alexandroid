package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum ChipCommandType {
    OFF(0),
    ON(1),
    TOGGLE(2),
    LEVEL(3);

    private int value;

    ChipCommandType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
