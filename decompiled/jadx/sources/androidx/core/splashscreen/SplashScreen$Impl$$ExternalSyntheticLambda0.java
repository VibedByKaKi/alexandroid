package androidx.core.splashscreen;

import android.window.SplashScreenView;
import androidx.core.splashscreen.SplashScreen;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class SplashScreen$Impl$$ExternalSyntheticLambda0 implements SplashScreen.KeepOnScreenCondition {
    public static /* bridge */ /* synthetic */ SplashScreenView m(Object obj) {
        return (SplashScreenView) obj;
    }

    @Override // androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        boolean m7661splashScreenWaitPredicate$lambda0;
        m7661splashScreenWaitPredicate$lambda0 = SplashScreen.Impl.m7661splashScreenWaitPredicate$lambda0();
        return m7661splashScreenWaitPredicate$lambda0;
    }
}
