package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Sensitive;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("ThreadNetworkScanResult")
@Documentation("A unique idenfifer for a Thread network composed of network name and\n        extended PAN ID, along with scan information.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class ThreadNetworkScanResult {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.ThreadNetworkScanResult");
    private String extendedPanId;
    private Long lqi;
    private String networkName;
    private Long rssi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String extendedPanId;
        protected Long lqi;
        protected String networkName;
        protected Long rssi;

        public ThreadNetworkScanResult build() {
            ThreadNetworkScanResult threadNetworkScanResult = new ThreadNetworkScanResult();
            populate(threadNetworkScanResult);
            return threadNetworkScanResult;
        }

        public void populate(ThreadNetworkScanResult threadNetworkScanResult) {
            threadNetworkScanResult.setNetworkName(this.networkName);
            threadNetworkScanResult.setExtendedPanId(this.extendedPanId);
            threadNetworkScanResult.setRssi(this.rssi);
            threadNetworkScanResult.setLqi(this.lqi);
        }

        public Builder withExtendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        public Builder withLqi(Long l) {
            this.lqi = l;
            return this;
        }

        public Builder withNetworkName(String str) {
            this.networkName = str;
            return this;
        }

        public Builder withRssi(Long l) {
            this.rssi = l;
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
        if (!(obj instanceof ThreadNetworkScanResult)) {
            return false;
        }
        ThreadNetworkScanResult threadNetworkScanResult = (ThreadNetworkScanResult) obj;
        return Objects.equals(getNetworkName(), threadNetworkScanResult.getNetworkName()) && Objects.equals(getExtendedPanId(), threadNetworkScanResult.getExtendedPanId()) && Objects.equals(getRssi(), threadNetworkScanResult.getRssi()) && Objects.equals(getLqi(), threadNetworkScanResult.getLqi());
    }

    @MaxLength(16)
    @Required
    @Sensitive
    @MinLength(16)
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    public Long getLqi() {
        return this.lqi;
    }

    @Required
    @Sensitive
    public String getNetworkName() {
        return this.networkName;
    }

    public Long getRssi() {
        return this.rssi;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNetworkName(), getExtendedPanId(), getRssi(), getLqi());
    }

    public void setExtendedPanId(String str) {
        this.extendedPanId = str;
    }

    public void setLqi(Long l) {
        this.lqi = l;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }

    public void setRssi(Long l) {
        this.rssi = l;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNetworkName(getNetworkName());
        builder.withExtendedPanId(getExtendedPanId());
        builder.withRssi(getRssi());
        builder.withLqi(getLqi());
        return builder;
    }

    public String toString() {
        return "ThreadNetworkScanResult(networkName=*** REDACTED ***, extendedPanId=*** REDACTED ***, rssi=" + String.valueOf(this.rssi) + ", lqi=" + String.valueOf(this.lqi) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
