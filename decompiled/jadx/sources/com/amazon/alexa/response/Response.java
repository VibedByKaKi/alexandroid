package com.amazon.alexa.response;

import com.amazon.alexa.context.Context;
import com.amazon.alexa.event.Event;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class Response<NamespaceType, ResponseType, InstanceType, PayloadType> {

    @CheckForNull
    private final Context context;

    @CheckForNull
    private final Event<NamespaceType, ResponseType, InstanceType, PayloadType> event;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static class ResponseBuilder<NamespaceType, ResponseType, InstanceType, PayloadType> {

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Context context;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        private Event<NamespaceType, ResponseType, InstanceType, PayloadType> event;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ResponseBuilder() {
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Response<NamespaceType, ResponseType, InstanceType, PayloadType> build() {
            return new Response<>(this.event, this.context);
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ResponseBuilder<NamespaceType, ResponseType, InstanceType, PayloadType> context(@CheckForNull Context context) {
            this.context = context;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public ResponseBuilder<NamespaceType, ResponseType, InstanceType, PayloadType> event(@CheckForNull Event<NamespaceType, ResponseType, InstanceType, PayloadType> event) {
            this.event = event;
            return this;
        }

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Response.ResponseBuilder(event=", String.valueOf(this.event), ", context=", String.valueOf(this.context), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Response(@CheckForNull Event<NamespaceType, ResponseType, InstanceType, PayloadType> event, @CheckForNull Context context) {
        this.event = event;
        this.context = context;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static <NamespaceType, ResponseType, InstanceType, PayloadType> ResponseBuilder<NamespaceType, ResponseType, InstanceType, PayloadType> builder() {
        return new ResponseBuilder<>();
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Response;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        if (!response.canEqual(this)) {
            return false;
        }
        Event<NamespaceType, ResponseType, InstanceType, PayloadType> event = getEvent();
        Event<NamespaceType, ResponseType, InstanceType, PayloadType> event2 = response.getEvent();
        if (event != null ? !event.equals(event2) : event2 != null) {
            return false;
        }
        Context context = getContext();
        Context context2 = response.getContext();
        return context != null ? context.equals(context2) : context2 == null;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Context getContext() {
        return this.context;
    }

    @CheckForNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Event<NamespaceType, ResponseType, InstanceType, PayloadType> getEvent() {
        return this.event;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Event<NamespaceType, ResponseType, InstanceType, PayloadType> event = getEvent();
        int hashCode = event == null ? 43 : event.hashCode();
        Context context = getContext();
        return ((hashCode + 59) * 59) + (context != null ? context.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Response(event=", String.valueOf(getEvent()), ", context=", String.valueOf(getContext()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
