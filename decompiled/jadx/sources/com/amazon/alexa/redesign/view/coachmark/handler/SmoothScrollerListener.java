package com.amazon.alexa.redesign.view.coachmark.handler;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/SmoothScrollerListener;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/redesign/view/coachmark/handler/SmoothScrollerListener$OnScrollCompletedListener;", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/redesign/view/coachmark/handler/SmoothScrollerListener$OnScrollCompletedListener;)V", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "", "OnScrollCompletedListener", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SmoothScrollerListener extends LinearSmoothScroller {
    public static final int $stable = 8;

    @NotNull
    private final OnScrollCompletedListener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/SmoothScrollerListener$OnScrollCompletedListener;", "", "onScrollCompleted", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnScrollCompletedListener {
        void onScrollCompleted();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmoothScrollerListener(@NotNull Context context, @NotNull OnScrollCompletedListener onScrollCompletedListener) {
        super(context);
        context.getClass();
        onScrollCompletedListener.getClass();
        this.listener = onScrollCompletedListener;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        super.onStop();
        this.listener.onScrollCompleted();
    }
}
