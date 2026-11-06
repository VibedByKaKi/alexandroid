package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "idx", targets = {ReferenceModel.class})
/* loaded from: classes19.dex */
public final class IdxTraits extends AbstractTraits {
    private final int value;

    public IdxTraits(int i) {
        this(IdxTraits.class, Model.Id.NONE, "", "N/A", i);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && IdxTraits.class == obj.getClass() && super.equals(obj) && this.value == ((IdxTraits) obj).value;
    }

    @TraitProperty(name = "value")
    public int getValue() {
        return this.value;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.value));
    }

    @ValidTrait(requires = {"value"})
    public IdxTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "value") int i) {
        super(cls, id, str, str2);
        this.value = i;
    }
}
