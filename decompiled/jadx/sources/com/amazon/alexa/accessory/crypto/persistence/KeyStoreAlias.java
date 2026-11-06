package com.amazon.alexa.accessory.crypto.persistence;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.google.common.base.Joiner;
import com.here.sdk.core.engine.UsageStats;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class KeyStoreAlias {
    private static final String SEPARATOR = "_";
    final String alias;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum KeyType {
        ROOT_WRAPPER("root-wrapper"),
        AUTHENTICATION_WRAPPER("authentication-wrapper"),
        DECRYPTION_WRAPPER("decryption-wrapper"),
        WRAPPER("wrapper"),
        AUTHENTICATION(UsageStats.MethodNames.AUTHENTICATION),
        DECRYPTION("decryption");

        private final String aliasForm;

        KeyType(String str) {
            this.aliasForm = str;
        }
    }

    public KeyStoreAlias(String str) {
        Preconditions.notEmpty(str, "rawValue");
        this.alias = str;
    }

    public static KeyStoreAlias composeFrom(String str, KeyType keyType, long j) {
        Preconditions.notNull(str, "accessoryId");
        Preconditions.notNull(keyType, "keyType");
        Preconditions.precondition(j > 0, "version");
        return new KeyStoreAlias(Joiner.on("_").join(str, keyType.aliasForm, Long.valueOf(j)));
    }
}
