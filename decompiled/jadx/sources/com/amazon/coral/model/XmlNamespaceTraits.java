package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.XmlNamespaceTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "xmlnamespace", targets = {Model.class})
@UseTraitValidator(XmlNamespaceTraitsValidator.class)
/* loaded from: classes19.dex */
public class XmlNamespaceTraits extends AbstractTraits {
    private final String xmlNamespace;

    public XmlNamespaceTraits(String str) {
        this(XmlNamespaceTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XmlNamespaceTraits)) {
            return false;
        }
        XmlNamespaceTraits xmlNamespaceTraits = (XmlNamespaceTraits) obj;
        if (getXmlNamespace().equals(xmlNamespaceTraits.getXmlNamespace())) {
            return super.equals(xmlNamespaceTraits);
        }
        return false;
    }

    @TraitProperty(name = "namespace")
    public String getXmlNamespace() {
        return this.xmlNamespace;
    }

    @ValidTrait(requires = {"namespace"})
    public XmlNamespaceTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "namespace") String str3) {
        super(cls, id, str, str2);
        this.xmlNamespace = nullToEmpty(str3);
    }
}
