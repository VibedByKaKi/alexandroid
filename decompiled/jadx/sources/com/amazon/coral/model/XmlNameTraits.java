package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.XmlNameTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "xmlname", targets = {Model.class})
@UseTraitValidator(XmlNameTraitsValidator.class)
/* loaded from: classes19.dex */
public class XmlNameTraits extends AbstractTraits {
    private final String xmlName;

    public XmlNameTraits(String str) {
        this(XmlNameTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XmlNameTraits)) {
            return false;
        }
        XmlNameTraits xmlNameTraits = (XmlNameTraits) obj;
        if (getXmlName().equals(xmlNameTraits.getXmlName())) {
            return super.equals(xmlNameTraits);
        }
        return false;
    }

    @TraitProperty(name = "name")
    public String getXmlName() {
        return this.xmlName;
    }

    @ValidTrait(requires = {"name"})
    public XmlNameTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "name") String str3) {
        super(cls, id, str, str2);
        this.xmlName = nullToEmpty(str3);
    }
}
