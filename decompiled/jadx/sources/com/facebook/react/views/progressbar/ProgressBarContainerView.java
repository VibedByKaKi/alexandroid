package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.facebook.react.R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.FeBlendView$$ExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\r\u0010\"\u001a\u00020\u001fH\u0000¢\u0006\u0002\b#J\u0017\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0002\b'J\u0010\u0010(\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/facebook/react/views/progressbar/ProgressBarContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "color", "", "getColor$ReactAndroid_release", "()Ljava/lang/Integer;", "setColor$ReactAndroid_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", ReactProgressBarViewManager.PROP_INDETERMINATE, "", "getIndeterminate$ReactAndroid_release", "()Z", "setIndeterminate$ReactAndroid_release", "(Z)V", ReactProgressBarViewManager.PROP_ANIMATING, "getAnimating$ReactAndroid_release", "setAnimating$ReactAndroid_release", "progress", "", "getProgress$ReactAndroid_release", "()D", "setProgress$ReactAndroid_release", "(D)V", "progressBar", "Landroid/widget/ProgressBar;", "onInitializeAccessibilityNodeInfo", "", LogLevel.INFO, "Landroid/view/accessibility/AccessibilityNodeInfo;", "apply", "apply$ReactAndroid_release", "setStyle", "styleName", "", "setStyle$ReactAndroid_release", "setColor", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressBarContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressBarContainerView.kt\ncom/facebook/react/views/progressbar/ProgressBarContainerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
/* loaded from: classes7.dex */
public final class ProgressBarContainerView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_PROGRESS = 1000;
    private boolean animating;

    @Nullable
    private Integer color;
    private boolean indeterminate;
    private double progress;

    @Nullable
    private ProgressBar progressBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBarContainerView(@NotNull Context context) {
        super(context);
        context.getClass();
        this.indeterminate = true;
        this.animating = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.color;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void apply$ReactAndroid_release() {
        ProgressBar progressBar = this.progressBar;
        if (progressBar == null) {
            FeBlendView$$ExternalSyntheticLambda0.m("setStyle() not called");
            return;
        }
        progressBar.setIndeterminate(this.indeterminate);
        setColor(progressBar);
        progressBar.setProgress((int) (this.progress * 1000));
        progressBar.setVisibility(this.animating ? 0 : 4);
    }

    /* renamed from: getAnimating$ReactAndroid_release, reason: from getter */
    public final boolean getAnimating() {
        return this.animating;
    }

    @Nullable
    /* renamed from: getColor$ReactAndroid_release, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* renamed from: getIndeterminate$ReactAndroid_release, reason: from getter */
    public final boolean getIndeterminate() {
        return this.indeterminate;
    }

    /* renamed from: getProgress$ReactAndroid_release, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        info.getClass();
        super.onInitializeAccessibilityNodeInfo(info);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            info.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z) {
        this.animating = z;
    }

    public final void setColor$ReactAndroid_release(@Nullable Integer num) {
        this.color = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z) {
        this.indeterminate = z;
    }

    public final void setProgress$ReactAndroid_release(double d) {
        this.progress = d;
    }

    public final void setStyle$ReactAndroid_release(@Nullable String styleName) {
        ReactProgressBarViewManager.Companion companion = ReactProgressBarViewManager.INSTANCE;
        ProgressBar createProgressBar = companion.createProgressBar(getContext(), companion.getStyleFromString$ReactAndroid_release(styleName));
        createProgressBar.setMax(1000);
        this.progressBar = createProgressBar;
        removeAllViews();
        addView(this.progressBar, new ViewGroup.LayoutParams(-1, -1));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/progressbar/ProgressBarContainerView$Companion;", "", "<init>", "()V", "MAX_PROGRESS", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
