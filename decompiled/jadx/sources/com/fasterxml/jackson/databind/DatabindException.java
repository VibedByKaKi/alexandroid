package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class DatabindException extends JsonProcessingException {
    private static final long serialVersionUID = 3;

    public DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public abstract void prependPath(Object obj, int i);

    public abstract void prependPath(Object obj, String str);

    public DatabindException(String str) {
        super(str);
    }

    public DatabindException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public DatabindException(String str, Throwable th) {
        this(str, null, th);
    }
}
