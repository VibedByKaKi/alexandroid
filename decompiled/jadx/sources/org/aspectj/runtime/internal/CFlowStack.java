package org.aspectj.runtime.internal;

import androidx.camera.core.processing.util.GLUtils;
import java.util.Stack;
import org.apache.commons.lang3.SystemProperties;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.runtime.CFlow;
import org.aspectj.runtime.internal.cflowstack.ThreadStack;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactory;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl;
import org.aspectj.runtime.internal.cflowstack.ThreadStackFactoryImpl11;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class CFlowStack {
    private static ThreadStackFactory tsFactory;
    private ThreadStack stackProxy = tsFactory.getNewThreadStack();

    static {
        selectFactoryForVMVersion();
    }

    private static String getSystemPropertyWithoutSecurityException(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (SecurityException unused) {
            return str2;
        }
    }

    private static ThreadStackFactory getThreadLocalStackFactory() {
        return new ThreadStackFactoryImpl();
    }

    private static ThreadStackFactory getThreadLocalStackFactoryFor11() {
        return new ThreadStackFactoryImpl11();
    }

    private Stack getThreadStack() {
        return this.stackProxy.getThreadStack();
    }

    public static String getThreadStackFactoryClassName() {
        return tsFactory.getClass().getName();
    }

    private static void selectFactoryForVMVersion() {
        String systemPropertyWithoutSecurityException = getSystemPropertyWithoutSecurityException("aspectj.runtime.cflowstack.usethreadlocal", "unspecified");
        if (!systemPropertyWithoutSecurityException.equals("unspecified") ? !(systemPropertyWithoutSecurityException.equals("yes") || systemPropertyWithoutSecurityException.equals("true")) : System.getProperty(SystemProperties.JAVA_CLASS_VERSION, GLUtils.VERSION_UNKNOWN).compareTo("46.0") < 0) {
            tsFactory = getThreadLocalStackFactory();
        } else {
            tsFactory = getThreadLocalStackFactoryFor11();
        }
    }

    public Object get(int i) {
        CFlow peekCFlow = peekCFlow();
        if (peekCFlow == null) {
            return null;
        }
        return peekCFlow.get(i);
    }

    public boolean isValid() {
        return !getThreadStack().isEmpty();
    }

    public Object peek() {
        Stack threadStack = getThreadStack();
        if (threadStack.isEmpty()) {
            throw new NoAspectBoundException();
        }
        return threadStack.peek();
    }

    public CFlow peekCFlow() {
        Stack threadStack = getThreadStack();
        if (threadStack.isEmpty()) {
            return null;
        }
        return (CFlow) threadStack.peek();
    }

    public Object peekInstance() {
        CFlow peekCFlow = peekCFlow();
        if (peekCFlow != null) {
            return peekCFlow.getAspect();
        }
        throw new NoAspectBoundException();
    }

    public CFlow peekTopCFlow() {
        Stack threadStack = getThreadStack();
        if (threadStack.isEmpty()) {
            return null;
        }
        return (CFlow) threadStack.elementAt(0);
    }

    public void pop() {
        Stack threadStack = getThreadStack();
        threadStack.pop();
        if (threadStack.isEmpty()) {
            this.stackProxy.removeThreadStack();
        }
    }

    public void push(Object[] objArr) {
        getThreadStack().push(new CFlowPlusState(objArr));
    }

    public void pushInstance(Object obj) {
        getThreadStack().push(new CFlow(obj));
    }

    public void push(Object obj) {
        getThreadStack().push(obj);
    }
}
