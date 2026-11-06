package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Payload {
    private Request request;
    private Response response;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Payload() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Payload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) obj;
        if (!payload.canEqual(this)) {
            return false;
        }
        Request request = getRequest();
        Request request2 = payload.getRequest();
        if (request != null ? !request.equals(request2) : request2 != null) {
            return false;
        }
        Response response = getResponse();
        Response response2 = payload.getResponse();
        return response != null ? response.equals(response2) : response2 == null;
    }

    @JsonProperty(MissingTokenPull.TRIGGER_REQUEST)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Request getRequest() {
        return this.request;
    }

    @JsonProperty("response")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Response getResponse() {
        return this.response;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Request request = getRequest();
        int hashCode = request == null ? 43 : request.hashCode();
        Response response = getResponse();
        return ((hashCode + 59) * 59) + (response != null ? response.hashCode() : 43);
    }

    @JsonProperty(MissingTokenPull.TRIGGER_REQUEST)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("response")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setResponse(Response response) {
        this.response = response;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Payload(request=" + getRequest() + ", response=" + getResponse() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
