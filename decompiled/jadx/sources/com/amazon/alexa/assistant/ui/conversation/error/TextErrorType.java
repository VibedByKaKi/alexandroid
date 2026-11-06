package com.amazon.alexa.assistant.ui.conversation.error;

import androidx.annotation.StringRes;
import com.amazon.alexa.assistant.ui.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/error/TextErrorType;", "", "stringResId", "", "<init>", "(Ljava/lang/String;II)V", "getStringResId", "()I", "LOST_CONNECTION", "HTTP_ERROR", "SERVER_ISSUE", "DATA_PROCESSING_ISSUE", "IO_ERROR", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextErrorType[] $VALUES;
    private final int stringResId;
    public static final TextErrorType LOST_CONNECTION = new TextErrorType("LOST_CONNECTION", 0, R.string.TTA_error_lost_connection);
    public static final TextErrorType HTTP_ERROR = new TextErrorType("HTTP_ERROR", 1, R.string.TTA_error_http_error_issue);
    public static final TextErrorType SERVER_ISSUE = new TextErrorType("SERVER_ISSUE", 2, R.string.TTA_error_server_issue);
    public static final TextErrorType DATA_PROCESSING_ISSUE = new TextErrorType("DATA_PROCESSING_ISSUE", 3, R.string.TTA_error_data_processing_issue);
    public static final TextErrorType IO_ERROR = new TextErrorType("IO_ERROR", 4, R.string.TTA_error_IOError_issue);

    private static final /* synthetic */ TextErrorType[] $values() {
        return new TextErrorType[]{LOST_CONNECTION, HTTP_ERROR, SERVER_ISSUE, DATA_PROCESSING_ISSUE, IO_ERROR};
    }

    static {
        TextErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TextErrorType(@StringRes String str, int i, int i2) {
        this.stringResId = i2;
    }

    @NotNull
    public static EnumEntries<TextErrorType> getEntries() {
        return $ENTRIES;
    }

    public static TextErrorType valueOf(String str) {
        return (TextErrorType) Enum.valueOf(TextErrorType.class, str);
    }

    public static TextErrorType[] values() {
        return (TextErrorType[]) $VALUES.clone();
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}
