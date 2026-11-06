package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.DefaultTraitsValidator;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "default", targets = {ReferenceModel.class})
@UseTraitValidator(DefaultTraitsValidator.class)
/* loaded from: classes19.dex */
public final class DefaultTraits extends AbstractTraits {
    private final Boolean added;
    private final String value;

    public DefaultTraits(String str, boolean z) {
        this(DefaultTraits.class, Model.Id.NONE, "", "N/A", str, Boolean.valueOf(z));
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultTraits)) {
            return false;
        }
        DefaultTraits defaultTraits = (DefaultTraits) obj;
        return getValue().equals(defaultTraits.getValue()) && Objects.equals(getAdded(), defaultTraits.getAdded()) && super.equals(obj);
    }

    @TraitProperty(emitIfNull = true, name = "added")
    public Boolean getAdded() {
        return this.added;
    }

    @TraitProperty(name = "value")
    public String getValue() {
        return this.value;
    }

    public boolean isAdded() {
        Boolean bool = this.added;
        return bool != null && bool.booleanValue();
    }

    public DefaultTraits(String str) {
        this(str, false);
    }

    @ValidTraitOr({@ValidTrait(requires = {"value"}), @ValidTrait(requires = {"value", "added"})})
    public DefaultTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "value") String str3, @TraitProperty(name = "added") Boolean bool) {
        super(cls, id, str, str2);
        this.value = str3;
        this.added = bool;
    }

    public DefaultTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, String str3) {
        this(cls, id, str, str2, str3, Boolean.FALSE);
    }
}
