package org.apache.http.params;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public class HttpConnectionParamBean extends HttpAbstractParamBean {
    public HttpConnectionParamBean(HttpParams httpParams) {
        super(httpParams);
    }

    public void setConnectionTimeout(int i) {
        HttpConnectionParams.setConnectionTimeout(this.params, i);
    }

    public void setLinger(int i) {
        HttpConnectionParams.setLinger(this.params, i);
    }

    public void setSoTimeout(int i) {
        HttpConnectionParams.setSoTimeout(this.params, i);
    }

    public void setSocketBufferSize(int i) {
        HttpConnectionParams.setSocketBufferSize(this.params, i);
    }

    public void setStaleCheckingEnabled(boolean z) {
        HttpConnectionParams.setStaleCheckingEnabled(this.params, z);
    }

    public void setTcpNoDelay(boolean z) {
        HttpConnectionParams.setTcpNoDelay(this.params, z);
    }
}
