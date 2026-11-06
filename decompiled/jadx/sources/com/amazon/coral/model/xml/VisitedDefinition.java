package com.amazon.coral.model.xml;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class VisitedDefinition implements VisitableDefinition {
    private final Definition wrapped;

    public VisitedDefinition(Definition definition) {
        if (definition != null) {
            this.wrapped = definition;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("should not get null definition");
            throw null;
        }
    }

    @Override // com.amazon.coral.model.xml.VisitableDefinition
    public void accept(DefinitionVisitor definitionVisitor) {
        if (definitionVisitor != null) {
            definitionVisitor.visit(this);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("should not get null visitor");
        }
    }

    @Override // com.amazon.coral.model.xml.Definition
    public String expectAttribute(String str) {
        return this.wrapped.expectAttribute(str);
    }

    @Override // com.amazon.coral.model.xml.Definition
    public String getAttribute(String str) {
        return this.wrapped.getAttribute(str);
    }

    @Override // com.amazon.coral.model.xml.Definition
    public Iterable<String> getAttributes() {
        return this.wrapped.getAttributes();
    }

    @Override // com.amazon.coral.model.xml.Definition
    public Iterable<Definition> getChildren() {
        return this.wrapped.getChildren();
    }

    @Override // com.amazon.coral.model.xml.Definition
    public String getName() {
        return this.wrapped.getName();
    }

    @Override // com.amazon.coral.model.xml.Definition
    public String getSource() {
        return this.wrapped.getSource();
    }

    @Override // com.amazon.coral.model.xml.Definition
    public String getText() {
        return this.wrapped.getText();
    }
}
