package com.amazon.tarazed.annotations;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/annotations/AnnotationViewEvent;", "", "(Ljava/lang/String;I)V", "ANNOTATION_EVENT", "ANNOTATION_EVENT_HANDLED", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AnnotationViewEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationViewEvent[] $VALUES;
    public static final AnnotationViewEvent ANNOTATION_EVENT = new AnnotationViewEvent("ANNOTATION_EVENT", 0);
    public static final AnnotationViewEvent ANNOTATION_EVENT_HANDLED = new AnnotationViewEvent("ANNOTATION_EVENT_HANDLED", 1);

    private static final /* synthetic */ AnnotationViewEvent[] $values() {
        return new AnnotationViewEvent[]{ANNOTATION_EVENT, ANNOTATION_EVENT_HANDLED};
    }

    static {
        AnnotationViewEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AnnotationViewEvent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AnnotationViewEvent> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationViewEvent valueOf(String str) {
        return (AnnotationViewEvent) Enum.valueOf(AnnotationViewEvent.class, str);
    }

    public static AnnotationViewEvent[] values() {
        return (AnnotationViewEvent[]) $VALUES.clone();
    }
}
