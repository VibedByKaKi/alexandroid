package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ThumbnailErrorState;", "", "errorMessage", "", "shouldShowRetryButton", "", "<init>", "(Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "getShouldShowRetryButton", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ThumbnailErrorState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThumbnailErrorState DEFAULT_THUMBNAIL_ERROR_STATE = new ThumbnailErrorState(0 == true ? 1 : 0, false, 3, 0 == true ? 1 : 0);

    @NotNull
    private final String errorMessage;
    private final boolean shouldShowRetryButton;

    public /* synthetic */ ThumbnailErrorState(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ ThumbnailErrorState copy$default(ThumbnailErrorState thumbnailErrorState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thumbnailErrorState.errorMessage;
        }
        if ((i & 2) != 0) {
            z = thumbnailErrorState.shouldShowRetryButton;
        }
        return thumbnailErrorState.copy(str, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowRetryButton() {
        return this.shouldShowRetryButton;
    }

    @NotNull
    public final ThumbnailErrorState copy(@NotNull String errorMessage, boolean shouldShowRetryButton) {
        errorMessage.getClass();
        return new ThumbnailErrorState(errorMessage, shouldShowRetryButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailErrorState)) {
            return false;
        }
        ThumbnailErrorState thumbnailErrorState = (ThumbnailErrorState) other;
        return Intrinsics.areEqual(this.errorMessage, thumbnailErrorState.errorMessage) && this.shouldShowRetryButton == thumbnailErrorState.shouldShowRetryButton;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getShouldShowRetryButton() {
        return this.shouldShowRetryButton;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowRetryButton) + (this.errorMessage.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("ThumbnailErrorState(errorMessage=", this.errorMessage, ", shouldShowRetryButton=", this.shouldShowRetryButton, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ThumbnailErrorState$Companion;", "", "<init>", "()V", "DEFAULT_THUMBNAIL_ERROR_STATE", "Lcom/amazon/alexa/ra/core/data/model/ThumbnailErrorState;", "getDEFAULT_THUMBNAIL_ERROR_STATE", "()Lcom/amazon/alexa/ra/core/data/model/ThumbnailErrorState;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ThumbnailErrorState getDEFAULT_THUMBNAIL_ERROR_STATE() {
            return ThumbnailErrorState.DEFAULT_THUMBNAIL_ERROR_STATE;
        }

        private Companion() {
        }
    }

    public ThumbnailErrorState(@NotNull String str, boolean z) {
        str.getClass();
        this.errorMessage = str;
        this.shouldShowRetryButton = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThumbnailErrorState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
