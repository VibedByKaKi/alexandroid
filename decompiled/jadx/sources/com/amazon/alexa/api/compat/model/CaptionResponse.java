package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/api/compat/model/CaptionResponse;", "", "content", "", "type", "Lcom/amazon/alexa/api/compat/model/CaptionResponse$CaptionFormat;", "dialogRequestId", "metadata", "Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/CaptionResponse$CaptionFormat;Ljava/lang/String;Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;)V", "getContent", "()Ljava/lang/String;", "getType", "()Lcom/amazon/alexa/api/compat/model/CaptionResponse$CaptionFormat;", "getDialogRequestId", "getMetadata", "()Lcom/amazon/alexa/api/compat/model/TextResponseMetadata;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "CaptionFormat", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CaptionResponse {
    public static final int $stable = 0;

    @NotNull
    private final String content;

    @NotNull
    private final String dialogRequestId;

    @Nullable
    private final TextResponseMetadata metadata;

    @NotNull
    private final CaptionFormat type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/CaptionResponse$CaptionFormat;", "", "<init>", "(Ljava/lang/String;I)V", "WEBVTT", SurfaceWire.RENDER_TYPE_RAW, "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptionFormat {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CaptionFormat[] $VALUES;
        public static final CaptionFormat WEBVTT = new CaptionFormat("WEBVTT", 0);
        public static final CaptionFormat RAW = new CaptionFormat(SurfaceWire.RENDER_TYPE_RAW, 1);

        private static final /* synthetic */ CaptionFormat[] $values() {
            return new CaptionFormat[]{WEBVTT, RAW};
        }

        static {
            CaptionFormat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private CaptionFormat(String str, int i) {
        }

        @NotNull
        public static EnumEntries<CaptionFormat> getEntries() {
            return $ENTRIES;
        }

        public static CaptionFormat valueOf(String str) {
            return (CaptionFormat) Enum.valueOf(CaptionFormat.class, str);
        }

        public static CaptionFormat[] values() {
            return (CaptionFormat[]) $VALUES.clone();
        }
    }

    public CaptionResponse(@NotNull String str, @NotNull CaptionFormat captionFormat, @NotNull String str2, @Nullable TextResponseMetadata textResponseMetadata) {
        str.getClass();
        captionFormat.getClass();
        str2.getClass();
        this.content = str;
        this.type = captionFormat;
        this.dialogRequestId = str2;
        this.metadata = textResponseMetadata;
    }

    public static /* synthetic */ CaptionResponse copy$default(CaptionResponse captionResponse, String str, CaptionFormat captionFormat, String str2, TextResponseMetadata textResponseMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captionResponse.content;
        }
        if ((i & 2) != 0) {
            captionFormat = captionResponse.type;
        }
        if ((i & 4) != 0) {
            str2 = captionResponse.dialogRequestId;
        }
        if ((i & 8) != 0) {
            textResponseMetadata = captionResponse.metadata;
        }
        return captionResponse.copy(str, captionFormat, str2, textResponseMetadata);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaptionFormat getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CaptionResponse copy(@NotNull String content, @NotNull CaptionFormat type, @NotNull String dialogRequestId, @Nullable TextResponseMetadata metadata) {
        content.getClass();
        type.getClass();
        dialogRequestId.getClass();
        return new CaptionResponse(content, type, dialogRequestId, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptionResponse)) {
            return false;
        }
        CaptionResponse captionResponse = (CaptionResponse) other;
        return Intrinsics.areEqual(this.content, captionResponse.content) && this.type == captionResponse.type && Intrinsics.areEqual(this.dialogRequestId, captionResponse.dialogRequestId) && Intrinsics.areEqual(this.metadata, captionResponse.metadata);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    @Nullable
    public final TextResponseMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final CaptionFormat getType() {
        return this.type;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m((this.type.hashCode() + (this.content.hashCode() * 31)) * 31, 31, this.dialogRequestId);
        TextResponseMetadata textResponseMetadata = this.metadata;
        return m + (textResponseMetadata == null ? 0 : textResponseMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "CaptionResponse(content=" + this.content + ", type=" + this.type + ", dialogRequestId=" + this.dialogRequestId + ", metadata=" + this.metadata + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ CaptionResponse(String str, CaptionFormat captionFormat, String str2, TextResponseMetadata textResponseMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CaptionFormat.RAW : captionFormat, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : textResponseMetadata);
    }
}
