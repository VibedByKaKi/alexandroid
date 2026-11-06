package com.upokecenter.cbor;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PODOptions {
    public static final PODOptions Default = new PODOptions();
    private final boolean propVarusecamelcase;

    public PODOptions(String str) {
        if (str != null) {
            this.propVarusecamelcase = new OptionsParser(str).GetBoolean("usecamelcase", true);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("paramString");
            throw null;
        }
    }

    public final boolean getUseCamelCase() {
        return this.propVarusecamelcase;
    }

    public String toString() {
        return "usecamelcase=".concat(getUseCamelCase() ? "true" : "false");
    }

    @Deprecated
    public PODOptions(boolean z, boolean z2) {
        this.propVarusecamelcase = z2;
    }

    public PODOptions() {
        this("");
    }
}
