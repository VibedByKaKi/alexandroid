package com.amazon.coral.model;

import com.amazon.alexa.ra.core.data.fragments.Relation;
import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.XmlOrderTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "xmlorder", targets = {StructureModel.class, ReferenceModel.class})
@UseTraitValidator(XmlOrderTraitsValidator.class)
/* loaded from: classes19.dex */
public class XmlOrderTraits extends AbstractTraits {
    private final Integer order;

    @ValidTrait(requires = {Relation.ORDER})
    public XmlOrderTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "order") Integer num) {
        super(cls, id, str, str2);
        this.order = (Integer) nullToDefault(num, -1);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XmlOrderTraits)) {
            return false;
        }
        XmlOrderTraits xmlOrderTraits = (XmlOrderTraits) obj;
        if (getOrder() != xmlOrderTraits.getOrder()) {
            return false;
        }
        return super.equals(xmlOrderTraits);
    }

    @TraitProperty(name = Relation.ORDER)
    public int getOrder() {
        return this.order.intValue();
    }

    public XmlOrderTraits(Integer num) {
        this(XmlOrderTraits.class, Model.Id.NONE, "", "N/A", num);
    }
}
