package com.amazon.alexa.mobile.assistant.capabilities.iocomponents;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/iocomponents/VoiceApp;", "", "<init>", "(Ljava/lang/String;I)V", "QUEBEC", "MIKE", "METRO", "FOXTROT", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceApp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceApp[] $VALUES;
    public static final VoiceApp QUEBEC = new VoiceApp("QUEBEC", 0);
    public static final VoiceApp MIKE = new VoiceApp("MIKE", 1);
    public static final VoiceApp METRO = new VoiceApp("METRO", 2);
    public static final VoiceApp FOXTROT = new VoiceApp("FOXTROT", 3);

    private static final /* synthetic */ VoiceApp[] $values() {
        return new VoiceApp[]{QUEBEC, MIKE, METRO, FOXTROT};
    }

    static {
        VoiceApp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceApp(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceApp> getEntries() {
        return $ENTRIES;
    }

    public static VoiceApp valueOf(String str) {
        return (VoiceApp) Enum.valueOf(VoiceApp.class, str);
    }

    public static VoiceApp[] values() {
        return (VoiceApp[]) $VALUES.clone();
    }
}
