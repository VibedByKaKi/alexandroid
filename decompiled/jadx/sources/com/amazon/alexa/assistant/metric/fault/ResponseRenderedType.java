package com.amazon.alexa.assistant.metric.fault;

import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/ResponseRenderedType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", SimbaEventProcessor.SOURCE_EMPTY, "LOCAL_HANDLED", "LOCAL_UNHANDLED", "LOCAL_RESPONSE", "PREAMBLE", "ANSWER_TRUNCATED", "ANSWER_COMPLETE", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResponseRenderedType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseRenderedType[] $VALUES;

    @NotNull
    private final String value;
    public static final ResponseRenderedType EMPTY = new ResponseRenderedType(SimbaEventProcessor.SOURCE_EMPTY, 0, "Empty");
    public static final ResponseRenderedType LOCAL_HANDLED = new ResponseRenderedType("LOCAL_HANDLED", 1, "Local.Handled");
    public static final ResponseRenderedType LOCAL_UNHANDLED = new ResponseRenderedType("LOCAL_UNHANDLED", 2, "Local.Unhandled");
    public static final ResponseRenderedType LOCAL_RESPONSE = new ResponseRenderedType("LOCAL_RESPONSE", 3, "Local.Response");
    public static final ResponseRenderedType PREAMBLE = new ResponseRenderedType("PREAMBLE", 4, "PreambleOnly");
    public static final ResponseRenderedType ANSWER_TRUNCATED = new ResponseRenderedType("ANSWER_TRUNCATED", 5, "TruncatedAnswer");
    public static final ResponseRenderedType ANSWER_COMPLETE = new ResponseRenderedType("ANSWER_COMPLETE", 6, "CompleteAnswer");

    private static final /* synthetic */ ResponseRenderedType[] $values() {
        return new ResponseRenderedType[]{EMPTY, LOCAL_HANDLED, LOCAL_UNHANDLED, LOCAL_RESPONSE, PREAMBLE, ANSWER_TRUNCATED, ANSWER_COMPLETE};
    }

    static {
        ResponseRenderedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ResponseRenderedType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ResponseRenderedType> getEntries() {
        return $ENTRIES;
    }

    public static ResponseRenderedType valueOf(String str) {
        return (ResponseRenderedType) Enum.valueOf(ResponseRenderedType.class, str);
    }

    public static ResponseRenderedType[] values() {
        return (ResponseRenderedType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
