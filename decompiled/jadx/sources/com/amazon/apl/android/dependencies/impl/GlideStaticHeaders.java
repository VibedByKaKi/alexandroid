package com.amazon.apl.android.dependencies.impl;

import com.bumptech.glide.load.model.Headers;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class GlideStaticHeaders implements Headers {
    private Map<String, String> headers;

    public GlideStaticHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GlideStaticHeaders) {
            return this.headers.equals(((GlideStaticHeaders) obj).headers);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        return this.headers.hashCode();
    }
}
