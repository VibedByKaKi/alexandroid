package com.amazon.alexa.delegatedidentity.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface DelegatedTokenManagement {
    public static final String NO_DELEGATED_TOKEN = "";

    default String getDelegatedToken(String str, String str2, boolean z) {
        return "";
    }

    default void terminateDelegation(String str) {
    }

    default void initiateDelegation(String str, String str2) {
    }
}
