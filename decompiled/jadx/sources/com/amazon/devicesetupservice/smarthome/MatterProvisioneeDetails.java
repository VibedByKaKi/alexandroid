package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
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
import com.amazon.devicesetupservice.reporting.Radio;
import com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("MatterProvisioneeDetails")
@Documentation("Matter provisionee details from a BLE beacon.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class MatterProvisioneeDetails extends SmartHomeProvisioneeDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.MatterProvisioneeDetails");
    private Integer discriminator;
    private Integer productId;
    private ByteBuffer rotatingId;
    private String rotatingIdStatus;
    private String transport;
    private Integer vendorId;

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails, com.amazon.devicesetupservice.ProvisioneeDetails
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatterProvisioneeDetails)) {
            return false;
        }
        MatterProvisioneeDetails matterProvisioneeDetails = (MatterProvisioneeDetails) obj;
        return super.equals(obj) && Objects.equals(getTransport(), matterProvisioneeDetails.getTransport()) && Objects.equals(getVendorId(), matterProvisioneeDetails.getVendorId()) && Objects.equals(getProductId(), matterProvisioneeDetails.getProductId()) && Objects.equals(getRotatingId(), matterProvisioneeDetails.getRotatingId()) && Objects.equals(getRotatingIdStatus(), matterProvisioneeDetails.getRotatingIdStatus()) && Objects.equals(getDiscriminator(), matterProvisioneeDetails.getDiscriminator());
    }

    @Required
    @MaxValue("4095")
    @Documentation("Matter device discriminator - 12 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getDiscriminator() {
        return this.discriminator;
    }

    @Required
    @MaxValue("65535")
    @Documentation("Matter (manufacturer) product ID - 16 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getProductId() {
        return this.productId;
    }

    @MaxLength(50)
    @MinLength(18)
    @Documentation("Matter rotating ID - currently 18 bytes but never more than 50.")
    public ByteBuffer getRotatingId() {
        return this.rotatingId;
    }

    @EnumValues({"UNAVAILABLE", RotatingIdStatus.RETRIEVED, RotatingIdStatus.RETRIEVAL_FAILED, RotatingIdStatus.NOT_RETRIEVED})
    @Documentation("Matter rotating ID status.")
    public String getRotatingIdStatus() {
        return this.rotatingIdStatus;
    }

    @EnumValues({Radio.BLUETOOTH_LOW_ENERGY, Radio.WIFI, "Thread"})
    public String getTransport() {
        return this.transport;
    }

    @Required
    @MaxValue("65535")
    @Documentation("Matter (Zigbee) vendor ID - 16 bits.")
    @MinValue(Constants.FEEDBACK_TYPE_DISLIKE)
    public Integer getVendorId() {
        return this.vendorId;
    }

    @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails, com.amazon.devicesetupservice.ProvisioneeDetails
    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(super.hashCode()), Integer.valueOf(classNameHashCode), getTransport(), getVendorId(), getProductId(), getRotatingId(), getRotatingIdStatus(), getDiscriminator());
    }

    public void setDiscriminator(Integer num) {
        this.discriminator = num;
    }

    public void setProductId(Integer num) {
        this.productId = num;
    }

    public void setRotatingId(ByteBuffer byteBuffer) {
        this.rotatingId = byteBuffer;
    }

    public void setRotatingIdStatus(String str) {
        this.rotatingIdStatus = str;
    }

    public void setTransport(String str) {
        this.transport = str;
    }

    public void setVendorId(Integer num) {
        this.vendorId = num;
    }

    @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMac(getMac());
        builder.withRssi(getRssi());
        builder.withTransport(getTransport());
        builder.withVendorId(getVendorId());
        builder.withProductId(getProductId());
        builder.withRotatingId(getRotatingId());
        builder.withRotatingIdStatus(getRotatingIdStatus());
        builder.withDiscriminator(getDiscriminator());
        return builder;
    }

    @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails, com.amazon.devicesetupservice.ProvisioneeDetails
    public String toString() {
        StringBuilder sb = new StringBuilder("MatterProvisioneeDetails(super=");
        sb.append(super.toString());
        sb.append(", , , , , , transport=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.transport, ", vendorId=", sb);
        sb.append(String.valueOf(this.vendorId));
        sb.append(", productId=");
        sb.append(String.valueOf(this.productId));
        sb.append(", rotatingId=");
        sb.append(String.valueOf(this.rotatingId));
        sb.append(", rotatingIdStatus=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.rotatingIdStatus, ", discriminator=", sb);
        sb.append(String.valueOf(this.discriminator));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder extends SmartHomeProvisioneeDetails.Builder {
        protected Integer discriminator;
        protected Integer productId;
        protected ByteBuffer rotatingId;
        protected String rotatingIdStatus;
        protected String transport;
        protected Integer vendorId;

        @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails.Builder
        public MatterProvisioneeDetails build() {
            MatterProvisioneeDetails matterProvisioneeDetails = new MatterProvisioneeDetails();
            populate(matterProvisioneeDetails);
            return matterProvisioneeDetails;
        }

        public void populate(MatterProvisioneeDetails matterProvisioneeDetails) {
            super.populate((SmartHomeProvisioneeDetails) matterProvisioneeDetails);
            matterProvisioneeDetails.setTransport(this.transport);
            matterProvisioneeDetails.setVendorId(this.vendorId);
            matterProvisioneeDetails.setProductId(this.productId);
            matterProvisioneeDetails.setRotatingId(this.rotatingId);
            matterProvisioneeDetails.setRotatingIdStatus(this.rotatingIdStatus);
            matterProvisioneeDetails.setDiscriminator(this.discriminator);
        }

        public Builder withDiscriminator(Integer num) {
            this.discriminator = num;
            return this;
        }

        public Builder withProductId(Integer num) {
            this.productId = num;
            return this;
        }

        public Builder withRotatingId(ByteBuffer byteBuffer) {
            this.rotatingId = byteBuffer;
            return this;
        }

        public Builder withRotatingIdStatus(String str) {
            this.rotatingIdStatus = str;
            return this;
        }

        public Builder withTransport(String str) {
            this.transport = str;
            return this;
        }

        public Builder withVendorId(Integer num) {
            this.vendorId = num;
            return this;
        }

        @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails.Builder
        public Builder withMac(String str) {
            super.withMac(str);
            return this;
        }

        @Override // com.amazon.devicesetupservice.smarthome.SmartHomeProvisioneeDetails.Builder
        public Builder withRssi(int i) {
            super.withRssi(i);
            return this;
        }
    }
}
