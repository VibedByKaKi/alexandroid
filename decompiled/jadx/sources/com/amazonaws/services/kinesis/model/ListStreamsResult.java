package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListStreamsResult implements Serializable {
    private Boolean hasMoreStreams;
    private List<String> streamNames = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsResult)) {
            return false;
        }
        ListStreamsResult listStreamsResult = (ListStreamsResult) obj;
        if ((listStreamsResult.getStreamNames() == null) ^ (getStreamNames() == null)) {
            return false;
        }
        if (listStreamsResult.getStreamNames() != null && !listStreamsResult.getStreamNames().equals(getStreamNames())) {
            return false;
        }
        if ((listStreamsResult.getHasMoreStreams() == null) ^ (getHasMoreStreams() == null)) {
            return false;
        }
        return listStreamsResult.getHasMoreStreams() == null || listStreamsResult.getHasMoreStreams().equals(getHasMoreStreams());
    }

    public Boolean getHasMoreStreams() {
        return this.hasMoreStreams;
    }

    public List<String> getStreamNames() {
        return this.streamNames;
    }

    public int hashCode() {
        return (((getStreamNames() == null ? 0 : getStreamNames().hashCode()) + 31) * 31) + (getHasMoreStreams() != null ? getHasMoreStreams().hashCode() : 0);
    }

    public Boolean isHasMoreStreams() {
        return this.hasMoreStreams;
    }

    public void setHasMoreStreams(Boolean bool) {
        this.hasMoreStreams = bool;
    }

    public void setStreamNames(Collection<String> collection) {
        if (collection == null) {
            this.streamNames = null;
        } else {
            this.streamNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStreamNames() != null) {
            sb.append("StreamNames: " + getStreamNames() + ",");
        }
        if (getHasMoreStreams() != null) {
            sb.append("HasMoreStreams: " + getHasMoreStreams());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListStreamsResult withHasMoreStreams(Boolean bool) {
        this.hasMoreStreams = bool;
        return this;
    }

    public ListStreamsResult withStreamNames(String... strArr) {
        if (getStreamNames() == null) {
            this.streamNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.streamNames.add(str);
        }
        return this;
    }

    public ListStreamsResult withStreamNames(Collection<String> collection) {
        setStreamNames(collection);
        return this;
    }
}
