package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.annotation.JsonInclude;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RedactInLogs
/* loaded from: classes20.dex */
public class SIPProxyEndpoint {
    private String host;
    private Integer port;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SIPProxyEndpointBuilder {
        private String host;
        private Integer port;

        public SIPProxyEndpoint build() {
            return new SIPProxyEndpoint(0, this.port, this.host);
        }

        public SIPProxyEndpointBuilder host(String str) {
            this.host = str;
            return this;
        }

        public SIPProxyEndpointBuilder port(Integer num) {
            this.port = num;
            return this;
        }

        public String toString() {
            return "SIPProxyEndpoint.SIPProxyEndpointBuilder(host=" + this.host + ", port=" + this.port + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    private SIPProxyEndpoint(String str, Integer num) {
        this.host = str;
        this.port = num;
    }

    public static SIPProxyEndpointBuilder builder() {
        return new SIPProxyEndpointBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SIPProxyEndpoint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SIPProxyEndpoint)) {
            return false;
        }
        SIPProxyEndpoint sIPProxyEndpoint = (SIPProxyEndpoint) obj;
        if (!sIPProxyEndpoint.canEqual(this)) {
            return false;
        }
        Integer port = getPort();
        Integer port2 = sIPProxyEndpoint.getPort();
        if (port != null ? !port.equals(port2) : port2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = sIPProxyEndpoint.getHost();
        return host != null ? host.equals(host2) : host2 == null;
    }

    public String getHost() {
        return this.host;
    }

    public Integer getPort() {
        return this.port;
    }

    public int hashCode() {
        Integer port = getPort();
        int hashCode = port == null ? 43 : port.hashCode();
        String host = getHost();
        return ((hashCode + 59) * 59) + (host != null ? host.hashCode() : 43);
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setPort(Integer num) {
        this.port = num;
    }

    public String toString() {
        return "SIPProxyEndpoint(host=" + getHost() + ", port=" + getPort() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public SIPProxyEndpoint() {
    }

    public /* synthetic */ SIPProxyEndpoint(int i, Integer num, String str) {
        this(str, num);
    }
}
