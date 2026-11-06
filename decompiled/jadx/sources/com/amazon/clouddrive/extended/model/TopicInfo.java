package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TopicInfo implements Comparable<TopicInfo> {
    private final String nodeType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String nodeType;

        public TopicInfo build() {
            return new TopicInfo(this.nodeType);
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("Builder{nodeType='"), this.nodeType, "'}");
        }

        public Builder withNodeType(String str) {
            this.nodeType = str;
            return this;
        }
    }

    public TopicInfo(String str) {
        this.nodeType = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(TopicInfo topicInfo) {
        int compare;
        if (topicInfo == null) {
            return -1;
        }
        if (topicInfo == this || (compare = ObjectComparator.compare(getNodeType(), topicInfo.getNodeType())) == 0) {
            return 0;
        }
        return compare;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TopicInfo) && compareTo((TopicInfo) obj) == 0;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public int hashCode() {
        if (getNodeType() != null) {
            return getNodeType().hashCode();
        }
        return 0;
    }
}
