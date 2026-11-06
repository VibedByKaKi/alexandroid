package com.amazon.alexa.assistant.metric.fault;

import com.amazon.alexa.voice.tta.Constants;
import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/RenderInitiator;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "VOICE", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "TOUCH", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RenderInitiator {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderInitiator[] $VALUES;

    @NotNull
    private final String value;
    public static final RenderInitiator VOICE = new RenderInitiator("VOICE", 0, Constants.Telemetry.CallInitScreenNames.VOX);
    public static final RenderInitiator TEXT = new RenderInitiator(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 1, Constants.Namespaces.TEXT);
    public static final RenderInitiator TOUCH = new RenderInitiator("TOUCH", 2, "Touch");

    private static final /* synthetic */ RenderInitiator[] $values() {
        return new RenderInitiator[]{VOICE, TEXT, TOUCH};
    }

    static {
        RenderInitiator[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RenderInitiator(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<RenderInitiator> getEntries() {
        return $ENTRIES;
    }

    public static RenderInitiator valueOf(String str) {
        return (RenderInitiator) Enum.valueOf(RenderInitiator.class, str);
    }

    public static RenderInitiator[] values() {
        return (RenderInitiator[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
