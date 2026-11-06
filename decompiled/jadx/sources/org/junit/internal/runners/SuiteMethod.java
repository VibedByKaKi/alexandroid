package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import junit.framework.Test;
import junit.runner.BaseTestRunner;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SuiteMethod extends JUnit38ClassRunner {
    public SuiteMethod(Class<?> cls) throws Throwable {
        super(testFromSuiteMethod(cls));
    }

    public static Test testFromSuiteMethod(Class<?> cls) throws Throwable {
        try {
            Method method = cls.getMethod(BaseTestRunner.SUITE_METHODNAME, null);
            if (Modifier.isStatic(method.getModifiers())) {
                return (Test) method.invoke(null, null);
            }
            throw new Exception(cls.getName().concat(".suite() must be static"));
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
