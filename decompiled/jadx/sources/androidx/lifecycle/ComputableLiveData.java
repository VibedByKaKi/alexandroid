package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\r\u0010\u001c\u001a\u00028\u0000H%¢\u0006\u0002\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0017¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "", "executor", "Ljava/util/concurrent/Executor;", "<init>", "(Ljava/util/concurrent/Executor;)V", "getExecutor$lifecycle_livedata", "()Ljava/util/concurrent/Executor;", "_liveData", "Landroidx/lifecycle/LiveData;", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "invalid", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid$lifecycle_livedata", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "getComputing$lifecycle_livedata", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$lifecycle_livedata$annotations", "()V", "invalidationRunnable", "getInvalidationRunnable$lifecycle_livedata$annotations", "invalidate", "", "compute", "()Ljava/lang/Object;", "lifecycle-livedata"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes14.dex */
public abstract class ComputableLiveData<T> {

    @NotNull
    private final LiveData<T> _liveData;

    @NotNull
    private final AtomicBoolean computing;

    @NotNull
    private final Executor executor;

    @NotNull
    private final AtomicBoolean invalid;

    @JvmField
    @NotNull
    public final Runnable invalidationRunnable;

    @NotNull
    private final LiveData<T> liveData;

    @JvmField
    @NotNull
    public final Runnable refreshRunnable;

    @JvmOverloads
    public ComputableLiveData(@NotNull Executor executor) {
        executor.getClass();
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        final int i = 0;
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable(this) { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            public final /* synthetic */ ComputableLiveData f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ComputableLiveData computableLiveData = this.f$0;
                switch (i2) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        break;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$0(computableLiveData);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.invalidationRunnable = new Runnable(this) { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            public final /* synthetic */ ComputableLiveData f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ComputableLiveData computableLiveData = this.f$0;
                switch (i22) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        break;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$0(computableLiveData);
                        break;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$0(ComputableLiveData computableLiveData) {
        boolean hasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && hasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        do {
            boolean z = false;
            if (computableLiveData.computing.compareAndSet(false, true)) {
                Object obj = null;
                boolean z2 = false;
                while (computableLiveData.invalid.compareAndSet(true, false)) {
                    try {
                        obj = computableLiveData.compute();
                        z2 = true;
                    } catch (Throwable th) {
                        computableLiveData.computing.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    computableLiveData.getLiveData().postValue(obj);
                }
                computableLiveData.computing.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (computableLiveData.invalid.get());
    }

    @WorkerThread
    public abstract T compute();

    @NotNull
    /* renamed from: getComputing$lifecycle_livedata, reason: from getter */
    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    @NotNull
    /* renamed from: getExecutor$lifecycle_livedata, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* renamed from: getInvalid$lifecycle_livedata, reason: from getter */
    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    @NotNull
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Lb
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            r1.getClass()
        Lb:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
