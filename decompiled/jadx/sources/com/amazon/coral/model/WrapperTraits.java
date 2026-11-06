package com.amazon.coral.model;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "wrapper", targets = {Model.class})
/* loaded from: classes19.dex */
public class WrapperTraits extends AbstractTraits {
    private final Boolean inputWrapped;
    private final Boolean outputWrapped;

    @ValidTraitOr({@ValidTrait(requires = {}), @ValidTrait(requires = {"input"}), @ValidTrait(requires = {ContactsModuleConstants.OUTPUT}), @ValidTrait(requires = {"input", ContactsModuleConstants.OUTPUT})})
    public WrapperTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "input") Boolean bool, @TraitProperty(name = "output") Boolean bool2) {
        super(cls, id, str, str2);
        if (bool == null && bool2 == null) {
            Boolean bool3 = Boolean.TRUE;
            this.inputWrapped = bool3;
            this.outputWrapped = bool3;
        } else {
            Boolean bool4 = Boolean.FALSE;
            this.inputWrapped = (Boolean) nullToDefault(bool, bool4);
            this.outputWrapped = (Boolean) nullToDefault(bool2, bool4);
        }
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WrapperTraits)) {
            return super.equals(obj);
        }
        WrapperTraits wrapperTraits = (WrapperTraits) obj;
        return wrapperTraits.isInputWrapped() == isInputWrapped() && wrapperTraits.isOutputWrapped() == isOutputWrapped();
    }

    @TraitProperty(name = "input")
    public boolean isInputWrapped() {
        return this.inputWrapped.booleanValue();
    }

    @TraitProperty(name = ContactsModuleConstants.OUTPUT)
    public boolean isOutputWrapped() {
        return this.outputWrapped.booleanValue();
    }

    public WrapperTraits(Boolean bool, Boolean bool2) {
        this(WrapperTraits.class, Model.Id.NONE, "", "N/A", bool, bool2);
    }
}
