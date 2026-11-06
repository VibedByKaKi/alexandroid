package com.amazon.coral.model;

import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.HttpHeaderTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "httpheader", targets = {ReferenceModel.class})
@UseTraitValidator(HttpHeaderTraitsValidator.class)
/* loaded from: classes19.dex */
public class HttpHeaderTraits extends AbstractTraits {
    private final String header;

    public HttpHeaderTraits(String str) {
        this(HttpHeaderTraits.class, Model.Id.NONE, "", "N/A", str);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof HttpHeaderTraits) && getHeader().equals(((HttpHeaderTraits) obj).getHeader())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = Content.HEADER)
    public String getHeader() {
        return this.header;
    }

    @ValidTrait(requires = {Content.HEADER})
    public HttpHeaderTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "header") String str3) {
        super(cls, id, str, str2);
        this.header = nullToEmpty(str3);
    }
}
