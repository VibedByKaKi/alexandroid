package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "internalonly", targets = {Model.class})
/* loaded from: classes19.dex */
public class InternalOnlyTraits extends AbstractTraits {
    public InternalOnlyTraits() {
        this(InternalOnlyTraits.class, Model.Id.NONE, "", "N/A");
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternalOnlyTraits) {
            return super.equals(obj);
        }
        return false;
    }

    @ValidTrait(requires = {})
    public InternalOnlyTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        super(cls, id, str, str2);
    }
}
