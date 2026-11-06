package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigodir", targets = {Model.class})
/* loaded from: classes19.dex */
public class CodigoDirTraits extends AbstractTraits {
    private final String dir;

    public CodigoDirTraits(String str) {
        this(CodigoDirTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof CodigoDirTraits) && getDir().equals(((CodigoDirTraits) obj).getDir())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "dir")
    public String getDir() {
        return this.dir;
    }

    @ValidTrait(requires = {"dir"})
    public CodigoDirTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "dir") String str3) {
        super(cls, id, str, str2);
        this.dir = str3;
    }
}
