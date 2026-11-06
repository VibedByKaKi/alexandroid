package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateBillingGroupRequest extends AmazonWebServiceRequest implements Serializable {
    private String billingGroupName;
    private BillingGroupProperties billingGroupProperties;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateBillingGroupRequest)) {
            return false;
        }
        CreateBillingGroupRequest createBillingGroupRequest = (CreateBillingGroupRequest) obj;
        if ((createBillingGroupRequest.getBillingGroupName() == null) ^ (getBillingGroupName() == null)) {
            return false;
        }
        if (createBillingGroupRequest.getBillingGroupName() != null && !createBillingGroupRequest.getBillingGroupName().equals(getBillingGroupName())) {
            return false;
        }
        if ((createBillingGroupRequest.getBillingGroupProperties() == null) ^ (getBillingGroupProperties() == null)) {
            return false;
        }
        if (createBillingGroupRequest.getBillingGroupProperties() != null && !createBillingGroupRequest.getBillingGroupProperties().equals(getBillingGroupProperties())) {
            return false;
        }
        if ((createBillingGroupRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createBillingGroupRequest.getTags() == null || createBillingGroupRequest.getTags().equals(getTags());
    }

    public String getBillingGroupName() {
        return this.billingGroupName;
    }

    public BillingGroupProperties getBillingGroupProperties() {
        return this.billingGroupProperties;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((getBillingGroupName() == null ? 0 : getBillingGroupName().hashCode()) + 31) * 31) + (getBillingGroupProperties() == null ? 0 : getBillingGroupProperties().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setBillingGroupName(String str) {
        this.billingGroupName = str;
    }

    public void setBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
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
        if (getBillingGroupName() != null) {
            sb.append("billingGroupName: " + getBillingGroupName() + ",");
        }
        if (getBillingGroupProperties() != null) {
            sb.append("billingGroupProperties: " + getBillingGroupProperties() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateBillingGroupRequest withBillingGroupName(String str) {
        this.billingGroupName = str;
        return this;
    }

    public CreateBillingGroupRequest withBillingGroupProperties(BillingGroupProperties billingGroupProperties) {
        this.billingGroupProperties = billingGroupProperties;
        return this;
    }

    public CreateBillingGroupRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateBillingGroupRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
