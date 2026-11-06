package com.amazon.coral.model.xml;

import com.amazon.coral.model.ModelIndexFactoryException;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefinitionMissingAttributeException extends ModelIndexFactoryException {
    static final String MISSING_ATTRIBUTE_FORMAT_STRING = "Missing attribute '%s' @%s";

    public DefinitionMissingAttributeException(String str, Definition definition) {
        this(a$$ExternalSyntheticOutline0.m("Missing attribute '", str, "' @", definition.getSource()));
    }

    public DefinitionMissingAttributeException(String str) {
        super(str);
    }
}
