package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateDynamicThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String indexName;
    private String queryString;
    private String queryVersion;
    private List<Tag> tags;
    private String thingGroupName;
    private ThingGroupProperties thingGroupProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateDynamicThingGroupRequest)) {
            return false;
        }
        CreateDynamicThingGroupRequest createDynamicThingGroupRequest = (CreateDynamicThingGroupRequest) obj;
        if ((createDynamicThingGroupRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (createDynamicThingGroupRequest.getThingGroupName() != null && !createDynamicThingGroupRequest.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((createDynamicThingGroupRequest.getThingGroupProperties() == null) ^ (getThingGroupProperties() == null)) {
            return false;
        }
        if (createDynamicThingGroupRequest.getThingGroupProperties() != null && !createDynamicThingGroupRequest.getThingGroupProperties().equals(getThingGroupProperties())) {
            return false;
        }
        if ((createDynamicThingGroupRequest.getIndexName() == null) ^ (getIndexName() == null)) {
            return false;
        }
        if (createDynamicThingGroupRequest.getIndexName() != null && !createDynamicThingGroupRequest.getIndexName().equals(getIndexName())) {
            return false;
        }
        if ((createDynamicThingGroupRequest.getQueryString() == null) ^ (getQueryString() == null)) {
            return false;
        }
        if (createDynamicThingGroupRequest.getQueryString() != null && !createDynamicThingGroupRequest.getQueryString().equals(getQueryString())) {
            return false;
        }
        if ((createDynamicThingGroupRequest.getQueryVersion() == null) ^ (getQueryVersion() == null)) {
            return false;
        }
        if (createDynamicThingGroupRequest.getQueryVersion() != null && !createDynamicThingGroupRequest.getQueryVersion().equals(getQueryVersion())) {
            return false;
        }
        if ((createDynamicThingGroupRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createDynamicThingGroupRequest.getTags() == null || createDynamicThingGroupRequest.getTags().equals(getTags());
    }

    public String getIndexName() {
        return this.indexName;
    }

    public String getQueryString() {
        return this.queryString;
    }

    public String getQueryVersion() {
        return this.queryVersion;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    public ThingGroupProperties getThingGroupProperties() {
        return this.thingGroupProperties;
    }

    public int hashCode() {
        return (((((((((((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getThingGroupProperties() == null ? 0 : getThingGroupProperties().hashCode())) * 31) + (getIndexName() == null ? 0 : getIndexName().hashCode())) * 31) + (getQueryString() == null ? 0 : getQueryString().hashCode())) * 31) + (getQueryVersion() == null ? 0 : getQueryVersion().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public void setQueryString(String str) {
        this.queryString = str;
    }

    public void setQueryVersion(String str) {
        this.queryVersion = str;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setThingGroupName(String str) {
        this.thingGroupName = str;
    }

    public void setThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingGroupName() != null) {
            sb.append("thingGroupName: " + getThingGroupName() + ",");
        }
        if (getThingGroupProperties() != null) {
            sb.append("thingGroupProperties: " + getThingGroupProperties() + ",");
        }
        if (getIndexName() != null) {
            sb.append("indexName: " + getIndexName() + ",");
        }
        if (getQueryString() != null) {
            sb.append("queryString: " + getQueryString() + ",");
        }
        if (getQueryVersion() != null) {
            sb.append("queryVersion: " + getQueryVersion() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateDynamicThingGroupRequest withIndexName(String str) {
        this.indexName = str;
        return this;
    }

    public CreateDynamicThingGroupRequest withQueryString(String str) {
        this.queryString = str;
        return this;
    }

    public CreateDynamicThingGroupRequest withQueryVersion(String str) {
        this.queryVersion = str;
        return this;
    }

    public CreateDynamicThingGroupRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateDynamicThingGroupRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }

    public CreateDynamicThingGroupRequest withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
        return this;
    }

    public CreateDynamicThingGroupRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
