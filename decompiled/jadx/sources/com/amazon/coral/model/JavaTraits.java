package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.JavaTraitsValidator;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import org.apache.commons.text.lookup.StringLookupFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = StringLookupFactory.KEY_JAVA, targets = {Model.class})
@UseTraitValidator(JavaTraitsValidator.class)
/* loaded from: classes19.dex */
public class JavaTraits extends AbstractTraits {
    private final String className;

    public JavaTraits(String str) {
        this(JavaTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof JavaTraits) && getClassName().equals(((JavaTraits) obj).getClassName())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = RoadProbe.CLASS_PROPERTY)
    public String getClassName() {
        return this.className;
    }

    @ValidTrait(requires = {RoadProbe.CLASS_PROPERTY})
    public JavaTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "class") String str3) {
        super(cls, id, str, str2);
        this.className = nullToEmpty(str3);
    }
}
