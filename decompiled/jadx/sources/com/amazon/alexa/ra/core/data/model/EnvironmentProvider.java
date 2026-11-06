package com.amazon.alexa.ra.core.data.model;

import android.os.Environment;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/EnvironmentProvider;", "", "picturesDirectory", "", "documentsDirectory", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPicturesDirectory", "()Ljava/lang/String;", "getDocumentsDirectory", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class EnvironmentProvider {
    public static final int $stable = 0;

    @NotNull
    private final String documentsDirectory;

    @NotNull
    private final String picturesDirectory;

    public /* synthetic */ EnvironmentProvider(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Environment.DIRECTORY_PICTURES : str, (i & 2) != 0 ? Environment.DIRECTORY_DOCUMENTS : str2);
    }

    public static /* synthetic */ EnvironmentProvider copy$default(EnvironmentProvider environmentProvider, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = environmentProvider.picturesDirectory;
        }
        if ((i & 2) != 0) {
            str2 = environmentProvider.documentsDirectory;
        }
        return environmentProvider.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPicturesDirectory() {
        return this.picturesDirectory;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDocumentsDirectory() {
        return this.documentsDirectory;
    }

    @NotNull
    public final EnvironmentProvider copy(@NotNull String picturesDirectory, @NotNull String documentsDirectory) {
        picturesDirectory.getClass();
        documentsDirectory.getClass();
        return new EnvironmentProvider(picturesDirectory, documentsDirectory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentProvider)) {
            return false;
        }
        EnvironmentProvider environmentProvider = (EnvironmentProvider) other;
        return Intrinsics.areEqual(this.picturesDirectory, environmentProvider.picturesDirectory) && Intrinsics.areEqual(this.documentsDirectory, environmentProvider.documentsDirectory);
    }

    @NotNull
    public final String getDocumentsDirectory() {
        return this.documentsDirectory;
    }

    @NotNull
    public final String getPicturesDirectory() {
        return this.picturesDirectory;
    }

    public int hashCode() {
        return this.documentsDirectory.hashCode() + (this.picturesDirectory.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("EnvironmentProvider(picturesDirectory=", this.picturesDirectory, ", documentsDirectory=", this.documentsDirectory, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public EnvironmentProvider(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.picturesDirectory = str;
        this.documentsDirectory = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnvironmentProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
