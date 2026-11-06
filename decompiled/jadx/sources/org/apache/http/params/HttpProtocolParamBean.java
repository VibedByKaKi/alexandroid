package org.apache.http.params;

import org.apache.http.HttpVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class HttpProtocolParamBean extends HttpAbstractParamBean {
    public HttpProtocolParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setContentCharset(String str) {
        HttpProtocolParams.setContentCharset(this.params, str);
    }

    public void setHttpElementCharset(String str) {
        HttpProtocolParams.setHttpElementCharset(this.params, str);
    }

    public void setUseExpectContinue(boolean z) {
        HttpProtocolParams.setUseExpectContinue(this.params, z);
    }

    public void setUserAgent(String str) {
        HttpProtocolParams.setUserAgent(this.params, str);
    }

    public void setVersion(HttpVersion httpVersion) {
        HttpProtocolParams.setVersion(this.params, httpVersion);
    }
}
