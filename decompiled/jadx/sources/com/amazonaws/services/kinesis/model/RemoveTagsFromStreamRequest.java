package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RemoveTagsFromStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String streamName;
    private List<String> tagKeys = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RemoveTagsFromStreamRequest)) {
            return false;
        }
        RemoveTagsFromStreamRequest removeTagsFromStreamRequest = (RemoveTagsFromStreamRequest) obj;
        if ((removeTagsFromStreamRequest.getStreamName() == null) ^ (getStreamName() == null)) {
            return false;
        }
        if (removeTagsFromStreamRequest.getStreamName() != null && !removeTagsFromStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if ((removeTagsFromStreamRequest.getTagKeys() == null) ^ (getTagKeys() == null)) {
            return false;
        }
        return removeTagsFromStreamRequest.getTagKeys() == null || removeTagsFromStreamRequest.getTagKeys().equals(getTagKeys());
    }

    public String getStreamName() {
        return this.streamName;
    }

    public List<String> getTagKeys() {
        return this.tagKeys;
    }

    public int hashCode() {
        return (((getStreamName() == null ? 0 : getStreamName().hashCode()) + 31) * 31) + (getTagKeys() != null ? getTagKeys().hashCode() : 0);
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTagKeys(Collection<String> collection) {
        if (collection == null) {
            this.tagKeys = null;
        } else {
            this.tagKeys = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamName() != null) {
            sb.append("StreamName: " + getStreamName() + ",");
        }
        if (getTagKeys() != null) {
            sb.append("TagKeys: " + getTagKeys());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RemoveTagsFromStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public RemoveTagsFromStreamRequest withTagKeys(String... strArr) {
        if (getTagKeys() == null) {
            this.tagKeys = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.tagKeys.add(str);
        }
        return this;
    }

    public RemoveTagsFromStreamRequest withTagKeys(Collection<String> collection) {
        setTagKeys(collection);
        return this;
    }
}
