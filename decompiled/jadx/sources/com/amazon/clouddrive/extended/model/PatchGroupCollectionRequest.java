package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveRequest;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class PatchGroupCollectionRequest implements CloudDriveRequest {
    private final String caption;
    private final String collectionId;
    private final String groupId;
    private final String lang;
    private final String name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PatchGroupCollectionRequestBuilder {
        private String caption;
        private String collectionId;
        private String groupId;
        private String lang;
        private String name;

        public PatchGroupCollectionRequest build() {
            return new PatchGroupCollectionRequest(this.name, this.caption, this.collectionId, this.groupId, this.lang);
        }

        public PatchGroupCollectionRequestBuilder caption(String str) {
            this.caption = str;
            return this;
        }

        public PatchGroupCollectionRequestBuilder collectionId(String str) {
            this.collectionId = str;
            return this;
        }

        public PatchGroupCollectionRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public PatchGroupCollectionRequestBuilder lang(String str) {
            this.lang = str;
            return this;
        }

        public PatchGroupCollectionRequestBuilder name(String str) {
            this.name = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PatchGroupCollectionRequest.PatchGroupCollectionRequestBuilder(name=");
            sb.append(this.name);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", collectionId=");
            sb.append(this.collectionId);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", lang=");
            return a$$ExternalSyntheticOutline0.m(sb, this.lang, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public PatchGroupCollectionRequest(String str, String str2, String str3, String str4, String str5) {
        this.name = str;
        this.caption = str2;
        this.collectionId = str3;
        this.groupId = str4;
        this.lang = str5;
    }

    public static PatchGroupCollectionRequestBuilder builder() {
        return new PatchGroupCollectionRequestBuilder();
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest instanceof PatchGroupCollectionRequest) {
            return cloudDriveRequest.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PatchGroupCollectionRequest)) {
            return false;
        }
        PatchGroupCollectionRequest patchGroupCollectionRequest = (PatchGroupCollectionRequest) obj;
        String name = getName();
        String name2 = patchGroupCollectionRequest.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String caption = getCaption();
        String caption2 = patchGroupCollectionRequest.getCaption();
        if (caption != null ? !caption.equals(caption2) : caption2 != null) {
            return false;
        }
        String collectionId = getCollectionId();
        String collectionId2 = patchGroupCollectionRequest.getCollectionId();
        if (collectionId != null ? !collectionId.equals(collectionId2) : collectionId2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = patchGroupCollectionRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = patchGroupCollectionRequest.getLang();
        return lang != null ? lang.equals(lang2) : lang2 == null;
    }

    public String getCaption() {
        return this.caption;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLang() {
        return this.lang;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String name = getName();
        int hashCode = name == null ? 43 : name.hashCode();
        String caption = getCaption();
        int hashCode2 = ((hashCode + 59) * 59) + (caption == null ? 43 : caption.hashCode());
        String collectionId = getCollectionId();
        int hashCode3 = (hashCode2 * 59) + (collectionId == null ? 43 : collectionId.hashCode());
        String groupId = getGroupId();
        int i = hashCode3 * 59;
        int hashCode4 = groupId == null ? 43 : groupId.hashCode();
        String lang = getLang();
        return ((i + hashCode4) * 59) + (lang != null ? lang.hashCode() : 43);
    }

    public String toString() {
        return "PatchGroupCollectionRequest(name=" + getName() + ", caption=" + getCaption() + ", collectionId=" + getCollectionId() + ", groupId=" + getGroupId() + ", lang=" + getLang() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
