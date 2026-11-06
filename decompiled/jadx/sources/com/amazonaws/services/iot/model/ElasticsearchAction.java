package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ElasticsearchAction implements Serializable {
    private String endpoint;
    private String id;
    private String index;
    private String roleArn;
    private String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ElasticsearchAction)) {
            return false;
        }
        ElasticsearchAction elasticsearchAction = (ElasticsearchAction) obj;
        if ((elasticsearchAction.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (elasticsearchAction.getRoleArn() != null && !elasticsearchAction.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((elasticsearchAction.getEndpoint() == null) ^ (getEndpoint() == null)) {
            return false;
        }
        if (elasticsearchAction.getEndpoint() != null && !elasticsearchAction.getEndpoint().equals(getEndpoint())) {
            return false;
        }
        if ((elasticsearchAction.getIndex() == null) ^ (getIndex() == null)) {
            return false;
        }
        if (elasticsearchAction.getIndex() != null && !elasticsearchAction.getIndex().equals(getIndex())) {
            return false;
        }
        if ((elasticsearchAction.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (elasticsearchAction.getType() != null && !elasticsearchAction.getType().equals(getType())) {
            return false;
        }
        if ((elasticsearchAction.getId() == null) ^ (getId() == null)) {
            return false;
        }
        return elasticsearchAction.getId() == null || elasticsearchAction.getId().equals(getId());
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getId() {
        return this.id;
    }

    public String getIndex() {
        return this.index;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getEndpoint() == null ? 0 : getEndpoint().hashCode())) * 31) + (getIndex() == null ? 0 : getIndex().hashCode())) * 31) + (getType() == null ? 0 : getType().hashCode())) * 31) + (getId() != null ? getId().hashCode() : 0);
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getEndpoint() != null) {
            sb.append("endpoint: " + getEndpoint() + ",");
        }
        if (getIndex() != null) {
            sb.append("index: " + getIndex() + ",");
        }
        if (getType() != null) {
            sb.append("type: " + getType() + ",");
        }
        if (getId() != null) {
            sb.append("id: " + getId());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ElasticsearchAction withEndpoint(String str) {
        this.endpoint = str;
        return this;
    }

    public ElasticsearchAction withId(String str) {
        this.id = str;
        return this;
    }

    public ElasticsearchAction withIndex(String str) {
        this.index = str;
        return this;
    }

    public ElasticsearchAction withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public ElasticsearchAction withType(String str) {
        this.type = str;
        return this;
    }
}
