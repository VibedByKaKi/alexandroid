package com.amazon.devicesetupservice.smarthome;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.ListMemberConstraint;
import com.amazon.coral.annotation.MapKeyConstraint;
import com.amazon.coral.annotation.MapValueConstraint;
import com.amazon.coral.annotation.NestedConstraints;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.smarthome/")
@CoralSuppressWarnings
@Generated
@XmlName("ProvisionerConfigurationInfo")
@Documentation("Wraps FeatureSettings and BleScanFilterList for Provisioner")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ProvisionerConfigurationInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.smarthome.ProvisionerConfigurationInfo");
    private List<String> bleScanFilterList;
    private Map<String, String> featureSettings;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected List<String> bleScanFilterList;
        protected Map<String, String> featureSettings;

        public ProvisionerConfigurationInfo build() {
            ProvisionerConfigurationInfo provisionerConfigurationInfo = new ProvisionerConfigurationInfo();
            populate(provisionerConfigurationInfo);
            return provisionerConfigurationInfo;
        }

        public void populate(ProvisionerConfigurationInfo provisionerConfigurationInfo) {
            provisionerConfigurationInfo.setFeatureSettings(this.featureSettings);
            provisionerConfigurationInfo.setBleScanFilterList(this.bleScanFilterList);
        }

        public Builder withBleScanFilterList(List<String> list) {
            this.bleScanFilterList = list;
            return this;
        }

        public Builder withFeatureSettings(Map<String, String> map) {
            this.featureSettings = map;
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
        if (!(obj instanceof ProvisionerConfigurationInfo)) {
            return false;
        }
        ProvisionerConfigurationInfo provisionerConfigurationInfo = (ProvisionerConfigurationInfo) obj;
        return Objects.equals(getFeatureSettings(), provisionerConfigurationInfo.getFeatureSettings()) && Objects.equals(getBleScanFilterList(), provisionerConfigurationInfo.getBleScanFilterList());
    }

    @ListMemberConstraint(@NestedConstraints)
    @Documentation("BLE Scan Filters for the Provisioner")
    public List<String> getBleScanFilterList() {
        return this.bleScanFilterList;
    }

    @MapKeyConstraint(@NestedConstraints)
    @MapValueConstraint(@NestedConstraints)
    @Documentation("Configuration list to set features on the Provisioner.")
    public Map<String, String> getFeatureSettings() {
        return this.featureSettings;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getFeatureSettings(), getBleScanFilterList());
    }

    public void setBleScanFilterList(List<String> list) {
        this.bleScanFilterList = list;
    }

    public void setFeatureSettings(Map<String, String> map) {
        this.featureSettings = map;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withFeatureSettings(getFeatureSettings());
        builder.withBleScanFilterList(getBleScanFilterList());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProvisionerConfigurationInfo(featureSettings=");
        sb.append(String.valueOf(this.featureSettings));
        sb.append(", bleScanFilterList=");
        return CredentialConfig$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, (List) this.bleScanFilterList, sb);
    }
}
