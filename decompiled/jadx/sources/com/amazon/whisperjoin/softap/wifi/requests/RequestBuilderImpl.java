package com.amazon.whisperjoin.softap.wifi.requests;

import android.net.Uri;
import com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class RequestBuilderImpl implements RequestBuilder {
    private static final int DEFAULT_RESPONSE_TIMEOUT = 6000;
    private static final String TAG = "RequestBuilderImpl";
    private byte[] requestBody;
    private final Uri.Builder uriBuilder;
    private RequestBuilder.ContentType contentType = null;
    private int timeoutMs = 6000;
    private RequestBuilder.RequestMethod requestMethod = RequestBuilder.RequestMethod.GET;

    public RequestBuilderImpl(Uri.Builder builder) {
        this.uriBuilder = builder;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder addQueryParameter(String str, String str2) {
        this.uriBuilder.appendQueryParameter(str, str2);
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder appendPath(String str) {
        this.uriBuilder.appendPath(str);
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public Request buildRequest() throws IOException {
        URL url = new URL(this.uriBuilder.build().toString());
        RequestBuilder.ContentType contentType = this.contentType;
        String contentType2 = contentType != null ? contentType.toString() : null;
        url.toString();
        Objects.toString(this.requestMethod);
        byte[] bArr = this.requestBody;
        if (bArr != null) {
            "Building request with request body: ".concat(new String(bArr, Charset.forName("UTF-8")));
        }
        return new Request(url, contentType2, this.timeoutMs, this.requestMethod, this.requestBody);
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setAuthority(String str) {
        this.uriBuilder.authority(str);
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setContentType(RequestBuilder.ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setPath(String str) {
        this.uriBuilder.path(str);
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setRequestBody(byte[] bArr) {
        this.requestBody = (byte[]) bArr.clone();
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setRequestMethod(RequestBuilder.RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setScheme(String str) {
        this.uriBuilder.scheme(str);
        return this;
    }

    @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilder
    public RequestBuilder setTimeout(int i) {
        this.timeoutMs = i;
        return this;
    }
}
