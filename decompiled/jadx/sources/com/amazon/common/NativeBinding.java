package com.amazon.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NativeBinding extends PhantomReference<BoundObject> {
    private String mDebugId;
    private final long mNativeHandle;

    @NonNull
    private static final ReferenceQueue<BoundObject> sRefQueue = new ReferenceQueue<>();
    private static final Map<Long, Set<NativeBinding>> sReferenceMap = new ConcurrentHashMap();
    private static Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    private NativeBinding(@NonNull BoundObject boundObject) {
        super(boundObject, sRefQueue);
        this.mNativeHandle = boundObject.getNativeHandle();
    }

    private static void add(NativeBinding nativeBinding) {
        Map<Long, Set<NativeBinding>> map = sReferenceMap;
        Set<NativeBinding> set = map.get(Long.valueOf(nativeBinding.mNativeHandle));
        if (set == null) {
            set = ChatData$$ExternalSyntheticOutline0.m();
            map.put(Long.valueOf(nativeBinding.mNativeHandle), set);
        }
        set.add(nativeBinding);
    }

    public static synchronized void doDeletes() {
        synchronized (NativeBinding.class) {
            for (NativeBinding nativeBinding = (NativeBinding) sRefQueue.poll(); nativeBinding != null; nativeBinding = (NativeBinding) sRefQueue.poll()) {
                remove(nativeBinding);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$remove$0(NativeBinding nativeBinding) {
        nUnbind(nativeBinding.mNativeHandle);
    }

    private static native boolean nTestNativePeer(long j);

    private static native int nTestPointerCount(long j);

    private static native void nUnbind(long j);

    public static synchronized void register(BoundObject boundObject) {
        synchronized (NativeBinding.class) {
            if (!boundObject.isBound()) {
                throw new IllegalStateException("The object is not yet bound");
            }
            add(new NativeBinding(boundObject));
        }
    }

    private static void remove(NativeBinding nativeBinding) {
        Map<Long, Set<NativeBinding>> map = sReferenceMap;
        Set<NativeBinding> set = map.get(Long.valueOf(nativeBinding.mNativeHandle));
        set.remove(nativeBinding);
        if (set.isEmpty()) {
            map.remove(Long.valueOf(nativeBinding.mNativeHandle));
            mainThreadHandler.post(new NativeBinding$$ExternalSyntheticLambda0(nativeBinding, 0));
        }
    }

    @VisibleForTesting
    public static boolean testBound(long j) {
        Iterator<Set<NativeBinding>> it2 = sReferenceMap.values().iterator();
        while (it2.hasNext()) {
            Iterator<NativeBinding> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                if (it3.next().mNativeHandle == j) {
                    return true;
                }
            }
        }
        return false;
    }

    @VisibleForTesting
    public static int testBoundObjectCount() {
        return sReferenceMap.size();
    }

    @VisibleForTesting
    public static boolean testNativePeer(long j) {
        return nTestNativePeer(j);
    }

    @NonNull
    @VisibleForTesting
    public static NativeBinding testPopPendingDelete() {
        NativeBinding nativeBinding = (NativeBinding) sRefQueue.poll();
        Map<Long, Set<NativeBinding>> map = sReferenceMap;
        Set<NativeBinding> set = map.get(Long.valueOf(nativeBinding.mNativeHandle));
        set.remove(nativeBinding);
        if (set.isEmpty()) {
            map.remove(Long.valueOf(nativeBinding.mNativeHandle));
        }
        return nativeBinding;
    }

    @VisibleForTesting
    public static int testReferenceCount(long j) {
        return nTestPointerCount(j);
    }

    @VisibleForTesting
    public static void testUnBind(NativeBinding nativeBinding) {
        nUnbind(nativeBinding.getNativeHandle());
    }

    public long getNativeHandle() {
        return this.mNativeHandle;
    }
}
