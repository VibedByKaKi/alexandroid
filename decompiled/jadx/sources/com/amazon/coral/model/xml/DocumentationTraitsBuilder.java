package com.amazon.coral.model.xml;

import com.amazon.coral.model.DocumentationTraits;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DocumentationTraitsBuilder implements TraitsBuilder {
    @Override // com.amazon.coral.model.xml.TraitsBuilder
    public DocumentationTraits build(Definition definition, Definition definition2) {
        return new DocumentationTraits(DocumentationTraits.class, Helper.createId(definition, definition2, definition2.expectAttribute("target")), "", definition2.getSource(), definition2.getText());
    }
}
