package com.amazonaws.services.s3.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RoutingRuleCondition {
    String httpErrorCodeReturnedEquals;
    String keyPrefixEquals;

    public String getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals;
    }

    public String getKeyPrefixEquals() {
        return this.keyPrefixEquals;
    }

    public void setHttpErrorCodeReturnedEquals(String str) {
        this.httpErrorCodeReturnedEquals = str;
    }

    public void setKeyPrefixEquals(String str) {
        this.keyPrefixEquals = str;
    }

    public RoutingRuleCondition withHttpErrorCodeReturnedEquals(String str) {
        setHttpErrorCodeReturnedEquals(str);
        return this;
    }

    public RoutingRuleCondition withKeyPrefixEquals(String str) {
        setKeyPrefixEquals(str);
        return this;
    }
}
