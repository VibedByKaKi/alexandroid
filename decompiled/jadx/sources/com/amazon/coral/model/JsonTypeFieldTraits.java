package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.JsonTypeFieldTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "jsontypefield", targets = {StructureModel.class})
@UseTraitValidator(JsonTypeFieldTraitsValidator.class)
/* loaded from: classes19.dex */
public class JsonTypeFieldTraits extends AbstractTraits {
    private final String typeField;

    public JsonTypeFieldTraits(String str) {
        this(JsonTypeFieldTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof JsonTypeFieldTraits) && getTypeField().equals(((JsonTypeFieldTraits) obj).getTypeField())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "name")
    public String getTypeField() {
        return this.typeField;
    }

    @ValidTrait(requires = {"name"})
    public JsonTypeFieldTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "name") String str3) {
        super(cls, id, str, str2);
        this.typeField = nullToEmpty(str3);
    }
}
