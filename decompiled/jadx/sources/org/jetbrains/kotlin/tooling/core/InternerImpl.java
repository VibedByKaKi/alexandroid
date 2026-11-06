package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import com.dee.app.metrics.MetricsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\rJ\"\u0010\u000e\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\u0010H\u0082\b¢\u0006\u0002\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/InternerImpl;", "Lorg/jetbrains/kotlin/tooling/core/Interner;", HttpClientUtils.ElementsCacheKey.STORE, "Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store;", JoinPoint.SYNCHRONIZATION_LOCK, "Ljava/util/concurrent/locks/Lock;", "(Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store;Ljava/util/concurrent/locks/Lock;)V", MetricsConstants.Method.CACHE_CLEAR, "", "getOrPut", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "withLockIfAny", "action", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Store", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nInterner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl\n*L\n1#1,75:1\n72#1:76\n72#1:77\n*S KotlinDebug\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl\n*L\n64#1:76\n68#1:77\n*E\n"})
/* loaded from: classes11.dex */
final class InternerImpl implements Interner {

    @Nullable
    private final Lock lock;

    @NotNull
    private final Store store;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\b\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\u001f\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u0002H\u0005H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store;", "", MetricsConstants.Method.CACHE_CLEAR, "", "getOrPut", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "Strong", "Weak", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Store {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00052\u0006\u0010\u000b\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Strong;", "Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store;", "()V", Content.REFERENCES, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", MetricsConstants.Method.CACHE_CLEAR, "", "getOrPut", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension({"SMAP\nInterner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Strong\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,75:1\n372#2,7:76\n*S KotlinDebug\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Strong\n*L\n54#1:76,7\n*E\n"})
        public static final class Strong implements Store {

            @NotNull
            private final HashMap<Object, Object> references = new HashMap<>();

            @Override // org.jetbrains.kotlin.tooling.core.InternerImpl.Store
            public void clear() {
                this.references.clear();
            }

            @Override // org.jetbrains.kotlin.tooling.core.InternerImpl.Store
            @NotNull
            public <T> T getOrPut(@NotNull T value) {
                value.getClass();
                HashMap<Object, Object> hashMap = this.references;
                T t = (T) hashMap.get(value);
                if (t != null) {
                    return t;
                }
                hashMap.put(value, value);
                return value;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u00052\u0006\u0010\u000b\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\fR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Weak;", "Lorg/jetbrains/kotlin/tooling/core/InternerImpl$Store;", "()V", Content.REFERENCES, "Ljava/util/WeakHashMap;", "", "Ljava/lang/ref/WeakReference;", MetricsConstants.Method.CACHE_CLEAR, "", "getOrPut", ExifInterface.GPS_DIRECTION_TRUE, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension({"SMAP\nInterner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Weak\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,75:1\n372#2,7:76\n*S KotlinDebug\n*F\n+ 1 Interner.kt\norg/jetbrains/kotlin/tooling/core/InternerImpl$Store$Weak\n*L\n39#1:76,7\n*E\n"})
        public static final class Weak implements Store {

            @NotNull
            private final WeakHashMap<Object, WeakReference<Object>> references = new WeakHashMap<>();

            @Override // org.jetbrains.kotlin.tooling.core.InternerImpl.Store
            public void clear() {
                this.references.clear();
            }

            @Override // org.jetbrains.kotlin.tooling.core.InternerImpl.Store
            @NotNull
            public <T> T getOrPut(@NotNull T value) {
                value.getClass();
                WeakHashMap<Object, WeakReference<Object>> weakHashMap = this.references;
                WeakReference<Object> weakReference = weakHashMap.get(value);
                if (weakReference == null) {
                    weakReference = new WeakReference<>(value);
                    weakHashMap.put(value, weakReference);
                }
                T t = (T) weakReference.get();
                if (t != null) {
                    return t;
                }
                this.references.put(value, new WeakReference<>(value));
                return value;
            }
        }

        void clear();

        @NotNull
        <T> T getOrPut(@NotNull T value);
    }

    public InternerImpl(@NotNull Store store, @Nullable Lock lock) {
        store.getClass();
        this.store = store;
        this.lock = lock;
    }

    private final <T> T withLockIfAny(Function0<? extends T> action) {
        Lock lock = this.lock;
        if (lock == null) {
            return action.invoke();
        }
        lock.lock();
        try {
            return action.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            lock.unlock();
            InlineMarker.finallyEnd(1);
        }
    }

    @Override // org.jetbrains.kotlin.tooling.core.Interner
    public void clear() {
        Lock lock = this.lock;
        if (lock == null) {
            this.store.clear();
            return;
        }
        lock.lock();
        try {
            this.store.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    @Override // org.jetbrains.kotlin.tooling.core.Interner
    @NotNull
    public <T> T getOrPut(@NotNull T value) {
        value.getClass();
        Lock lock = this.lock;
        if (lock == null) {
            return (T) this.store.getOrPut(value);
        }
        lock.lock();
        try {
            return (T) this.store.getOrPut(value);
        } finally {
            lock.unlock();
        }
    }

    public /* synthetic */ InternerImpl(Store store, Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(store, (i & 2) != 0 ? null : lock);
    }
}
