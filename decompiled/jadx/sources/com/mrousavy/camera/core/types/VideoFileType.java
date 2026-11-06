package com.mrousavy.camera.core.types;

import com.amazon.alexa.accessory.frames.http.HttpClientConstants;
import com.mrousavy.camera.core.InvalidTypeScriptUnionError;
import com.mrousavy.camera.core.types.JSUnionValue;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/mrousavy/camera/core/types/VideoFileType;", "Lcom/mrousavy/camera/core/types/JSUnionValue;", "", "unionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnionValue", "()Ljava/lang/String;", "MOV", "MP4", "toExtension", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VideoFileType implements JSUnionValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VideoFileType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final VideoFileType MOV = new VideoFileType("MOV", 0, "mov");
    public static final VideoFileType MP4 = new VideoFileType("MP4", 1, "mp4");

    @NotNull
    private final String unionValue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoFileType.values().length];
            try {
                iArr[VideoFileType.MOV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoFileType.MP4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ VideoFileType[] $values() {
        return new VideoFileType[]{MOV, MP4};
    }

    static {
        VideoFileType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private VideoFileType(String str, int i, String str2) {
        this.unionValue = str2;
    }

    @NotNull
    public static EnumEntries<VideoFileType> getEntries() {
        return $ENTRIES;
    }

    public static VideoFileType valueOf(String str) {
        return (VideoFileType) Enum.valueOf(VideoFileType.class, str);
    }

    public static VideoFileType[] values() {
        return (VideoFileType[]) $VALUES.clone();
    }

    @Override // com.mrousavy.camera.core.types.JSUnionValue
    @NotNull
    public String getUnionValue() {
        return this.unionValue;
    }

    @NotNull
    public final String toExtension() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ".mov";
        }
        if (i == 2) {
            return HttpClientConstants.VIDEO_EXTENSION;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/types/VideoFileType$Companion;", "Lcom/mrousavy/camera/core/types/JSUnionValue$Companion;", "Lcom/mrousavy/camera/core/types/VideoFileType;", "<init>", "()V", "fromUnionValue", "unionValue", "", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements JSUnionValue.Companion<VideoFileType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.mrousavy.camera.core.types.JSUnionValue.Companion
        @NotNull
        public VideoFileType fromUnionValue(@Nullable String unionValue) {
            if (Intrinsics.areEqual(unionValue, "mov")) {
                return VideoFileType.MOV;
            }
            if (Intrinsics.areEqual(unionValue, "mp4")) {
                return VideoFileType.MP4;
            }
            if (unionValue == null) {
                unionValue = "(null)";
            }
            throw new InvalidTypeScriptUnionError("fileType", unionValue);
        }

        private Companion() {
        }
    }
}
