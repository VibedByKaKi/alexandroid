package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CreateContactBlockResponse {
    private final String blockType;
    private final String customerId;
    private final String name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateContactBlockResponseBuilder {
        private String blockType;
        private String customerId;
        private String name;

        public CreateContactBlockResponseBuilder blockType(String str) {
            this.blockType = str;
            return this;
        }

        public CreateContactBlockResponse build() {
            return new CreateContactBlockResponse(this.customerId, this.blockType, this.name);
        }

        public CreateContactBlockResponseBuilder customerId(String str) {
            this.customerId = str;
            return this;
        }

        public CreateContactBlockResponseBuilder name(String str) {
            this.name = str;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CreateContactBlockResponse.CreateContactBlockResponseBuilder(customerId=");
            sb.append(this.customerId);
            sb.append(", blockType=");
            sb.append(this.blockType);
            sb.append(", name=");
            return a$$ExternalSyntheticOutline0.m(sb, this.name, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public CreateContactBlockResponse(String str, String str2, String str3) {
        this.customerId = str;
        this.blockType = str2;
        this.name = str3;
    }

    public static CreateContactBlockResponseBuilder builder() {
        return new CreateContactBlockResponseBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateContactBlockResponse)) {
            return false;
        }
        CreateContactBlockResponse createContactBlockResponse = (CreateContactBlockResponse) obj;
        String customerId = getCustomerId();
        String customerId2 = createContactBlockResponse.getCustomerId();
        if (customerId != null ? !customerId.equals(customerId2) : customerId2 != null) {
            return false;
        }
        String blockType = getBlockType();
        String blockType2 = createContactBlockResponse.getBlockType();
        if (blockType != null ? !blockType.equals(blockType2) : blockType2 != null) {
            return false;
        }
        String name = getName();
        String name2 = createContactBlockResponse.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public String getBlockType() {
        return this.blockType;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String customerId = getCustomerId();
        int hashCode = customerId == null ? 43 : customerId.hashCode();
        String blockType = getBlockType();
        int i = (hashCode + 59) * 59;
        int hashCode2 = blockType == null ? 43 : blockType.hashCode();
        String name = getName();
        return ((i + hashCode2) * 59) + (name != null ? name.hashCode() : 43);
    }

    public String toString() {
        return "CreateContactBlockResponse(customerId=" + getCustomerId() + ", blockType=" + getBlockType() + ", name=" + getName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
