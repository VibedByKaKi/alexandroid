package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BlacklistDevice")
@Documentation("Device to blacklist on the provisioner.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BlacklistDevice {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BlacklistDevice");
    private ByteBuffer advertisementData;
    private String deviceId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ByteBuffer advertisementData;
        protected String deviceId;

        public BlacklistDevice build() {
            BlacklistDevice blacklistDevice = new BlacklistDevice();
            populate(blacklistDevice);
            return blacklistDevice;
        }

        public void populate(BlacklistDevice blacklistDevice) {
            blacklistDevice.setDeviceId(this.deviceId);
            blacklistDevice.setAdvertisementData(this.advertisementData);
        }

        public Builder withAdvertisementData(ByteBuffer byteBuffer) {
            this.advertisementData = byteBuffer;
            return this;
        }

        public Builder withDeviceId(String str) {
            this.deviceId = str;
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
        if (!(obj instanceof BlacklistDevice)) {
            return false;
        }
        BlacklistDevice blacklistDevice = (BlacklistDevice) obj;
        return Objects.equals(getDeviceId(), blacklistDevice.getDeviceId()) && Objects.equals(getAdvertisementData(), blacklistDevice.getAdvertisementData());
    }

    @MaxLength(64)
    @MinLength(0)
    @Documentation("Binary advertisement and/or scan response data.")
    public ByteBuffer getAdvertisementData() {
        return this.advertisementData;
    }

    @MinLength(1)
    @Documentation("MAC address in MM:MM:MM:SS:SS:SS format or other unique ID string.")
    public String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceId(), getAdvertisementData());
    }

    public void setAdvertisementData(ByteBuffer byteBuffer) {
        this.advertisementData = byteBuffer;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceId(getDeviceId());
        builder.withAdvertisementData(getAdvertisementData());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlacklistDevice(deviceId=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceId, ", advertisementData=", sb);
        sb.append(String.valueOf(this.advertisementData));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
