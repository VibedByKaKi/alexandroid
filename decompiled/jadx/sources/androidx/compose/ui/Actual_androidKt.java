package androidx.compose.ui;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000\u001a\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"currentTimeMillis", "", "handler", "Landroid/os/Handler;", "postDelayed", "", "delayMillis", "block", "Lkotlin/Function0;", "", "removePost", "token", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Actual_androidKt {

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());

    public static final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final Object postDelayed(long j, @NotNull Function0<Unit> function0) {
        Actual_androidKt$$ExternalSyntheticLambda0 actual_androidKt$$ExternalSyntheticLambda0 = new Actual_androidKt$$ExternalSyntheticLambda0(function0, 0);
        handler.postDelayed(actual_androidKt$$ExternalSyntheticLambda0, j);
        return actual_androidKt$$ExternalSyntheticLambda0;
    }

    public static final void removePost(@Nullable Object obj) {
        if ((obj instanceof Runnable ? (Runnable) obj : null) == null) {
            return;
        }
        handler.removeCallbacks((Runnable) obj);
    }
}
