package com.amazon.alexa.accessory.speechapi.vision;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureSource;", "", "type", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionSourceType;", "cameraCategory", "", "id", "(Lcom/amazon/alexa/accessory/speechapi/vision/VisionSourceType;Ljava/lang/String;Ljava/lang/String;)V", "getCameraCategory", "()Ljava/lang/String;", "getId", "getType", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionSourceType;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionCaptureSource {

    @Nullable
    private final String cameraCategory;

    @Nullable
    private final String id;

    @NotNull
    private final VisionSourceType type;

    public /* synthetic */ VisionCaptureSource(VisionSourceType visionSourceType, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(visionSourceType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ VisionCaptureSource copy$default(VisionCaptureSource visionCaptureSource, VisionSourceType visionSourceType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            visionSourceType = visionCaptureSource.type;
        }
        if ((i & 2) != 0) {
            str = visionCaptureSource.cameraCategory;
        }
        if ((i & 4) != 0) {
            str2 = visionCaptureSource.id;
        }
        return visionCaptureSource.copy(visionSourceType, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VisionSourceType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCameraCategory() {
        return this.cameraCategory;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final VisionCaptureSource copy(@NotNull VisionSourceType type, @Nullable String cameraCategory, @Nullable String id) {
        type.getClass();
        return new VisionCaptureSource(type, cameraCategory, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionCaptureSource)) {
            return false;
        }
        VisionCaptureSource visionCaptureSource = (VisionCaptureSource) other;
        return this.type == visionCaptureSource.type && Intrinsics.areEqual(this.cameraCategory, visionCaptureSource.cameraCategory) && Intrinsics.areEqual(this.id, visionCaptureSource.id);
    }

    @Nullable
    public final String getCameraCategory() {
        return this.cameraCategory;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final VisionSourceType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.cameraCategory;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        VisionSourceType visionSourceType = this.type;
        String str = this.cameraCategory;
        String str2 = this.id;
        StringBuilder sb = new StringBuilder("VisionCaptureSource(type=");
        sb.append(visionSourceType);
        sb.append(", cameraCategory=");
        sb.append(str);
        sb.append(", id=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public VisionCaptureSource(@NotNull VisionSourceType visionSourceType, @Nullable String str, @Nullable String str2) {
        visionSourceType.getClass();
        this.type = visionSourceType;
        this.cameraCategory = str;
        this.id = str2;
    }
}
