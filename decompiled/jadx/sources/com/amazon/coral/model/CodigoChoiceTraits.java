package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.CodigoChoiceTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigochoice", targets = {StructureModel.class})
@UseTraitValidator(CodigoChoiceTraitsValidator.class)
/* loaded from: classes19.dex */
public class CodigoChoiceTraits extends AbstractTraits {
    public CodigoChoiceTraits() {
        this(CodigoChoiceTraits.class, Model.Id.NONE, "", "N/A");
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CodigoChoiceTraits) {
            return super.equals(obj);
        }
        return false;
    }

    @ValidTrait(requires = {})
    public CodigoChoiceTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
