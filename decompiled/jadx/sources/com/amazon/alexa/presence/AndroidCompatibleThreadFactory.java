package com.amazon.alexa.presence;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/presence/AndroidCompatibleThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadPrefix", "", "(Ljava/lang/String;)V", "group", "Ljava/lang/ThreadGroup;", "namePrefix", "threadNumber", "Ljava/util/concurrent/atomic/AtomicInteger;", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "Companion", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AndroidCompatibleThreadFactory implements ThreadFactory {

    @NotNull
    private static final AtomicInteger poolNumber = new AtomicInteger(1);

    @NotNull
    private final ThreadGroup group;

    @NotNull
    private final String namePrefix;

    @NotNull
    private final AtomicInteger threadNumber;

    @NotNull
    private final String threadPrefix;

    @JvmOverloads
    public AndroidCompatibleThreadFactory(@NotNull String str) {
        str.getClass();
        this.threadPrefix = str;
        this.threadNumber = new AtomicInteger(1);
        SecurityManager securityManager = System.getSecurityManager();
        ThreadGroup threadGroup = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        threadGroup.getClass();
        this.group = threadGroup;
        this.namePrefix = str + "-" + poolNumber.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull final Runnable r) {
        r.getClass();
        final ThreadGroup threadGroup = this.group;
        final String str = this.namePrefix + this.threadNumber.getAndIncrement();
        Thread thread = new Thread(r, threadGroup, str) { // from class: com.amazon.alexa.presence.AndroidCompatibleThreadFactory$newThread$thread$1
            final /* synthetic */ Runnable $r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(threadGroup, r, str, 0L);
                this.$r = r;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                this.$r.run();
            }
        };
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AndroidCompatibleThreadFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AndroidCompatibleThreadFactory(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "generic-thread" : str);
    }
}
