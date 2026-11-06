package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.HierarchicalIdxTraitsValidator;
import com.amazon.coral.model.xml.HierarchicalIdxTraitsBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "hierarchicalIdx", targets = {StructureModel.class})
@UseTraitValidator(HierarchicalIdxTraitsValidator.class)
@UseTraitsBuilder(HierarchicalIdxTraitsBuilder.class)
/* loaded from: classes19.dex */
public final class HierarchicalIdxTraits extends AbstractTraits {
    private final List<String> value;

    public HierarchicalIdxTraits(Model.Id id, String str, List<String> list) {
        super(HierarchicalIdxTraits.class, id, "", str);
        this.value = Collections.unmodifiableList(list);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && HierarchicalIdxTraits.class == obj.getClass() && super.equals(obj)) {
            return this.value.equals(((HierarchicalIdxTraits) obj).value);
        }
        return false;
    }

    @TraitProperty(name = "value")
    public List<String> getValue() {
        return this.value;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.value);
    }
}
