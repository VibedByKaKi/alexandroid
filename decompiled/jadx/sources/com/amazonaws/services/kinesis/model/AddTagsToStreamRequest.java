package com.amazonaws.services.kinesis.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AddTagsToStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamName;
    private Map<String, String> tags = new HashMap();

    public AddTagsToStreamRequest addTagsEntry(String str, String str2) {
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

    public AddTagsToStreamRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AddTagsToStreamRequest)) {
            return false;
        }
        AddTagsToStreamRequest addTagsToStreamRequest = (AddTagsToStreamRequest) obj;
        if ((addTagsToStreamRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (addTagsToStreamRequest.getStreamName() != null && !addTagsToStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((addTagsToStreamRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return addTagsToStreamRequest.getTags() == null || addTagsToStreamRequest.getTags().equals(getTags());
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTags(Map<String, String> map) {
        this.tags = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getTags() != null) {
            sb.append("Tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AddTagsToStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public AddTagsToStreamRequest withTags(Map<String, String> map) {
        this.tags = map;
        return this;
    }
}
