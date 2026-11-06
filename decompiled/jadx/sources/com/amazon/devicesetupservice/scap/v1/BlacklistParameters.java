package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.NestedConstraints;
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
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("BlacklistParameters")
@Documentation("Blacklisting parameters.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class BlacklistParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.BlacklistParameters");
    private List<String> deviceIdList;
    private List<BlacklistDevice> devicesToBlacklist;
    private String duration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<String> deviceIdList;
        protected List<BlacklistDevice> devicesToBlacklist;
        protected String duration;

        public BlacklistParameters build() {
            BlacklistParameters blacklistParameters = new BlacklistParameters();
            populate(blacklistParameters);
            return blacklistParameters;
        }

        public void populate(BlacklistParameters blacklistParameters) {
            blacklistParameters.setDeviceIdList(this.deviceIdList);
            blacklistParameters.setDevicesToBlacklist(this.devicesToBlacklist);
            blacklistParameters.setDuration(this.duration);
        }

        public Builder withDeviceIdList(List<String> list) {
            this.deviceIdList = list;
            return this;
        }

        public Builder withDevicesToBlacklist(List<BlacklistDevice> list) {
            this.devicesToBlacklist = list;
            return this;
        }

        public Builder withDuration(String str) {
            this.duration = str;
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
        if (!(obj instanceof BlacklistParameters)) {
            return false;
        }
        BlacklistParameters blacklistParameters = (BlacklistParameters) obj;
        return Objects.equals(getDeviceIdList(), blacklistParameters.getDeviceIdList()) && Objects.equals(getDevicesToBlacklist(), blacklistParameters.getDevicesToBlacklist()) && Objects.equals(getDuration(), blacklistParameters.getDuration());
    }

    @ListMemberConstraint(@NestedConstraints(minLength = {@MinLength(1)}))
    @Documentation("List of peripheral device IDs to blacklist.")
    public List<String> getDeviceIdList() {
        return this.deviceIdList;
    }

    @Documentation("List of peripheral devices to blacklist on the provisioner.")
    public List<BlacklistDevice> getDevicesToBlacklist() {
        return this.devicesToBlacklist;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getDeviceIdList(), getDevicesToBlacklist(), getDuration());
    }

    public void setDeviceIdList(List<String> list) {
        this.deviceIdList = list;
    }

    public void setDevicesToBlacklist(List<BlacklistDevice> list) {
        this.devicesToBlacklist = list;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withDeviceIdList(getDeviceIdList());
        builder.withDevicesToBlacklist(getDevicesToBlacklist());
        builder.withDuration(getDuration());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BlacklistParameters(deviceIdList=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", devicesToBlacklist=", (List) this.deviceIdList, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", duration=", (List) this.devicesToBlacklist, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.duration, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
