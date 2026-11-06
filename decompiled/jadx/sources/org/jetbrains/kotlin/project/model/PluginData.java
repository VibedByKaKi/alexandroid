package org.jetbrains.kotlin.project.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/jetbrains/kotlin/project/model/PluginData;", "", "pluginId", "", "artifact", "Lorg/jetbrains/kotlin/project/model/PluginData$ArtifactCoordinates;", "options", "", "Lorg/jetbrains/kotlin/project/model/PluginOption;", "(Ljava/lang/String;Lorg/jetbrains/kotlin/project/model/PluginData$ArtifactCoordinates;Ljava/util/List;)V", "getArtifact", "()Lorg/jetbrains/kotlin/project/model/PluginData$ArtifactCoordinates;", "getOptions", "()Ljava/util/List;", "getPluginId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ArtifactCoordinates", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PluginData {

    @NotNull
    private final ArtifactCoordinates artifact;

    @NotNull
    private final List<PluginOption> options;

    @NotNull
    private final String pluginId;

    /* JADX WARN: Multi-variable type inference failed */
    public PluginData(@NotNull String str, @NotNull ArtifactCoordinates artifactCoordinates, @NotNull List<? extends PluginOption> list) {
        str.getClass();
        artifactCoordinates.getClass();
        list.getClass();
        this.pluginId = str;
        this.artifact = artifactCoordinates;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginData copy$default(PluginData pluginData, String str, ArtifactCoordinates artifactCoordinates, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginData.pluginId;
        }
        if ((i & 2) != 0) {
            artifactCoordinates = pluginData.artifact;
        }
        if ((i & 4) != 0) {
            list = pluginData.options;
        }
        return pluginData.copy(str, artifactCoordinates, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPluginId() {
        return this.pluginId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ArtifactCoordinates getArtifact() {
        return this.artifact;
    }

    @NotNull
    public final List<PluginOption> component3() {
        return this.options;
    }

    @NotNull
    public final PluginData copy(@NotNull String pluginId, @NotNull ArtifactCoordinates artifact, @NotNull List<? extends PluginOption> options) {
        pluginId.getClass();
        artifact.getClass();
        options.getClass();
        return new PluginData(pluginId, artifact, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginData)) {
            return false;
        }
        PluginData pluginData = (PluginData) other;
        return Intrinsics.areEqual(this.pluginId, pluginData.pluginId) && Intrinsics.areEqual(this.artifact, pluginData.artifact) && Intrinsics.areEqual(this.options, pluginData.options);
    }

    @NotNull
    public final ArtifactCoordinates getArtifact() {
        return this.artifact;
    }

    @NotNull
    public final List<PluginOption> getOptions() {
        return this.options;
    }

    @NotNull
    public final String getPluginId() {
        return this.pluginId;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.artifact.hashCode() + (this.pluginId.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PluginData(pluginId=");
        sb.append(this.pluginId);
        sb.append(", artifact=");
        sb.append(this.artifact);
        sb.append(", options=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, (List) this.options, ')');
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlin/project/model/PluginData$ArtifactCoordinates;", "", "group", "", "artifact", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArtifact", "()Ljava/lang/String;", "getGroup", "getVersion", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "kotlin-project-model"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class ArtifactCoordinates {

        @NotNull
        private final String artifact;

        @NotNull
        private final String group;

        @Nullable
        private final String version;

        public ArtifactCoordinates(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            str.getClass();
            str2.getClass();
            this.group = str;
            this.artifact = str2;
            this.version = str3;
        }

        public static /* synthetic */ ArtifactCoordinates copy$default(ArtifactCoordinates artifactCoordinates, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = artifactCoordinates.group;
            }
            if ((i & 2) != 0) {
                str2 = artifactCoordinates.artifact;
            }
            if ((i & 4) != 0) {
                str3 = artifactCoordinates.version;
            }
            return artifactCoordinates.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getGroup() {
            return this.group;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getArtifact() {
            return this.artifact;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        public final ArtifactCoordinates copy(@NotNull String group, @NotNull String artifact, @Nullable String version) {
            group.getClass();
            artifact.getClass();
            return new ArtifactCoordinates(group, artifact, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ArtifactCoordinates)) {
                return false;
            }
            ArtifactCoordinates artifactCoordinates = (ArtifactCoordinates) other;
            return Intrinsics.areEqual(this.group, artifactCoordinates.group) && Intrinsics.areEqual(this.artifact, artifactCoordinates.artifact) && Intrinsics.areEqual(this.version, artifactCoordinates.version);
        }

        @NotNull
        public final String getArtifact() {
            return this.artifact;
        }

        @NotNull
        public final String getGroup() {
            return this.group;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            int m = ArcMode$$ExternalSyntheticOutline0.m(this.group.hashCode() * 31, 31, this.artifact);
            String str = this.version;
            return m + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ArtifactCoordinates(group=");
            sb.append(this.group);
            sb.append(", artifact=");
            sb.append(this.artifact);
            sb.append(", version=");
            return ArcMode$$ExternalSyntheticOutline0.m(')', this.version, sb);
        }

        public /* synthetic */ ArtifactCoordinates(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}
