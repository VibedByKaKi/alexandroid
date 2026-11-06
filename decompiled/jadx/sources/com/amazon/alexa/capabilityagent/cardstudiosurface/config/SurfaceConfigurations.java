package com.amazon.alexa.capabilityagent.cardstudiosurface.config;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/SurfaceConfigurations;", "", "supportedSurfaces", "", "Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/SupportedSurface;", "availableRenderTypes", "Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/AvailableRenderType;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSupportedSurfaces", "()Ljava/util/List;", "getAvailableRenderTypes", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SurfaceConfigurations {
    public static final int $stable = 8;

    @SerializedName("availableRenderTypes")
    @NotNull
    private final List<AvailableRenderType> availableRenderTypes;

    @SerializedName("supportedSurfaces")
    @NotNull
    private final List<SupportedSurface> supportedSurfaces;

    public SurfaceConfigurations(@NotNull List<SupportedSurface> list, @NotNull List<AvailableRenderType> list2) {
        list.getClass();
        list2.getClass();
        this.supportedSurfaces = list;
        this.availableRenderTypes = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurfaceConfigurations copy$default(SurfaceConfigurations surfaceConfigurations, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = surfaceConfigurations.supportedSurfaces;
        }
        if ((i & 2) != 0) {
            list2 = surfaceConfigurations.availableRenderTypes;
        }
        return surfaceConfigurations.copy(list, list2);
    }

    @NotNull
    public final List<SupportedSurface> component1() {
        return this.supportedSurfaces;
    }

    @NotNull
    public final List<AvailableRenderType> component2() {
        return this.availableRenderTypes;
    }

    @NotNull
    public final SurfaceConfigurations copy(@NotNull List<SupportedSurface> supportedSurfaces, @NotNull List<AvailableRenderType> availableRenderTypes) {
        supportedSurfaces.getClass();
        availableRenderTypes.getClass();
        return new SurfaceConfigurations(supportedSurfaces, availableRenderTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceConfigurations)) {
            return false;
        }
        SurfaceConfigurations surfaceConfigurations = (SurfaceConfigurations) other;
        return Intrinsics.areEqual(this.supportedSurfaces, surfaceConfigurations.supportedSurfaces) && Intrinsics.areEqual(this.availableRenderTypes, surfaceConfigurations.availableRenderTypes);
    }

    @NotNull
    public final List<AvailableRenderType> getAvailableRenderTypes() {
        return this.availableRenderTypes;
    }

    @NotNull
    public final List<SupportedSurface> getSupportedSurfaces() {
        return this.supportedSurfaces;
    }

    public int hashCode() {
        return this.availableRenderTypes.hashCode() + (this.supportedSurfaces.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SurfaceConfigurations(supportedSurfaces=" + this.supportedSurfaces + ", availableRenderTypes=" + this.availableRenderTypes + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
