package com.amazon.comms.models.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceCapabilities {
    private List<String> capabilities;
    private String deviceTypeId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DeviceCapabilitiesBuilder {
        private List<String> capabilities;
        private String deviceTypeId;

        public DeviceCapabilities build() {
            return new DeviceCapabilities(0, this.deviceTypeId, this.capabilities);
        }

        public DeviceCapabilitiesBuilder capabilities(List<String> list) {
            this.capabilities = list;
            return this;
        }

        public DeviceCapabilitiesBuilder deviceTypeId(String str) {
            this.deviceTypeId = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("DeviceCapabilities.DeviceCapabilitiesBuilder(deviceTypeId=", this.deviceTypeId, ", capabilities=", String.valueOf(this.capabilities), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private DeviceCapabilities(String str, List<String> list) {
        this.deviceTypeId = str;
        this.capabilities = list;
    }

    public static DeviceCapabilitiesBuilder builder() {
        return new DeviceCapabilitiesBuilder();
    }

    public List<String> getCapabilities() {
        return this.capabilities;
    }

    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    public void setCapabilities(List<String> list) {
        this.capabilities = list;
    }

    public void setDeviceTypeId(String str) {
        this.deviceTypeId = str;
    }

    public DeviceCapabilities() {
    }

    public /* synthetic */ DeviceCapabilities(int i, String str, List list) {
        this(str, list);
    }
}
