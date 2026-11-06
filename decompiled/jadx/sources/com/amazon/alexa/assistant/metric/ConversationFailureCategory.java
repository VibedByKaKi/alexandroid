package com.amazon.alexa.assistant.metric;

import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import com.amazon.alexa.ra.core.data.model.TextFieldUploadManager;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/metric/ConversationFailureCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", TextFieldUploadManager.ERROR_CODE_NETWORK_ERROR, "SERVICE_ERROR", "AUTH_ERROR", "TIMEOUT_ERROR", "VALIDATION_ERROR", MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, "CLIENT_TIMEOUT_ERROR", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConversationFailureCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConversationFailureCategory[] $VALUES;

    @NotNull
    private final String value;
    public static final ConversationFailureCategory NETWORK_ERROR = new ConversationFailureCategory(TextFieldUploadManager.ERROR_CODE_NETWORK_ERROR, 0, TextFieldUploadManager.ERROR_CODE_NETWORK_ERROR);
    public static final ConversationFailureCategory SERVICE_ERROR = new ConversationFailureCategory("SERVICE_ERROR", 1, "SERVICE_ERROR");
    public static final ConversationFailureCategory AUTH_ERROR = new ConversationFailureCategory("AUTH_ERROR", 2, "AUTH_ERROR");
    public static final ConversationFailureCategory TIMEOUT_ERROR = new ConversationFailureCategory("TIMEOUT_ERROR", 3, "TIMEOUT_ERROR");
    public static final ConversationFailureCategory VALIDATION_ERROR = new ConversationFailureCategory("VALIDATION_ERROR", 4, "VALIDATION_ERROR");
    public static final ConversationFailureCategory UNKNOWN_ERROR = new ConversationFailureCategory(MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, 5, MetricsConstants.OperationalMetrics.UNKNOWN_ERROR);
    public static final ConversationFailureCategory CLIENT_TIMEOUT_ERROR = new ConversationFailureCategory("CLIENT_TIMEOUT_ERROR", 6, "CLIENT_TIMEOUT_ERROR");

    private static final /* synthetic */ ConversationFailureCategory[] $values() {
        return new ConversationFailureCategory[]{NETWORK_ERROR, SERVICE_ERROR, AUTH_ERROR, TIMEOUT_ERROR, VALIDATION_ERROR, UNKNOWN_ERROR, CLIENT_TIMEOUT_ERROR};
    }

    static {
        ConversationFailureCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ConversationFailureCategory(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ConversationFailureCategory> getEntries() {
        return $ENTRIES;
    }

    public static ConversationFailureCategory valueOf(String str) {
        return (ConversationFailureCategory) Enum.valueOf(ConversationFailureCategory.class, str);
    }

    public static ConversationFailureCategory[] values() {
        return (ConversationFailureCategory[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
