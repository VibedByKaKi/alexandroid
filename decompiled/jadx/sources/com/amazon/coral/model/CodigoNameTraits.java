package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import javax.xml.namespace.QName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "codigoname", targets = {Model.class})
/* loaded from: classes19.dex */
public class CodigoNameTraits extends AbstractTraits {
    private final QName qname;

    public CodigoNameTraits(String str) {
        this(CodigoNameTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof CodigoNameTraits) && getName().equals(((CodigoNameTraits) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "name")
    public QName getName() {
        return this.qname;
    }

    public CodigoNameTraits(QName qName) {
        this(String.valueOf(qName));
    }

    @ValidTrait(requires = {"name"})
    public CodigoNameTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "name") String str3) {
        super(cls, id, str, str2);
        this.qname = QName.valueOf(str3);
    }
}
