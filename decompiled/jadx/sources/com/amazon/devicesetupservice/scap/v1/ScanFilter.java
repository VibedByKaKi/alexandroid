package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Pattern;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ScanFilter")
@Documentation("Single BLE scan filter")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ScanFilter {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ScanFilter");
    private String serviceData;
    private String serviceDataMask;
    private String serviceUuid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String serviceData;
        protected String serviceDataMask;
        protected String serviceUuid;

        public ScanFilter build() {
            ScanFilter scanFilter = new ScanFilter();
            populate(scanFilter);
            return scanFilter;
        }

        public void populate(ScanFilter scanFilter) {
            scanFilter.setServiceUuid(this.serviceUuid);
            scanFilter.setServiceData(this.serviceData);
            scanFilter.setServiceDataMask(this.serviceDataMask);
        }

        public Builder withServiceData(String str) {
            this.serviceData = str;
            return this;
        }

        public Builder withServiceDataMask(String str) {
            this.serviceDataMask = str;
            return this;
        }

        public Builder withServiceUuid(String str) {
            this.serviceUuid = str;
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
        if (!(obj instanceof ScanFilter)) {
            return false;
        }
        ScanFilter scanFilter = (ScanFilter) obj;
        return Objects.equals(getServiceUuid(), scanFilter.getServiceUuid()) && Objects.equals(getServiceData(), scanFilter.getServiceData()) && Objects.equals(getServiceDataMask(), scanFilter.getServiceDataMask());
    }

    @Documentation("BLE service data (in hexadecimal byte form)")
    @Pattern("[0-9a-fA-F]*")
    public String getServiceData() {
        return this.serviceData;
    }

    @Documentation("BLE service data mask (in hexadecimal byte form)")
    @Pattern("[0-9a-fA-F]*")
    public String getServiceDataMask() {
        return this.serviceDataMask;
    }

    @Documentation("BLE UUID (hexadecimal 16- or 32-bit or 128-bit canonical form).")
    @Pattern("([0-9a-fA-F]{4})|([0-9a-fA-F]{8})|([0-9a-fA-F]{8}(-[0-9a-fA-F]{4}){3}-[0-9a-fA-F]{12})")
    public String getServiceUuid() {
        return this.serviceUuid;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getServiceUuid(), getServiceData(), getServiceDataMask());
    }

    public void setServiceData(String str) {
        this.serviceData = str;
    }

    public void setServiceDataMask(String str) {
        this.serviceDataMask = str;
    }

    public void setServiceUuid(String str) {
        this.serviceUuid = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withServiceUuid(getServiceUuid());
        builder.withServiceData(getServiceData());
        builder.withServiceDataMask(getServiceDataMask());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScanFilter(serviceUuid=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.serviceUuid, ", serviceData=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.serviceData, ", serviceDataMask=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.serviceDataMask, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
