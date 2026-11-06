package com.amazonaws.services.logs.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListTagsLogGroupResult implements Serializable {
    private Map<String, String> tags;

    public ListTagsLogGroupResult addtagsEntry(String str, String str2) {
        if (this.tags == null) {
            this.tags = new HashMap();
        }
        if (this.tags.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.tags.put(str, str2);
        return this;
    }

    public ListTagsLogGroupResult cleartagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsLogGroupResult)) {
            return false;
        }
        ListTagsLogGroupResult listTagsLogGroupResult = (ListTagsLogGroupResult) obj;
        if ((listTagsLogGroupResult.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return listTagsLogGroupResult.getTags() == null || listTagsLogGroupResult.getTags().equals(getTags());
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return 31 + (getTags() == null ? 0 : getTags().hashCode());
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListTagsLogGroupResult withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }
}
