package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CreateContactBlockRequest extends AccessTokenRequest {
    private final String blockType;
    private final String blockedCustomerId;
    private final String groupId;
    private final String lang;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateContactBlockRequestBuilder {
        private String blockType;
        private String blockedCustomerId;
        private String groupId;
        private String lang;

        public CreateContactBlockRequestBuilder blockType(String str) {
            this.blockType = str;
            return this;
        }

        public CreateContactBlockRequestBuilder blockedCustomerId(String str) {
            this.blockedCustomerId = str;
            return this;
        }

        public CreateContactBlockRequest build() {
            return new CreateContactBlockRequest(this.groupId, this.blockedCustomerId, this.blockType, this.lang);
        }

        public CreateContactBlockRequestBuilder groupId(String str) {
            this.groupId = str;
            return this;
        }

        public CreateContactBlockRequestBuilder lang(String str) {
            this.lang = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CreateContactBlockRequest.CreateContactBlockRequestBuilder(groupId=");
            sb.append(this.groupId);
            sb.append(", blockedCustomerId=");
            sb.append(this.blockedCustomerId);
            sb.append(", blockType=");
            sb.append(this.blockType);
            sb.append(", lang=");
            return a$$ExternalSyntheticOutline0.m(sb, this.lang, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public CreateContactBlockRequest(String str, String str2, String str3, String str4) {
        this.groupId = str;
        this.blockedCustomerId = str2;
        this.blockType = str3;
        this.lang = str4;
    }

    public static CreateContactBlockRequestBuilder builder() {
        return new CreateContactBlockRequestBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CreateContactBlockRequest;
    }

    @Override // com.amazon.clouddrive.extended.model.AccessTokenRequest
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateContactBlockRequest)) {
            return false;
        }
        CreateContactBlockRequest createContactBlockRequest = (CreateContactBlockRequest) obj;
        if (!createContactBlockRequest.canEqual(this)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = createContactBlockRequest.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String blockedCustomerId = getBlockedCustomerId();
        String blockedCustomerId2 = createContactBlockRequest.getBlockedCustomerId();
        if (blockedCustomerId != null ? !blockedCustomerId.equals(blockedCustomerId2) : blockedCustomerId2 != null) {
            return false;
        }
        String blockType = getBlockType();
        String blockType2 = createContactBlockRequest.getBlockType();
        if (blockType != null ? !blockType.equals(blockType2) : blockType2 != null) {
            return false;
        }
        String lang = getLang();
        String lang2 = createContactBlockRequest.getLang();
        return lang != null ? lang.equals(lang2) : lang2 == null;
    }

    public String getBlockType() {
        return this.blockType;
    }

    public String getBlockedCustomerId() {
        return this.blockedCustomerId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLang() {
        return this.lang;
    }

    @Override // com.amazon.clouddrive.extended.model.AccessTokenRequest
    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String blockedCustomerId = getBlockedCustomerId();
        int hashCode2 = ((hashCode + 59) * 59) + (blockedCustomerId == null ? 43 : blockedCustomerId.hashCode());
        String blockType = getBlockType();
        int i = hashCode2 * 59;
        int hashCode3 = blockType == null ? 43 : blockType.hashCode();
        String lang = getLang();
        return ((i + hashCode3) * 59) + (lang != null ? lang.hashCode() : 43);
    }

    public String toString() {
        return "CreateContactBlockRequest(groupId=" + getGroupId() + ", blockedCustomerId=" + getBlockedCustomerId() + ", blockType=" + getBlockType() + ", lang=" + getLang() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
