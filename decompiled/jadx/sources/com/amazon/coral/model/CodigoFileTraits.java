package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigofile", targets = {Model.class})
/* loaded from: classes19.dex */
public class CodigoFileTraits extends AbstractTraits {
    private final String file;

    public CodigoFileTraits(String str) {
        this(CodigoFileTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof CodigoFileTraits) && getFile().equals(((CodigoFileTraits) obj).getFile())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "file")
    public String getFile() {
        return this.file;
    }

    @ValidTrait(requires = {"file"})
    public CodigoFileTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "file") String str3) {
        super(cls, id, str, str2);
        this.file = str3;
    }
}
