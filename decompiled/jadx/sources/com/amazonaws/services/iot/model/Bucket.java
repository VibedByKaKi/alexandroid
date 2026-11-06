package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class Bucket implements Serializable {
    private Integer count;
    private String keyValue;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) obj;
        if ((bucket.getKeyValue() == null) ^ (getKeyValue() == null)) {
            return false;
        }
        if (bucket.getKeyValue() != null && !bucket.getKeyValue().equals(getKeyValue())) {
            return false;
        }
        if ((bucket.getCount() == null) ^ (getCount() == null)) {
            return false;
        }
        return bucket.getCount() == null || bucket.getCount().equals(getCount());
    }

    public Integer getCount() {
        return this.count;
    }

    public String getKeyValue() {
        return this.keyValue;
    }

    public int hashCode() {
        return (((getKeyValue() == null ? 0 : getKeyValue().hashCode()) + 31) * 31) + (getCount() != null ? getCount().hashCode() : 0);
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setKeyValue(String str) {
        this.keyValue = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getKeyValue() != null) {
            sb.append("keyValue: " + getKeyValue() + ",");
        }
        if (getCount() != null) {
            sb.append("count: " + getCount());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public Bucket withCount(Integer num) {
        this.count = num;
        return this;
    }

    public Bucket withKeyValue(String str) {
        this.keyValue = str;
        return this;
    }
}
