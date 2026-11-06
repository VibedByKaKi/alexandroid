package com.amazon.alexa.delegatedidentity.model;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Token {
    private final Long expiry;
    private final TokenType type;
    private final String value;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Long expiry;
        private TokenType type;
        private String value;

        public Token build() {
            return new Token(this, 0);
        }

        public Builder withExpiry(Long l) {
            this.expiry = l;
            return this;
        }

        public Builder withType(TokenType tokenType) {
            this.type = tokenType;
            return this;
        }

        public Builder withValue(String str) {
            this.value = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TokenType {
        ACTOR,
        DELEGATION
    }

    private Token(Builder builder) {
        this.value = builder.value;
        this.type = builder.type;
        this.expiry = builder.expiry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Token.class == obj.getClass()) {
            Token token = (Token) obj;
            if (this.value.equals(token.value) && this.type == token.type) {
                return true;
            }
        }
        return false;
    }

    public Long getExpiry() {
        return this.expiry;
    }

    public TokenType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.value, this.type, this.expiry);
    }

    public /* synthetic */ Token(Builder builder, int i) {
        this(builder);
    }
}
