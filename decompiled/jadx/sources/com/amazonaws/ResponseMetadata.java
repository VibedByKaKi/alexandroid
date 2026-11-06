package com.amazonaws;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class ResponseMetadata {
    public static final String AWS_REQUEST_ID = "AWS_REQUEST_ID";
    protected final Map<String, String> metadata;

    public ResponseMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public String getRequestId() {
        return this.metadata.get(AWS_REQUEST_ID);
    }

    public String toString() {
        Map<String, String> map = this.metadata;
        return map == null ? "{}" : map.toString();
    }

    public ResponseMetadata(ResponseMetadata responseMetadata) {
        this(responseMetadata.metadata);
    }
}
