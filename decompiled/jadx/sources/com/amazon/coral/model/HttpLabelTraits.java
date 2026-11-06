package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.HttpLabelTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "httplabel", targets = {ReferenceModel.class})
@UseTraitValidator(HttpLabelTraitsValidator.class)
/* loaded from: classes19.dex */
public class HttpLabelTraits extends AbstractTraits {
    private final String label;

    public HttpLabelTraits(String str) {
        this(HttpLabelTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof HttpLabelTraits) && getLabel().equals(((HttpLabelTraits) obj).getLabel())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "label")
    public String getLabel() {
        return this.label;
    }

    @ValidTrait(requires = {"label"})
    public HttpLabelTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "label") String str3) {
        super(cls, id, str, str2);
        this.label = nullToEmpty(str3);
    }
}
