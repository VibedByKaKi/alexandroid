package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateDimensionRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String name;
    private List<String> stringValues;
    private List<Tag> tags;
    private String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateDimensionRequest)) {
            return false;
        }
        CreateDimensionRequest createDimensionRequest = (CreateDimensionRequest) obj;
        if ((createDimensionRequest.getName() == null) ^ (getName() == null)) {
            return false;
        }
        if (createDimensionRequest.getName() != null && !createDimensionRequest.getName().equals(getName())) {
            return false;
        }
        if ((createDimensionRequest.getType() == null) ^ (getType() == null)) {
            return false;
        }
        if (createDimensionRequest.getType() != null && !createDimensionRequest.getType().equals(getType())) {
            return false;
        }
        if ((createDimensionRequest.getStringValues() == null) ^ (getStringValues() == null)) {
            return false;
        }
        if (createDimensionRequest.getStringValues() != null && !createDimensionRequest.getStringValues().equals(getStringValues())) {
            return false;
        }
        if ((createDimensionRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (createDimensionRequest.getTags() != null && !createDimensionRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((createDimensionRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        return createDimensionRequest.getClientRequestToken() == null || createDimensionRequest.getClientRequestToken().equals(getClientRequestToken());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getStringValues() {
        return this.stringValues;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((getName() == null ? 0 : getName().hashCode()) + 31) * 31) + (getType() == null ? 0 : getType().hashCode())) * 31) + (getStringValues() == null ? 0 : getStringValues().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getClientRequestToken() != null ? getClientRequestToken().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStringValues(Collection<String> collection) {
        if (collection == null) {
            this.stringValues = null;
        } else {
            this.stringValues = new ArrayList(collection);
        }
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setType(DimensionType dimensionType) {
        this.type = dimensionType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getName() != null) {
            sb.append("name: " + getName() + ",");
        }
        if (getType() != null) {
            sb.append("type: " + getType() + ",");
        }
        if (getStringValues() != null) {
            sb.append("stringValues: " + getStringValues() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags() + ",");
        }
        if (getClientRequestToken() != null) {
            sb.append("clientRequestToken: " + getClientRequestToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateDimensionRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public CreateDimensionRequest withName(String str) {
        this.name = str;
        return this;
    }

    public CreateDimensionRequest withStringValues(String... strArr) {
        if (getStringValues() == null) {
            this.stringValues = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.stringValues.add(str);
        }
        return this;
    }

    public CreateDimensionRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateDimensionRequest withType(DimensionType dimensionType) {
        this.type = dimensionType.toString();
        return this;
    }

    public void setType(String str) {
        this.type = str;
    }

    public CreateDimensionRequest withType(String str) {
        this.type = str;
        return this;
    }

    public CreateDimensionRequest withStringValues(Collection<String> collection) {
        setStringValues(collection);
        return this;
    }

    public CreateDimensionRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
