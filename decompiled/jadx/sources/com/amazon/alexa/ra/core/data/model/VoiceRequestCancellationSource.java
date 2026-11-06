package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VoiceRequestCancellationSource;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_BUTTON", "SUPERSEDED_BY_NEW_SEND", "NONE", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceRequestCancellationSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VoiceRequestCancellationSource[] $VALUES;
    public static final VoiceRequestCancellationSource STOP_BUTTON = new VoiceRequestCancellationSource("STOP_BUTTON", 0);
    public static final VoiceRequestCancellationSource SUPERSEDED_BY_NEW_SEND = new VoiceRequestCancellationSource("SUPERSEDED_BY_NEW_SEND", 1);
    public static final VoiceRequestCancellationSource NONE = new VoiceRequestCancellationSource("NONE", 2);

    private static final /* synthetic */ VoiceRequestCancellationSource[] $values() {
        return new VoiceRequestCancellationSource[]{STOP_BUTTON, SUPERSEDED_BY_NEW_SEND, NONE};
    }

    static {
        VoiceRequestCancellationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VoiceRequestCancellationSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VoiceRequestCancellationSource> getEntries() {
        return $ENTRIES;
    }

    public static VoiceRequestCancellationSource valueOf(String str) {
        return (VoiceRequestCancellationSource) Enum.valueOf(VoiceRequestCancellationSource.class, str);
    }

    public static VoiceRequestCancellationSource[] values() {
        return (VoiceRequestCancellationSource[]) $VALUES.clone();
    }
}
