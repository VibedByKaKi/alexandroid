package com.amazon.clouddrive.extended.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListReactionsResponse {
    private final int count;
    private final String nextToken;
    private final List<Reaction> reactions;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Integer count;
        private List<Reaction> reactions;
        private String token;

        public ListReactionsResponse build() {
            return new ListReactionsResponse(this.reactions, this.token, this.count.intValue());
        }

        public String toString() {
            return "Builder{token='" + this.token + "', reactions=" + this.reactions + ", count=" + this.count + AbstractJsonLexerKt.END_OBJ;
        }

        public Builder withCount(Integer num) {
            this.count = num;
            return this;
        }

        public Builder withReactions(List<Reaction> list) {
            this.reactions = list;
            return this;
        }

        public Builder withToken(String str) {
            this.token = str;
            return this;
        }
    }

    public ListReactionsResponse(List<Reaction> list, String str, int i) {
        this.nextToken = str;
        this.reactions = list;
        this.count = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListReactionsResponse)) {
            return false;
        }
        ListReactionsResponse listReactionsResponse = (ListReactionsResponse) obj;
        if (getCount() != null ? getCount().equals(listReactionsResponse.getCount()) : listReactionsResponse.getCount() == null) {
            String str = this.nextToken;
            String str2 = listReactionsResponse.nextToken;
            if (str == null ? str2 == null : str.equals(str2)) {
                if (getReactions() == null ? listReactionsResponse.getReactions() == null : getReactions().equals(listReactionsResponse.getReactions())) {
                    return true;
                }
            }
        }
        return false;
    }

    public Integer getCount() {
        return Integer.valueOf(this.count);
    }

    public List<Reaction> getReactions() {
        return this.reactions;
    }

    public String getToken() {
        return this.nextToken;
    }

    public int hashCode() {
        String str = this.nextToken;
        return getCount().intValue() + ((((str != null ? str.hashCode() : 0) * 31) + (getReactions() != null ? getReactions().hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ListReactionsResponse{nextToken='");
        sb.append(this.nextToken);
        sb.append("', reactions=");
        sb.append(this.reactions);
        sb.append(", count=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.count, AbstractJsonLexerKt.END_OBJ);
    }
}
