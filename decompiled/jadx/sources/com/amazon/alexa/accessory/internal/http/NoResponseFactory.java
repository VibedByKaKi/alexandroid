package com.amazon.alexa.accessory.internal.http;

import com.amazon.alexa.accessory.internal.http.HttpResponse;
import com.amazon.alexa.accessory.io.Source;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class NoResponseFactory implements HttpResponse.Factory<NoResponse> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NoResponse {
        public static final NoResponse INSTANCE = new NoResponse();

        private NoResponse() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.accessory.internal.http.HttpResponse.Factory
    public NoResponse create(Source source) throws IOException {
        return NoResponse.INSTANCE;
    }
}
