package com.amazon.alexa.assistant.metric.fault;

import com.amazon.alexa.aamb.AAMBMetrics;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/metric/fault/DialogStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "ABANDONED", "CANCEL", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DialogStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DialogStatus[] $VALUES;

    @NotNull
    private final String value;
    public static final DialogStatus SUCCESS = new DialogStatus("SUCCESS", 0, "Success");
    public static final DialogStatus FAILURE = new DialogStatus("FAILURE", 1, "Failure");
    public static final DialogStatus ABANDONED = new DialogStatus("ABANDONED", 2, UploadWorker.ABANDONED_PREFIX);
    public static final DialogStatus CANCEL = new DialogStatus("CANCEL", 3, AAMBMetrics.Button.CANCEL);

    private static final /* synthetic */ DialogStatus[] $values() {
        return new DialogStatus[]{SUCCESS, FAILURE, ABANDONED, CANCEL};
    }

    static {
        DialogStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DialogStatus(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<DialogStatus> getEntries() {
        return $ENTRIES;
    }

    public static DialogStatus valueOf(String str) {
        return (DialogStatus) Enum.valueOf(DialogStatus.class, str);
    }

    public static DialogStatus[] values() {
        return (DialogStatus[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
