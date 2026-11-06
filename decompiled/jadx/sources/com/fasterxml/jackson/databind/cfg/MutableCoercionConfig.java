package com.fasterxml.jackson.databind.cfg;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class MutableCoercionConfig extends CoercionConfig implements Serializable {
    private static final long serialVersionUID = 1;

    public MutableCoercionConfig() {
    }

    public MutableCoercionConfig copy() {
        return new MutableCoercionConfig(this);
    }

    public MutableCoercionConfig setAcceptBlankAsEmpty(Boolean bool) {
        this._acceptBlankAsEmpty = bool;
        return this;
    }

    public MutableCoercionConfig setCoercion(CoercionInputShape coercionInputShape, CoercionAction coercionAction) {
        this._coercionsByShape[coercionInputShape.ordinal()] = coercionAction;
        return this;
    }

    public MutableCoercionConfig(MutableCoercionConfig mutableCoercionConfig) {
        super(mutableCoercionConfig);
    }
}
