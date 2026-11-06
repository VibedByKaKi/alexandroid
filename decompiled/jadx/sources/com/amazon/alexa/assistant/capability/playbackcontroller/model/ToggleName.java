package com.amazon.alexa.assistant.capability.playbackcontroller.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/playbackcontroller/model/ToggleName;", "", "<init>", "(Ljava/lang/String;I)V", "SHUFFLE", "LOOP", "REPEAT", "THUMBSUP", "THUMBSDOWN", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ToggleName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ToggleName[] $VALUES;
    public static final ToggleName SHUFFLE = new ToggleName("SHUFFLE", 0);
    public static final ToggleName LOOP = new ToggleName("LOOP", 1);
    public static final ToggleName REPEAT = new ToggleName("REPEAT", 2);
    public static final ToggleName THUMBSUP = new ToggleName("THUMBSUP", 3);
    public static final ToggleName THUMBSDOWN = new ToggleName("THUMBSDOWN", 4);

    private static final /* synthetic */ ToggleName[] $values() {
        return new ToggleName[]{SHUFFLE, LOOP, REPEAT, THUMBSUP, THUMBSDOWN};
    }

    static {
        ToggleName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ToggleName(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ToggleName> getEntries() {
        return $ENTRIES;
    }

    public static ToggleName valueOf(String str) {
        return (ToggleName) Enum.valueOf(ToggleName.class, str);
    }

    public static ToggleName[] values() {
        return (ToggleName[]) $VALUES.clone();
    }
}
