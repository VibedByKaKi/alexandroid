package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Finalizer implements Runnable {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    private static final Constructor<Thread> bigThreadConstructor;
    private static final Field inheritableThreadLocals;
    private static final Logger logger = Logger.getLogger(Finalizer.class.getName());
    private final WeakReference<Class<?>> finalizableReferenceClassReference;
    private final PhantomReference<Object> frqReference;
    private final ReferenceQueue<Object> queue;

    static {
        Constructor<Thread> bigThreadConstructor2 = getBigThreadConstructor();
        bigThreadConstructor = bigThreadConstructor2;
        inheritableThreadLocals = bigThreadConstructor2 == null ? getInheritableThreadLocalsField() : null;
    }

    private Finalizer(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.queue = referenceQueue;
        this.finalizableReferenceClassReference = new WeakReference<>(cls);
        this.frqReference = phantomReference;
    }

    private boolean cleanUp(Reference<?> reference) {
        Reference<? extends Object> poll;
        Method finalizeReferentMethod = getFinalizeReferentMethod();
        if (finalizeReferentMethod == null || !finalizeReference(reference, finalizeReferentMethod)) {
            return false;
        }
        do {
            poll = this.queue.poll();
            if (poll == null) {
                return true;
            }
        } while (finalizeReference(poll, finalizeReferentMethod));
        return false;
    }

    private boolean finalizeReference(Reference<?> reference, Method method) {
        reference.clear();
        if (reference == this.frqReference) {
            return false;
        }
        try {
            method.invoke(reference, null);
            return true;
        } catch (Throwable th) {
            logger.log(Level.SEVERE, "Error cleaning up after reference.", th);
            return true;
        }
    }

    private static Constructor<Thread> getBigThreadConstructor() {
        try {
            return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, Long.TYPE, Boolean.TYPE);
        } catch (Throwable unused) {
            return null;
        }
    }

    private Method getFinalizeReferentMethod() {
        Class<?> cls = this.finalizableReferenceClassReference.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", null);
        } catch (NoSuchMethodException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }

    private static Field getInheritableThreadLocalsField() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(10:5|6|7|(1:9)|10|11|12|(1:14)|16|17)|24|(0)|10|11|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        com.google.common.base.internal.Finalizer.logger.log(java.util.logging.Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:12:0x0045, B:14:0x0049), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void startFinalizer(java.lang.Class<?> r4, java.lang.ref.ReferenceQueue<java.lang.Object> r5, java.lang.ref.PhantomReference<java.lang.Object> r6) {
        /*
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "com.google.common.base.FinalizableReference"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5b
            com.google.common.base.internal.Finalizer r0 = new com.google.common.base.internal.Finalizer
            r0.<init>(r4, r5, r6)
            java.lang.Class<com.google.common.base.internal.Finalizer> r4 = com.google.common.base.internal.Finalizer.class
            java.lang.String r4 = r4.getName()
            java.lang.reflect.Constructor<java.lang.Thread> r5 = com.google.common.base.internal.Finalizer.bigThreadConstructor
            r6 = 0
            if (r5 == 0) goto L39
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r0, r4, r1, r2}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.newInstance(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Thread r5 = (java.lang.Thread) r5     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r5 = move-exception
            java.util.logging.Logger r1 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r3 = "Failed to create a thread without inherited thread-local values"
            r1.log(r2, r3, r5)
        L39:
            r5 = r6
        L3a:
            if (r5 != 0) goto L41
            java.lang.Thread r5 = new java.lang.Thread
            r5.<init>(r6, r0, r4)
        L41:
            r4 = 1
            r5.setDaemon(r4)
            java.lang.reflect.Field r4 = com.google.common.base.internal.Finalizer.inheritableThreadLocals     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L57
            r4.set(r5, r6)     // Catch: java.lang.Throwable -> L4d
            goto L57
        L4d:
            r4 = move-exception
            java.util.logging.Logger r6 = com.google.common.base.internal.Finalizer.logger
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            java.lang.String r1 = "Failed to clear thread local values inherited by reference finalizer thread."
            r6.log(r0, r1, r4)
        L57:
            r5.start()
            return
        L5b:
            java.lang.String r4 = "Expected com.google.common.base.FinalizableReference."
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.internal.Finalizer.startFinalizer(java.lang.Class, java.lang.ref.ReferenceQueue, java.lang.ref.PhantomReference):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        while (cleanUp(this.queue.remove())) {
        }
    }
}
