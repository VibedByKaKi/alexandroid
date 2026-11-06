package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.CodigoLocationTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigolocation", targets = {Model.class})
@UseTraitValidator(CodigoLocationTraitsValidator.class)
/* loaded from: classes19.dex */
public class CodigoLocationTraits extends AbstractTraits {
    private final String location;

    public CodigoLocationTraits(String str) {
        this(CodigoLocationTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof CodigoLocationTraits) && getLocation().equals(((CodigoLocationTraits) obj).getLocation())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "location")
    public String getLocation() {
        return this.location;
    }

    @ValidTrait(requires = {"location"})
    public CodigoLocationTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "location") String str3) {
        super(cls, id, str, str2);
        this.location = nullToEmpty(str3);
    }
}
