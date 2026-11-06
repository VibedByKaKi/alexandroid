package com.amazonaws.services.kms.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MultiRegionKey implements Serializable {
    private String arn;
    private String region;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MultiRegionKey)) {
            return false;
        }
        MultiRegionKey multiRegionKey = (MultiRegionKey) obj;
        if ((multiRegionKey.getArn() == null) ^ (getArn() == null)) {
            return false;
        }
        if (multiRegionKey.getArn() != null && !multiRegionKey.getArn().equals(getArn())) {
            return false;
        }
        if ((multiRegionKey.getRegion() == null) ^ (getRegion() == null)) {
            return false;
        }
        return multiRegionKey.getRegion() == null || multiRegionKey.getRegion().equals(getRegion());
    }

    public String getArn() {
        return this.arn;
    }

    public String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((getArn() == null ? 0 : getArn().hashCode()) + 31) * 31) + (getRegion() != null ? getRegion().hashCode() : 0);
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getArn() != null) {
            sb.append("Arn: " + getArn() + ",");
        }
        if (getRegion() != null) {
            sb.append("Region: " + getRegion());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public MultiRegionKey withArn(String str) {
        this.arn = str;
        return this;
    }

    public MultiRegionKey withRegion(String str) {
        this.region = str;
        return this;
    }
}
