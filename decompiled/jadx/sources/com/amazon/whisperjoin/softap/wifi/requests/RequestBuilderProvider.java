package com.amazon.whisperjoin.softap.wifi.requests;

import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface RequestBuilderProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DefaultRequestBuilderProvider implements RequestBuilderProvider {
        @Override // com.amazon.whisperjoin.softap.wifi.requests.RequestBuilderProvider
        public RequestBuilder getBuilder() {
            return new RequestBuilderImpl(new Uri.Builder());
        }
    }

    RequestBuilder getBuilder();
}
