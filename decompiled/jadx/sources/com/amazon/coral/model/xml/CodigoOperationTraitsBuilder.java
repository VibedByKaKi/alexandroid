package com.amazon.coral.model.xml;

import com.amazon.coral.model.CodigoOperationTraits;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.ModelIndexFactoryException;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.http.cookie.ClientCookie;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CodigoOperationTraitsBuilder implements TraitsBuilder {
    @Override // com.amazon.coral.model.xml.TraitsBuilder
    public CodigoOperationTraits build(Definition definition, Definition definition2) {
        Model.Id createId = Helper.createId(definition, definition2, definition2.expectAttribute("target"));
        String source = definition2.getSource();
        CodigoOperationTraits.OperationMEP operationMEP = null;
        String str = null;
        for (Definition definition3 : definition2.getChildren()) {
            String name = definition3.getName();
            if (!"outputpartname".equalsIgnoreCase(name) && !"mep".equalsIgnoreCase(name) && !ClientCookie.COMMENT_ATTR.equalsIgnoreCase(name)) {
                throw new ModelIndexFactoryException(a$$ExternalSyntheticOutline0.m("Unsupported element '", name, "'  @", source));
            }
            if ("outputpartname".equals(name)) {
                str = definition3.getAttribute("value");
            }
            if ("mep".equals(name)) {
                operationMEP = CodigoOperationTraits.OperationMEP.valueOf(definition3.getAttribute("value"));
            }
        }
        if (str == null && operationMEP == null) {
            throw new ModelIndexFactoryException("");
        }
        if (operationMEP == null) {
            operationMEP = CodigoOperationTraits.OperationMEP.REQUEST_RESPONSE;
        }
        return new CodigoOperationTraits(CodigoOperationTraits.class, createId, "", source, str, operationMEP);
    }
}
