package com.amazon.coral.reflect.invoke;

import com.amazon.coral.reflect.InvocationException;
import com.amazon.coral.reflect.Invoker;
import com.amazon.coral.reflect.InvokerFactory;
import com.amazon.coral.reflect.Signature;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReflectiveInvokerFactory implements InvokerFactory {
    private final boolean unprotect;

    public ReflectiveInvokerFactory(boolean z) {
        this.unprotect = z;
    }

    @Override // com.amazon.coral.reflect.InvokerFactory
    public <T> Invoker newInvoker(Class<T> cls, String str, Class<?>... clsArr) {
        try {
            final Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            return new AbstractInvoker(new Signature(cls, declaredMethod.getReturnType(), str, clsArr), declaredMethod.getDeclaredAnnotations()) { // from class: com.amazon.coral.reflect.invoke.ReflectiveInvokerFactory.1
                @Override // com.amazon.coral.reflect.Invoker
                public Object invoke(Object obj, Object... objArr) throws InvocationException {
                    if (Modifier.isStatic(declaredMethod.getModifiers())) {
                        if (obj != null) {
                            throw InvocationException.newTargetMustBeNull(this);
                        }
                    } else if (obj != null && !declaredMethod.getDeclaringClass().isInstance(obj)) {
                        throw InvocationException.newWrongSortOfTarget(this, obj);
                    }
                    try {
                        if (ReflectiveInvokerFactory.this.unprotect) {
                            try {
                                declaredMethod.setAccessible(true);
                            } catch (Throwable unused) {
                            }
                        }
                        return declaredMethod.invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
                        throw InvocationException.newIllegalAccess(this, e);
                    } catch (IllegalArgumentException unused2) {
                        throw InvocationException.newWrongSortOfParameters(this, objArr);
                    } catch (NullPointerException unused3) {
                        throw InvocationException.newTargetMustNotBeNull(this);
                    } catch (InvocationTargetException e2) {
                        throw InvocationException.newInvocationTargetException(this, declaredMethod.getDeclaringClass(), declaredMethod.getName(), e2);
                    }
                }
            };
        } catch (Throwable th) {
            Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Could not obtain a Method for ", str, " with the given signature"), th);
            return null;
        }
    }

    public ReflectiveInvokerFactory() {
        this(false);
    }
}
