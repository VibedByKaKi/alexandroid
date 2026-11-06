package com.amazon.alexa.assistant.capability.launcher.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/model/LauncherEventOutcome;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TARGET_LAUNCHED", "PLATFORM_DETERMINED_TARGET_LAUNCHED", "NONE_LAUNCHED", "TARGET_NOT_LAUNCHED", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LauncherEventOutcome {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LauncherEventOutcome[] $VALUES;

    @NotNull
    private final String value;
    public static final LauncherEventOutcome TARGET_LAUNCHED = new LauncherEventOutcome("TARGET_LAUNCHED", 0, "TARGET_LAUNCHED");
    public static final LauncherEventOutcome PLATFORM_DETERMINED_TARGET_LAUNCHED = new LauncherEventOutcome("PLATFORM_DETERMINED_TARGET_LAUNCHED", 1, "PLATFORM_DETERMINED_TARGET_LAUNCHED");
    public static final LauncherEventOutcome NONE_LAUNCHED = new LauncherEventOutcome("NONE_LAUNCHED", 2, "NONE_LAUNCHED");
    public static final LauncherEventOutcome TARGET_NOT_LAUNCHED = new LauncherEventOutcome("TARGET_NOT_LAUNCHED", 3, "TARGET_NOT_LAUNCHED");

    private static final /* synthetic */ LauncherEventOutcome[] $values() {
        return new LauncherEventOutcome[]{TARGET_LAUNCHED, PLATFORM_DETERMINED_TARGET_LAUNCHED, NONE_LAUNCHED, TARGET_NOT_LAUNCHED};
    }

    static {
        LauncherEventOutcome[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LauncherEventOutcome(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<LauncherEventOutcome> getEntries() {
        return $ENTRIES;
    }

    public static LauncherEventOutcome valueOf(String str) {
        return (LauncherEventOutcome) Enum.valueOf(LauncherEventOutcome.class, str);
    }

    public static LauncherEventOutcome[] values() {
        return (LauncherEventOutcome[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
