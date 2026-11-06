package com.amazon.comms.models.device;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class CommsDeviceContext {
    public String COMMS_DEVICE_CONTEXT_NAME;
    private String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CommsDeviceContextBuilder {
        private String COMMS_DEVICE_CONTEXT_NAME;
        private String version;

        public CommsDeviceContextBuilder COMMS_DEVICE_CONTEXT_NAME(String str) {
            this.COMMS_DEVICE_CONTEXT_NAME = str;
            return this;
        }

        public CommsDeviceContext build() {
            return new CommsDeviceContext(this.COMMS_DEVICE_CONTEXT_NAME, this.version);
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("CommsDeviceContext.CommsDeviceContextBuilder(COMMS_DEVICE_CONTEXT_NAME=", this.COMMS_DEVICE_CONTEXT_NAME, ", version=", this.version, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public CommsDeviceContextBuilder version(String str) {
            this.version = str;
            return this;
        }
    }

    public CommsDeviceContext() {
        this.COMMS_DEVICE_CONTEXT_NAME = "Comms";
    }

    public static CommsDeviceContextBuilder builder() {
        return new CommsDeviceContextBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CommsDeviceContext;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommsDeviceContext)) {
            return false;
        }
        CommsDeviceContext commsDeviceContext = (CommsDeviceContext) obj;
        if (!commsDeviceContext.canEqual(this)) {
            return false;
        }
        String comms_device_context_name = getCOMMS_DEVICE_CONTEXT_NAME();
        String comms_device_context_name2 = commsDeviceContext.getCOMMS_DEVICE_CONTEXT_NAME();
        if (comms_device_context_name != null ? !comms_device_context_name.equals(comms_device_context_name2) : comms_device_context_name2 != null) {
            return false;
        }
        String version = getVersion();
        String version2 = commsDeviceContext.getVersion();
        return version != null ? version.equals(version2) : version2 == null;
    }

    public String getCOMMS_DEVICE_CONTEXT_NAME() {
        return this.COMMS_DEVICE_CONTEXT_NAME;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String comms_device_context_name = getCOMMS_DEVICE_CONTEXT_NAME();
        int hashCode = comms_device_context_name == null ? 43 : comms_device_context_name.hashCode();
        String version = getVersion();
        return ((hashCode + 59) * 59) + (version != null ? version.hashCode() : 43);
    }

    public void setCOMMS_DEVICE_CONTEXT_NAME(String str) {
        this.COMMS_DEVICE_CONTEXT_NAME = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CommsDeviceContext(COMMS_DEVICE_CONTEXT_NAME=", getCOMMS_DEVICE_CONTEXT_NAME(), ", version=", getVersion(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CommsDeviceContext(String str, String str2) {
        this.COMMS_DEVICE_CONTEXT_NAME = str;
        this.version = str2;
    }
}
