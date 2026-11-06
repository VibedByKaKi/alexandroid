package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.HttpHeadersTraitsValidator;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "httpheaders", targets = {ReferenceModel.class})
@UseTraitValidator(HttpHeadersTraitsValidator.class)
/* loaded from: classes19.dex */
public class HttpHeadersTraits extends AbstractTraits {
    private final String prefix;

    public HttpHeadersTraits(String str) {
        this(HttpHeadersTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return Objects.equals(this.prefix, ((HttpHeadersTraits) obj).prefix);
        }
        return false;
    }

    @TraitProperty(emitIfNull = false, name = "prefix")
    public String getPrefix() {
        return this.prefix;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.prefix;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public HttpHeadersTraits() {
        this(null);
    }

    @Deprecated
    public HttpHeadersTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2) {
        this(cls, id, str, str2, null);
    }

    @ValidTraitOr({@ValidTrait(requires = {}), @ValidTrait(requires = {"prefix"})})
    public HttpHeadersTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "prefix") String str3) {
        super(cls, id, str, str2);
        this.prefix = str3;
    }
}
