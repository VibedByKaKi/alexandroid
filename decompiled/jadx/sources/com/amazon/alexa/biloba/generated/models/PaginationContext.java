package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PaginationContext {

    @SerializedName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)
    private String nextToken = null;

    @SerializedName("previousToken")
    private String previousToken = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PaginationContext paginationContext = (PaginationContext) obj;
            if (Objects.equals(this.nextToken, paginationContext.nextToken) && Objects.equals(this.previousToken, paginationContext.previousToken)) {
                return true;
            }
        }
        return false;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public String getPreviousToken() {
        return this.previousToken;
    }

    public int hashCode() {
        return Objects.hash(this.nextToken, this.previousToken);
    }

    public PaginationContext nextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public PaginationContext previousToken(String str) {
        this.previousToken = str;
        return this;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setPreviousToken(String str) {
        this.previousToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PaginationContext {\n    nextToken: ");
        sb.append(toIndentedString(this.nextToken));
        sb.append("\n    previousToken: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.previousToken), "\n}");
    }
}
