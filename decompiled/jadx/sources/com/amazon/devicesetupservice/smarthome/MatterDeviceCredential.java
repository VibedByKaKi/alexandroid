package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxValue;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.MinValue;
import com.amazon.coral.annotation.Required;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("MatterDeviceCredential")
@Documentation("A structure to hold the Matter credential information:\n          1. Vendor ID\n          2. Product ID\n          3. Unique ID\n          4. Discriminator\n          5. Setup code")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class MatterDeviceCredential {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.MatterDeviceCredential");
    private Integer discriminator;
    private Integer passcode;
    private Integer productId;
    private String rotatingIdAlgorithm;
    private ByteBuffer uniqueId;
    private Integer vendorId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected Integer discriminator;
        protected Integer passcode;
        protected Integer productId;
        protected String rotatingIdAlgorithm;
        protected ByteBuffer uniqueId;
        protected Integer vendorId;

        public MatterDeviceCredential build() {
            MatterDeviceCredential matterDeviceCredential = new MatterDeviceCredential();
            populate(matterDeviceCredential);
            return matterDeviceCredential;
        }

        public void populate(MatterDeviceCredential matterDeviceCredential) {
            matterDeviceCredential.setVendorId(this.vendorId);
            matterDeviceCredential.setProductId(this.productId);
            matterDeviceCredential.setUniqueId(this.uniqueId);
            matterDeviceCredential.setDiscriminator(this.discriminator);
            matterDeviceCredential.setPasscode(this.passcode);
            matterDeviceCredential.setRotatingIdAlgorithm(this.rotatingIdAlgorithm);
        }

        public Builder withDiscriminator(Integer num) {
            this.discriminator = num;
            return this;
        }

        public Builder withPasscode(Integer num) {
            this.passcode = num;
            return this;
        }

        public Builder withProductId(Integer num) {
            this.productId = num;
            return this;
        }

        public Builder withRotatingIdAlgorithm(String str) {
            this.rotatingIdAlgorithm = str;
            return this;
        }

        public Builder withUniqueId(ByteBuffer byteBuffer) {
            this.uniqueId = byteBuffer;
            return this;
        }

        public Builder withVendorId(Integer num) {
            this.vendorId = num;
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
        if (!(obj instanceof MatterDeviceCredential)) {
            return false;
        }
        MatterDeviceCredential matterDeviceCredential = (MatterDeviceCredential) obj;
        return Objects.equals(getVendorId(), matterDeviceCredential.getVendorId()) && Objects.equals(getProductId(), matterDeviceCredential.getProductId()) && Objects.equals(getUniqueId(), matterDeviceCredential.getUniqueId()) && Objects.equals(getDiscriminator(), matterDeviceCredential.getDiscriminator()) && Objects.equals(getPasscode(), matterDeviceCredential.getPasscode()) && Objects.equals(getRotatingIdAlgorithm(), matterDeviceCredential.getRotatingIdAlgorithm());
    }

    @MaxValue("4095")
    @Documentation("Matter device discriminator - 12 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getDiscriminator() {
        return this.discriminator;
    }

    @Required
    @MaxValue("99999998")
    @Documentation("Matter device passcode - up to 8 decimal digits, excluding 0 and 99999999.")
    @MinValue("1")
    public Integer getPasscode() {
        return this.passcode;
    }

    @MaxValue("65535")
    @Documentation("Matter (manufacturer) product ID - 16 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getProductId() {
        return this.productId;
    }

    @EnumValues({RotatingIdAlgorithm.MATTER_V0, RotatingIdAlgorithm.MATTER_V1})
    @Documentation("Matter rotating ID algorithm.")
    public String getRotatingIdAlgorithm() {
        return this.rotatingIdAlgorithm;
    }

    @MinLength(32)
    @Documentation("Matter device unique identifier - at least 128 random bits.")
    public ByteBuffer getUniqueId() {
        return this.uniqueId;
    }

    @MaxValue("65535")
    @Documentation("Matter (Zigbee) vendor ID - 16 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getVendorId() {
        return this.vendorId;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getVendorId(), getProductId(), getUniqueId(), getDiscriminator(), getPasscode(), getRotatingIdAlgorithm());
    }

    public void setDiscriminator(Integer num) {
        this.discriminator = num;
    }

    public void setPasscode(Integer num) {
        this.passcode = num;
    }

    public void setProductId(Integer num) {
        this.productId = num;
    }

    public void setRotatingIdAlgorithm(String str) {
        this.rotatingIdAlgorithm = str;
    }

    public void setUniqueId(ByteBuffer byteBuffer) {
        this.uniqueId = byteBuffer;
    }

    public void setVendorId(Integer num) {
        this.vendorId = num;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withVendorId(getVendorId());
        builder.withProductId(getProductId());
        builder.withUniqueId(getUniqueId());
        builder.withDiscriminator(getDiscriminator());
        builder.withPasscode(getPasscode());
        builder.withRotatingIdAlgorithm(getRotatingIdAlgorithm());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MatterDeviceCredential(vendorId=");
        sb.append(String.valueOf(this.vendorId));
        sb.append(", productId=");
        sb.append(String.valueOf(this.productId));
        sb.append(", uniqueId=");
        sb.append(String.valueOf(this.uniqueId));
        sb.append(", discriminator=");
        sb.append(String.valueOf(this.discriminator));
        sb.append(", passcode=");
        sb.append(String.valueOf(this.passcode));
        sb.append(", rotatingIdAlgorithm=");
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.rotatingIdAlgorithm, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
