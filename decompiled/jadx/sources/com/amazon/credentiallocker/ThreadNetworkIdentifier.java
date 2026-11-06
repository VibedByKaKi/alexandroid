package com.amazon.credentiallocker;

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
@XmlName("ThreadNetworkIdentifier")
@Documentation("A unique idenfifer for a Thread network composed of network name and\n        extended PAN ID.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public class ThreadNetworkIdentifier {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.ThreadNetworkIdentifier");
    private String extendedPanId;
    private String networkName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String extendedPanId;
        protected String networkName;

        public ThreadNetworkIdentifier build() {
            ThreadNetworkIdentifier threadNetworkIdentifier = new ThreadNetworkIdentifier();
            populate(threadNetworkIdentifier);
            return threadNetworkIdentifier;
        }

        public void populate(ThreadNetworkIdentifier threadNetworkIdentifier) {
            threadNetworkIdentifier.setNetworkName(this.networkName);
            threadNetworkIdentifier.setExtendedPanId(this.extendedPanId);
        }

        public Builder withExtendedPanId(String str) {
            this.extendedPanId = str;
            return this;
        }

        public Builder withNetworkName(String str) {
            this.networkName = str;
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
        if (!(obj instanceof ThreadNetworkIdentifier)) {
            return false;
        }
        ThreadNetworkIdentifier threadNetworkIdentifier = (ThreadNetworkIdentifier) obj;
        return Objects.equals(getNetworkName(), threadNetworkIdentifier.getNetworkName()) && Objects.equals(getExtendedPanId(), threadNetworkIdentifier.getExtendedPanId());
    }

    @MaxLength(16)
    @Required
    @Sensitive
    @MinLength(16)
    public String getExtendedPanId() {
        return this.extendedPanId;
    }

    @Required
    @Sensitive
    public String getNetworkName() {
        return this.networkName;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getNetworkName(), getExtendedPanId());
    }

    public void setExtendedPanId(String str) {
        this.extendedPanId = str;
    }

    public void setNetworkName(String str) {
        this.networkName = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withNetworkName(getNetworkName());
        builder.withExtendedPanId(getExtendedPanId());
        return builder;
    }

    public String toString() {
        return "ThreadNetworkIdentifier(networkName=*** REDACTED ***, extendedPanId=*** REDACTED ***)";
    }
}
