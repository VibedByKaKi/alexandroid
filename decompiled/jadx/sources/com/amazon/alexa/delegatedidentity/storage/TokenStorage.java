package com.amazon.alexa.delegatedidentity.storage;

import com.amazon.alexa.delegatedidentity.model.Token;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface TokenStorage {
    void cleanupTokens();

    Token getActorToken();

    Token getDelegatedToken();

    void putActorToken(Token token);

    void putDelegatedToken(Token token);
}
