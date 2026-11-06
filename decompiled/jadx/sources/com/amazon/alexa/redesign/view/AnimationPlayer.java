package com.amazon.alexa.redesign.view;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.redesign.entity.CardModel;
import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/view/AnimationPlayer;", "", "context", "Landroid/content/Context;", "fadeIn", "Landroid/view/animation/Animation;", "slideUp", "<init>", "(Landroid/content/Context;Landroid/view/animation/Animation;Landroid/view/animation/Animation;)V", "playAnimation", "", "cardModel", "Lcom/amazon/alexa/redesign/entity/CardModel;", "view", "Landroid/view/View;", "prepareAnimations", "selectAnimation", "isColdStart", "", "viewUpdateType", "", "shouldContentSlideUp", "shouldContentFadeIn", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AnimationPlayer {
    public static final int $stable = 8;

    @NotNull
    private final Animation fadeIn;

    @NotNull
    private final Animation slideUp;

    public /* synthetic */ AnimationPlayer(Context context, Animation animation, Animation animation2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? AnimationUtils.loadAnimation(context, R.anim.amahc_contents_fade_in) : animation, (i & 4) != 0 ? AnimationUtils.loadAnimation(context, R.anim.amahc_contents_slide_up) : animation2);
    }

    private final void prepareAnimations() {
        this.fadeIn.cancel();
        this.fadeIn.reset();
        this.slideUp.cancel();
        this.slideUp.reset();
    }

    private final void selectAnimation(boolean isColdStart, String viewUpdateType, View view) {
        if (shouldContentFadeIn(isColdStart, viewUpdateType)) {
            view.startAnimation(this.fadeIn);
        }
        if (shouldContentSlideUp(isColdStart, viewUpdateType)) {
            view.startAnimation(this.slideUp);
        }
    }

    private final boolean shouldContentFadeIn(boolean isColdStart, String viewUpdateType) {
        return isColdStart && Intrinsics.areEqual(viewUpdateType, Constants.VIEW_UPDATE_TYPE_CACHE);
    }

    private final boolean shouldContentSlideUp(boolean isColdStart, String viewUpdateType) {
        if (Intrinsics.areEqual(viewUpdateType, Constants.VIEW_UPDATE_TYPE_PULLREFRESH) || Intrinsics.areEqual(viewUpdateType, Constants.VIEW_UPDATE_TYPE_REFRESH_BUTTON)) {
            return true;
        }
        return Intrinsics.areEqual(viewUpdateType, Constants.VIEW_UPDATE_TYPE_CACHE) && !isColdStart;
    }

    public final void playAnimation(@Nullable CardModel cardModel, @NotNull View view) {
        view.getClass();
        prepareAnimations();
        if (cardModel != null) {
            selectAnimation(cardModel.getIsColdStart(), cardModel.getViewUpdateType(), view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimationPlayer(@NotNull Context context, @NotNull Animation animation) {
        this(context, animation, null, 4, null);
        context.getClass();
        animation.getClass();
    }

    @JvmOverloads
    public AnimationPlayer(@NotNull Context context, @NotNull Animation animation, @NotNull Animation animation2) {
        context.getClass();
        animation.getClass();
        animation2.getClass();
        this.fadeIn = animation;
        this.slideUp = animation2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimationPlayer(@NotNull Context context) {
        this(context, null, null, 6, null);
        context.getClass();
    }
}
