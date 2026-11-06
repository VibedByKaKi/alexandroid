package com.amazon.alexa.matter.client.gordonservice.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class SetupRequirementsRequest {
    private final int discriminatorId;
    private final Integer productId;
    private final Integer vendorId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class SetupRequirementsRequestBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private int discriminatorId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer productId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Integer vendorId;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsRequestBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsRequest build() {
            return new SetupRequirementsRequest(this.vendorId, this.productId, this.discriminatorId);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsRequestBuilder discriminatorId(int i) {
            this.discriminatorId = i;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsRequestBuilder productId(Integer num) {
            this.productId = num;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("SetupRequirementsRequest.SetupRequirementsRequestBuilder(vendorId=");
            sb.append(this.vendorId);
            sb.append(", productId=");
            sb.append(this.productId);
            sb.append(", discriminatorId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.discriminatorId, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public SetupRequirementsRequestBuilder vendorId(Integer num) {
            this.vendorId = num;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private SetupRequirementsRequest() {
        this.vendorId = null;
        this.productId = null;
        this.discriminatorId = 0;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static SetupRequirementsRequestBuilder builder() {
        return new SetupRequirementsRequestBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetupRequirementsRequest)) {
            return false;
        }
        SetupRequirementsRequest setupRequirementsRequest = (SetupRequirementsRequest) obj;
        if (getDiscriminatorId() != setupRequirementsRequest.getDiscriminatorId()) {
            return false;
        }
        Integer vendorId = getVendorId();
        Integer vendorId2 = setupRequirementsRequest.getVendorId();
        if (vendorId != null ? !vendorId.equals(vendorId2) : vendorId2 != null) {
            return false;
        }
        Integer productId = getProductId();
        Integer productId2 = setupRequirementsRequest.getProductId();
        return productId != null ? productId.equals(productId2) : productId2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int getDiscriminatorId() {
        return this.discriminatorId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getProductId() {
        return this.productId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Integer getVendorId() {
        return this.vendorId;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        int discriminatorId = getDiscriminatorId() + 59;
        Integer vendorId = getVendorId();
        int i = discriminatorId * 59;
        int hashCode = vendorId == null ? 43 : vendorId.hashCode();
        Integer productId = getProductId();
        return ((i + hashCode) * 59) + (productId != null ? productId.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SetupRequirementsRequest(vendorId=" + getVendorId() + ", productId=" + getProductId() + ", discriminatorId=" + getDiscriminatorId() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsRequest withDiscriminatorId(int i) {
        return this.discriminatorId == i ? this : new SetupRequirementsRequest(this.vendorId, this.productId, i);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsRequest withProductId(Integer num) {
        return this.productId == num ? this : new SetupRequirementsRequest(this.vendorId, num, this.discriminatorId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsRequest withVendorId(Integer num) {
        return this.vendorId == num ? this : new SetupRequirementsRequest(num, this.productId, this.discriminatorId);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupRequirementsRequest(Integer num, Integer num2, int i) {
        this.vendorId = num;
        this.productId = num2;
        this.discriminatorId = i;
    }
}
