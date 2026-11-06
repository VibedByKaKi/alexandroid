package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListThingRegistrationTasksResult implements Serializable {
    private String nextToken;
    private List<String> taskIds;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListThingRegistrationTasksResult)) {
            return false;
        }
        ListThingRegistrationTasksResult listThingRegistrationTasksResult = (ListThingRegistrationTasksResult) obj;
        if ((listThingRegistrationTasksResult.getTaskIds() == null) ^ (getTaskIds() == null)) {
            return false;
        }
        if (listThingRegistrationTasksResult.getTaskIds() != null && !listThingRegistrationTasksResult.getTaskIds().equals(getTaskIds())) {
            return false;
        }
        if ((listThingRegistrationTasksResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listThingRegistrationTasksResult.getNextToken() == null || listThingRegistrationTasksResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<String> getTaskIds() {
        return this.taskIds;
    }

    public int hashCode() {
        return (((getTaskIds() == null ? 0 : getTaskIds().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setTaskIds(Collection<String> collection) {
        if (collection == null) {
            this.taskIds = null;
        } else {
            this.taskIds = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskIds() != null) {
            sb.append("taskIds: " + getTaskIds() + ",");
        }
        if (getNextToken() != null) {
            sb.append("nextToken: " + getNextToken());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ListThingRegistrationTasksResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListThingRegistrationTasksResult withTaskIds(String... strArr) {
        if (getTaskIds() == null) {
            this.taskIds = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.taskIds.add(str);
        }
        return this;
    }

    public ListThingRegistrationTasksResult withTaskIds(Collection<String> collection) {
        setTaskIds(collection);
        return this;
    }
}
