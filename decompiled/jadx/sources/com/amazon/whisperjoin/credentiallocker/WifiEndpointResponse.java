package com.amazon.whisperjoin.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class WifiEndpointResponse {
    private final String endpoint;
    private final long refreshAfterSeconds;

    public WifiEndpointResponse(String str, long j) {
        this.endpoint = str;
        this.refreshAfterSeconds = j;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WifiEndpointResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WifiEndpointResponse)) {
            return false;
        }
        WifiEndpointResponse wifiEndpointResponse = (WifiEndpointResponse) obj;
        if (!wifiEndpointResponse.canEqual(this) || getRefreshAfterSeconds() != wifiEndpointResponse.getRefreshAfterSeconds()) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = wifiEndpointResponse.getEndpoint();
        return endpoint != null ? endpoint.equals(endpoint2) : endpoint2 == null;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public long getRefreshAfterSeconds() {
        return this.refreshAfterSeconds;
    }

    public int hashCode() {
        long refreshAfterSeconds = getRefreshAfterSeconds();
        String endpoint = getEndpoint();
        return ((((int) (refreshAfterSeconds ^ (refreshAfterSeconds >>> 32))) + 59) * 59) + (endpoint == null ? 43 : endpoint.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WifiEndpointResponse(endpoint=");
        sb.append(getEndpoint());
        sb.append(", refreshAfterSeconds=");
        return a$$ExternalSyntheticOutline0.m(getRefreshAfterSeconds(), MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
