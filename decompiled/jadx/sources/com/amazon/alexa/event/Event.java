package com.amazon.alexa.event;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.endpoint.Endpoint;
import com.amazon.alexa.header.Header;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Event<NamespaceType, NameType, InstanceType, PayloadType> {

    @CheckForNull
    private final Endpoint endpoint;

    @CheckForNull
    private final Header<NamespaceType, NameType, InstanceType> header;

    @CheckForNull
    private final PayloadType payload;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class EventBuilder<NamespaceType, NameType, InstanceType, PayloadType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Endpoint endpoint;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Header<NamespaceType, NameType, InstanceType> header;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private PayloadType payload;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EventBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Event<NamespaceType, NameType, InstanceType, PayloadType> build() {
            return new Event<>(this.header, this.endpoint, this.payload);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EventBuilder<NamespaceType, NameType, InstanceType, PayloadType> endpoint(@CheckForNull Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EventBuilder<NamespaceType, NameType, InstanceType, PayloadType> header(@CheckForNull Header<NamespaceType, NameType, InstanceType> header) {
            this.header = header;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public EventBuilder<NamespaceType, NameType, InstanceType, PayloadType> payload(@CheckForNull PayloadType payloadtype) {
            this.payload = payloadtype;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            String valueOf = String.valueOf(this.header);
            String valueOf2 = String.valueOf(this.endpoint);
            return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Event.EventBuilder(header=", valueOf, ", endpoint=", valueOf2, ", payload="), String.valueOf(this.payload), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Event(@CheckForNull Header<NamespaceType, NameType, InstanceType> header, @CheckForNull Endpoint endpoint, @CheckForNull PayloadType payloadtype) {
        this.header = header;
        this.endpoint = endpoint;
        this.payload = payloadtype;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, NameType, InstanceType, PayloadType> EventBuilder<NamespaceType, NameType, InstanceType, PayloadType> builder() {
        return new EventBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Event;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (!event.canEqual(this)) {
            return false;
        }
        Header<NamespaceType, NameType, InstanceType> header = getHeader();
        Header<NamespaceType, NameType, InstanceType> header2 = event.getHeader();
        if (header != null ? !header.equals(header2) : header2 != null) {
            return false;
        }
        Endpoint endpoint = getEndpoint();
        Endpoint endpoint2 = event.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        PayloadType payload = getPayload();
        Object payload2 = event.getPayload();
        return payload != null ? payload.equals(payload2) : payload2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Header<NamespaceType, NameType, InstanceType> getHeader() {
        return this.header;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public PayloadType getPayload() {
        return this.payload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Header<NamespaceType, NameType, InstanceType> header = getHeader();
        int hashCode = header == null ? 43 : header.hashCode();
        Endpoint endpoint = getEndpoint();
        int i = (hashCode + 59) * 59;
        int hashCode2 = endpoint == null ? 43 : endpoint.hashCode();
        PayloadType payload = getPayload();
        return ((i + hashCode2) * 59) + (payload != null ? payload.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        String valueOf = String.valueOf(getHeader());
        String valueOf2 = String.valueOf(getEndpoint());
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("Event(header=", valueOf, ", endpoint=", valueOf2, ", payload="), String.valueOf(getPayload()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
