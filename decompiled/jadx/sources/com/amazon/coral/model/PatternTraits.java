package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.PatternTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "pattern", targets = {StringModel.class})
@UseTraitValidator(PatternTraitsValidator.class)
/* loaded from: classes19.dex */
public class PatternTraits extends AbstractTraits {
    private final String regex;

    public PatternTraits(String str) {
        this(PatternTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof PatternTraits) && ((PatternTraits) obj).getRegex().equals(getRegex())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "regex")
    public String getRegex() {
        return this.regex;
    }

    @ValidTrait(requires = {"regex"})
    public PatternTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "regex") String str3) {
        super(cls, id, str, str2);
        this.regex = nullToEmpty(str3);
    }
}
