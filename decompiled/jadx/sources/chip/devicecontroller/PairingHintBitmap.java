package chip.devicecontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum PairingHintBitmap {
    PowerCycle(0, false),
    DeviceManufacturerURL(1, false),
    Administrator(2, false),
    SettingsMenuOnTheNode(3, false),
    CustomInstruction(4, true),
    DeviceManual(5, false),
    PressResetButton(6, false),
    PressResetButtonWithApplicationOfPower(7, false),
    PressResetButtonForNseconds(8, true),
    PressResetButtonUntilLightBlinks(9, true),
    PressResetButtonForNsecondsWithApplicationOfPower(10, true),
    PressResetButtonUntilLightBlinksWithApplicationOfPower(11, true),
    PressResetButtonNTimes(12, true),
    PressSetupButton(13, false),
    PressSetupButtonWithApplicationOfPower(14, false),
    PressSetupButtonForNseconds(15, true),
    PressSetupButtonUntilLightBlinks(16, true),
    PressSetupButtonForNsecondsWithApplicationOfPower(17, true),
    PressSetupButtonUntilLightBlinksWithApplicationOfPower(18, true),
    PressSetupButtonNtimes(19, true);

    private final int bitIndex;
    private final boolean isRequirePairingInstruction;

    PairingHintBitmap(int i, boolean z) {
        this.bitIndex = i;
        this.isRequirePairingInstruction = z;
    }

    public final int getBitIndex() {
        return this.bitIndex;
    }

    public final boolean getRequirePairingInstruction() {
        return this.isRequirePairingInstruction;
    }
}
