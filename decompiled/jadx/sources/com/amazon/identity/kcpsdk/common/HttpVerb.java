package com.amazon.identity.kcpsdk.common;

import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpTrace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum HttpVerb {
    HttpVerbConnect("CONNECT"),
    HttpVerbDelete("DELETE"),
    HttpVerbGet("GET"),
    HttpVerbHead(HttpHead.METHOD_NAME),
    HttpVerbOptions(HttpOptions.METHOD_NAME),
    HttpVerbPost("POST"),
    HttpVerbPut("PUT"),
    HttpVerbTrace(HttpTrace.METHOD_NAME);

    private final String mValue;

    HttpVerb(String str) {
        this.mValue = str;
    }

    public static HttpVerb parse(String str) {
        for (HttpVerb httpVerb : values()) {
            if (httpVerb.getValue().equals(str)) {
                return httpVerb;
            }
        }
        return null;
    }

    public String getValue() {
        return this.mValue;
    }
}
