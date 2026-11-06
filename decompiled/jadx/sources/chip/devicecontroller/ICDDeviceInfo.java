package chip.devicecontroller;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ICDDeviceInfo {
    private final long activeModeDuration;
    private final int activeModeThreshold;
    private final long checkInNodeId;
    private final long fabricId;
    private final int fabricIndex;
    private final long icdCounter;
    private final long icdNodeId;
    private final long idleModeDuration;
    private final long monitoredSubject;
    private final byte[] symmetricKey;
    private final Set<UserActiveModeTriggerBitmap> userActiveModeTriggerHint;
    private final String userActiveModeTriggerInstruction;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UserActiveModeTriggerBitmap {
        PowerCycle(0),
        SettingsMenu(1),
        CustomInstruction(2),
        DeviceManual(3),
        ActuateSensor(4),
        ActuateSensorSeconds(5),
        ActuateSensorTimes(6),
        ActuateSensorLightsBlink(7),
        ResetButton(8),
        ResetButtonLightsBlink(9),
        ResetButtonSeconds(10),
        ResetButtonTimes(11),
        SetupButton(12),
        SetupButtonSeconds(13),
        SetupButtonLightsBlink(14),
        SetupButtonTimes(15),
        AppDefinedButton(16);

        private final int bitIndex;

        UserActiveModeTriggerBitmap(int i) {
            this.bitIndex = i;
        }

        public final int getBitIndex() {
            return this.bitIndex;
        }
    }

    public ICDDeviceInfo(byte[] bArr, int i, String str, long j, long j2, int i2, long j3, long j4, long j5, long j6, long j7, int i3) {
        this.symmetricKey = bArr;
        this.userActiveModeTriggerInstruction = str;
        this.idleModeDuration = j;
        this.activeModeDuration = j2;
        this.activeModeThreshold = i2;
        this.icdNodeId = j3;
        this.checkInNodeId = j4;
        this.icdCounter = j5;
        this.monitoredSubject = j6;
        this.fabricId = j7;
        this.fabricIndex = i3;
        this.userActiveModeTriggerHint = new HashSet();
        for (UserActiveModeTriggerBitmap userActiveModeTriggerBitmap : UserActiveModeTriggerBitmap.values()) {
            if (((1 << userActiveModeTriggerBitmap.getBitIndex()) & i) != 0) {
                this.userActiveModeTriggerHint.add(userActiveModeTriggerBitmap);
            }
        }
    }

    public long getActiveModeDuration() {
        return this.activeModeDuration;
    }

    public int getActiveModeThreshold() {
        return this.activeModeThreshold;
    }

    public long getFabricId() {
        return this.fabricId;
    }

    public int getFabricIndex() {
        return this.fabricIndex;
    }

    public long getIcdCheckInNodeId() {
        return this.checkInNodeId;
    }

    public long getIcdCounter() {
        return this.icdCounter;
    }

    public long getIcdNodeId() {
        return this.icdNodeId;
    }

    public long getIdleModeDuration() {
        return this.idleModeDuration;
    }

    public long getMonitoredSubject() {
        return this.monitoredSubject;
    }

    public byte[] getSymmetricKey() {
        return this.symmetricKey;
    }

    public Set<UserActiveModeTriggerBitmap> getUserActiveModeTriggerHint() {
        return this.userActiveModeTriggerHint;
    }

    public String getUserActiveModeTriggerInstruction() {
        return this.userActiveModeTriggerInstruction;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ICDDeviceInfo : {\n\tuserActiveModeTriggerHint : ");
        sb.append(this.userActiveModeTriggerHint);
        sb.append("\n\tuserActiveModeTriggerInstruction : ");
        sb.append(this.userActiveModeTriggerInstruction);
        sb.append("\n\ticdNodeId : ");
        sb.append(this.icdNodeId);
        sb.append("\n\ticdCheckInNodeId : ");
        sb.append(this.checkInNodeId);
        sb.append("\n\ticdCounter : ");
        sb.append(this.icdCounter);
        sb.append("\n\tmonitoredSubject : ");
        sb.append(this.monitoredSubject);
        sb.append("\n\tfabricId : ");
        sb.append(this.fabricId);
        sb.append("\n\tfabricIndex : ");
        return a$$ExternalSyntheticOutline0.m(sb, this.fabricIndex, "\n}");
    }

    public ICDDeviceInfo(byte[] bArr, Set<UserActiveModeTriggerBitmap> set, String str, long j, long j2, int i, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.symmetricKey = bArr;
        this.userActiveModeTriggerHint = set;
        this.userActiveModeTriggerInstruction = str;
        this.idleModeDuration = j;
        this.activeModeDuration = j2;
        this.activeModeThreshold = i;
        this.icdNodeId = j3;
        this.checkInNodeId = j4;
        this.icdCounter = j5;
        this.monitoredSubject = j6;
        this.fabricId = j7;
        this.fabricIndex = i2;
    }
}
