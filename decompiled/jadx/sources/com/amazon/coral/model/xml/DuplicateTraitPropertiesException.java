package com.amazon.coral.model.xml;

import com.amazon.coral.model.ModelIndexFactoryException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DuplicateTraitPropertiesException extends ModelIndexFactoryException {
    static final String DUPLICATE_TRAIT_PROPERTIES_FORMAT_STRING = "Duplicate properties '%s' for trait '%s' @%s";

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DuplicateTraitPropertiesException(java.lang.String r5, com.amazon.coral.model.xml.Definition r6) {
        /*
            r4 = this;
            java.lang.String r0 = r6.getName()
            java.lang.String r6 = r6.getSource()
            java.lang.String r1 = "' for trait '"
            java.lang.String r2 = "' @"
            java.lang.String r3 = "Duplicate properties '"
            java.lang.StringBuilder r5 = androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0.m(r3, r0, r1, r5, r2)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.model.xml.DuplicateTraitPropertiesException.<init>(java.lang.String, com.amazon.coral.model.xml.Definition):void");
    }

    public DuplicateTraitPropertiesException(String str) {
        super(str);
    }
}
