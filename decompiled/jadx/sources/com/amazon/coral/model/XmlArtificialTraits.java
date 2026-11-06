package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.XmlArtificialTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "xmlartificial", targets = {Model.class})
@UseTraitValidator(XmlArtificialTraitsValidator.class)
/* loaded from: classes19.dex */
public class XmlArtificialTraits extends AbstractTraits {
    private final String xmlName;
    private final String xmlNamespace;
    private final boolean xsiNillable;

    @ValidTraitOr({@ValidTrait(requires = {"name", "namespace"}), @ValidTrait(requires = {"name", "namespace", "nillable"})})
    public XmlArtificialTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "name") String str3, @TraitProperty(name = "namespace") String str4, @TraitProperty(name = "nillable") boolean z) {
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
        if (!(obj instanceof XmlArtificialTraits)) {
            return false;
        }
        XmlArtificialTraits xmlArtificialTraits = (XmlArtificialTraits) obj;
        if (getXmlName().equals(xmlArtificialTraits.getXmlName()) && getXmlNamespace().equals(xmlArtificialTraits.getXmlNamespace()) && isXsiNillable() == xmlArtificialTraits.isXsiNillable()) {
            return super.equals(xmlArtificialTraits);
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

    public XmlArtificialTraits(String str, String str2, boolean z) {
        this(XmlArtificialTraits.class, Model.Id.NONE, "", "N/A", str, str2, z);
    }
}
