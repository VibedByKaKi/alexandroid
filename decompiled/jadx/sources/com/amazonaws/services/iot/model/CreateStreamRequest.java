package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String description;
    private List<StreamFile> files;
    private String roleArn;
    private String streamId;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamRequest)) {
            return false;
        }
        CreateStreamRequest createStreamRequest = (CreateStreamRequest) obj;
        if ((createStreamRequest.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        if (createStreamRequest.getStreamId() != null && !createStreamRequest.getStreamId().equals(getStreamId())) {
            return false;
        }
        if ((createStreamRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (createStreamRequest.getDescription() != null && !createStreamRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((createStreamRequest.getFiles() == null) ^ (getFiles() == null)) {
            return false;
        }
        if (createStreamRequest.getFiles() != null && !createStreamRequest.getFiles().equals(getFiles())) {
            return false;
        }
        if ((createStreamRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (createStreamRequest.getRoleArn() != null && !createStreamRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((createStreamRequest.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        return createStreamRequest.getTags() == null || createStreamRequest.getTags().equals(getTags());
    }

    public String getDescription() {
        return this.description;
    }

    public List<StreamFile> getFiles() {
        return this.files;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((((((((getStreamId() == null ? 0 : getStreamId().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getFiles() == null ? 0 : getFiles().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getTags() != null ? getTags().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFiles(Collection<StreamFile> collection) {
        if (collection == null) {
            this.files = null;
        } else {
            this.files = new ArrayList(collection);
        }
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setStreamId(String str) {
        this.streamId = str;
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
        if (getStreamId() != null) {
            sb.append("streamId: " + getStreamId() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getFiles() != null) {
            sb.append("files: " + getFiles() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getTags() != null) {
            sb.append("tags: " + getTags());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateStreamRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public CreateStreamRequest withFiles(StreamFile... streamFileArr) {
        if (getFiles() == null) {
            this.files = new ArrayList(streamFileArr.length);
        }
        for (StreamFile streamFile : streamFileArr) {
            this.files.add(streamFile);
        }
        return this;
    }

    public CreateStreamRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public CreateStreamRequest withStreamId(String str) {
        this.streamId = str;
        return this;
    }

    public CreateStreamRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public CreateStreamRequest withFiles(Collection<StreamFile> collection) {
        setFiles(collection);
        return this;
    }

    public CreateStreamRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
