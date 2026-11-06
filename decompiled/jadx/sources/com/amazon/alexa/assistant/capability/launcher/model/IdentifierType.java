package com.amazon.alexa.assistant.capability.launcher.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/model/IdentifierType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "URI_HTTP_SCHEME", "URI_CUSTOM_SCHEME", "URI_APP_IDENTIFIER_SCHEME", "URI_ANDROID_INTENT_SCHEME", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IdentifierType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdentifierType[] $VALUES;

    @NotNull
    private final String value;
    public static final IdentifierType URI_HTTP_SCHEME = new IdentifierType("URI_HTTP_SCHEME", 0, "URI_HTTP_SCHEME");
    public static final IdentifierType URI_CUSTOM_SCHEME = new IdentifierType("URI_CUSTOM_SCHEME", 1, "URI_CUSTOM_SCHEME");
    public static final IdentifierType URI_APP_IDENTIFIER_SCHEME = new IdentifierType("URI_APP_IDENTIFIER_SCHEME", 2, "URI_APP_IDENTIFIER_SCHEME");
    public static final IdentifierType URI_ANDROID_INTENT_SCHEME = new IdentifierType("URI_ANDROID_INTENT_SCHEME", 3, "URI_ANDROID_INTENT_SCHEME");

    private static final /* synthetic */ IdentifierType[] $values() {
        return new IdentifierType[]{URI_HTTP_SCHEME, URI_CUSTOM_SCHEME, URI_APP_IDENTIFIER_SCHEME, URI_ANDROID_INTENT_SCHEME};
    }

    static {
        IdentifierType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private IdentifierType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<IdentifierType> getEntries() {
        return $ENTRIES;
    }

    public static IdentifierType valueOf(String str) {
        return (IdentifierType) Enum.valueOf(IdentifierType.class, str);
    }

    public static IdentifierType[] values() {
        return (IdentifierType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
