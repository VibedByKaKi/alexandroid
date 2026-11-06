package com.amazon.coral.model.xml;

import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ReferenceIdFactory implements ModelIdGenerationStrategy {
    @Override // com.amazon.coral.model.xml.ModelIdGenerationStrategy
    public Model.Id createId(Definition definition, Definition definition2, String str) {
        return Helper.createId(definition, definition2, str);
    }
}
