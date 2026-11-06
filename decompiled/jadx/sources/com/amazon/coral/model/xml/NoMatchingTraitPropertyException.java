package com.amazon.coral.model.xml;

import com.amazon.coral.model.ModelIndexFactoryException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NoMatchingTraitPropertyException extends ModelIndexFactoryException {
    static final String NO_MATCHING_TRAIT_PROPERTY_FORMAT_STRING = "Trait '%s' has no properties that match '%s' @%s";

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NoMatchingTraitPropertyException(java.lang.String r5, com.amazon.coral.model.xml.Definition r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getName()
            java.lang.String r6 = r6.getSource()
            java.lang.String r1 = "' has no properties that match '"
            java.lang.String r2 = "' @"
            java.lang.String r3 = "Trait '"
            java.lang.StringBuilder r5 = androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0.m(r3, r5, r1, r0, r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.model.xml.NoMatchingTraitPropertyException.<init>(java.lang.String, com.amazon.coral.model.xml.Definition):void");
    }

    public NoMatchingTraitPropertyException(String str) {
        super(str);
    }
}
