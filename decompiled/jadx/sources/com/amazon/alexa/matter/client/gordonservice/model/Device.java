package com.amazon.alexa.matter.client.gordonservice.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class Device {
    private final List<Connection> connections;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class DeviceBuilder {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private List<Connection> connections;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Device build() {
            return new Device(this.connections);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public DeviceBuilder connections(List<Connection> list) {
            this.connections = list;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.connections, new StringBuilder("Device.DeviceBuilder(connections="));
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    private Device() {
        this.connections = null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static DeviceBuilder builder() {
        return new DeviceBuilder();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        List<Connection> connections = getConnections();
        List<Connection> connections2 = ((Device) obj).getConnections();
        return connections != null ? connections.equals(connections2) : connections2 == null;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<Connection> getConnections() {
        return this.connections;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<Connection> connections = getConnections();
        return 59 + (connections == null ? 43 : connections.hashCode());
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Device(connections=" + getConnections() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Device withConnections(List<Connection> list) {
        return this.connections == list ? this : new Device(list);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Device(List<Connection> list) {
        this.connections = list;
    }
}
