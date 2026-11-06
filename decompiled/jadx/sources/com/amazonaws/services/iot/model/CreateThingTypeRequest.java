package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateThingTypeRequest extends AmazonWebServiceRequest implements Serializable {
    private List<Tag> tags;
    private String thingTypeName;
    private ThingTypeProperties thingTypeProperties;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateThingTypeRequest)) {
            return false;
        }
        CreateThingTypeRequest createThingTypeRequest = (CreateThingTypeRequest) obj;
        if ((createThingTypeRequest.getThingTypeName() == null) ^ (getThingTypeName() == null)) {
            return false;
        }
        if (createThingTypeRequest.getThingTypeName() != null && !createThingTypeRequest.getThingTypeName().equals(getThingTypeName())) {
            return false;
        }
        if ((createThingTypeRequest.getThingTypeProperties() == null) ^ (getThingTypeProperties() == null)) {
            return false;
        }
        if (createThingTypeRequest.getThingTypeProperties() != null && !createThingTypeRequest.getThingTypeProperties().equals(getThingTypeProperties())) {
            return false;
        }
        if ((createThingTypeRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createThingTypeRequest.getTags() == null || createThingTypeRequest.getTags().equals(getTags());
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    public ThingTypeProperties getThingTypeProperties() {
        return this.thingTypeProperties;
    }

    public int hashCode() {
        return (((((getThingTypeName() == null ? 0 : getThingTypeName().hashCode()) + 31) * 31) + (getThingTypeProperties() == null ? 0 : getThingTypeProperties().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setThingTypeName(String str) {
        this.thingTypeName = str;
    }

    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getThingTypeName() != null) {
            sb.append("thingTypeName: " + getThingTypeName() + ",");
        }
        if (getThingTypeProperties() != null) {
            sb.append("thingTypeProperties: " + getThingTypeProperties() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateThingTypeRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateThingTypeRequest withThingTypeName(String str) {
        this.thingTypeName = str;
        return this;
    }

    public CreateThingTypeRequest withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
        return this;
    }

    public CreateThingTypeRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
