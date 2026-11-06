package com.amazon.alexa.capabilityagent.cardstudiosurface.config;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/AvailableRenderType;", "", "type", "", "version", FragmentData.FRAGMENT_VERSION, "supportedContentTypes", "", "Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/SmartFragmentContentType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getVersion", "getFragmentVersion", "getSupportedContentTypes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AvailableRenderType {

    @SerializedName(FragmentData.FRAGMENT_VERSION)
    @Nullable
    private final String fragmentVersion;

    @SerializedName("supportedContentTypes")
    @Nullable
    private final List<SmartFragmentContentType> supportedContentTypes;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("version")
    @Nullable
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AvailableRenderType(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableRenderType copy$default(AvailableRenderType availableRenderType, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = availableRenderType.type;
        }
        if ((i & 2) != 0) {
            str2 = availableRenderType.version;
        }
        if ((i & 4) != 0) {
            str3 = availableRenderType.fragmentVersion;
        }
        if ((i & 8) != 0) {
            list = availableRenderType.supportedContentTypes;
        }
        return availableRenderType.copy(str, str2, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFragmentVersion() {
        return this.fragmentVersion;
    }

    @Nullable
    public final List<SmartFragmentContentType> component4() {
        return this.supportedContentTypes;
    }

    @NotNull
    public final AvailableRenderType copy(@NotNull String type, @Nullable String version, @Nullable String fragmentVersion, @Nullable List<SmartFragmentContentType> supportedContentTypes) {
        type.getClass();
        return new AvailableRenderType(type, version, fragmentVersion, supportedContentTypes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableRenderType)) {
            return false;
        }
        AvailableRenderType availableRenderType = (AvailableRenderType) other;
        return Intrinsics.areEqual(this.type, availableRenderType.type) && Intrinsics.areEqual(this.version, availableRenderType.version) && Intrinsics.areEqual(this.fragmentVersion, availableRenderType.fragmentVersion) && Intrinsics.areEqual(this.supportedContentTypes, availableRenderType.supportedContentTypes);
    }

    @Nullable
    public final String getFragmentVersion() {
        return this.fragmentVersion;
    }

    @Nullable
    public final List<SmartFragmentContentType> getSupportedContentTypes() {
        return this.supportedContentTypes;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fragmentVersion;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SmartFragmentContentType> list = this.supportedContentTypes;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.version;
        String str3 = this.fragmentVersion;
        List<SmartFragmentContentType> list = this.supportedContentTypes;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("AvailableRenderType(type=", str, ", version=", str2, ", fragmentVersion=");
        m.append(str3);
        m.append(", supportedContentTypes=");
        m.append(list);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/AvailableRenderType$Companion;", "", "<init>", "()V", "raw", "Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/AvailableRenderType;", "version", "", "jsonSpec", "fragment", FragmentData.FRAGMENT_VERSION, "supportedContentTypes", "", "Lcom/amazon/alexa/capabilityagent/cardstudiosurface/config/SmartFragmentContentType;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvailableRenderType fragment(@NotNull String fragmentVersion, @NotNull List<SmartFragmentContentType> supportedContentTypes) {
            fragmentVersion.getClass();
            supportedContentTypes.getClass();
            return new AvailableRenderType(SurfaceWire.RENDER_TYPE_FRAGMENT, null, fragmentVersion, supportedContentTypes, 2, null);
        }

        @NotNull
        public final AvailableRenderType jsonSpec(@NotNull String version) {
            version.getClass();
            return new AvailableRenderType(SurfaceWire.RENDER_TYPE_JSON_SPEC, version, null, null, 12, null);
        }

        @NotNull
        public final AvailableRenderType raw(@NotNull String version) {
            version.getClass();
            return new AvailableRenderType(SurfaceWire.RENDER_TYPE_RAW, version, null, null, 12, null);
        }

        private Companion() {
        }
    }

    public AvailableRenderType(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable List<SmartFragmentContentType> list) {
        str.getClass();
        this.type = str;
        this.version = str2;
        this.fragmentVersion = str3;
        this.supportedContentTypes = list;
    }
}
