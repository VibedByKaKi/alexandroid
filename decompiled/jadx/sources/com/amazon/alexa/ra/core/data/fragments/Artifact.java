package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "", "filename", "", "variants", "", "Lcom/amazon/alexa/ra/core/data/fragments/ArtifactVariant;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFilename", "()Ljava/lang/String;", "getVariants", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Artifact {

    @NotNull
    public static final String FILE_NAME = "filename";

    @NotNull
    public static final String VARIANTS = "variants";

    @NotNull
    private final String filename;

    @NotNull
    private final List<ArtifactVariant> variants;
    public static final int $stable = 8;

    public /* synthetic */ Artifact(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Artifact copy$default(Artifact artifact, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifact.filename;
        }
        if ((i & 2) != 0) {
            list = artifact.variants;
        }
        return artifact.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final List<ArtifactVariant> component2() {
        return this.variants;
    }

    @NotNull
    public final Artifact copy(@NotNull String filename, @NotNull List<ArtifactVariant> variants) {
        filename.getClass();
        variants.getClass();
        return new Artifact(filename, variants);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Artifact)) {
            return false;
        }
        Artifact artifact = (Artifact) other;
        return Intrinsics.areEqual(this.filename, artifact.filename) && Intrinsics.areEqual(this.variants, artifact.variants);
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final List<ArtifactVariant> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return this.variants.hashCode() + (this.filename.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("Artifact(filename=", this.filename, ", variants=", (List) this.variants, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public Artifact(@NotNull String str, @NotNull List<ArtifactVariant> list) {
        str.getClass();
        list.getClass();
        this.filename = str;
        this.variants = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Artifact() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
