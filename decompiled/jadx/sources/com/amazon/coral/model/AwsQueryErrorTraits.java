package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.AwsErrorTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "awsqueryerror", targets = {Model.class})
@UseTraitValidator(AwsErrorTraitsValidator.class)
/* loaded from: classes19.dex */
public class AwsQueryErrorTraits extends AwsErrorTraits {
    private final boolean allowAdditionalFields;

    public AwsQueryErrorTraits(String str, int i, boolean z, boolean z2) {
        this(AwsQueryErrorTraits.class, Model.Id.NONE, "", "N/A", str, i, z, z2);
    }

    @TraitProperty(name = "allowadditionalfields")
    public boolean allowAdditionalFields() {
        return this.allowAdditionalFields;
    }

    @Override // com.amazon.coral.model.AwsErrorTraits, com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof AwsQueryErrorTraits) && super.equals(obj) && this.allowAdditionalFields == ((AwsQueryErrorTraits) obj).allowAdditionalFields;
    }

    @ValidTraitOr({@ValidTrait(requires = {"code", "httpresponsecode"}), @ValidTrait(requires = {"code", "httpresponsecode", "senderfault"}), @ValidTrait(requires = {"code", "httpresponsecode", "allowadditionalfields"}), @ValidTrait(requires = {"code", "httpresponsecode", "senderfault", "allowadditionalfields"})})
    public AwsQueryErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "code") String str3, @TraitProperty(name = "httpresponsecode") int i, @TraitProperty(name = "senderfault") boolean z, @TraitProperty(name = "allowadditionalfields") boolean z2) {
        super(cls, id, str, str2, str3, i, z);
        this.allowAdditionalFields = z2;
    }
}
