package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class StreamConstraintsException extends JsonProcessingException {
    private static final long serialVersionUID = 2;

    public StreamConstraintsException(String str) {
        super(str);
    }

    public StreamConstraintsException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }
}
