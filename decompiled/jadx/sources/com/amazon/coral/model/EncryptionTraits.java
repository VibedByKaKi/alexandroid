package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "encryption", targets = {Model.class})
/* loaded from: classes19.dex */
public class EncryptionTraits extends AbstractTraits {
    private final String algorithm;

    public EncryptionTraits(String str) {
        this(EncryptionTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof EncryptionTraits) && getAlgorithm().equals(((EncryptionTraits) obj).getAlgorithm())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "algorithm")
    public String getAlgorithm() {
        return this.algorithm;
    }

    @ValidTrait(requires = {"algorithm"})
    public EncryptionTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "algorithm") String str3) {
        super(cls, id, str, str2);
        this.algorithm = nullToEmpty(str3);
    }
}
