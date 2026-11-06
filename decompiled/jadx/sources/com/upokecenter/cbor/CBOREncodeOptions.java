package com.upokecenter.cbor;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class CBOREncodeOptions {
    public static final CBOREncodeOptions Default = new CBOREncodeOptions();
    public static final CBOREncodeOptions DefaultCtap2Canonical = new CBOREncodeOptions("ctap2canonical=true");
    private final boolean propVarallowduplicatekeys;
    private final boolean propVarallowempty;
    private final boolean propVarctap2canonical;
    private final boolean propVarfloat64;
    private final boolean propVarkeepkeyorder;
    private final boolean propVarresolvereferences;
    private final boolean propVaruseindeflengthstrings;

    public CBOREncodeOptions(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("paramString");
            throw null;
        }
        OptionsParser optionsParser = new OptionsParser(str);
        this.propVarresolvereferences = optionsParser.GetBoolean("resolvereferences", false);
        this.propVaruseindeflengthstrings = optionsParser.GetBoolean("useindeflengthstrings", false);
        this.propVarfloat64 = optionsParser.GetBoolean("float64", false);
        this.propVarallowduplicatekeys = optionsParser.GetBoolean("allowduplicatekeys", false);
        this.propVarkeepkeyorder = optionsParser.GetBoolean("keepkeyorder", false);
        this.propVarallowempty = optionsParser.GetBoolean("allowempty", false);
        this.propVarctap2canonical = optionsParser.GetBoolean("ctap2canonical", false);
    }

    public final boolean getAllowDuplicateKeys() {
        return this.propVarallowduplicatekeys;
    }

    public final boolean getAllowEmpty() {
        return this.propVarallowempty;
    }

    public final boolean getCtap2Canonical() {
        return this.propVarctap2canonical;
    }

    public final boolean getFloat64() {
        return this.propVarfloat64;
    }

    public final boolean getKeepKeyOrder() {
        return this.propVarkeepkeyorder;
    }

    public final boolean getResolveReferences() {
        return this.propVarresolvereferences;
    }

    public final boolean getUseIndefLengthStrings() {
        return this.propVaruseindeflengthstrings;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("allowduplicatekeys=");
        sb.append(getAllowDuplicateKeys() ? "true" : "false");
        sb.append(";useindeflengthstrings=");
        sb.append(getUseIndefLengthStrings() ? "true" : "false");
        sb.append(";float64=");
        sb.append(getFloat64() ? "true" : "false");
        sb.append(";ctap2canonical=");
        sb.append(getCtap2Canonical() ? "true" : "false");
        sb.append(";keepkeyorder=");
        sb.append(getKeepKeyOrder() ? "true" : "false");
        sb.append(";resolvereferences=");
        sb.append(getResolveReferences() ? "true" : "false");
        sb.append(";allowempty=");
        sb.append(getAllowEmpty() ? "true" : "false");
        return sb.toString();
    }

    @Deprecated
    public CBOREncodeOptions(boolean z, boolean z2) {
        this(z, z2, false);
    }

    @Deprecated
    public CBOREncodeOptions(boolean z, boolean z2, boolean z3) {
        this.propVarresolvereferences = false;
        this.propVarallowempty = false;
        this.propVarfloat64 = false;
        this.propVarkeepkeyorder = false;
        this.propVaruseindeflengthstrings = z;
        this.propVarallowduplicatekeys = z2;
        this.propVarctap2canonical = z3;
    }

    public CBOREncodeOptions() {
        this("");
    }
}
