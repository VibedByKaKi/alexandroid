package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.model.Model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class AwsErrorTraits extends AbstractTraits {
    private final String code;
    private final int httpResponseCode;
    private final boolean senderFault;

    public AwsErrorTraits(Class<? extends Traits> cls, Model.Id id, String str, String str2, String str3, int i, boolean z) {
        super(cls, id, str, str2);
        this.code = nullToEmpty(str3);
        this.httpResponseCode = i;
        this.senderFault = z;
    }

    @Override // com.amazon.coral.model.AbstractTraits
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwsErrorTraits)) {
            return false;
        }
        AwsErrorTraits awsErrorTraits = (AwsErrorTraits) obj;
        if (awsErrorTraits.isSenderFault() != isSenderFault() || awsErrorTraits.getHttpResponseCode() != getHttpResponseCode()) {
            return false;
        }
        String code = awsErrorTraits.getCode();
        String code2 = getCode();
        if (code2 == code || !(code == null || code2 == null || !code.equals(code2))) {
            return super.equals(obj);
        }
        return false;
    }

    @TraitProperty(name = "code")
    public String getCode() {
        return this.code;
    }

    @TraitProperty(name = "httpresponsecode")
    public int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    @TraitProperty(name = "senderfault")
    public boolean isSenderFault() {
        return this.senderFault;
    }
}
