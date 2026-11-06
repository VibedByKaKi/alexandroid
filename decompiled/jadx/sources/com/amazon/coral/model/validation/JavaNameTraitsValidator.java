package com.amazon.coral.model.validation;

import com.amazon.coral.model.AbstractTraitsVisitor;
import com.amazon.coral.model.JavaNameTraits;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class JavaNameTraitsValidator extends AbstractTraitsVisitor {
    public void onJavaNameTraits(JavaNameTraits javaNameTraits) {
        String name = javaNameTraits.getName();
        if (name.length() > 0) {
            int i = 0;
            if (Character.isJavaIdentifierStart(name.charAt(0))) {
                int i2 = 1;
                for (int i3 = 1; i3 < name.length(); i3++) {
                    if (Character.isJavaIdentifierPart(name.charAt(i3))) {
                        i2++;
                    }
                }
                i = i2;
            }
            if (i == name.length()) {
                return;
            }
        }
        IdxTraitsValidator$$ExternalSyntheticBUOutline0.m(javaNameTraits.getSource(), a$$ExternalSyntheticOutline0.m2m("Invalid JavaName: ", name, " "));
    }
}
