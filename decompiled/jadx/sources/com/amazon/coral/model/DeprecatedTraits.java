package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "deprecated", targets = {Model.class})
/* loaded from: classes19.dex */
public class DeprecatedTraits extends AbstractTraits {
    private String message;
    private String since;

    public DeprecatedTraits() {
        this(DeprecatedTraits.class, Model.Id.NONE, "", "N/A", null, null);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DeprecatedTraits) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(emitIfNull = true, name = "message")
    public String getMessage() {
        return this.message;
    }

    @TraitProperty(emitIfNull = false, name = "since")
    public String getSince() {
        return this.since;
    }

    public DeprecatedTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "message") String str3) {
        super(cls, id, str, str2);
        this.message = str3;
    }

    @ValidTraitOr({@ValidTrait(requires = {}), @ValidTrait(requires = {"message"}), @ValidTrait(requires = {"since"}), @ValidTrait(requires = {"message", "since"})})
    public DeprecatedTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "message") String str3, @TraitProperty(name = "since") String str4) {
        super(cls, id, str, str2);
        this.message = str3;
        this.since = str4;
    }
}
