package com.amazon.alexa.redesign.compose.coachmark;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.routing.data.RouteName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/compose/coachmark/AnchorState;", "", "favorites", "Landroid/view/View;", RouteName.MENU, "voice", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "getFavorites", "()Landroid/view/View;", "getMenu", "getVoice", "allReady", "", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AnchorState {
    public static final int $stable = 8;

    @Nullable
    private final View favorites;

    @Nullable
    private final View menu;

    @Nullable
    private final View voice;

    public /* synthetic */ AnchorState(View view, View view2, View view3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : view, (i & 2) != 0 ? null : view2, (i & 4) != 0 ? null : view3);
    }

    public static /* synthetic */ AnchorState copy$default(AnchorState anchorState, View view, View view2, View view3, int i, Object obj) {
        if ((i & 1) != 0) {
            view = anchorState.favorites;
        }
        if ((i & 2) != 0) {
            view2 = anchorState.menu;
        }
        if ((i & 4) != 0) {
            view3 = anchorState.voice;
        }
        return anchorState.copy(view, view2, view3);
    }

    public final boolean allReady() {
        return (this.favorites == null || this.menu == null || this.voice == null) ? false : true;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final View getFavorites() {
        return this.favorites;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final View getMenu() {
        return this.menu;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final View getVoice() {
        return this.voice;
    }

    @NotNull
    public final AnchorState copy(@Nullable View favorites, @Nullable View menu, @Nullable View voice) {
        return new AnchorState(favorites, menu, voice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnchorState)) {
            return false;
        }
        AnchorState anchorState = (AnchorState) other;
        return Intrinsics.areEqual(this.favorites, anchorState.favorites) && Intrinsics.areEqual(this.menu, anchorState.menu) && Intrinsics.areEqual(this.voice, anchorState.voice);
    }

    @Nullable
    public final View getFavorites() {
        return this.favorites;
    }

    @Nullable
    public final View getMenu() {
        return this.menu;
    }

    @Nullable
    public final View getVoice() {
        return this.voice;
    }

    public int hashCode() {
        View view = this.favorites;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        View view2 = this.menu;
        int hashCode2 = (hashCode + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.voice;
        return hashCode2 + (view3 != null ? view3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnchorState(favorites=" + this.favorites + ", menu=" + this.menu + ", voice=" + this.voice + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public AnchorState(@Nullable View view, @Nullable View view2, @Nullable View view3) {
        this.favorites = view;
        this.menu = view2;
        this.voice = view3;
    }

    public AnchorState() {
        this(null, null, null, 7, null);
    }
}
