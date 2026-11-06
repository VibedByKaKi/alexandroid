package com.amazon.alexa.assistant.ui.conversation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamMetricName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPENED", "CLOSED_SUCCESS", "CLOSED_CANCELLED", "CLOSED_ERROR", "CLOSED_LIFETIME_EXPIRED", "RESEND_NONSTREAMING", "KEEPALIVE_FAILED", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextStreamMetricName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextStreamMetricName[] $VALUES;

    @NotNull
    private final String value;
    public static final TextStreamMetricName OPENED = new TextStreamMetricName("OPENED", 0, "TEXTSTREAM_OPENED");
    public static final TextStreamMetricName CLOSED_SUCCESS = new TextStreamMetricName("CLOSED_SUCCESS", 1, "TEXTSTREAM_CLOSED_SUCCESS");
    public static final TextStreamMetricName CLOSED_CANCELLED = new TextStreamMetricName("CLOSED_CANCELLED", 2, "TEXTSTREAM_CLOSED_CANCELLED");
    public static final TextStreamMetricName CLOSED_ERROR = new TextStreamMetricName("CLOSED_ERROR", 3, "TEXTSTREAM_CLOSED_ERROR");
    public static final TextStreamMetricName CLOSED_LIFETIME_EXPIRED = new TextStreamMetricName("CLOSED_LIFETIME_EXPIRED", 4, "TEXTSTREAM_CLOSED_LIFETIME_EXPIRED");
    public static final TextStreamMetricName RESEND_NONSTREAMING = new TextStreamMetricName("RESEND_NONSTREAMING", 5, "TEXTSTREAM_RESEND_NONSTREAMING");
    public static final TextStreamMetricName KEEPALIVE_FAILED = new TextStreamMetricName("KEEPALIVE_FAILED", 6, "TEXTSTREAM_KEEPALIVE_FAILED");

    private static final /* synthetic */ TextStreamMetricName[] $values() {
        return new TextStreamMetricName[]{OPENED, CLOSED_SUCCESS, CLOSED_CANCELLED, CLOSED_ERROR, CLOSED_LIFETIME_EXPIRED, RESEND_NONSTREAMING, KEEPALIVE_FAILED};
    }

    static {
        TextStreamMetricName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TextStreamMetricName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<TextStreamMetricName> getEntries() {
        return $ENTRIES;
    }

    public static TextStreamMetricName valueOf(String str) {
        return (TextStreamMetricName) Enum.valueOf(TextStreamMetricName.class, str);
    }

    public static TextStreamMetricName[] values() {
        return (TextStreamMetricName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
