package com.amazon.coral.reflect;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InvocationException extends RuntimeException {
    private InvocationException(String str) {
        super(str);
    }

    public static InvocationException newIllegalAccess(Invoker invoker, Throwable th) {
        return new InvocationException("Could not invoke " + invoker + " due to access restrictions", th);
    }

    public static InvocationException newInstantiationException(Invoker invoker) {
        return new InvocationException(invoker + " can not instantiate using " + invoker);
    }

    public static Throwable newInvocationTargetException(Invoker invoker, Throwable th) {
        if ((th instanceof IllegalAccessError) && invoker.getClass().getName().equals(th.getStackTrace()[0].getClassName())) {
            return new InvocationException("Could not invoke " + invoker + " due to access restrictions");
        }
        return new InvocationException(invoker + " threw an exception", th);
    }

    public static InvocationException newTargetMustBeNull(Invoker invoker) {
        return new InvocationException(invoker + " must have a null target");
    }

    public static InvocationException newTargetMustNotBeNull(Invoker invoker) {
        return new InvocationException(invoker + " must NOT have a null target");
    }

    public static InvocationException newWrongSortOfParameters(Invoker invoker, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append(invoker);
        sb.append(" was given the wrong parameters (");
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                sb.append('V');
            } else {
                sb.append(AsmUtils.getDescriptor(obj.getClass()));
            }
        }
        sb.append(')');
        return new InvocationException(sb.toString());
    }

    public static InvocationException newWrongSortOfTarget(Invoker invoker, Object obj) {
        return new InvocationException(invoker + " was given the wrong target " + AsmUtils.getDescriptor(obj.getClass()));
    }

    public InvocationException(String str, Throwable th) {
        super(str, th);
    }

    public static InvocationException newIllegalAccess(Invoker invoker) {
        return newIllegalAccess(invoker, null);
    }

    public static InvocationException newInvocationTargetException(Invoker invoker, Class<?> cls, String str, InvocationTargetException invocationTargetException) {
        return new InvocationException(invoker + " threw an exception", invocationTargetException.getTargetException());
    }
}
