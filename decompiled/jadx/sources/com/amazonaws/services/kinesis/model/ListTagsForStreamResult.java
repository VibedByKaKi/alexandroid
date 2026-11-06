package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsForStreamResult implements Serializable {
    private Boolean hasMoreTags;
    private List<Tag> tags = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForStreamResult)) {
            return false;
        }
        ListTagsForStreamResult listTagsForStreamResult = (ListTagsForStreamResult) obj;
        if ((listTagsForStreamResult.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (listTagsForStreamResult.getTags() != null && !listTagsForStreamResult.getTags().equals(getTags())) {
            return false;
        }
        if ((listTagsForStreamResult.getHasMoreTags() == null) ^ (getHasMoreTags() == null)) {
            return false;
        }
        return listTagsForStreamResult.getHasMoreTags() == null || listTagsForStreamResult.getHasMoreTags().equals(getHasMoreTags());
    }

    public Boolean getHasMoreTags() {
        return this.hasMoreTags;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getTags() == null ? 0 : getTags().hashCode()) + 31) * 31) + (getHasMoreTags() != null ? getHasMoreTags().hashCode() : 0);
    }

    public Boolean isHasMoreTags() {
        return this.hasMoreTags;
    }

    public void setHasMoreTags(Boolean bool) {
        this.hasMoreTags = bool;
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
        if (getTags() != null) {
            sb.append("Tags: " + getTags() + ",");
        }
        if (getHasMoreTags() != null) {
            sb.append("HasMoreTags: " + getHasMoreTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsForStreamResult withHasMoreTags(Boolean bool) {
        this.hasMoreTags = bool;
        return this;
    }

    public ListTagsForStreamResult withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public ListTagsForStreamResult withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
