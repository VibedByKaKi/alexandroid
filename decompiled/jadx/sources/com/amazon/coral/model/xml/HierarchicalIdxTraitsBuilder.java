package com.amazon.coral.model.xml;

import com.amazon.coral.model.HierarchicalIdxTraits;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndexFactoryException;
import com.amazon.coral.model.Traits;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class HierarchicalIdxTraitsBuilder implements TraitsBuilder {
    @Override // com.amazon.coral.model.xml.TraitsBuilder
    public Traits build(Definition definition, Definition definition2) {
        Model.Id createId = Helper.createId(definition, definition2, definition2.expectAttribute("target"));
        String source = definition2.getSource();
        ArrayList arrayList = new ArrayList();
        for (Definition definition3 : definition2.getChildren()) {
            if (!definition3.getName().equals("value")) {
                throw new ModelIndexFactoryException(a$$ExternalSyntheticOutline0.m("Unsupported hierarchicalIdx trait element '", definition3.getName(), "' @", source));
            }
            arrayList.add(definition3.getText().trim());
        }
        return new HierarchicalIdxTraits(createId, source, arrayList);
    }
}
