package expo.modules.splashscreen;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreen$Impl$$ExternalSyntheticLambda0;
import androidx.core.splashscreen.SplashScreenViewProvider;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.openjdk.tools.javac.util.Log$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lexpo/modules/splashscreen/SplashScreenManager;", "", "<init>", "()V", "keepSplashScreenOnScreen", "", "preventAutoHideCalled", "getPreventAutoHideCalled", "()Z", "setPreventAutoHideCalled", "(Z)V", "splashScreen", "Landroidx/core/splashscreen/SplashScreen;", "contentAppearedListener", "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;", "configureSplashScreen", "", "options", "Lexpo/modules/splashscreen/SplashScreenOptions;", "registerOnActivity", "activity", "Landroid/app/Activity;", Constants.HINT_TEXT_OPERATION_HIDE, "setSplashScreenOptions", "unregisterContentAppearedListener", "expo-splash-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SplashScreenManager {
    private static boolean preventAutoHideCalled;
    private static SplashScreen splashScreen;

    @NotNull
    public static final SplashScreenManager INSTANCE = new SplashScreenManager();
    private static boolean keepSplashScreenOnScreen = true;

    @NotNull
    private static final ReactMarker.MarkerListener contentAppearedListener = new SplashScreenManager$$ExternalSyntheticLambda1();

    private SplashScreenManager() {
    }

    private final void configureSplashScreen(SplashScreenOptions options) {
        if (splashScreen == null) {
            return;
        }
        long duration = options.getDuration();
        SplashScreen splashScreen2 = splashScreen;
        if (splashScreen2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splashScreen");
            splashScreen2 = null;
        }
        splashScreen2.setOnExitAnimationListener(new SplashScreenManager$$ExternalSyntheticLambda0(duration));
    }

    public static /* synthetic */ void configureSplashScreen$default(SplashScreenManager splashScreenManager, SplashScreenOptions splashScreenOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            splashScreenOptions = new SplashScreenOptions();
        }
        splashScreenManager.configureSplashScreen(splashScreenOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSplashScreen$lambda$2(long j, SplashScreenViewProvider splashScreenViewProvider) {
        splashScreenViewProvider.getClass();
        View view = splashScreenViewProvider.getView();
        view.animate().setDuration(j).alpha(0.0f).setInterpolator(new AccelerateInterpolator()).withEndAction(new Log$$ExternalSyntheticLambda0(splashScreenViewProvider, view, 10)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureSplashScreen$lambda$2$lambda$1(SplashScreenViewProvider splashScreenViewProvider, View view) {
        if (Build.VERSION.SDK_INT < 31) {
            splashScreenViewProvider.remove();
        } else {
            view.getClass();
            SplashScreen$Impl$$ExternalSyntheticLambda0.m(view).remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentAppearedListener$lambda$0(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        reactMarkerConstants.getClass();
        if (reactMarkerConstants != ReactMarkerConstants.CONTENT_APPEARED || preventAutoHideCalled) {
            return;
        }
        INSTANCE.hide();
    }

    public final boolean getPreventAutoHideCalled() {
        return preventAutoHideCalled;
    }

    public final void hide() {
        keepSplashScreenOnScreen = false;
    }

    public final void registerOnActivity(@NotNull Activity activity) {
        activity.getClass();
        splashScreen = SplashScreen.INSTANCE.installSplashScreen(activity);
        ReactMarker.addListener(contentAppearedListener);
        final View findViewById = activity.findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: expo.modules.splashscreen.SplashScreenManager$registerOnActivity$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                boolean z;
                z = SplashScreenManager.keepSplashScreenOnScreen;
                if (z) {
                    return false;
                }
                findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
        configureSplashScreen$default(this, null, 1, null);
    }

    public final void setPreventAutoHideCalled(boolean z) {
        preventAutoHideCalled = z;
    }

    public final void setSplashScreenOptions(@NotNull SplashScreenOptions options) {
        options.getClass();
        configureSplashScreen(options);
    }

    public final void unregisterContentAppearedListener() {
        ReactMarker.removeListener(contentAppearedListener);
    }
}
