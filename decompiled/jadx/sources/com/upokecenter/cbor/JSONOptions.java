package com.upokecenter.cbor;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.dee.app.contacts.common.constants.AppUrlConstants;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class JSONOptions {
    public static final JSONOptions Default = new JSONOptions();
    private final boolean propVarallowduplicatekeys;
    private final boolean propVarbase64padding;
    private final boolean propVarkeepkeyorder;
    private final ConversionMode propVarnumberconversion;
    private final boolean propVarpreservenegativezero;
    private final boolean propVarreplacesurrogates;
    private final boolean propVarwritebasic;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConversionMode {
        Full,
        Double,
        IntOrFloat,
        IntOrFloatFromDouble,
        Decimal128
    }

    public JSONOptions(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("paramString");
            throw null;
        }
        OptionsParser optionsParser = new OptionsParser(str);
        this.propVarpreservenegativezero = optionsParser.GetBoolean("preservenegativezero", true);
        this.propVarallowduplicatekeys = optionsParser.GetBoolean("allowduplicatekeys", false);
        this.propVarkeepkeyorder = optionsParser.GetBoolean("keepkeyorder", false);
        this.propVarbase64padding = optionsParser.GetBoolean("base64padding", true);
        this.propVarreplacesurrogates = optionsParser.GetBoolean("replacesurrogates", false);
        this.propVarnumberconversion = ToNumberConversion(optionsParser.GetLCString("numberconversion", null));
        this.propVarwritebasic = optionsParser.GetBoolean("writebasic", false);
    }

    private String FromNumberConversion() {
        ConversionMode numberConversion = getNumberConversion();
        return numberConversion == ConversionMode.Full ? AppUrlConstants.ACMS.QueryParam.Values.VIEW_QUERY_PARAM_VALUE : numberConversion == ConversionMode.Double ? "double" : numberConversion == ConversionMode.Decimal128 ? "decimal128" : numberConversion == ConversionMode.IntOrFloat ? "intorfloat" : numberConversion == ConversionMode.IntOrFloatFromDouble ? "intorfloatfromdouble" : AppUrlConstants.ACMS.QueryParam.Values.VIEW_QUERY_PARAM_VALUE;
    }

    private static ConversionMode ToNumberConversion(String str) {
        if (str == null) {
            return ConversionMode.Full;
        }
        if (str.equals(AppUrlConstants.ACMS.QueryParam.Values.VIEW_QUERY_PARAM_VALUE)) {
            return ConversionMode.Full;
        }
        if (str.equals("double")) {
            return ConversionMode.Double;
        }
        if (str.equals("decimal128")) {
            return ConversionMode.Decimal128;
        }
        if (str.equals("intorfloat")) {
            return ConversionMode.IntOrFloat;
        }
        if (str.equals("intorfloatfromdouble")) {
            return ConversionMode.IntOrFloatFromDouble;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unrecognized conversion mode");
        return null;
    }

    public final boolean getAllowDuplicateKeys() {
        return this.propVarallowduplicatekeys;
    }

    @Deprecated
    public final boolean getBase64Padding() {
        return this.propVarbase64padding;
    }

    public final boolean getKeepKeyOrder() {
        return this.propVarkeepkeyorder;
    }

    public final ConversionMode getNumberConversion() {
        return this.propVarnumberconversion;
    }

    public final boolean getPreserveNegativeZero() {
        return this.propVarpreservenegativezero;
    }

    public final boolean getReplaceSurrogates() {
        return this.propVarreplacesurrogates;
    }

    public final boolean getWriteBasic() {
        return this.propVarwritebasic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("base64padding=");
        sb.append(getBase64Padding() ? "true" : "false");
        sb.append(";replacesurrogates=");
        sb.append(getReplaceSurrogates() ? "true" : "false");
        sb.append(";preservenegativezero=");
        sb.append(getPreserveNegativeZero() ? "true" : "false");
        sb.append(";keepkeyorder=");
        sb.append(getKeepKeyOrder() ? "true" : "false");
        sb.append(";numberconversion=");
        sb.append(FromNumberConversion());
        sb.append(";allowduplicatekeys=");
        sb.append(getAllowDuplicateKeys() ? "true" : "false");
        sb.append(";writebasic=");
        sb.append(getWriteBasic() ? "true" : "false");
        return sb.toString();
    }

    @Deprecated
    public JSONOptions(boolean z) {
        this("base64Padding=".concat(z ? "1" : Constants.FEEDBACK_TYPE_DISLIKE));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JSONOptions(boolean r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "base64Padding="
            r0.<init>(r1)
            java.lang.String r1 = "0"
            java.lang.String r2 = "1"
            if (r4 == 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r1
        L10:
            r0.append(r4)
            java.lang.String r4 = ";replacesurrogates="
            r0.append(r4)
            if (r5 == 0) goto L1b
            r1 = r2
        L1b:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.JSONOptions.<init>(boolean, boolean):void");
    }

    public JSONOptions() {
        this("");
    }
}
