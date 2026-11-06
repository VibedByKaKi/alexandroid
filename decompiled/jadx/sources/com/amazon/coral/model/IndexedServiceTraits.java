package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.IndexedServiceTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "indexed", targets = {ServiceModel.class})
@UseTraitValidator(IndexedServiceTraitsValidator.class)
/* loaded from: classes19.dex */
public final class IndexedServiceTraits extends AbstractTraits {
    public IndexedServiceTraits() {
        this(IndexedServiceTraits.class, Model.Id.NONE, "", "N/A");
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IndexedServiceTraits.class != obj.getClass()) {
            return false;
        }
        return super.equals(obj);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return super.hashCode();
    }

    @ValidTrait(requires = {})
    public IndexedServiceTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
