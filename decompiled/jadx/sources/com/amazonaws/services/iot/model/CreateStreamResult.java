package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateStreamResult implements Serializable {
    private String description;
    private String streamArn;
    private String streamId;
    private Integer streamVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamResult)) {
            return false;
        }
        CreateStreamResult createStreamResult = (CreateStreamResult) obj;
        if ((createStreamResult.getStreamId() == null) ^ (getStreamId() == null)) {
            return false;
        }
        if (createStreamResult.getStreamId() != null && !createStreamResult.getStreamId().equals(getStreamId())) {
            return false;
        }
        if ((createStreamResult.getStreamArn() == null) ^ (getStreamArn() == null)) {
            return false;
        }
        if (createStreamResult.getStreamArn() != null && !createStreamResult.getStreamArn().equals(getStreamArn())) {
            return false;
        }
        if ((createStreamResult.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (createStreamResult.getDescription() != null && !createStreamResult.getDescription().equals(getDescription())) {
            return false;
        }
        if ((createStreamResult.getStreamVersion() == null) ^ (getStreamVersion() == null)) {
            return false;
        }
        return createStreamResult.getStreamVersion() == null || createStreamResult.getStreamVersion().equals(getStreamVersion());
    }

    public String getDescription() {
        return this.description;
    }

    public String getStreamArn() {
        return this.streamArn;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public Integer getStreamVersion() {
        return this.streamVersion;
    }

    public int hashCode() {
        return (((((((getStreamId() == null ? 0 : getStreamId().hashCode()) + 31) * 31) + (getStreamArn() == null ? 0 : getStreamArn().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getStreamVersion() != null ? getStreamVersion().hashCode() : 0);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStreamArn(String str) {
        this.streamArn = str;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public void setStreamVersion(Integer num) {
        this.streamVersion = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamId() != null) {
            sb.append("streamId: " + getStreamId() + ",");
        }
        if (getStreamArn() != null) {
            sb.append("streamArn: " + getStreamArn() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getStreamVersion() != null) {
            sb.append("streamVersion: " + getStreamVersion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CreateStreamResult withDescription(String str) {
        this.description = str;
        return this;
    }

    public CreateStreamResult withStreamArn(String str) {
        this.streamArn = str;
        return this;
    }

    public CreateStreamResult withStreamId(String str) {
        this.streamId = str;
        return this;
    }

    public CreateStreamResult withStreamVersion(Integer num) {
        this.streamVersion = num;
        return this;
    }
}
