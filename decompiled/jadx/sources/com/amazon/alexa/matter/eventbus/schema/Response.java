package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class Response {
    private ResponseBody body;
    private ResponseHeader header;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Response() {
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
        ResponseBody body = getBody();
        ResponseBody body2 = response.getBody();
        if (body != null ? !body.equals(body2) : body2 != null) {
            return false;
        }
        ResponseHeader header = getHeader();
        ResponseHeader header2 = response.getHeader();
        return header != null ? header.equals(header2) : header2 == null;
    }

    @JsonProperty("body")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ResponseBody getBody() {
        return this.body;
    }

    @JsonProperty(Content.HEADER)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ResponseHeader getHeader() {
        return this.header;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        ResponseBody body = getBody();
        int hashCode = body == null ? 43 : body.hashCode();
        ResponseHeader header = getHeader();
        return ((hashCode + 59) * 59) + (header != null ? header.hashCode() : 43);
    }

    @JsonProperty("body")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setBody(ResponseBody responseBody) {
        this.body = responseBody;
    }

    @JsonProperty(Content.HEADER)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHeader(ResponseHeader responseHeader) {
        this.header = responseHeader;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "Response(body=" + getBody() + ", header=" + getHeader() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
