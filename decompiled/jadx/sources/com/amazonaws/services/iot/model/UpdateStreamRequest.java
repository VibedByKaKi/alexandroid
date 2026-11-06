package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UpdateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String description;
    private List<StreamFile> files;
    private String roleArn;
    private String streamId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateStreamRequest)) {
            return false;
        }
        UpdateStreamRequest updateStreamRequest = (UpdateStreamRequest) obj;
        if ((updateStreamRequest.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        if (updateStreamRequest.getStreamId() != null && !updateStreamRequest.getStreamId().equals(getStreamId())) {
            return false;
        }
        if ((updateStreamRequest.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (updateStreamRequest.getDescription() != null && !updateStreamRequest.getDescription().equals(getDescription())) {
            return false;
        }
        if ((updateStreamRequest.getFiles() == null) ^ (getFiles() == null)) {
            return false;
        }
        if (updateStreamRequest.getFiles() != null && !updateStreamRequest.getFiles().equals(getFiles())) {
            return false;
        }
        if ((updateStreamRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return updateStreamRequest.getRoleArn() == null || updateStreamRequest.getRoleArn().equals(getRoleArn());
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

    public int hashCode() {
        return (((((((getStreamId() == null ? 0 : getStreamId().hashCode()) + 31) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getFiles() == null ? 0 : getFiles().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
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
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UpdateStreamRequest withDescription(String str) {
        this.description = str;
        return this;
    }

    public UpdateStreamRequest withFiles(StreamFile... streamFileArr) {
        if (getFiles() == null) {
            this.files = new ArrayList(streamFileArr.length);
        }
        for (StreamFile streamFile : streamFileArr) {
            this.files.add(streamFile);
        }
        return this;
    }

    public UpdateStreamRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public UpdateStreamRequest withStreamId(String str) {
        this.streamId = str;
        return this;
    }

    public UpdateStreamRequest withFiles(Collection<StreamFile> collection) {
        setFiles(collection);
        return this;
    }
}
