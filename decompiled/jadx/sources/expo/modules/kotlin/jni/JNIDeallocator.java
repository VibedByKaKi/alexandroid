package expo.modules.kotlin.jni;

import expo.modules.core.interfaces.DoNotStrip;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0018\u00010\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "shouldCreateDestructorThread", "", "<init>", "(Z)V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Lexpo/modules/kotlin/jni/Destructible;", "destructorMap", "", "Ljava/lang/ref/PhantomReference;", "Ljava/lang/ref/WeakReference;", "destructorThread", "Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;", "addReference", "", "destructible", "deallocate", "deallocate$expo_modules_core_release", "()Lkotlin/Unit;", "inspectMemory", "", "deallocator", "Ljava/lang/Thread;", "close", "DeallocatorThread", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
@SourceDebugExtension({"SMAP\nJNIDeallocator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JNIDeallocator.kt\nexpo/modules/kotlin/jni/JNIDeallocator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1#2:90\n1#2:103\n1869#3,2:91\n1617#3,9:93\n1869#3:102\n1870#3:104\n1626#3:105\n*S KotlinDebug\n*F\n+ 1 JNIDeallocator.kt\nexpo/modules/kotlin/jni/JNIDeallocator\n*L\n67#1:103\n55#1:91,2\n67#1:93,9\n67#1:102\n67#1:104\n67#1:105\n*E\n"})
/* loaded from: classes9.dex */
public final class JNIDeallocator implements AutoCloseable {

    @NotNull
    private final Map<PhantomReference<Destructible>, WeakReference<Destructible>> destructorMap;

    @Nullable
    private final DeallocatorThread destructorThread;

    @NotNull
    private final ReferenceQueue<Destructible> referenceQueue;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/jni/JNIDeallocator$DeallocatorThread;", "Ljava/lang/Thread;", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "run", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class DeallocatorThread extends Thread {
        public DeallocatorThread() {
            super("Expo JNI deallocator");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            JNIDeallocator.this.deallocator(this);
        }
    }

    public JNIDeallocator(boolean z) {
        DeallocatorThread deallocatorThread;
        this.referenceQueue = new ReferenceQueue<>();
        this.destructorMap = new LinkedHashMap();
        if (z) {
            deallocatorThread = new DeallocatorThread();
            deallocatorThread.start();
        } else {
            deallocatorThread = null;
        }
        this.destructorThread = deallocatorThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deallocator(Thread thread) {
        while (!thread.isInterrupted()) {
            try {
                Reference<? extends Destructible> remove = this.referenceQueue.remove();
                synchronized (this) {
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @DoNotStrip
    public final void addReference(@NotNull Destructible destructible) {
        destructible.getClass();
        synchronized (this) {
            WeakReference<Destructible> weakReference = new WeakReference<>(destructible);
            this.destructorMap.put(new PhantomReference<>(destructible, this.referenceQueue), weakReference);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        deallocate$expo_modules_core_release();
    }

    @Nullable
    public final Unit deallocate$expo_modules_core_release() {
        Unit unit;
        synchronized (this) {
            try {
                Iterator<T> it2 = this.destructorMap.values().iterator();
                while (it2.hasNext()) {
                    Destructible destructible = (Destructible) ((WeakReference) it2.next()).get();
                    if (destructible != null) {
                        destructible.deallocate();
                    }
                }
                this.destructorMap.clear();
                DeallocatorThread deallocatorThread = this.destructorThread;
                if (deallocatorThread != null) {
                    deallocatorThread.interrupt();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return unit;
    }

    @NotNull
    public final List<Destructible> inspectMemory() {
        ArrayList arrayList;
        synchronized (this) {
            Collection<WeakReference<Destructible>> values = this.destructorMap.values();
            arrayList = new ArrayList();
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                Destructible destructible = (Destructible) ((WeakReference) it2.next()).get();
                if (destructible != null) {
                    arrayList.add(destructible);
                }
            }
        }
        return arrayList;
    }

    public JNIDeallocator() {
        this(false, 1, null);
    }

    public /* synthetic */ JNIDeallocator(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
