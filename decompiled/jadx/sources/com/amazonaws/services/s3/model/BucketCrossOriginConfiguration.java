package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BucketCrossOriginConfiguration implements Serializable {
    private List<CORSRule> rules;

    public BucketCrossOriginConfiguration(List<CORSRule> list) {
        this.rules = list;
    }

    public List<CORSRule> getRules() {
        return this.rules;
    }

    public void setRules(List<CORSRule> list) {
        this.rules = list;
    }

    public BucketCrossOriginConfiguration withRules(CORSRule... cORSRuleArr) {
        setRules(Arrays.asList(cORSRuleArr));
        return this;
    }

    public BucketCrossOriginConfiguration() {
    }

    public BucketCrossOriginConfiguration withRules(List<CORSRule> list) {
        setRules(list);
        return this;
    }
}
