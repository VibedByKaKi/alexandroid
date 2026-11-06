package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("WepKeyConfiguration")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class WepKeyConfiguration {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.WepKeyConfiguration");
    private int keyIndex;
    private List<String> wepKeyList;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected int keyIndex;
        protected List<String> wepKeyList;

        public WepKeyConfiguration build() {
            WepKeyConfiguration wepKeyConfiguration = new WepKeyConfiguration();
            populate(wepKeyConfiguration);
            return wepKeyConfiguration;
        }

        public void populate(WepKeyConfiguration wepKeyConfiguration) {
            wepKeyConfiguration.setWepKeyList(this.wepKeyList);
            wepKeyConfiguration.setKeyIndex(this.keyIndex);
        }

        public Builder withKeyIndex(int i) {
            this.keyIndex = i;
            return this;
        }

        public Builder withWepKeyList(List<String> list) {
            this.wepKeyList = list;
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
        if (!(obj instanceof WepKeyConfiguration)) {
            return false;
        }
        WepKeyConfiguration wepKeyConfiguration = (WepKeyConfiguration) obj;
        return Objects.equals(getWepKeyList(), wepKeyConfiguration.getWepKeyList()) && Integer.valueOf(getKeyIndex()).equals(Integer.valueOf(wepKeyConfiguration.getKeyIndex()));
    }

    @Documentation("An access point (wireless router) can be configured with as many as four\n        WEP keys. Only one key is used on the network at a time, however. The\n        keys are numbered, and the number of a key is referred to as its key\n        index.")
    public int getKeyIndex() {
        return this.keyIndex;
    }

    @ListMemberConstraint(@NestedConstraints)
    public List<String> getWepKeyList() {
        return this.wepKeyList;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getWepKeyList(), Integer.valueOf(getKeyIndex()));
    }

    public void setKeyIndex(int i) {
        this.keyIndex = i;
    }

    public void setWepKeyList(List<String> list) {
        this.wepKeyList = list;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withWepKeyList(getWepKeyList());
        builder.withKeyIndex(getKeyIndex());
        return builder;
    }

    public String toString() {
        return "WepKeyConfiguration(wepKeyList=*** REDACTED ***, keyIndex=" + String.valueOf(this.keyIndex) + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
