package com.amazon.alexa.mosaic.apl.dependencies.glide;

import com.bumptech.glide.load.model.Headers;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GlideStaticHeaders implements Headers {
    private final Map<String, String> mHeaders;

    public GlideStaticHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public boolean equals(GlideStaticHeaders glideStaticHeaders) {
        return this.mHeaders.equals(glideStaticHeaders.mHeaders);
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public int hashCode() {
        return this.mHeaders.hashCode();
    }

    public boolean equals(Object obj) {
        return false;
    }
}
