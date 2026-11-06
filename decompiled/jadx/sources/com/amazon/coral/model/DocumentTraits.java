package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.DocumentTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "document", targets = {StructureModel.class})
@UseTraitValidator(DocumentTraitsValidator.class)
/* loaded from: classes19.dex */
public class DocumentTraits extends AbstractTraits {
    @ValidTrait(requires = {})
    public DocumentTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
