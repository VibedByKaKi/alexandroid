package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateCustomMetricRequest extends AmazonWebServiceRequest implements Serializable {
    private String clientRequestToken;
    private String displayName;
    private String metricName;
    private String metricType;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateCustomMetricRequest)) {
            return false;
        }
        CreateCustomMetricRequest createCustomMetricRequest = (CreateCustomMetricRequest) obj;
        if ((createCustomMetricRequest.getMetricName() == null) ^ (getMetricName() == null)) {
            return false;
        }
        if (createCustomMetricRequest.getMetricName() != null && !createCustomMetricRequest.getMetricName().equals(getMetricName())) {
            return false;
        }
        if ((createCustomMetricRequest.getDisplayName() == null) ^ (getDisplayName() == null)) {
            return false;
        }
        if (createCustomMetricRequest.getDisplayName() != null && !createCustomMetricRequest.getDisplayName().equals(getDisplayName())) {
            return false;
        }
        if ((createCustomMetricRequest.getMetricType() == null) ^ (getMetricType() == null)) {
            return false;
        }
        if (createCustomMetricRequest.getMetricType() != null && !createCustomMetricRequest.getMetricType().equals(getMetricType())) {
            return false;
        }
        if ((createCustomMetricRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (createCustomMetricRequest.getTags() != null && !createCustomMetricRequest.getTags().equals(getTags())) {
            return false;
        }
        if ((createCustomMetricRequest.getClientRequestToken() == null) ^ (getClientRequestToken() == null)) {
            return false;
        }
        return createCustomMetricRequest.getClientRequestToken() == null || createCustomMetricRequest.getClientRequestToken().equals(getClientRequestToken());
    }

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricType() {
        return this.metricType;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((((((getMetricName() == null ? 0 : getMetricName().hashCode()) + 31) * 31) + (getDisplayName() == null ? 0 : getDisplayName().hashCode())) * 31) + (getMetricType() == null ? 0 : getMetricType().hashCode())) * 31) + (getTags() == null ? 0 : getTags().hashCode())) * 31) + (getClientRequestToken() != null ? getClientRequestToken().hashCode() : 0);
    }

    public void setClientRequestToken(String str) {
        this.clientRequestToken = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setMetricName(String str) {
        this.metricName = str;
    }

    public void setMetricType(CustomMetricType customMetricType) {
        this.metricType = customMetricType.toString();
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getMetricName() != null) {
            sb.append("metricName: " + getMetricName() + ",");
        }
        if (getDisplayName() != null) {
            sb.append("displayName: " + getDisplayName() + ",");
        }
        if (getMetricType() != null) {
            sb.append("metricType: " + getMetricType() + ",");
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

    public CreateCustomMetricRequest withClientRequestToken(String str) {
        this.clientRequestToken = str;
        return this;
    }

    public CreateCustomMetricRequest withDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public CreateCustomMetricRequest withMetricName(String str) {
        this.metricName = str;
        return this;
    }

    public CreateCustomMetricRequest withMetricType(CustomMetricType customMetricType) {
        this.metricType = customMetricType.toString();
        return this;
    }

    public CreateCustomMetricRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public void setMetricType(String str) {
        this.metricType = str;
    }

    public CreateCustomMetricRequest withMetricType(String str) {
        this.metricType = str;
        return this;
    }

    public CreateCustomMetricRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
