package com.facebook.imagepipeline.core;

import android.os.Process;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/imagepipeline/core/PriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadPriority", "", "prefix", "", "addThreadNumber", "", "<init>", "(ILjava/lang/String;Z)V", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "runnable", "Ljava/lang/Runnable;", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PriorityThreadFactory implements ThreadFactory {
    private final boolean addThreadNumber;

    @NotNull
    private final String prefix;

    @NotNull
    private final AtomicInteger threadNumber;
    private final int threadPriority;

    @JvmOverloads
    public PriorityThreadFactory(int i, @NotNull String str, boolean z) {
        str.getClass();
        this.threadPriority = i;
        this.prefix = str;
        this.addThreadNumber = z;
        this.threadNumber = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newThread$lambda$0(PriorityThreadFactory priorityThreadFactory, Runnable runnable) {
        priorityThreadFactory.getClass();
        runnable.getClass();
        try {
            Process.setThreadPriority(priorityThreadFactory.threadPriority);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull Runnable runnable) {
        runnable.getClass();
        LifecycleUtils$$ExternalSyntheticLambda4 lifecycleUtils$$ExternalSyntheticLambda4 = new LifecycleUtils$$ExternalSyntheticLambda4(this, runnable, 12);
        boolean z = this.addThreadNumber;
        String str = this.prefix;
        if (z) {
            str = TableInfo$$ExternalSyntheticOutline0.m(this.threadNumber.getAndIncrement(), str, "-");
        }
        return new Thread(lifecycleUtils$$ExternalSyntheticLambda4, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PriorityThreadFactory(int i, @NotNull String str) {
        this(i, str, false, 4, null);
        str.getClass();
    }

    @JvmOverloads
    public PriorityThreadFactory(int i) {
        this(i, null, false, 6, null);
    }

    public /* synthetic */ PriorityThreadFactory(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "PriorityThreadFactory" : str, (i2 & 4) != 0 ? true : z);
    }
}
