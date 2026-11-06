package com.amazon.coral.model.xml;

import com.amazon.coral.model.basic.BasicModel;
import com.amazon.coral.model.basic.BasicStringModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class StringModelBuilder extends BasicModelBuilder {
    @Override // com.amazon.coral.model.xml.BasicModelBuilder, com.amazon.coral.model.xml.ModelBuilder
    public BasicModel build(Definition definition, Definition definition2) {
        BasicModel build = super.build(definition, definition2);
        if (build instanceof BasicStringModel) {
            BasicStringModel basicStringModel = (BasicStringModel) build;
            String attribute = definition2.getAttribute("encoding");
            if (attribute != null) {
                basicStringModel.setEncoding(attribute);
            }
        }
        return build;
    }

    @Override // com.amazon.coral.model.xml.BasicModelBuilder
    public BasicModel newBasicModel() {
        return new BasicStringModel();
    }
}
