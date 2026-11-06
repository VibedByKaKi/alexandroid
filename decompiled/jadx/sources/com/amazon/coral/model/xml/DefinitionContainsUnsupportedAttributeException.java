package com.amazon.coral.model.xml;

import com.amazon.coral.model.ModelIndexFactoryException;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefinitionContainsUnsupportedAttributeException extends ModelIndexFactoryException {
    static final String UNSUPPORTED_ATTRIBUTE_FORMAT_STRING = "Unsupported attribute '%s' @%s";

    public DefinitionContainsUnsupportedAttributeException(String str, Definition definition) {
        this(a$$ExternalSyntheticOutline0.m("Unsupported attribute '", str, "' @", definition.getSource()));
    }

    public DefinitionContainsUnsupportedAttributeException(String str) {
        super(str);
    }
}
