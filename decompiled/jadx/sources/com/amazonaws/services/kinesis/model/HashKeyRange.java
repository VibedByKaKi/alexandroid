package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HashKeyRange implements Serializable {
    private String endingHashKey;
    private String startingHashKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HashKeyRange)) {
            return false;
        }
        HashKeyRange hashKeyRange = (HashKeyRange) obj;
        if ((hashKeyRange.getStartingHashKey() == null) ^ (getStartingHashKey() == null)) {
            return false;
        }
        if (hashKeyRange.getStartingHashKey() != null && !hashKeyRange.getStartingHashKey().equals(getStartingHashKey())) {
            return false;
        }
        if ((hashKeyRange.getEndingHashKey() == null) ^ (getEndingHashKey() == null)) {
            return false;
        }
        return hashKeyRange.getEndingHashKey() == null || hashKeyRange.getEndingHashKey().equals(getEndingHashKey());
    }

    public String getEndingHashKey() {
        return this.endingHashKey;
    }

    public String getStartingHashKey() {
        return this.startingHashKey;
    }

    public int hashCode() {
        return (((getStartingHashKey() == null ? 0 : getStartingHashKey().hashCode()) + 31) * 31) + (getEndingHashKey() != null ? getEndingHashKey().hashCode() : 0);
    }

    public void setEndingHashKey(String str) {
        this.endingHashKey = str;
    }

    public void setStartingHashKey(String str) {
        this.startingHashKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getStartingHashKey() != null) {
            sb.append("StartingHashKey: " + getStartingHashKey() + ",");
        }
        if (getEndingHashKey() != null) {
            sb.append("EndingHashKey: " + getEndingHashKey());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public HashKeyRange withEndingHashKey(String str) {
        this.endingHashKey = str;
        return this;
    }

    public HashKeyRange withStartingHashKey(String str) {
        this.startingHashKey = str;
        return this;
    }
}
