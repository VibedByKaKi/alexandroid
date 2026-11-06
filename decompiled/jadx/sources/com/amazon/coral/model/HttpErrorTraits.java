package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.Trait;
import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Trait(name = "httperror", targets = {Model.class})
/* loaded from: classes19.dex */
public class HttpErrorTraits extends AbstractTraits {
    private final int httpResponseCode;
    private final boolean senderFault;

    public HttpErrorTraits(int i) {
        this(HttpErrorTraits.class, Model.Id.NONE, "", "N/A", i);
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HttpErrorTraits)) {
            return false;
        }
        HttpErrorTraits httpErrorTraits = (HttpErrorTraits) obj;
        if (httpErrorTraits.getHttpResponseCode() == getHttpResponseCode() && httpErrorTraits.isSenderFault() == isSenderFault()) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "httpresponsecode")
    public int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    @TraitProperty(name = "senderfault")
    public boolean isSenderFault() {
        return this.senderFault;
    }

    public HttpErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "httpresponsecode") int i) {
        this(cls, id, str, str2, i, false);
    }

    @ValidTraitOr({@ValidTrait(requires = {"httpresponsecode"}), @ValidTrait(requires = {"httpresponsecode", "senderfault"})})
    public HttpErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, @TraitProperty(name = "httpresponsecode") int i, @TraitProperty(name = "senderfault") boolean z) {
        super(cls, id, str, str2);
        this.httpResponseCode = i;
        this.senderFault = z;
    }
}
