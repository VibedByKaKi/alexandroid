package com.amazon.alexa.feedback.api;

import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/feedback/api/ContentType;", "", "(Ljava/lang/String;I)V", "IMAGE", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "VIDEO", "URL", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentType[] $VALUES;
    public static final ContentType IMAGE = new ContentType("IMAGE", 0);
    public static final ContentType TEXT = new ContentType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 1);
    public static final ContentType VIDEO = new ContentType("VIDEO", 2);
    public static final ContentType URL = new ContentType("URL", 3);

    private static final /* synthetic */ ContentType[] $values() {
        return new ContentType[]{IMAGE, TEXT, VIDEO, URL};
    }

    static {
        ContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ContentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ContentType> getEntries() {
        return $ENTRIES;
    }

    public static ContentType valueOf(String str) {
        return (ContentType) Enum.valueOf(ContentType.class, str);
    }

    public static ContentType[] values() {
        return (ContentType[]) $VALUES.clone();
    }
}
