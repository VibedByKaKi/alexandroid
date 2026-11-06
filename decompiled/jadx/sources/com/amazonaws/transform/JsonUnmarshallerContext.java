package com.amazonaws.transform;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class JsonUnmarshallerContext {
    private final HttpResponse httpResponse;
    private final AwsJsonReader reader;

    public JsonUnmarshallerContext(AwsJsonReader awsJsonReader, HttpResponse httpResponse) {
        this.reader = awsJsonReader;
        this.httpResponse = httpResponse;
    }

    public String getHeader(String str) {
        HttpResponse httpResponse = this.httpResponse;
        if (httpResponse == null) {
            return null;
        }
        return httpResponse.getHeaders().get(str);
    }

    public HttpResponse getHttpResponse() {
        return this.httpResponse;
    }

    public AwsJsonReader getReader() {
        return this.reader;
    }

    public JsonUnmarshallerContext(AwsJsonReader awsJsonReader) {
        this(awsJsonReader, null);
    }
}
