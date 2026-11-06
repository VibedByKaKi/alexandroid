package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Request {
    private RequestBody body;
    private RequestHeader header;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Request() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Request;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        if (!request.canEqual(this)) {
            return false;
        }
        RequestBody body = getBody();
        RequestBody body2 = request.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        RequestHeader header = getHeader();
        RequestHeader header2 = request.getHeader();
        return header != null ? header.equals(header2) : header2 == null;
    }

    @JsonProperty("body")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public RequestBody getBody() {
        return this.body;
    }

    @JsonProperty(Content.HEADER)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public RequestHeader getHeader() {
        return this.header;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        RequestBody body = getBody();
        int hashCode = body == null ? 43 : body.hashCode();
        RequestHeader header = getHeader();
        return ((hashCode + 59) * 59) + (header != null ? header.hashCode() : 43);
    }

    @JsonProperty("body")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    @JsonProperty(Content.HEADER)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHeader(RequestHeader requestHeader) {
        this.header = requestHeader;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Request(body=" + getBody() + ", header=" + getHeader() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
