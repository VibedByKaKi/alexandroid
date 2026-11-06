package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String parentGroupName;
    private List<Tag> tags;
    private String thingGroupName;
    private ThingGroupProperties thingGroupProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingGroupRequest)) {
            return false;
        }
        CreateThingGroupRequest createThingGroupRequest = (CreateThingGroupRequest) obj;
        if ((createThingGroupRequest.getThingGroupName() == null) ^ (getThingGroupName() == null)) {
            return false;
        }
        if (createThingGroupRequest.getThingGroupName() != null && !createThingGroupRequest.getThingGroupName().equals(getThingGroupName())) {
            return false;
        }
        if ((createThingGroupRequest.getParentGroupName() == null) ^ (getParentGroupName() == null)) {
            return false;
        }
        if (createThingGroupRequest.getParentGroupName() != null && !createThingGroupRequest.getParentGroupName().equals(getParentGroupName())) {
            return false;
        }
        if ((createThingGroupRequest.getThingGroupProperties() == null) ^ (getThingGroupProperties() == null)) {
            return false;
        }
        if (createThingGroupRequest.getThingGroupProperties() != null && !createThingGroupRequest.getThingGroupProperties().equals(getThingGroupProperties())) {
            return false;
        }
        if ((createThingGroupRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createThingGroupRequest.getTags() == null || createThingGroupRequest.getTags().equals(getTags());
    }

    public String getParentGroupName() {
        return this.parentGroupName;
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
        return (((((((getThingGroupName() == null ? 0 : getThingGroupName().hashCode()) + 31) * 31) + (getParentGroupName() == null ? 0 : getParentGroupName().hashCode())) * 31) + (getThingGroupProperties() == null ? 0 : getThingGroupProperties().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setParentGroupName(String str) {
        this.parentGroupName = str;
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
        if (getParentGroupName() != null) {
            sb.append("parentGroupName: " + getParentGroupName() + ",");
        }
        if (getThingGroupProperties() != null) {
            sb.append("thingGroupProperties: " + getThingGroupProperties() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingGroupRequest withParentGroupName(String str) {
        this.parentGroupName = str;
        return this;
    }

    public CreateThingGroupRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateThingGroupRequest withThingGroupName(String str) {
        this.thingGroupName = str;
        return this;
    }

    public CreateThingGroupRequest withThingGroupProperties(ThingGroupProperties thingGroupProperties) {
        this.thingGroupProperties = thingGroupProperties;
        return this;
    }

    public CreateThingGroupRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
