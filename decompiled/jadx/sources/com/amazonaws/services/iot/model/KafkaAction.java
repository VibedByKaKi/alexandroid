package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class KafkaAction implements Serializable {
    private Map<String, String> clientProperties;
    private String destinationArn;
    private String key;
    private String partition;
    private String topic;

    public KafkaAction addclientPropertiesEntry(String str, String str2) {
        if (this.clientProperties == null) {
            this.clientProperties = new HashMap();
        }
        if (this.clientProperties.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.clientProperties.put(str, str2);
        return this;
    }

    public KafkaAction clearclientPropertiesEntries() {
        this.clientProperties = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof KafkaAction)) {
            return false;
        }
        KafkaAction kafkaAction = (KafkaAction) obj;
        if ((kafkaAction.getDestinationArn() == null) ^ (getDestinationArn() == null)) {
            return false;
        }
        if (kafkaAction.getDestinationArn() != null && !kafkaAction.getDestinationArn().equals(getDestinationArn())) {
            return false;
        }
        if ((kafkaAction.getTopic() == null) ^ (getTopic() == null)) {
            return false;
        }
        if (kafkaAction.getTopic() != null && !kafkaAction.getTopic().equals(getTopic())) {
            return false;
        }
        if ((kafkaAction.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (kafkaAction.getKey() != null && !kafkaAction.getKey().equals(getKey())) {
            return false;
        }
        if ((kafkaAction.getPartition() == null) ^ (getPartition() == null)) {
            return false;
        }
        if (kafkaAction.getPartition() != null && !kafkaAction.getPartition().equals(getPartition())) {
            return false;
        }
        if ((kafkaAction.getClientProperties() == null) ^ (getClientProperties() == null)) {
            return false;
        }
        return kafkaAction.getClientProperties() == null || kafkaAction.getClientProperties().equals(getClientProperties());
    }

    public Map<String, String> getClientProperties() {
        return this.clientProperties;
    }

    public String getDestinationArn() {
        return this.destinationArn;
    }

    public String getKey() {
        return this.key;
    }

    public String getPartition() {
        return this.partition;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((((((getDestinationArn() == null ? 0 : getDestinationArn().hashCode()) + 31) * 31) + (getTopic() == null ? 0 : getTopic().hashCode())) * 31) + (getKey() == null ? 0 : getKey().hashCode())) * 31) + (getPartition() == null ? 0 : getPartition().hashCode())) * 31) + (getClientProperties() != null ? getClientProperties().hashCode() : 0);
    }

    public void setClientProperties(Map<String, String> map) {
        this.clientProperties = map;
    }

    public void setDestinationArn(String str) {
        this.destinationArn = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPartition(String str) {
        this.partition = str;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getDestinationArn() != null) {
            sb.append("destinationArn: " + getDestinationArn() + ",");
        }
        if (getTopic() != null) {
            sb.append("topic: " + getTopic() + ",");
        }
        if (getKey() != null) {
            sb.append("key: " + getKey() + ",");
        }
        if (getPartition() != null) {
            sb.append("partition: " + getPartition() + ",");
        }
        if (getClientProperties() != null) {
            sb.append("clientProperties: " + getClientProperties());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public KafkaAction withClientProperties(Map<String, String> map) {
        this.clientProperties = map;
        return this;
    }

    public KafkaAction withDestinationArn(String str) {
        this.destinationArn = str;
        return this;
    }

    public KafkaAction withKey(String str) {
        this.key = str;
        return this;
    }

    public KafkaAction withPartition(String str) {
        this.partition = str;
        return this;
    }

    public KafkaAction withTopic(String str) {
        this.topic = str;
        return this;
    }
}
