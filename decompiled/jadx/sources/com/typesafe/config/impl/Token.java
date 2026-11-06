package com.typesafe.config.impl;

import com.android.tools.r8.RecordTag;
import com.typesafe.config.ConfigOrigin;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Token {
    private final String debugString;
    private final ConfigOrigin origin;
    private final String tokenText;
    private final TokenType tokenType;

    public Token(TokenType tokenType, ConfigOrigin configOrigin, String str, String str2) {
        this.tokenType = tokenType;
        this.origin = configOrigin;
        this.debugString = str2;
        this.tokenText = str;
    }

    public static Token newWithoutOrigin(TokenType tokenType, String str, String str2) {
        return new Token(tokenType, null, str2, str);
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Token;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Token) && canEqual(obj) && this.tokenType == ((Token) obj).tokenType;
    }

    public int hashCode() {
        return this.tokenType.hashCode();
    }

    public final int lineNumber() {
        ConfigOrigin configOrigin = this.origin;
        if (configOrigin != null) {
            return configOrigin.lineNumber();
        }
        return -1;
    }

    public final ConfigOrigin origin() {
        ConfigOrigin configOrigin = this.origin;
        if (configOrigin != null) {
            return configOrigin;
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m(RecordTag.m("tried to get origin from token that doesn't have one: ", this));
        return null;
    }

    public String toString() {
        String str = this.debugString;
        return str != null ? str : this.tokenType.name();
    }

    public String tokenText() {
        return this.tokenText;
    }

    public final TokenType tokenType() {
        return this.tokenType;
    }

    public Token(TokenType tokenType, ConfigOrigin configOrigin, String str) {
        this(tokenType, configOrigin, str, null);
    }

    public Token(TokenType tokenType, ConfigOrigin configOrigin) {
        this(tokenType, configOrigin, null);
    }
}
