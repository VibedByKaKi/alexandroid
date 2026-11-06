package com.amazon.alexa.accessory.frames.metrics.media;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/frames/metrics/media/VideoResolution;", "", "bucket", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getBucket", "()Ljava/lang/String;", "RES_720P", "RES_1080P", "RES_3K", "UNKNOWN", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VideoResolution {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoResolution[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String bucket;
    public static final VideoResolution RES_720P = new VideoResolution("RES_720P", 0, "720p");
    public static final VideoResolution RES_1080P = new VideoResolution("RES_1080P", 1, "1080p");
    public static final VideoResolution RES_3K = new VideoResolution("RES_3K", 2, "3k");
    public static final VideoResolution UNKNOWN = new VideoResolution("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ VideoResolution[] $values() {
        return new VideoResolution[]{RES_720P, RES_1080P, RES_3K, UNKNOWN};
    }

    static {
        VideoResolution[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private VideoResolution(String str, int i, String str2) {
        this.bucket = str2;
    }

    @JvmStatic
    @NotNull
    public static final VideoResolution from(int i, int i2) {
        return INSTANCE.from(i, i2);
    }

    @NotNull
    public static EnumEntries<VideoResolution> getEntries() {
        return $ENTRIES;
    }

    public static VideoResolution valueOf(String str) {
        return (VideoResolution) Enum.valueOf(VideoResolution.class, str);
    }

    public static VideoResolution[] values() {
        return (VideoResolution[]) $VALUES.clone();
    }

    @NotNull
    public final String getBucket() {
        return this.bucket;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/accessory/frames/metrics/media/VideoResolution$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/accessory/frames/metrics/media/VideoResolution;", "width", "", "height", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final VideoResolution from(int width, int height) {
            int min = Math.min(width, height);
            return (700 > min || min >= 781) ? (1000 > min || min >= 1101) ? (1680 > min || min >= 1781) ? VideoResolution.UNKNOWN : VideoResolution.RES_3K : VideoResolution.RES_1080P : VideoResolution.RES_720P;
        }

        private Companion() {
        }
    }
}
