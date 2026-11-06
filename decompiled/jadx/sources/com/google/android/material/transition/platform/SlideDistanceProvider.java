package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {
    private static final int DEFAULT_DISTANCE = -1;

    @Px
    private int slideDistance = -1;
    private int slideEdge;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
        this.slideEdge = i;
    }

    private static Animator createTranslationAppearAnimator(View view, View view2, int i, @Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, i2 + translationX, translationX, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX - i2, translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY - i2, translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, i2 + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, isRtl(view) ? i2 + translationX : translationX - i2, translationX, translationX);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, isRtl(view) ? translationX - i2 : i2 + translationX, translationX, translationX);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid slide direction: "));
        return null;
    }

    private static Animator createTranslationDisappearAnimator(View view, View view2, int i, @Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return createTranslationXAnimator(view2, translationX, translationX - i2, translationX);
        }
        if (i == 5) {
            return createTranslationXAnimator(view2, translationX, i2 + translationX, translationX);
        }
        if (i == 48) {
            return createTranslationYAnimator(view2, translationY, i2 + translationY, translationY);
        }
        if (i == 80) {
            return createTranslationYAnimator(view2, translationY, translationY - i2, translationY);
        }
        if (i == 8388611) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? translationX - i2 : i2 + translationX, translationX);
        }
        if (i == 8388613) {
            return createTranslationXAnimator(view2, translationX, isRtl(view) ? i2 + translationX : translationX - i2, translationX);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid slide direction: "));
        return null;
    }

    private static Animator createTranslationXAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private static Animator createTranslationYAnimator(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    private int getSlideDistanceOrDefault(Context context) {
        int i = this.slideDistance;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean isRtl(View view) {
        return view.getLayoutDirection() == 1;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationAppearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return createTranslationDisappearAnimator(viewGroup, view, this.slideEdge, getSlideDistanceOrDefault(view.getContext()));
    }

    @Px
    public int getSlideDistance() {
        return this.slideDistance;
    }

    public int getSlideEdge() {
        return this.slideEdge;
    }

    public void setSlideDistance(@Px int i) {
        if (i >= 0) {
            this.slideDistance = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
    }

    public void setSlideEdge(int i) {
        this.slideEdge = i;
    }
}
