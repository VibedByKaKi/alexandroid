package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.AwsErrorTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "awssoap12error", targets = {Model.class})
@UseTraitValidator(AwsErrorTraitsValidator.class)
/* loaded from: classes19.dex */
public class AwsSoap12ErrorTraits extends AwsErrorTraits {
    public AwsSoap12ErrorTraits(String str, int i, boolean z) {
        this(AwsSoap12ErrorTraits.class, Model.Id.NONE, "", "N/A", str, i, z);
    }

    @Override // com.amazon.coral.model.AwsErrorTraits, com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AwsSoap12ErrorTraits) {
            return super.equals(obj);
        }
        return false;
    }

    @ValidTraitOr({@ValidTrait(requires = {"code", "httpresponsecode"}), @ValidTrait(requires = {"code", "httpresponsecode", "senderfault"})})
    public AwsSoap12ErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "code") String str3, @TraitProperty(name = "httpresponsecode") int i, @TraitProperty(name = "senderfault") boolean z) {
        super(cls, id, str, str2, str3, i, z);
    }
}
