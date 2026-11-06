package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BucketReplicationConfiguration implements Serializable {
    private String roleARN;
    private Map<String, ReplicationRule> rules = new HashMap();

    public BucketReplicationConfiguration addRule(String str, ReplicationRule replicationRule) {
        if (str == null || str.trim().isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Rule id cannot be null or empty.");
            return null;
        }
        if (replicationRule != null) {
            this.rules.put(str, replicationRule);
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Replication rule cannot be null");
        return null;
    }

    public String getRoleARN() {
        return this.roleARN;
    }

    public ReplicationRule getRule(String str) {
        return this.rules.get(str);
    }

    public Map<String, ReplicationRule> getRules() {
        return this.rules;
    }

    public BucketReplicationConfiguration removeRule(String str) {
        this.rules.remove(str);
        return this;
    }

    public void setRoleARN(String str) {
        this.roleARN = str;
    }

    public void setRules(Map<String, ReplicationRule> map) {
        if (map != null) {
            this.rules = new HashMap(map);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Replication rules cannot be null");
        }
    }

    public BucketReplicationConfiguration withRoleARN(String str) {
        setRoleARN(str);
        return this;
    }

    public BucketReplicationConfiguration withRules(Map<String, ReplicationRule> map) {
        setRules(map);
        return this;
    }
}
