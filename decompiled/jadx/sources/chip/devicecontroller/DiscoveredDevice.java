package chip.devicecontroller;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DiscoveredDevice {
    public CommissioningWindowStatus commissioningMode;
    public String deviceName;
    public long deviceType;
    public long discriminator;
    public String instanceName;
    public String ipAddress;
    public Set<PairingHintBitmap> pairingHint;
    public String pairingInstruction;
    public int port;
    public int productId;
    public byte[] rotatingId;
    public int vendorId;

    private void setCommissioningMode(int i) {
        this.commissioningMode = CommissioningWindowStatus.value(i);
    }

    private void setPairingHint(int i) {
        this.pairingHint = new HashSet();
        for (PairingHintBitmap pairingHintBitmap : PairingHintBitmap.values()) {
            if (((1 << pairingHintBitmap.getBitIndex()) & i) != 0) {
                this.pairingHint.add(pairingHintBitmap);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiscoveredDevice : {\n\tdiscriminator : ");
        sb.append(this.discriminator);
        sb.append("\n\tipAddress : ");
        sb.append(this.ipAddress);
        sb.append("\n\tport : ");
        sb.append(this.port);
        sb.append("\n\tdeviceType : ");
        sb.append(this.deviceType);
        sb.append("\n\tvendorId : ");
        sb.append(this.vendorId);
        sb.append("\n\tproductId : ");
        sb.append(this.productId);
        sb.append("\n\tpairingHint : ");
        sb.append(this.pairingHint);
        sb.append("\n\tcommissioningMode : ");
        sb.append(this.commissioningMode);
        sb.append("\n\trotatingId : ");
        byte[] bArr = this.rotatingId;
        sb.append(bArr != null ? Arrays.toString(bArr) : "null");
        sb.append("\n\tinstanceName : ");
        sb.append(this.instanceName);
        sb.append("\n\tdeviceName : ");
        sb.append(this.deviceName);
        sb.append("\n\tpairingInstruction : ");
        return a$$ExternalSyntheticOutline0.m(sb, this.pairingInstruction, "\n}");
    }
}
