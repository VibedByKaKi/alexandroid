package com.amazon.alexa.ra.core.features.artifact;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.ArtifactUploadConfiguration;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkCommitOptions;", "", "attachArtifactFlags", "Lcom/amazon/alexa/ra/core/data/model/ArtifactUploadConfiguration;", "showLoadingIndicator", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/ArtifactUploadConfiguration;Z)V", "getAttachArtifactFlags", "()Lcom/amazon/alexa/ra/core/data/model/ArtifactUploadConfiguration;", "getShowLoadingIndicator", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SilkCommitOptions {
    public static final int $stable = 0;

    @NotNull
    private final ArtifactUploadConfiguration attachArtifactFlags;
    private final boolean showLoadingIndicator;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SilkCommitOptions TEXT_SEND = new SilkCommitOptions(new ArtifactUploadConfiguration(true, false, false, 6, null), false);

    @NotNull
    private static final SilkCommitOptions PILL = new SilkCommitOptions(new ArtifactUploadConfiguration(true, false, false, 6, null), true);

    public SilkCommitOptions(@NotNull ArtifactUploadConfiguration artifactUploadConfiguration, boolean z) {
        artifactUploadConfiguration.getClass();
        this.attachArtifactFlags = artifactUploadConfiguration;
        this.showLoadingIndicator = z;
    }

    public static /* synthetic */ SilkCommitOptions copy$default(SilkCommitOptions silkCommitOptions, ArtifactUploadConfiguration artifactUploadConfiguration, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            artifactUploadConfiguration = silkCommitOptions.attachArtifactFlags;
        }
        if ((i & 2) != 0) {
            z = silkCommitOptions.showLoadingIndicator;
        }
        return silkCommitOptions.copy(artifactUploadConfiguration, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ArtifactUploadConfiguration getAttachArtifactFlags() {
        return this.attachArtifactFlags;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoadingIndicator() {
        return this.showLoadingIndicator;
    }

    @NotNull
    public final SilkCommitOptions copy(@NotNull ArtifactUploadConfiguration attachArtifactFlags, boolean showLoadingIndicator) {
        attachArtifactFlags.getClass();
        return new SilkCommitOptions(attachArtifactFlags, showLoadingIndicator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SilkCommitOptions)) {
            return false;
        }
        SilkCommitOptions silkCommitOptions = (SilkCommitOptions) other;
        return Intrinsics.areEqual(this.attachArtifactFlags, silkCommitOptions.attachArtifactFlags) && this.showLoadingIndicator == silkCommitOptions.showLoadingIndicator;
    }

    @NotNull
    public final ArtifactUploadConfiguration getAttachArtifactFlags() {
        return this.attachArtifactFlags;
    }

    public final boolean getShowLoadingIndicator() {
        return this.showLoadingIndicator;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showLoadingIndicator) + (this.attachArtifactFlags.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SilkCommitOptions(attachArtifactFlags=" + this.attachArtifactFlags + ", showLoadingIndicator=" + this.showLoadingIndicator + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/features/artifact/SilkCommitOptions$Companion;", "", "<init>", "()V", "TEXT_SEND", "Lcom/amazon/alexa/ra/core/features/artifact/SilkCommitOptions;", "getTEXT_SEND", "()Lcom/amazon/alexa/ra/core/features/artifact/SilkCommitOptions;", SimbaEventProcessor.SOURCE_PILL, "getPILL", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SilkCommitOptions getPILL() {
            return SilkCommitOptions.PILL;
        }

        @NotNull
        public final SilkCommitOptions getTEXT_SEND() {
            return SilkCommitOptions.TEXT_SEND;
        }

        private Companion() {
        }
    }
}
