package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsForResourceResult implements Serializable {
    private String nextToken;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForResourceResult)) {
            return false;
        }
        ListTagsForResourceResult listTagsForResourceResult = (ListTagsForResourceResult) obj;
        if ((listTagsForResourceResult.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (listTagsForResourceResult.getTags() != null && !listTagsForResourceResult.getTags().equals(getTags())) {
            return false;
        }
        if ((listTagsForResourceResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTagsForResourceResult.getNextToken() == null || listTagsForResourceResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getTags() == null ? 0 : getTags().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
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
            sb.append("tags: " + getTags() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsForResourceResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTagsForResourceResult withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public ListTagsForResourceResult withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
