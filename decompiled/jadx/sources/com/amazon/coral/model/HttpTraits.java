package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.HttpTraitsValidator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "http", targets = {OperationModel.class})
@UseTraitValidator(HttpTraitsValidator.class)
/* loaded from: classes19.dex */
public class HttpTraits extends AbstractTraits {
    private final int httpResponseCode;
    private final String uri;
    private final String verb;

    @ValidTraitOr({@ValidTrait(requires = {"verb", "uri"}), @ValidTrait(requires = {"verb", "uri", "httpresponsecode"})})
    public HttpTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "verb") String str3, @TraitProperty(name = "uri") String str4, @TraitProperty(name = "httpresponsecode") Integer num) {
        super(cls, id, str, str2);
        this.verb = nullToEmpty(str3);
        this.uri = nullToEmpty(str4);
        this.httpResponseCode = ((Integer) nullToDefault(num, 200)).intValue();
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpTraits)) {
            return false;
        }
        HttpTraits httpTraits = (HttpTraits) obj;
        if (getVerb().equals(httpTraits.getVerb()) && getUri().equals(httpTraits.getUri()) && getHttpResponseCode() == httpTraits.getHttpResponseCode()) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "httpresponsecode")
    public int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    @TraitProperty(name = "uri")
    public String getUri() {
        return this.uri;
    }

    @TraitProperty(name = "verb")
    public String getVerb() {
        return this.verb;
    }

    public HttpTraits(String str, String str2, Integer num) {
        this(HttpTraits.class, Model.Id.NONE, "", "N/A", str, str2, num);
    }
}
