package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.alexa.biloba.view.dashboard.CardTransformer$$ExternalSyntheticLambda5;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.voice.ui.onedesign.remarkable.metrics.RemarkableAlexaSheetUiEvent;
import com.amazon.alexa.voice.ui.onedesign.util.FontUtils;
import com.amazon.alexa.voice.ui.tta.metrics.TtaEventSender;
import com.amazon.alexa.vox.ui.onedesign.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FeedbackComponent {
    public static final int FEEDBACK_LAYOUT_ID = View.generateViewId();
    private static final String TAG = "FeedbackComponent";
    private final TtaEventSender eventSender;
    private final Handler handler = new Handler(Looper.getMainLooper());

    public FeedbackComponent(TtaEventSender ttaEventSender) {
        this.eventSender = ttaEventSender;
    }

    private Animation createFeedbackIconAnimations(View view) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), R.anim.motion_easing_decelerate_fast);
        long integer = view.getContext().getResources().getInteger(R.integer.reveal_feedback_icon_animation_duration);
        long integer2 = view.getContext().getResources().getInteger(R.integer.reveal_feedback_delay_duration);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(integer);
        scaleAnimation.setStartOffset(integer2);
        scaleAnimation.setInterpolator(loadInterpolator);
        return scaleAnimation;
    }

    private AnimationSet createFeedbackMenuAnimations(View view) {
        long integer = view.getContext().getResources().getInteger(R.integer.reveal_feedback_menu_animation_duration);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(view.getContext(), R.anim.motion_easing_decelerate_fast);
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(view.getContext(), R.anim.motion_easing_decelerate_fast);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(integer);
        scaleAnimation.setInterpolator(loadInterpolator);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(loadInterpolator2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private Animation createFeedbackTextAnimations(Context context) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.vox_motion_easing_linear);
        long integer = context.getResources().getInteger(R.integer.reveal_feedback_text_animation_duration);
        long integer2 = context.getResources().getInteger(R.integer.reveal_feedback_delay_duration);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(loadInterpolator);
        alphaAnimation.setDuration(integer);
        alphaAnimation.setStartOffset(integer2);
        alphaAnimation.setInterpolator(loadInterpolator);
        return alphaAnimation;
    }

    private void feedbackRequestOnClickAnimation(Context context, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, FeedbackItem feedbackItem) {
        if (textView.getText().toString().equals(context.getString(feedbackItem.textId))) {
            textView.setText(feedbackItem.selectedTextId);
        }
        long integer = context.getResources().getInteger(R.integer.dismiss_copy_menu_animation_delay);
        long integer2 = context.getResources().getInteger(R.integer.dismiss_feedback_menu_icons_animation_duration);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.motion_easing_accelerate);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(integer2);
        scaleAnimation.setStartOffset(integer);
        scaleAnimation.setInterpolator(loadInterpolator);
        scaleAnimation.setAnimationListener(new AnonymousClass4(linearLayout2));
        linearLayout.startAnimation(scaleAnimation);
    }

    private AnimationSet getAnimationSetForDismissIcons(Context context) {
        long integer = context.getResources().getInteger(R.integer.dismiss_feedback_menu_icons_animation_duration);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.motion_easing_accelerate);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(integer);
        scaleAnimation.setInterpolator(loadInterpolator);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private AnimationSet getAnimationSetForDismissMenu(Context context) {
        long integer = context.getResources().getInteger(R.integer.dismiss_feedback_menu_animation_duration);
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.motion_easing_accelerate);
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.anim.vox_motion_easing_linear);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(integer);
        scaleAnimation.setInterpolator(loadInterpolator);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(loadInterpolator2);
        alphaAnimation.setDuration(integer);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    private GradientDrawable getBackgroundDrawable(Resources resources) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(resources.getColor(R.color.card_background_gray));
        gradientDrawable.setStroke((int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_background_stroke), resources.getColor(R.color.card_border_gray));
        gradientDrawable.setCornerRadius((int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_background_radius));
        return gradientDrawable;
    }

    private LinearLayout.LayoutParams getLayoutParamsForIcon(List<FeedbackItem> list, FeedbackItem feedbackItem, Resources resources) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimension = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_left);
        int dimension2 = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_top_bottom);
        int i = 0;
        if (list.indexOf(feedbackItem) == 0) {
            dimension = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_most_left);
        } else if (list.indexOf(feedbackItem) == list.size() - 1) {
            i = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_right);
        }
        if (list.size() == 1) {
            dimension = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_request_margin_left);
            i = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_request_icon_margin_right);
        }
        layoutParams.setMargins(dimension, dimension2, i, dimension2);
        return layoutParams;
    }

    private LinearLayout.LayoutParams getLayoutParamsForText(Resources resources) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int dimension = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_request_text_margin_right);
        int dimension2 = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_top_bottom);
        layoutParams.setMargins(0, dimension2, dimension, dimension2);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$create$0(FeedbackItem feedbackItem) {
        try {
            feedbackItem.onClick.call();
        } catch (Exception e) {
            Log.e(TAG, "create: unable to click feedbackItem with type " + feedbackItem.type, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$1(FeedbackItem feedbackItem, Context context, LinearLayout linearLayout, View view) {
        sendFeedbackOptionMetrics(feedbackItem.type);
        removeWithAnimation(context, linearLayout, new FeedbackComponent$$ExternalSyntheticLambda1(feedbackItem, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$create$2(FeedbackItem feedbackItem, Context context, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, View view) {
        sendFeedbackOptionMetrics(feedbackItem.type);
        feedbackRequestOnClickAnimation(context, linearLayout, textView, linearLayout2, feedbackItem);
        try {
            feedbackItem.onClick.call();
        } catch (Exception e) {
            Log.e(TAG, "create: unable to click feedbackItem with type " + feedbackItem.type, e);
        }
    }

    private void sendFeedbackOptionMetrics(int i) {
        if (i == 1) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_RESPONSE_LIKED);
            return;
        }
        if (i == 2) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_RESPONSE_DISLIKED);
        } else if (i == 3) {
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_RESPONSE_COPIED);
        } else {
            if (i != 4) {
                return;
            }
            this.eventSender.sendEvent(RemarkableAlexaSheetUiEvent.RA_RESPONSE_SHARED);
        }
    }

    private void setAnimationForFeedbackIcon(View view, final ImageView imageView) {
        final Animation createFeedbackIconAnimations = createFeedbackIconAnimations(view);
        imageView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent.3
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                imageView.startAnimation(createFeedbackIconAnimations);
                return true;
            }
        });
    }

    private void setAnimationForFeedbackMenu(View view, final LinearLayout linearLayout) {
        final AnimationSet createFeedbackMenuAnimations = createFeedbackMenuAnimations(view);
        linearLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                linearLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                linearLayout.startAnimation(createFeedbackMenuAnimations);
                return true;
            }
        });
    }

    private void setAnimationForFeedbackText(Context context, final TextView textView) {
        final Animation createFeedbackTextAnimations = createFeedbackTextAnimations(context);
        textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent.5
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                textView.getViewTreeObserver().removeOnPreDrawListener(this);
                textView.startAnimation(createFeedbackTextAnimations);
                return true;
            }
        });
    }

    private void startAnimationForFeedbackIcons(LinearLayout linearLayout, Context context) {
        AnimationSet animationSetForDismissIcons = getAnimationSetForDismissIcons(context);
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof ImageView) {
                childAt.startAnimation(animationSetForDismissIcons);
            }
        }
    }

    public LinearLayout create(List<FeedbackItem> list, View view, LinearLayout linearLayout, String str) {
        Context context = view.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("remarkable_alexa_feedback", 0);
        Resources resources = context.getResources();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(getBackgroundDrawable(resources));
        for (FeedbackItem feedbackItem : list) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(feedbackItem.imageId);
            if (sharedPreferences.getInt(str, -1) == feedbackItem.type) {
                imageView.setColorFilter(resources.getColor(R.color.feedback_button_selected_color));
            } else {
                imageView.setColorFilter(resources.getColor(R.color.Icon100));
            }
            if (feedbackItem.description != null) {
                imageView.setContentDescription(feedbackItem.description);
            }
            imageView.setOnClickListener(new CardTransformer$$ExternalSyntheticLambda5(1, this, feedbackItem, context, linearLayout));
            setAnimationForFeedbackIcon(view, imageView);
            imageView.setLayoutParams(getLayoutParamsForIcon(list, feedbackItem, resources));
            linearLayout2.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_bottom));
        linearLayout2.setLayoutParams(layoutParams);
        setAnimationForFeedbackMenu(view, linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(view.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout3.addView(linearLayout2);
        linearLayout3.setId(FEEDBACK_LAYOUT_ID);
        return linearLayout3;
    }

    public void removeWithAnimation(Context context, LinearLayout linearLayout, Runnable runnable) {
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
        AnimationSet animationSetForDismissMenu = getAnimationSetForDismissMenu(context);
        linearLayout2.getId();
        linearLayout.getId();
        animationSetForDismissMenu.setAnimationListener(new AnonymousClass1(linearLayout, runnable));
        startAnimationForFeedbackIcons(linearLayout2, context);
        linearLayout2.startAnimation(animationSetForDismissMenu);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FeedbackItem {
        private final String description;
        private final int imageId;
        private final Callable<Void> onClick;
        private final int selectedTextId;
        private final int textId;
        private final int type;

        public FeedbackItem(int i, int i2, int i3, int i4, String str, Callable<Void> callable) {
            this.type = i;
            this.imageId = i2;
            this.textId = i3;
            this.selectedTextId = i4;
            this.description = str;
            this.onClick = callable;
        }

        public FeedbackItem(int i, int i2, Callable<Void> callable, String str) {
            this(i, i2, 0, 0, str, callable);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent$1, reason: invalid class name */
    public class AnonymousClass1 implements Animation.AnimationListener {
        final /* synthetic */ Runnable val$callback;
        final /* synthetic */ LinearLayout val$parentView;

        public AnonymousClass1(LinearLayout linearLayout, Runnable runnable) {
            this.val$parentView = linearLayout;
            this.val$callback = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onAnimationEnd$0(LinearLayout linearLayout, Runnable runnable) {
            linearLayout.removeViewAt(0);
            if (runnable != null) {
                linearLayout.post(runnable);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FeedbackComponent.this.handler.post(new EducationComponent$$ExternalSyntheticLambda2(this.val$parentView, 1, this.val$callback));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent$4, reason: invalid class name */
    public class AnonymousClass4 implements Animation.AnimationListener {
        final /* synthetic */ LinearLayout val$parentView;

        public AnonymousClass4(LinearLayout linearLayout) {
            this.val$parentView = linearLayout;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FeedbackComponent.this.handler.post(new FeedbackComponent$$ExternalSyntheticLambda1(this.val$parentView, 1));
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void removeWithAnimation(View view, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        removeWithAnimation(view.getContext(), linearLayout, null);
    }

    public LinearLayout create(final FeedbackItem feedbackItem, View view, final LinearLayout linearLayout) {
        final Context context = view.getContext();
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin_top_bottom);
        int dimension2 = (int) resources.getDimension(R.dimen.remarkable_alexa_feedback_layout_margin);
        LinearLayout.LayoutParams layoutParamsForText = getLayoutParamsForText(resources);
        LinearLayout.LayoutParams layoutParamsForIcon = getLayoutParamsForIcon(Arrays.asList(feedbackItem), feedbackItem, resources);
        final LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(getBackgroundDrawable(resources));
        final TextView textView = new TextView(context);
        textView.setText(feedbackItem.textId);
        textView.setLayoutParams(layoutParamsForText);
        FontUtils.apply(Font.APP_DISPLAY_MEDIUM, textView);
        linearLayout2.addView(textView);
        setAnimationForFeedbackText(context, textView);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(feedbackItem.imageId);
        setAnimationForFeedbackIcon(view, imageView);
        imageView.setLayoutParams(layoutParamsForIcon);
        linearLayout2.addView(imageView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(dimension2, dimension2, dimension2, dimension);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeedbackComponent.this.lambda$create$2(feedbackItem, context, linearLayout2, textView, linearLayout, view2);
            }
        });
        LinearLayout linearLayout3 = new LinearLayout(view.getContext());
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout3.addView(linearLayout2);
        setAnimationForFeedbackMenu(view, linearLayout3);
        linearLayout3.setId(FEEDBACK_LAYOUT_ID);
        return linearLayout3;
    }
}
