package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.xml.BsfErrorTraitsBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "bsferror", targets = {Model.class})
@UseTraitsBuilder(BsfErrorTraitsBuilder.class)
/* loaded from: classes19.dex */
public class BsfErrorTraits extends AbstractTraits {
    private final Error error;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Error {
        BadArgs,
        DependencyFailure,
        ServiceFailure
    }

    public BsfErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, Error error) {
        super(cls, id, str, str2);
        if (error != null) {
            this.error = error;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("error cannot be null");
            throw null;
        }
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof BsfErrorTraits) && getError().equals(((BsfErrorTraits) obj).getError())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "type")
    public Error getError() {
        return this.error;
    }

    public BsfErrorTraits(Error error) {
        this(BsfErrorTraits.class, Model.Id.NONE, "", "N/A", error);
    }
}
