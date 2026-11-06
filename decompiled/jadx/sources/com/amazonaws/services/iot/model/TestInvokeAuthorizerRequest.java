package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class TestInvokeAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    private String authorizerName;
    private HttpContext httpContext;
    private MqttContext mqttContext;
    private TlsContext tlsContext;
    private String token;
    private String tokenSignature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TestInvokeAuthorizerRequest)) {
            return false;
        }
        TestInvokeAuthorizerRequest testInvokeAuthorizerRequest = (TestInvokeAuthorizerRequest) obj;
        if ((testInvokeAuthorizerRequest.getAuthorizerName() == null) ^ (getAuthorizerName() == null)) {
            return false;
        }
        if (testInvokeAuthorizerRequest.getAuthorizerName() != null && !testInvokeAuthorizerRequest.getAuthorizerName().equals(getAuthorizerName())) {
            return false;
        }
        if ((testInvokeAuthorizerRequest.getToken() == null) ^ (getToken() == null)) {
            return false;
        }
        if (testInvokeAuthorizerRequest.getToken() != null && !testInvokeAuthorizerRequest.getToken().equals(getToken())) {
            return false;
        }
        if ((testInvokeAuthorizerRequest.getTokenSignature() == null) ^ (getTokenSignature() == null)) {
            return false;
        }
        if (testInvokeAuthorizerRequest.getTokenSignature() != null && !testInvokeAuthorizerRequest.getTokenSignature().equals(getTokenSignature())) {
            return false;
        }
        if ((testInvokeAuthorizerRequest.getHttpContext() == null) ^ (getHttpContext() == null)) {
            return false;
        }
        if (testInvokeAuthorizerRequest.getHttpContext() != null && !testInvokeAuthorizerRequest.getHttpContext().equals(getHttpContext())) {
            return false;
        }
        if ((testInvokeAuthorizerRequest.getMqttContext() == null) ^ (getMqttContext() == null)) {
            return false;
        }
        if (testInvokeAuthorizerRequest.getMqttContext() != null && !testInvokeAuthorizerRequest.getMqttContext().equals(getMqttContext())) {
            return false;
        }
        if ((testInvokeAuthorizerRequest.getTlsContext() == null) ^ (getTlsContext() == null)) {
            return false;
        }
        return testInvokeAuthorizerRequest.getTlsContext() == null || testInvokeAuthorizerRequest.getTlsContext().equals(getTlsContext());
    }

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public HttpContext getHttpContext() {
        return this.httpContext;
    }

    public MqttContext getMqttContext() {
        return this.mqttContext;
    }

    public TlsContext getTlsContext() {
        return this.tlsContext;
    }

    public String getToken() {
        return this.token;
    }

    public String getTokenSignature() {
        return this.tokenSignature;
    }

    public int hashCode() {
        return (((((((((((getAuthorizerName() == null ? 0 : getAuthorizerName().hashCode()) + 31) * 31) + (getToken() == null ? 0 : getToken().hashCode())) * 31) + (getTokenSignature() == null ? 0 : getTokenSignature().hashCode())) * 31) + (getHttpContext() == null ? 0 : getHttpContext().hashCode())) * 31) + (getMqttContext() == null ? 0 : getMqttContext().hashCode())) * 31) + (getTlsContext() != null ? getTlsContext().hashCode() : 0);
    }

    public void setAuthorizerName(String str) {
        this.authorizerName = str;
    }

    public void setHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
    }

    public void setMqttContext(MqttContext mqttContext) {
        this.mqttContext = mqttContext;
    }

    public void setTlsContext(TlsContext tlsContext) {
        this.tlsContext = tlsContext;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTokenSignature(String str) {
        this.tokenSignature = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAuthorizerName() != null) {
            sb.append("authorizerName: " + getAuthorizerName() + ",");
        }
        if (getToken() != null) {
            sb.append("token: " + getToken() + ",");
        }
        if (getTokenSignature() != null) {
            sb.append("tokenSignature: " + getTokenSignature() + ",");
        }
        if (getHttpContext() != null) {
            sb.append("httpContext: " + getHttpContext() + ",");
        }
        if (getMqttContext() != null) {
            sb.append("mqttContext: " + getMqttContext() + ",");
        }
        if (getTlsContext() != null) {
            sb.append("tlsContext: " + getTlsContext());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public TestInvokeAuthorizerRequest withAuthorizerName(String str) {
        this.authorizerName = str;
        return this;
    }

    public TestInvokeAuthorizerRequest withHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
        return this;
    }

    public TestInvokeAuthorizerRequest withMqttContext(MqttContext mqttContext) {
        this.mqttContext = mqttContext;
        return this;
    }

    public TestInvokeAuthorizerRequest withTlsContext(TlsContext tlsContext) {
        this.tlsContext = tlsContext;
        return this;
    }

    public TestInvokeAuthorizerRequest withToken(String str) {
        this.token = str;
        return this;
    }

    public TestInvokeAuthorizerRequest withTokenSignature(String str) {
        this.tokenSignature = str;
        return this;
    }
}
