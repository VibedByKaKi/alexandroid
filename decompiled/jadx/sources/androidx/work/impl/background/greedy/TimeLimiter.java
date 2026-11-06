package androidx.work.impl.background.greedy;

import androidx.media3.ui.PlayerView$$ExternalSyntheticLambda1;
import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/background/greedy/TimeLimiter;", "", "runnableScheduler", "Landroidx/work/RunnableScheduler;", AppStartInteractionDetails.ReferralType.LAUNCHER, "Landroidx/work/impl/WorkLauncher;", "timeoutMs", "", "(Landroidx/work/RunnableScheduler;Landroidx/work/impl/WorkLauncher;J)V", JoinPoint.SYNCHRONIZATION_LOCK, "tracked", "", "Landroidx/work/impl/StartStopToken;", "Ljava/lang/Runnable;", "cancel", "", "token", "track", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimeLimiter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeLimiter.kt\nandroidx/work/impl/background/greedy/TimeLimiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes14.dex */
public final class TimeLimiter {

    @NotNull
    private final WorkLauncher launcher;

    @NotNull
    private final Object lock;

    @NotNull
    private final RunnableScheduler runnableScheduler;
    private final long timeoutMs;

    @NotNull
    private final Map<StartStopToken, Runnable> tracked;

    @JvmOverloads
    public TimeLimiter(@NotNull RunnableScheduler runnableScheduler, @NotNull WorkLauncher workLauncher, long j) {
        runnableScheduler.getClass();
        workLauncher.getClass();
        this.runnableScheduler = runnableScheduler;
        this.launcher = workLauncher;
        this.timeoutMs = j;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void track$lambda$0(TimeLimiter timeLimiter, StartStopToken startStopToken) {
        timeLimiter.getClass();
        startStopToken.getClass();
        timeLimiter.launcher.stopWork(startStopToken, 3);
    }

    public final void cancel(@NotNull StartStopToken token) {
        Runnable remove;
        token.getClass();
        synchronized (this.lock) {
            remove = this.tracked.remove(token);
        }
        if (remove != null) {
            this.runnableScheduler.cancel(remove);
        }
    }

    public final void track(@NotNull StartStopToken token) {
        token.getClass();
        PlayerView$$ExternalSyntheticLambda1 playerView$$ExternalSyntheticLambda1 = new PlayerView$$ExternalSyntheticLambda1(this, token, 24);
        synchronized (this.lock) {
            this.tracked.put(token, playerView$$ExternalSyntheticLambda1);
        }
        this.runnableScheduler.scheduleWithDelay(this.timeoutMs, playerView$$ExternalSyntheticLambda1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimeLimiter(@NotNull RunnableScheduler runnableScheduler, @NotNull WorkLauncher workLauncher) {
        this(runnableScheduler, workLauncher, 0L, 4, null);
        runnableScheduler.getClass();
        workLauncher.getClass();
    }

    public /* synthetic */ TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(runnableScheduler, workLauncher, (i & 4) != 0 ? 5400000L : j);
    }
}
