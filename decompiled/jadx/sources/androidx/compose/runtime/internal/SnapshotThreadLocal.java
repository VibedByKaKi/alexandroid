package androidx.compose.runtime.internal;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.dee.app.metrics.MetricsConstants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0013R \u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00060\u0002j\u0002`\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/internal/SnapshotThreadLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", BuildConfig.FLAVOR_authType, "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "writeMutex", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "mainThreadValue", MetricsConstants.Method.CACHE_GET, "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,154:1\n25#2,5:155\n33#2:160\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/SnapshotThreadLocal\n*L\n33#1:155,5\n52#1:160\n*E\n"})
/* loaded from: classes13.dex */
public final class SnapshotThreadLocal<T> {
    public static final int $stable = 8;

    @Nullable
    private T mainThreadValue;

    @NotNull
    private final AtomicReference<ThreadMap> map;

    @NotNull
    private final Object writeMutex;

    public SnapshotThreadLocal() {
        ThreadMap threadMap;
        threadMap = SnapshotThreadLocalKt.emptyThreadMap;
        this.map = new AtomicReference<>(threadMap);
        this.writeMutex = new Object();
    }

    @Nullable
    public final T get() {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        return currentThreadId == Thread_androidKt.getMainThreadId() ? this.mainThreadValue : (T) this.map.get().get(currentThreadId);
    }

    public final void set(@Nullable T value) {
        long currentThreadId = Thread_jvmKt.currentThreadId();
        if (currentThreadId == Thread_androidKt.getMainThreadId()) {
            this.mainThreadValue = value;
            return;
        }
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(currentThreadId, value)) {
                return;
            }
            this.map.set(threadMap.newWith(currentThreadId, value));
            Unit unit = Unit.INSTANCE;
        }
    }
}
