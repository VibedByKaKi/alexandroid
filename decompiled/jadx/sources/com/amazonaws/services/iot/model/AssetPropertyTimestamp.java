package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AssetPropertyTimestamp implements Serializable {
    private String offsetInNanos;
    private String timeInSeconds;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssetPropertyTimestamp)) {
            return false;
        }
        AssetPropertyTimestamp assetPropertyTimestamp = (AssetPropertyTimestamp) obj;
        if ((assetPropertyTimestamp.getTimeInSeconds() == null) ^ (getTimeInSeconds() == null)) {
            return false;
        }
        if (assetPropertyTimestamp.getTimeInSeconds() != null && !assetPropertyTimestamp.getTimeInSeconds().equals(getTimeInSeconds())) {
            return false;
        }
        if ((assetPropertyTimestamp.getOffsetInNanos() == null) ^ (getOffsetInNanos() == null)) {
            return false;
        }
        return assetPropertyTimestamp.getOffsetInNanos() == null || assetPropertyTimestamp.getOffsetInNanos().equals(getOffsetInNanos());
    }

    public String getOffsetInNanos() {
        return this.offsetInNanos;
    }

    public String getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public int hashCode() {
        return (((getTimeInSeconds() == null ? 0 : getTimeInSeconds().hashCode()) + 31) * 31) + (getOffsetInNanos() != null ? getOffsetInNanos().hashCode() : 0);
    }

    public void setOffsetInNanos(String str) {
        this.offsetInNanos = str;
    }

    public void setTimeInSeconds(String str) {
        this.timeInSeconds = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTimeInSeconds() != null) {
            sb.append("timeInSeconds: " + getTimeInSeconds() + ",");
        }
        if (getOffsetInNanos() != null) {
            sb.append("offsetInNanos: " + getOffsetInNanos());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AssetPropertyTimestamp withOffsetInNanos(String str) {
        this.offsetInNanos = str;
        return this;
    }

    public AssetPropertyTimestamp withTimeInSeconds(String str) {
        this.timeInSeconds = str;
        return this;
    }
}
