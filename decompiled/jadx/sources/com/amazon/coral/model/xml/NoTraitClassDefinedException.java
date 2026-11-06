package com.amazon.coral.model.xml;

import com.amazon.coral.model.ModelIndexFactoryException;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NoTraitClassDefinedException extends ModelIndexFactoryException {
    static final String NO_TRAIT_CLASS_DEFINED_FORMAT_STRING = "No class defined for trait '%s'  @%s";

    public NoTraitClassDefinedException(Definition definition) {
        this(a$$ExternalSyntheticOutline0.m("No class defined for trait '", definition.getName(), "'  @", definition.getSource()));
    }

    public NoTraitClassDefinedException(String str) {
        super(str);
    }
}
