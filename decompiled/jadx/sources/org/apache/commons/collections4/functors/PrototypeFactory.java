package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.FunctorException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PrototypeFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PrototypeCloneFactory<T> implements Factory<T> {
        private transient Method iCloneMethod;
        private final T iPrototype;

        private PrototypeCloneFactory(T t, Method method) {
            this.iPrototype = t;
            this.iCloneMethod = method;
        }

        private void findCloneMethod() {
            try {
                this.iCloneMethod = this.iPrototype.getClass().getMethod("clone", null);
            } catch (NoSuchMethodException unused) {
                Single$$ExternalSyntheticBUOutline0.m$3("PrototypeCloneFactory: The clone method must exist and be public ");
            }
        }

        @Override // org.apache.commons.collections4.Factory
        public T create() {
            if (this.iCloneMethod == null) {
                findCloneMethod();
            }
            try {
                return (T) this.iCloneMethod.invoke(this.iPrototype, null);
            } catch (IllegalAccessException e) {
                throw new FunctorException("PrototypeCloneFactory: Clone method must be public", e);
            } catch (InvocationTargetException e2) {
                throw new FunctorException("PrototypeCloneFactory: Clone method threw an exception", e2);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PrototypeSerializationFactory<T extends Serializable> implements Factory<T> {
        private final T iPrototype;

        private PrototypeSerializationFactory(T t) {
            this.iPrototype = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r4v0, types: [org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory, org.apache.commons.collections4.functors.PrototypeFactory$PrototypeSerializationFactory<T extends java.io.Serializable>] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.io.ByteArrayInputStream] */
        @Override // org.apache.commons.collections4.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T create() {
            /*
                r4 = this;
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                r1 = 512(0x200, float:7.17E-43)
                r0.<init>(r1)
                r1 = 0
                java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                T extends java.io.Serializable r4 = r4.iPrototype     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                r2.writeObject(r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                r4.<init>(r2)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L38 java.lang.ClassNotFoundException -> L3d
                java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.lang.ClassNotFoundException -> L31
                r1.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.lang.ClassNotFoundException -> L31
                java.lang.Object r1 = r1.readObject()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.lang.ClassNotFoundException -> L31
                java.io.Serializable r1 = (java.io.Serializable) r1     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.lang.ClassNotFoundException -> L31
                r4.close()     // Catch: java.io.IOException -> L29
            L29:
                r0.close()     // Catch: java.io.IOException -> L2c
            L2c:
                return r1
            L2d:
                r1 = move-exception
                goto L4e
            L2f:
                r1 = move-exception
                goto L42
            L31:
                r1 = move-exception
                goto L48
            L33:
                r4 = move-exception
                r3 = r1
                r1 = r4
                r4 = r3
                goto L4e
            L38:
                r4 = move-exception
                r3 = r1
                r1 = r4
                r4 = r3
                goto L42
            L3d:
                r4 = move-exception
                r3 = r1
                r1 = r4
                r4 = r3
                goto L48
            L42:
                org.apache.commons.collections4.FunctorException r2 = new org.apache.commons.collections4.FunctorException     // Catch: java.lang.Throwable -> L2d
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
                throw r2     // Catch: java.lang.Throwable -> L2d
            L48:
                org.apache.commons.collections4.FunctorException r2 = new org.apache.commons.collections4.FunctorException     // Catch: java.lang.Throwable -> L2d
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L2d
                throw r2     // Catch: java.lang.Throwable -> L2d
            L4e:
                if (r4 == 0) goto L53
                r4.close()     // Catch: java.io.IOException -> L53
            L53:
                r0.close()     // Catch: java.io.IOException -> L56
            L56:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.collections4.functors.PrototypeFactory.PrototypeSerializationFactory.create():java.io.Serializable");
        }
    }

    private PrototypeFactory() {
    }

    public static <T> Factory<T> prototypeFactory(T t) {
        if (t == null) {
            return ConstantFactory.constantFactory(null);
        }
        try {
            try {
                return new PrototypeCloneFactory(t, t.getClass().getMethod("clone", null));
            } catch (NoSuchMethodException unused) {
                t.getClass().getConstructor(t.getClass());
                return new InstantiateFactory(t.getClass(), new Class[]{t.getClass()}, new Object[]{t});
            }
        } catch (NoSuchMethodException unused2) {
            if (t instanceof Serializable) {
                return new PrototypeSerializationFactory((Serializable) t);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("The prototype must be cloneable via a public clone method");
            return null;
        }
    }
}
