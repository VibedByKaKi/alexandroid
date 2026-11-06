package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.SparseTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "sparse", targets = {ListModel.class, MapModel.class})
@UseTraitValidator(SparseTraitsValidator.class)
/* loaded from: classes19.dex */
public final class SparseTraits extends AbstractTraits {
    public SparseTraits() {
        this(SparseTraits.class, Model.Id.NONE, "", "N/A");
    }

    @ValidTrait(requires = {})
    public SparseTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
