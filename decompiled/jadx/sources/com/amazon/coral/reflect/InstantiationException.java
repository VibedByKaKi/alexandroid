package com.amazon.coral.reflect;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InstantiationException extends RuntimeException {
    public InstantiationException() {
    }

    public static InstantiationException newIllegalAccess(Instantiator<?> instantiator) {
        return new InstantiationException("Could not invoke " + instantiator + " due to access restrictions");
    }

    public static InstantiationException newInstantiationException(Instantiator<?> instantiator) {
        return new InstantiationException(instantiator + " can not instantiate using " + instantiator);
    }

    public static InstantiationException newInvocationTargetException(Instantiator<?> instantiator, Throwable th) {
        return th instanceof InvocationTargetException ? new InstantiationException(((InvocationTargetException) th).getTargetException()) : new InstantiationException(th);
    }

    public static InstantiationException newWrongSortOfParameters(Instantiator<?> instantiator, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append(instantiator);
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
        return new InstantiationException(sb.toString());
    }

    public static InstantiationException newWrongSortOfTarget(Instantiator<?> instantiator, Object obj) {
        return new InstantiationException(instantiator + " was given the wrong target " + AsmUtils.getDescriptor(obj.getClass()));
    }

    public InstantiationException(String str) {
        super(str);
    }

    public InstantiationException(String str, Throwable th) {
        super(str, th);
    }

    public InstantiationException(Throwable th) {
        super(th);
    }
}
