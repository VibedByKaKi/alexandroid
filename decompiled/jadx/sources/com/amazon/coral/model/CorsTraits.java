package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;
import com.amazon.coral.model.validation.CorsTraitsValidator;
import com.amazon.coral.model.xml.CorsTraitsBuilder;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "cors", targets = {ServiceModel.class})
@UseTraitValidator(CorsTraitsValidator.class)
@UseTraitsBuilder(CorsTraitsBuilder.class)
/* loaded from: classes19.dex */
public class CorsTraits extends AbstractTraits {
    private static final String TRAIT_NAMESPACE = "";
    private final Set<String> additionalAllowedHeaders;
    private final Set<String> additionalExposedHeaders;
    private final int maxAge;
    private final String origin;

    public CorsTraits(Model.Id id, String str, String str2, int i, Set<String> set, Set<String> set2) {
        super(CorsTraits.class, id, "", str);
        this.origin = str2;
        this.maxAge = i;
        this.additionalAllowedHeaders = Collections.unmodifiableSet(set);
        this.additionalExposedHeaders = Collections.unmodifiableSet(set2);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CorsTraits)) {
            return false;
        }
        CorsTraits corsTraits = (CorsTraits) obj;
        if (getOrigin().equals(corsTraits.getOrigin()) && getMaxAge() == corsTraits.getMaxAge() && getAdditionalAllowedHeaders().equals(corsTraits.getAdditionalAllowedHeaders()) && getAdditionalExposedHeaders().equals(corsTraits.getAdditionalExposedHeaders())) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "additionalallowedheaders")
    public Set<String> getAdditionalAllowedHeaders() {
        return this.additionalAllowedHeaders;
    }

    @TraitProperty(name = "additionalexposedheaders")
    public Set<String> getAdditionalExposedHeaders() {
        return this.additionalExposedHeaders;
    }

    @TraitProperty(name = "maxage")
    public int getMaxAge() {
        return this.maxAge;
    }

    @TraitProperty(name = "origin")
    public String getOrigin() {
        return this.origin;
    }
}
