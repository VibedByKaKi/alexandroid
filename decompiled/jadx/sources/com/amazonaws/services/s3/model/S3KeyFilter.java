package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3KeyFilter implements Serializable {
    private List<FilterRule> filterRules = new ArrayList();

    public void addFilterRule(FilterRule filterRule) {
        this.filterRules.add(filterRule);
    }

    public List<FilterRule> getFilterRules() {
        return Collections.unmodifiableList(this.filterRules);
    }

    public void setFilterRules(List<FilterRule> list) {
        this.filterRules = new ArrayList(list);
    }

    public S3KeyFilter withFilterRules(FilterRule... filterRuleArr) {
        setFilterRules(Arrays.asList(filterRuleArr));
        return this;
    }

    public S3KeyFilter withFilterRules(List<FilterRule> list) {
        setFilterRules(list);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FilterRuleName {
        Prefix,
        Suffix;

        public FilterRule newRule() {
            return new FilterRule().withName(toString());
        }

        public FilterRule newRule(String str) {
            return newRule().withValue(str);
        }
    }
}
