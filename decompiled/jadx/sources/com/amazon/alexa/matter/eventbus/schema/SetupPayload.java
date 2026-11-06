package com.amazon.alexa.matter.eventbus.schema;

import chip.platform.ConfigurationManager;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SetupPayload {
    private long discriminator;
    private boolean isShortDiscriminator;
    private Long productID;
    private long setUpPINCode;
    private Long vendorID;
    private long version;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupPayload() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SetupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupPayload)) {
            return false;
        }
        SetupPayload setupPayload = (SetupPayload) obj;
        if (!setupPayload.canEqual(this) || getDiscriminator() != setupPayload.getDiscriminator() || isShortDiscriminator() != setupPayload.isShortDiscriminator() || getSetUpPINCode() != setupPayload.getSetUpPINCode() || getVersion() != setupPayload.getVersion()) {
            return false;
        }
        Long productID = getProductID();
        Long productID2 = setupPayload.getProductID();
        if (productID != null ? !productID.equals(productID2) : productID2 != null) {
            return false;
        }
        Long vendorID = getVendorID();
        Long vendorID2 = setupPayload.getVendorID();
        return vendorID != null ? vendorID.equals(vendorID2) : vendorID2 == null;
    }

    @JsonProperty(ConfigurationManager.kConfigKey_SetupDiscriminator)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getDiscriminator() {
        return this.discriminator;
    }

    @JsonProperty("productID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getProductID() {
        return this.productID;
    }

    @JsonProperty("setUpPINCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getSetUpPINCode() {
        return this.setUpPINCode;
    }

    @JsonProperty("vendorID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Long getVendorID() {
        return this.vendorID;
    }

    @JsonProperty("version")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getVersion() {
        return this.version;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long discriminator = getDiscriminator();
        int i = ((((int) (discriminator ^ (discriminator >>> 32))) + 59) * 59) + (isShortDiscriminator() ? 79 : 97);
        long setUpPINCode = getSetUpPINCode();
        int i2 = (i * 59) + ((int) (setUpPINCode ^ (setUpPINCode >>> 32)));
        long version = getVersion();
        Long productID = getProductID();
        int i3 = ((i2 * 59) + ((int) ((version >>> 32) ^ version))) * 59;
        int hashCode = productID == null ? 43 : productID.hashCode();
        Long vendorID = getVendorID();
        return ((i3 + hashCode) * 59) + (vendorID != null ? vendorID.hashCode() : 43);
    }

    @JsonProperty("isShortDiscriminator")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean isShortDiscriminator() {
        return this.isShortDiscriminator;
    }

    @JsonProperty(ConfigurationManager.kConfigKey_SetupDiscriminator)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiscriminator(long j) {
        this.discriminator = j;
    }

    @JsonProperty("productID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setProductID(Long l) {
        this.productID = l;
    }

    @JsonProperty("setUpPINCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSetUpPINCode(long j) {
        this.setUpPINCode = j;
    }

    @JsonProperty("isShortDiscriminator")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setShortDiscriminator(boolean z) {
        this.isShortDiscriminator = z;
    }

    @JsonProperty("vendorID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setVendorID(Long l) {
        this.vendorID = l;
    }

    @JsonProperty("version")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setVersion(long j) {
        this.version = j;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SetupPayload(discriminator=" + getDiscriminator() + ", isShortDiscriminator=" + isShortDiscriminator() + ", productID=" + getProductID() + ", setUpPINCode=" + getSetUpPINCode() + ", vendorID=" + getVendorID() + ", version=" + getVersion() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
