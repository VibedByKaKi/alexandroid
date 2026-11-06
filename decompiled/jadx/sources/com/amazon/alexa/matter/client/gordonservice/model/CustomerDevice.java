package com.amazon.alexa.matter.client.gordonservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class CustomerDevice {
    private final String networkProtocol;
    private final List<DeviceObject> thread;
    private final List<DeviceObject> wifi;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class CustomerDeviceBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private String networkProtocol;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<DeviceObject> thread;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<DeviceObject> wifi;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerDeviceBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerDevice build() {
            return new CustomerDevice(this.networkProtocol, this.wifi, this.thread);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerDeviceBuilder networkProtocol(String str) {
            this.networkProtocol = str;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerDeviceBuilder thread(List<DeviceObject> list) {
            this.thread = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            StringBuilder sb = new StringBuilder("CustomerDevice.CustomerDeviceBuilder(networkProtocol=");
            sb.append(this.networkProtocol);
            sb.append(", wifi=");
            sb.append(this.wifi);
            sb.append(", thread=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.thread, sb);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public CustomerDeviceBuilder wifi(List<DeviceObject> list) {
            this.wifi = list;
            return this;
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private CustomerDevice() {
        this.networkProtocol = null;
        this.wifi = null;
        this.thread = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static CustomerDeviceBuilder builder() {
        return new CustomerDeviceBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomerDevice)) {
            return false;
        }
        CustomerDevice customerDevice = (CustomerDevice) obj;
        String networkProtocol = getNetworkProtocol();
        String networkProtocol2 = customerDevice.getNetworkProtocol();
        if (networkProtocol != null ? !networkProtocol.equals(networkProtocol2) : networkProtocol2 != null) {
            return false;
        }
        List<DeviceObject> wifi = getWifi();
        List<DeviceObject> wifi2 = customerDevice.getWifi();
        if (wifi != null ? !wifi.equals(wifi2) : wifi2 != null) {
            return false;
        }
        List<DeviceObject> thread = getThread();
        List<DeviceObject> thread2 = customerDevice.getThread();
        return thread != null ? thread.equals(thread2) : thread2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getNetworkProtocol() {
        return this.networkProtocol;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<DeviceObject> getThread() {
        return this.thread;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<DeviceObject> getWifi() {
        return this.wifi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String networkProtocol = getNetworkProtocol();
        int hashCode = networkProtocol == null ? 43 : networkProtocol.hashCode();
        List<DeviceObject> wifi = getWifi();
        int i = (hashCode + 59) * 59;
        int hashCode2 = wifi == null ? 43 : wifi.hashCode();
        List<DeviceObject> thread = getThread();
        return ((i + hashCode2) * 59) + (thread != null ? thread.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CustomerDevice(networkProtocol=" + getNetworkProtocol() + ", wifi=" + getWifi() + ", thread=" + getThread() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomerDevice withNetworkProtocol(String str) {
        return this.networkProtocol == str ? this : new CustomerDevice(str, this.wifi, this.thread);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomerDevice withThread(List<DeviceObject> list) {
        return this.thread == list ? this : new CustomerDevice(this.networkProtocol, this.wifi, list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomerDevice withWifi(List<DeviceObject> list) {
        return this.wifi == list ? this : new CustomerDevice(this.networkProtocol, list, this.thread);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CustomerDevice(String str, List<DeviceObject> list, List<DeviceObject> list2) {
        this.networkProtocol = str;
        this.wifi = list;
        this.thread = list2;
    }
}
