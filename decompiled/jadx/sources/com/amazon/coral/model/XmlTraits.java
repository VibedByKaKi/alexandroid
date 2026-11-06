package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.XmlTraitsValidator;
import org.apache.commons.text.lookup.StringLookupFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = StringLookupFactory.KEY_XML, targets = {Model.class})
@UseTraitValidator(XmlTraitsValidator.class)
/* loaded from: classes19.dex */
public class XmlTraits extends AbstractTraits {
    private final String xmlName;
    private final String xmlNamespace;
    private final boolean xsiNillable;

    @ValidTraitOr({@ValidTrait(requires = {"name"}), @ValidTrait(requires = {"namespace"}), @ValidTrait(requires = {"name", "namespace"}), @ValidTrait(requires = {"name", "namespace", "nillable"})})
    public XmlTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "name") String str3, @TraitProperty(name = "namespace") String str4, @TraitProperty(name = "nillable") boolean z) {
        super(cls, id, str, str2);
        this.xmlName = nullToEmpty(str3);
        this.xmlNamespace = nullToEmpty(str4);
        this.xsiNillable = z;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XmlTraits)) {
            return false;
        }
        XmlTraits xmlTraits = (XmlTraits) obj;
        if (getXmlName().equals(xmlTraits.getXmlName()) && getXmlNamespace().equals(xmlTraits.getXmlNamespace()) && isXsiNillable() == xmlTraits.isXsiNillable()) {
            return super.equals(xmlTraits);
        }
        return false;
    }

    @TraitProperty(name = "name")
    public String getXmlName() {
        return this.xmlName;
    }

    @TraitProperty(name = "namespace")
    public String getXmlNamespace() {
        return this.xmlNamespace;
    }

    @TraitProperty(name = "nillable")
    public boolean isXsiNillable() {
        return this.xsiNillable;
    }

    public XmlTraits(String str, String str2, boolean z) {
        this(XmlTraits.class, Model.Id.NONE, "", "N/A", str, str2, z);
    }
}
