package com.amazon.clouddrive.cdasdk.cds.source;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SourceInfo extends BaseSourceInfo {

    @SerializedName("device")
    @Expose
    private BaseDeviceInfo device;

    @SerializedName("sourceUsage")
    @Expose
    private Map<String, MediaTypeUsage> sourceUsage;

    @Generated
    public SourceInfo() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SourceInfo;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceInfo)) {
            return false;
        }
        SourceInfo sourceInfo = (SourceInfo) obj;
        if (!sourceInfo.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        BaseDeviceInfo device = getDevice();
        BaseDeviceInfo device2 = sourceInfo.getDevice();
        if (device != null ? !device.equals(device2) : device2 != null) {
            return false;
        }
        Map<String, MediaTypeUsage> sourceUsage = getSourceUsage();
        Map<String, MediaTypeUsage> sourceUsage2 = sourceInfo.getSourceUsage();
        return sourceUsage != null ? sourceUsage.equals(sourceUsage2) : sourceUsage2 == null;
    }

    @Generated
    public BaseDeviceInfo getDevice() {
        return this.device;
    }

    @Generated
    public Map<String, MediaTypeUsage> getSourceUsage() {
        return this.sourceUsage;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        BaseDeviceInfo device = getDevice();
        int i = hashCode * 59;
        int hashCode2 = device == null ? 43 : device.hashCode();
        Map<String, MediaTypeUsage> sourceUsage = getSourceUsage();
        return ((i + hashCode2) * 59) + (sourceUsage != null ? sourceUsage.hashCode() : 43);
    }

    @Generated
    public void setDevice(BaseDeviceInfo baseDeviceInfo) {
        this.device = baseDeviceInfo;
    }

    @Generated
    public void setSourceUsage(Map<String, MediaTypeUsage> map) {
        this.sourceUsage = map;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.source.BaseSourceInfo
    @Generated
    public String toString() {
        return "SourceInfo(device=" + getDevice() + ", sourceUsage=" + getSourceUsage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
