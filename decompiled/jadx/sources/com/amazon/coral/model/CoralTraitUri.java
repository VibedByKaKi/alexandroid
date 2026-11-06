package com.amazon.coral.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URI;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CoralTraitUri {
    static final String CORAL_TRAIT_SCHEME = "coraltrait";
    private final URI _uri;

    public CoralTraitUri(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("uriString cannot be null");
            throw null;
        }
        if (isValid(str)) {
            this._uri = URI.create(str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("The string '", str, "' is not a value coral trait uri"));
            throw null;
        }
    }

    public static CoralTraitUri fromPackage(String str) {
        if (str != null) {
            return new CoralTraitUri("coraltrait:".concat(str));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("packageName cannot be null");
        return null;
    }

    public static boolean isValid(String str) {
        return str != null && str.startsWith("coraltrait:");
    }

    public String getPackageName() {
        return this._uri.getSchemeSpecificPart();
    }

    public String getScheme() {
        return this._uri.getScheme();
    }

    public String toString() {
        return this._uri.toString();
    }
}
