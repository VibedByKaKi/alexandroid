package kotlinx.atomicfu;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u000212B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\b\u0010 \u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\nH\u0002J\u001e\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u000e2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0%J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u0003H\u0002J\r\u0010(\u001a\u00020\u001aH\u0000¢\u0006\u0002\b)J8\u0010*\u001a\u00060\u0013R\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001d\b\u0004\u0010+\u001a\u0017\u0012\b\u0012\u00060\u0013R\u00020\u0000\u0012\u0004\u0012\u00020\u001a0,¢\u0006\u0002\b-H\u0086\bJ\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00000\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lkotlinx/atomicfu/LockFreedomTestEnvironment;", "", "name", "", "(Ljava/lang/String;)V", "globalPauseProgress", "Ljava/util/concurrent/atomic/AtomicInteger;", "interceptor", "Lkotlinx/atomicfu/LockFreedomTestEnvironment$Interceptor;", VoiceChatContract.COLUMN_IS_ACTIVE, "", "performedOps", "Ljava/util/concurrent/atomic/LongAdder;", "performedResumes", "", "started", "status", "threads", "", "Lkotlinx/atomicfu/LockFreedomTestEnvironment$TestThread;", "ueh", "Ljava/lang/Thread$UncaughtExceptionHandler;", "uncaughtException", "Ljava/util/concurrent/atomic/AtomicReference;", "", "checkStalled", "", "composeThreadName", "threadName", "dumpThreadsError", "", "message", "getPausedEpoch", "hasActiveNonPausedThread", "performTest", BizMetricsConstants.DURATION_METADATA_NAME, "progress", "Lkotlin/Function0;", "resumeImpl", "resumeStr", "step", "step$atomicfu", "testThread", "operation", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "waitUntil", "nextTime", "", "Interceptor", "TestThread", "atomicfu"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public class LockFreedomTestEnvironment {
    private final AtomicInteger globalPauseProgress;
    private final Interceptor interceptor;
    private volatile boolean isActive;
    private final String name;
    private final LongAdder performedOps;
    private int performedResumes;
    private boolean started;
    private final AtomicInteger status;
    private final List<TestThread> threads;
    private final Thread.UncaughtExceptionHandler ueh;
    private final AtomicReference<Throwable> uncaughtException;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b¦\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0001J\b\u0010\u001a\u001a\u00020\u0019H\u0001J\"\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0082\b¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010\u001fJ\b\u0010\u001d\u001a\u00020\u0019H&J\r\u0010\"\u001a\u00020\u0019H\u0000¢\u0006\u0002\b#J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0019J\r\u0010&\u001a\u00020\u0019H\u0000¢\u0006\u0002\b'R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/atomicfu/LockFreedomTestEnvironment$TestThread;", "Ljava/lang/Thread;", "name", "", "(Lkotlinx/atomicfu/LockFreedomTestEnvironment;Ljava/lang/String;)V", "index", "", "getIndex$atomicfu", "()I", "lastOpTime", "", "getLastOpTime$atomicfu", "()J", "setLastOpTime$atomicfu", "(J)V", "operationEpoch", "pausedEpoch", "getPausedEpoch$atomicfu", "setPausedEpoch$atomicfu", "(I)V", "progressEpoch", "random", "Ljava/util/Random;", "sink", "afterLockFreeOperation", "", "beforeLockFreeOperation", "ensureLockFree", ExifInterface.GPS_DIRECTION_TRUE, "operation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "intermission", "block", "pauseImpl", "pauseImpl$atomicfu", "randomSpinWaitIntermission", "run", "stepImpl", "stepImpl$atomicfu", "atomicfu"}, k = 1, mv = {1, 1, 13})
    public abstract class TestThread extends Thread {
        private final int index;
        private volatile long lastOpTime;
        private int operationEpoch;
        private volatile int pausedEpoch;
        private int progressEpoch;
        private final Random random;
        private int sink;

        public TestThread(@Nullable String str) {
            super(LockFreedomTestEnvironment.this.composeThreadName(str));
            this.pausedEpoch = -1;
            this.random = new Random();
            this.operationEpoch = -1;
            this.progressEpoch = -1;
            if (LockFreedomTestEnvironment.this.started) {
                Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                throw null;
            }
            this.index = LockFreedomTestEnvironment.this.threads.size();
            LockFreedomTestEnvironment.this.threads.add(this);
        }

        private final <T> T ensureLockFree(Function0<? extends T> operation) {
            beforeLockFreeOperation();
            try {
                return operation.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                afterLockFreeOperation();
                InlineMarker.finallyEnd(1);
            }
        }

        @PublishedApi
        public final void afterLockFreeOperation() {
            int i = this.operationEpoch;
            if (i > this.progressEpoch) {
                this.progressEpoch = i;
                int incrementAndGet = LockFreedomTestEnvironment.this.globalPauseProgress.incrementAndGet();
                if (incrementAndGet >= LockFreedomTestEnvironment.this.threads.size() - 1) {
                    if (incrementAndGet != LockFreedomTestEnvironment.this.threads.size() - 1) {
                        Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                        return;
                    } else {
                        if (!LockFreedomTestEnvironment.this.globalPauseProgress.compareAndSet(LockFreedomTestEnvironment.this.threads.size() - 1, 0)) {
                            Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                            return;
                        }
                        LockFreedomTestEnvironment.this.resumeImpl();
                    }
                }
            }
            this.lastOpTime = System.currentTimeMillis();
            LockFreedomTestEnvironment.this.performedOps.add(1L);
        }

        @PublishedApi
        public final void beforeLockFreeOperation() {
            this.operationEpoch = LockFreedomTestEnvironment.this.getPausedEpoch();
        }

        /* renamed from: getIndex$atomicfu, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: getLastOpTime$atomicfu, reason: from getter */
        public final long getLastOpTime() {
            return this.lastOpTime;
        }

        /* renamed from: getPausedEpoch$atomicfu, reason: from getter */
        public final int getPausedEpoch() {
            return this.pausedEpoch;
        }

        public final <T> T intermission(@NotNull Function0<? extends T> block) {
            block.getClass();
            afterLockFreeOperation();
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                beforeLockFreeOperation();
                InlineMarker.finallyEnd(1);
            }
        }

        public abstract void operation();

        public final void pauseImpl$atomicfu() {
            int i;
            int i2;
            do {
                i = LockFreedomTestEnvironment.this.status.get();
                if (i < 0 || i == Integer.MAX_VALUE) {
                    return;
                }
                this.pausedEpoch = i + 1;
                i2 = ~this.index;
            } while (!LockFreedomTestEnvironment.this.status.compareAndSet(i, i2));
            while (LockFreedomTestEnvironment.this.status.get() == i2) {
                LockSupport.parkNanos(1000000L);
            }
        }

        public final void randomSpinWaitIntermission() {
            int nextInt;
            afterLockFreeOperation();
            try {
                if (this.random.nextInt(100) < 95) {
                    beforeLockFreeOperation();
                    return;
                }
                do {
                    nextInt = this.random.nextInt(100);
                    for (int i = 0; i < nextInt; i++) {
                        this.sink += i;
                    }
                } while (nextInt >= 90);
                Unit unit = Unit.INSTANCE;
                beforeLockFreeOperation();
            } catch (Throwable th) {
                beforeLockFreeOperation();
                throw th;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (LockFreedomTestEnvironment.this.isActive) {
                beforeLockFreeOperation();
                try {
                    operation();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    afterLockFreeOperation();
                }
            }
        }

        public final void setLastOpTime$atomicfu(long j) {
            this.lastOpTime = j;
        }

        public final void setPausedEpoch$atomicfu(int i) {
            this.pausedEpoch = i;
        }

        public final void stepImpl$atomicfu() {
            if (this.random.nextInt(1000) == 0) {
                pauseImpl$atomicfu();
            }
        }
    }

    public LockFreedomTestEnvironment(@NotNull String str) {
        str.getClass();
        this.name = str;
        this.interceptor = new Interceptor();
        this.threads = new ArrayList();
        this.performedOps = new LongAdder();
        this.uncaughtException = new AtomicReference<>();
        this.ueh = new Thread.UncaughtExceptionHandler() { // from class: kotlinx.atomicfu.LockFreedomTestEnvironment$ueh$1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                AtomicReference atomicReference;
                PrintStream printStream = System.out;
                printStream.getClass();
                synchronized (printStream) {
                    System.out.println((Object) ("Uncaught exception in thread " + thread));
                    th.printStackTrace(System.out);
                    atomicReference = LockFreedomTestEnvironment.this.uncaughtException;
                    while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
                    }
                }
            }
        };
        this.status = new AtomicInteger();
        this.globalPauseProgress = new AtomicInteger();
        this.isActive = true;
    }

    private final void checkStalled() {
        long currentTimeMillis = System.currentTimeMillis() - 15000;
        List<TestThread> list = this.threads;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TestThread) obj).getLastOpTime() < currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("Progress stalled in threads ");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TestThread) it2.next()).getName());
        }
        sb.append(arrayList2);
        dumpThreadsError(sb.toString());
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String composeThreadName(String threadName) {
        String str = this.name;
        if (threadName != null) {
            return a$$ExternalSyntheticOutline0.m('-', str, threadName);
        }
        StringBuilder m = AppLaunchChecker$$ExternalSyntheticOutline0.m(str, '-');
        m.append(this.threads.size() + 1);
        return m.toString();
    }

    private final Void dumpThreadsError(String message) {
        List<TestThread> list = this.threads;
        LinkedHashMap linkedHashMap = new LinkedHashMap(BitVector$$ExternalSyntheticOutline0.m(list, 10, 16));
        for (TestThread testThread : list) {
            Pair pair = TuplesKt.to(testThread, testThread.getStackTrace());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        System.out.println((Object) a$$ExternalSyntheticOutline0.m("!!! ", message));
        System.out.println((Object) "=== Dumping live thread stack traces");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TestThread testThread2 = (TestThread) entry.getKey();
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            stackTraceElementArr.getClass();
            if (stackTraceElementArr.length != 0) {
                System.out.println((Object) ("Thread \"" + testThread2.getName() + "\" " + testThread2.getState()));
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    StringBuilder sb = new StringBuilder("\tat ");
                    stackTraceElement.getClass();
                    sb.append(stackTraceElement.getClassName());
                    sb.append('.');
                    sb.append(stackTraceElement.getMethodName());
                    sb.append('(');
                    sb.append(stackTraceElement.getFileName());
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(')');
                    System.out.println((Object) sb.toString());
                }
                System.out.println();
            }
        }
        System.out.println((Object) "===");
        throw new IllegalStateException(message.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPausedEpoch() {
        int i;
        int pausedEpoch;
        do {
            i = this.status.get();
            if (i >= 0) {
                return -1;
            }
            pausedEpoch = this.threads.get(~i).getPausedEpoch();
        } while (i != this.status.get());
        return pausedEpoch;
    }

    private final boolean hasActiveNonPausedThread() {
        List<TestThread> list = this.threads;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (TestThread testThread : list) {
            if (testThread.isAlive() && (~testThread.getIndex()) != this.status.get()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performTest$default(LockFreedomTestEnvironment lockFreedomTestEnvironment, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: performTest");
            return;
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: kotlinx.atomicfu.LockFreedomTestEnvironment$performTest$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        lockFreedomTestEnvironment.performTest(i, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeImpl() {
        int i;
        TestThread testThread;
        do {
            i = this.status.get();
            if (i == Integer.MAX_VALUE) {
                return;
            }
            if (i >= 0) {
                Single$$ExternalSyntheticBUOutline0.m$2("Check failed.");
                return;
            } else {
                testThread = this.threads.get(~i);
                this.performedResumes = testThread.getPausedEpoch();
            }
        } while (!this.status.compareAndSet(i, testThread.getPausedEpoch()));
        LockSupport.unpark(testThread);
    }

    private final String resumeStr() {
        int i = this.performedResumes;
        return i == 0 ? "" : ArcMode$$ExternalSyntheticOutline0.m(" (pause/resumes ", i, ')');
    }

    @NotNull
    public static /* synthetic */ TestThread testThread$default(LockFreedomTestEnvironment lockFreedomTestEnvironment, String str, Function1 function1, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: testThread");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        function1.getClass();
        return new LockFreedomTestEnvironment$testThread$1(lockFreedomTestEnvironment, function1, str, str);
    }

    private final void waitUntil(long nextTime) {
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= nextTime) {
                return;
            } else {
                Thread.sleep(nextTime - currentTimeMillis);
            }
        }
    }

    public final void performTest(int seconds, @NotNull Function0<Unit> progress) {
        Object obj;
        progress.getClass();
        if (!this.isActive) {
            Single$$ExternalSyntheticBUOutline0.m$2("Can perform test at most once on this instance");
            return;
        }
        System.out.println((Object) ("=== " + this.name));
        if (this.threads.size() < 2) {
            Single$$ExternalSyntheticBUOutline0.m$2("Must define at least two test threads");
            return;
        }
        InterceptorKt.lockAndSetInterceptor(this.interceptor);
        this.started = true;
        long currentTimeMillis = System.currentTimeMillis();
        for (TestThread testThread : this.threads) {
            testThread.setUncaughtExceptionHandler(this.ueh);
            testThread.setLastOpTime$atomicfu(currentTimeMillis);
            testThread.start();
        }
        int i = 0;
        while (true) {
            waitUntil(currentTimeMillis);
            StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "--- ", ": Performed ");
            m0m.append(this.performedOps.sum());
            m0m.append(" operations");
            m0m.append(resumeStr());
            System.out.println((Object) m0m.toString());
            progress.invoke();
            checkStalled();
            i++;
            if (i > seconds) {
                break;
            } else {
                currentTimeMillis += 1000;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() + 15000;
        this.isActive = false;
        while (System.currentTimeMillis() < currentTimeMillis2 && hasActiveNonPausedThread()) {
            checkStalled();
            Thread.sleep(10L);
        }
        int andSet = this.status.getAndSet(Integer.MAX_VALUE);
        if (andSet < 0) {
            LockSupport.unpark(this.threads.get(~andSet));
        }
        for (TestThread testThread2 : this.threads) {
            long currentTimeMillis3 = currentTimeMillis2 - System.currentTimeMillis();
            if (currentTimeMillis3 > 0) {
                testThread2.join(currentTimeMillis3);
            }
        }
        InterceptorKt.unlockAndResetInterceptor(this.interceptor);
        Throwable th = this.uncaughtException.get();
        if (th != null) {
            throw th;
        }
        Iterator<T> it2 = this.threads.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((TestThread) obj).isAlive()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        TestThread testThread3 = (TestThread) obj;
        if (testThread3 != null) {
            dumpThreadsError("A thread is still alive: " + testThread3);
            throw null;
        }
        System.out.println((Object) ("------ Done with " + this.performedOps.sum() + " operations" + resumeStr()));
        progress.invoke();
    }

    public final void step$atomicfu() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof TestThread)) {
            currentThread = null;
        }
        TestThread testThread = (TestThread) currentThread;
        if (testThread != null) {
            testThread.stepImpl$atomicfu();
        }
    }

    @NotNull
    public final TestThread testThread(@Nullable String name, @NotNull Function1<? super TestThread, Unit> operation) {
        operation.getClass();
        return new LockFreedomTestEnvironment$testThread$1(this, operation, name, name);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J1\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\f0\r2\u0006\u0010\u0007\u001a\u0002H\f2\u0006\u0010\t\u001a\u0002H\fH\u0016¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u000bH\u0016J)\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\f0\r2\u0006\u0010\t\u001a\u0002H\fH\u0016¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\f0\rH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lkotlinx/atomicfu/LockFreedomTestEnvironment$Interceptor;", "Lkotlinx/atomicfu/AtomicOperationInterceptor;", "(Lkotlinx/atomicfu/LockFreedomTestEnvironment;)V", "afterRMW", "", "ref", "Lkotlinx/atomicfu/AtomicInt;", "oldValue", "", "newValue", "Lkotlinx/atomicfu/AtomicLong;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/atomicfu/AtomicRef;", "(Lkotlinx/atomicfu/AtomicRef;Ljava/lang/Object;Ljava/lang/Object;)V", "afterSet", "(Lkotlinx/atomicfu/AtomicRef;Ljava/lang/Object;)V", "beforeUpdate", "toString", "", "atomicfu"}, k = 1, mv = {1, 1, 13})
    public final class Interceptor extends AtomicOperationInterceptor {
        public Interceptor() {
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public <T> void afterRMW(@NotNull AtomicRef<T> ref, T oldValue, T newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public <T> void afterSet(@NotNull AtomicRef<T> ref, T newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public <T> void beforeUpdate(@NotNull AtomicRef<T> ref) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @NotNull
        public String toString() {
            return "LockFreedomTestEnvironment(" + LockFreedomTestEnvironment.this.name + ')';
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void afterRMW(@NotNull AtomicInt ref, int oldValue, int newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void afterSet(@NotNull AtomicInt ref, int newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void beforeUpdate(@NotNull AtomicInt ref) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void afterRMW(@NotNull AtomicLong ref, long oldValue, long newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void afterSet(@NotNull AtomicLong ref, long newValue) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }

        @Override // kotlinx.atomicfu.AtomicOperationInterceptor
        public void beforeUpdate(@NotNull AtomicLong ref) {
            ref.getClass();
            LockFreedomTestEnvironment.this.step$atomicfu();
        }
    }
}
