package com.amazon.dee.app.services.toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.util.Utils;
import com.facebook.react.ReactHost;
import com.facebook.react.interfaces.fabric.ReactSurface;
import java.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001#B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0014J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/ToolbarView;", "", "context", "Landroid/content/Context;", "toolbarOptions", "Lcom/amazon/dee/app/services/toolbar/ToolbarOptions;", "<init>", "(Landroid/content/Context;Lcom/amazon/dee/app/services/toolbar/ToolbarOptions;)V", "containerView", "Landroid/widget/FrameLayout;", "surface", "Lcom/facebook/react/interfaces/fabric/ReactSurface;", "startReactApplication", "", "reactHost", "Lcom/facebook/react/ReactHost;", "bundle", "Landroid/os/Bundle;", "startReactApplication$impl", "unmountReactApplication", "unmountReactApplication$impl", "addTo", "container", "Landroid/view/ViewGroup;", "height", "", "getHeight", "()F", "backgroundColor", "", "getBackgroundColor", "()I", "isFloating", "", "()Z", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ToolbarView {
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final boolean DEFAULT_FLOATING = false;
    private static final float DEFAULT_HEIGHT = 52.0f;

    @NotNull
    private final FrameLayout containerView;

    @Nullable
    private ReactSurface surface;

    @Nullable
    private final ToolbarOptions toolbarOptions;

    @NotNull
    private static final String TAG = Log.tag((Class<?>) ToolbarView.class);

    public ToolbarView(@NotNull Context context, @Nullable ToolbarOptions toolbarOptions) {
        context.getClass();
        this.toolbarOptions = toolbarOptions;
        this.containerView = new FrameLayout(context);
    }

    public final void addTo(@NotNull ViewGroup container, @NotNull Context context) {
        container.getClass();
        context.getClass();
        if (container.getChildCount() > 0 || this.containerView.getParent() != null) {
            Log.i(TAG, "Transport bar already mounted.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            Log.i(TAG, "Transport bar cannot be mounted since its container is not laid out.");
            return;
        }
        container.setBackgroundColor(getBackgroundColor());
        layoutParams.height = (int) Math.ceil(Utils.convertDPToPixels(context, getHeight()));
        container.setLayoutParams(layoutParams);
        container.addView(this.containerView);
        container.invalidate();
        container.requestLayout();
    }

    public final int getBackgroundColor() {
        Optional<Integer> backgroundColor;
        Integer orElse;
        ToolbarOptions toolbarOptions = this.toolbarOptions;
        if (toolbarOptions == null || (backgroundColor = toolbarOptions.getBackgroundColor()) == null || (orElse = backgroundColor.orElse(0)) == null) {
            return 0;
        }
        return orElse.intValue();
    }

    public final float getHeight() {
        Optional<Float> height;
        Float orElse;
        ToolbarOptions toolbarOptions = this.toolbarOptions;
        return (toolbarOptions == null || (height = toolbarOptions.getHeight()) == null || (orElse = height.orElse(Float.valueOf(DEFAULT_HEIGHT))) == null) ? DEFAULT_HEIGHT : orElse.floatValue();
    }

    public final boolean isFloating() {
        Optional<Boolean> isFloating;
        Boolean orElse;
        ToolbarOptions toolbarOptions = this.toolbarOptions;
        if (toolbarOptions == null || (isFloating = toolbarOptions.isFloating()) == null || (orElse = isFloating.orElse(Boolean.FALSE)) == null) {
            return false;
        }
        return orElse.booleanValue();
    }

    public final void startReactApplication$impl(@NotNull ReactHost reactHost, @NotNull Bundle bundle) throws AssertionError {
        reactHost.getClass();
        bundle.getClass();
        Context context = this.containerView.getContext();
        context.getClass();
        ReactSurface createSurface = reactHost.createSurface(context, "ElementsToolbarComponent", bundle);
        this.surface = createSurface;
        reactHost.start();
        createSurface.start();
        ViewGroup view = createSurface.getView();
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.containerView.removeAllViews();
            this.containerView.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final void unmountReactApplication$impl() {
        ReactSurface reactSurface = this.surface;
        if (reactSurface != null) {
            reactSurface.stop();
            this.containerView.removeAllViews();
            this.surface = null;
        }
    }
}
