package expo.modules.splashscreen;

import androidx.core.splashscreen.SplashScreen;
import androidx.core.splashscreen.SplashScreenViewProvider;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic;
import java.util.Deque;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SplashScreenManager$$ExternalSyntheticLambda0 implements SimpleBasePlayer.PositionSupplier, SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction, SplashScreen.OnExitAnimationListener {
    public final /* synthetic */ long f$0;

    public /* synthetic */ SplashScreenManager$$ExternalSyntheticLambda0(long j) {
        this.f$0 = j;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        long lambda$getConstant$0;
        lambda$getConstant$0 = SimpleBasePlayer.PositionSupplier.lambda$getConstant$0(this.f$0);
        return lambda$getConstant$0;
    }

    @Override // androidx.core.splashscreen.SplashScreen.OnExitAnimationListener
    public void onSplashScreenExit(SplashScreenViewProvider splashScreenViewProvider) {
        SplashScreenManager.configureSplashScreen$lambda$2(this.f$0, splashScreenViewProvider);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
    public boolean shouldEvictSample(Deque deque) {
        boolean lambda$getMaxCountEvictionFunction$0;
        lambda$getMaxCountEvictionFunction$0 = SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(this.f$0, deque);
        return lambda$getMaxCountEvictionFunction$0;
    }
}
