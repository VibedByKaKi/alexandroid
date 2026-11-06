package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_APPEAR", "VIEW_DISAPPEAR", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ContentCaptureEventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES;
    public static final ContentCaptureEventType VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
    public static final ContentCaptureEventType VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);

    private static final /* synthetic */ ContentCaptureEventType[] $values() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    static {
        ContentCaptureEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ContentCaptureEventType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ContentCaptureEventType> getEntries() {
        return $ENTRIES;
    }

    public static ContentCaptureEventType valueOf(String str) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, str);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }
}
