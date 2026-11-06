package com.amazonaws.services.s3.model;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ReplicationRule {
    private ReplicationDestinationConfig destinationConfig;
    private String prefix;
    private String status;

    public ReplicationDestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getStatus() {
        return this.status;
    }

    public void setDestinationConfig(ReplicationDestinationConfig replicationDestinationConfig) {
        if (replicationDestinationConfig != null) {
            this.destinationConfig = replicationDestinationConfig;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Destination cannot be null in the replication rule");
        }
    }

    public void setPrefix(String str) {
        if (str != null) {
            this.prefix = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Prefix cannot be null for a replication rule");
        }
    }

    public void setStatus(ReplicationRuleStatus replicationRuleStatus) {
        setStatus(replicationRuleStatus.getStatus());
    }

    public ReplicationRule withDestinationConfig(ReplicationDestinationConfig replicationDestinationConfig) {
        setDestinationConfig(replicationDestinationConfig);
        return this;
    }

    public ReplicationRule withPrefix(String str) {
        setPrefix(str);
        return this;
    }

    public ReplicationRule withStatus(ReplicationRuleStatus replicationRuleStatus) {
        setStatus(replicationRuleStatus.getStatus());
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public ReplicationRule withStatus(String str) {
        setStatus(str);
        return this;
    }
}
