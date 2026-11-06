package org.java_websocket.exceptions;

import java.io.UnsupportedEncodingException;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class InvalidEncodingException extends RuntimeException {
    private final UnsupportedEncodingException encodingException;

    public InvalidEncodingException(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException != null) {
            this.encodingException = unsupportedEncodingException;
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
    }

    public UnsupportedEncodingException getEncodingException() {
        return this.encodingException;
    }
}
