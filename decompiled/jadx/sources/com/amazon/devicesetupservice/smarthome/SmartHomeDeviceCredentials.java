package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("SmartHomeDeviceCredentials")
@Documentation("An object containing lists of customers device credentials.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class SmartHomeDeviceCredentials {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.SmartHomeDeviceCredentials");
    private List<BLEDeviceCredential> ble;
    private List<BLEMeshDeviceCredential> bleMesh;

    /* renamed from: matter, reason: collision with root package name */
    private List<MatterDeviceCredential> f382matter;
    private List<ZigbeeDeviceCredential> zigbee;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<BLEDeviceCredential> ble;
        protected List<BLEMeshDeviceCredential> bleMesh;

        /* renamed from: matter, reason: collision with root package name */
        protected List<MatterDeviceCredential> f383matter;
        protected List<ZigbeeDeviceCredential> zigbee;

        public SmartHomeDeviceCredentials build() {
            SmartHomeDeviceCredentials smartHomeDeviceCredentials = new SmartHomeDeviceCredentials();
            populate(smartHomeDeviceCredentials);
            return smartHomeDeviceCredentials;
        }

        public void populate(SmartHomeDeviceCredentials smartHomeDeviceCredentials) {
            smartHomeDeviceCredentials.setZigbee(this.zigbee);
            smartHomeDeviceCredentials.setBle(this.ble);
            smartHomeDeviceCredentials.setBleMesh(this.bleMesh);
            smartHomeDeviceCredentials.setMatter(this.f383matter);
        }

        public Builder withBle(List<BLEDeviceCredential> list) {
            this.ble = list;
            return this;
        }

        public Builder withBleMesh(List<BLEMeshDeviceCredential> list) {
            this.bleMesh = list;
            return this;
        }

        public Builder withMatter(List<MatterDeviceCredential> list) {
            this.f383matter = list;
            return this;
        }

        public Builder withZigbee(List<ZigbeeDeviceCredential> list) {
            this.zigbee = list;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartHomeDeviceCredentials)) {
            return false;
        }
        SmartHomeDeviceCredentials smartHomeDeviceCredentials = (SmartHomeDeviceCredentials) obj;
        return Objects.equals(getZigbee(), smartHomeDeviceCredentials.getZigbee()) && Objects.equals(getBle(), smartHomeDeviceCredentials.getBle()) && Objects.equals(getBleMesh(), smartHomeDeviceCredentials.getBleMesh()) && Objects.equals(getMatter(), smartHomeDeviceCredentials.getMatter());
    }

    @Documentation("List of BLE Device Credentials")
    public List<BLEDeviceCredential> getBle() {
        return this.ble;
    }

    @Documentation("List of BLE Mesh Device Credentials")
    public List<BLEMeshDeviceCredential> getBleMesh() {
        return this.bleMesh;
    }

    @Documentation("List of Matter Device Credentials")
    public List<MatterDeviceCredential> getMatter() {
        return this.f382matter;
    }

    @Documentation("List of Zigbee Device Credentials")
    public List<ZigbeeDeviceCredential> getZigbee() {
        return this.zigbee;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getZigbee(), getBle(), getBleMesh(), getMatter());
    }

    public void setBle(List<BLEDeviceCredential> list) {
        this.ble = list;
    }

    public void setBleMesh(List<BLEMeshDeviceCredential> list) {
        this.bleMesh = list;
    }

    public void setMatter(List<MatterDeviceCredential> list) {
        this.f382matter = list;
    }

    public void setZigbee(List<ZigbeeDeviceCredential> list) {
        this.zigbee = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withZigbee(getZigbee());
        builder.withBle(getBle());
        builder.withBleMesh(getBleMesh());
        builder.withMatter(getMatter());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmartHomeDeviceCredentials(zigbee=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", ble=", (List) this.zigbee, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", bleMesh=", (List) this.ble, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", matter=", (List) this.bleMesh, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.f382matter, sb);
    }
}
