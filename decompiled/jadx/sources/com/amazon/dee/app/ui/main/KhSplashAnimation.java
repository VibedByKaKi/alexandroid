package com.amazon.dee.app.ui.main;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.services.logging.Log;
import com.dee.app.contacts.common.constants.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J,\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/dee/app/ui/main/KhSplashAnimation;", "", "<init>", "()V", Constants.LOG_TAG, "", "PLAY_ONCE", "", "FADE_OUT_MS", "", "MARK_TIMEOUT_MS", "playOnExit", "", "activity", "Landroid/app/Activity;", "splashScreen", "Landroidx/core/splashscreen/SplashScreen;", "onSplashExit", "provider", "Landroidx/core/splashscreen/SplashScreenViewProvider;", "showMarkOrRemove", "context", "Landroid/content/Context;", "content", "Landroid/view/ViewGroup;", "removeSplash", "Ljava/lang/Runnable;", "mark", "Landroid/graphics/drawable/AnimatedImageDrawable;", "decodeMark", "fadeOutAndRemove", "overlay", "Landroid/view/View;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KhSplashAnimation {
    private static final long FADE_OUT_MS = 200;
    private static final long MARK_TIMEOUT_MS = 2000;
    private static final int PLAY_ONCE = 0;

    @NotNull
    public static final KhSplashAnimation INSTANCE = new KhSplashAnimation();

    @NotNull
    private static final String TAG = Log.tag((Class<?>) KhSplashAnimation.class);

    private KhSplashAnimation() {
    }

    private final AnimatedImageDrawable decodeMark(Activity activity) {
        try {
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(activity.getResources(), R.drawable.splash_a_mark));
            decodeDrawable.getClass();
            if (decodeDrawable instanceof AnimatedImageDrawable) {
                return (AnimatedImageDrawable) decodeDrawable;
            }
            return null;
        } catch (IOException e) {
            Log.e(TAG, "Failed to decode splash mark", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fadeOutAndRemove(View overlay) {
        if (overlay.getParent() == null) {
            return;
        }
        overlay.animate().alpha(0.0f).setDuration(200L).withEndAction(new MainViewModel$$ExternalSyntheticLambda3(overlay, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fadeOutAndRemove$lambda$1(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    private final void onSplashExit(Activity activity, SplashScreenViewProvider provider) {
        showMarkOrRemove(activity, (ViewGroup) activity.findViewById(android.R.id.content), new MainViewModel$$ExternalSyntheticLambda3(provider, 2), decodeMark(activity));
    }

    @JvmStatic
    public static final void playOnExit(@NotNull Activity activity, @NotNull SplashScreen splashScreen) {
        activity.getClass();
        splashScreen.getClass();
        splashScreen.setOnExitAnimationListener(new MainActivity$$ExternalSyntheticLambda12(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playOnExit$lambda$0(Activity activity, SplashScreenViewProvider splashScreenViewProvider) {
        splashScreenViewProvider.getClass();
        INSTANCE.onSplashExit(activity, splashScreenViewProvider);
    }

    @JvmStatic
    @VisibleForTesting
    public static final void showMarkOrRemove(@NotNull Context context, @Nullable ViewGroup content, @NotNull Runnable removeSplash, @Nullable AnimatedImageDrawable mark) {
        context.getClass();
        removeSplash.getClass();
        if (content == null || mark == null) {
            removeSplash.run();
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.kh_splash_overlay, content, false);
        content.addView(inflate);
        removeSplash.run();
        ((ImageView) inflate.findViewById(R.id.kh_splash_mark)).setImageDrawable(mark);
        mark.setRepeatCount(0);
        final KhSplashAnimation$showMarkOrRemove$remove$1 khSplashAnimation$showMarkOrRemove$remove$1 = new KhSplashAnimation$showMarkOrRemove$remove$1(inflate);
        mark.registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: com.amazon.dee.app.ui.main.KhSplashAnimation$showMarkOrRemove$1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                KhSplashAnimation$showMarkOrRemove$remove$1.this.run();
            }
        });
        mark.start();
        inflate.postDelayed(khSplashAnimation$showMarkOrRemove$remove$1, 2000L);
    }
}
