package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UploadCancellationSource;", "", "<init>", "(Ljava/lang/String;I)V", "STOP_BUTTON", "WAKE_WORD", "THUMBNAIL_CANCEL_BUTTON", "CONVERSATION_NAVIGATE_AWAY", "SUPERSEDED_BY_NEW_SEND", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class UploadCancellationSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UploadCancellationSource[] $VALUES;
    public static final UploadCancellationSource STOP_BUTTON = new UploadCancellationSource("STOP_BUTTON", 0);
    public static final UploadCancellationSource WAKE_WORD = new UploadCancellationSource("WAKE_WORD", 1);
    public static final UploadCancellationSource THUMBNAIL_CANCEL_BUTTON = new UploadCancellationSource("THUMBNAIL_CANCEL_BUTTON", 2);
    public static final UploadCancellationSource CONVERSATION_NAVIGATE_AWAY = new UploadCancellationSource("CONVERSATION_NAVIGATE_AWAY", 3);
    public static final UploadCancellationSource SUPERSEDED_BY_NEW_SEND = new UploadCancellationSource("SUPERSEDED_BY_NEW_SEND", 4);

    private static final /* synthetic */ UploadCancellationSource[] $values() {
        return new UploadCancellationSource[]{STOP_BUTTON, WAKE_WORD, THUMBNAIL_CANCEL_BUTTON, CONVERSATION_NAVIGATE_AWAY, SUPERSEDED_BY_NEW_SEND};
    }

    static {
        UploadCancellationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private UploadCancellationSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<UploadCancellationSource> getEntries() {
        return $ENTRIES;
    }

    public static UploadCancellationSource valueOf(String str) {
        return (UploadCancellationSource) Enum.valueOf(UploadCancellationSource.class, str);
    }

    public static UploadCancellationSource[] values() {
        return (UploadCancellationSource[]) $VALUES.clone();
    }
}
