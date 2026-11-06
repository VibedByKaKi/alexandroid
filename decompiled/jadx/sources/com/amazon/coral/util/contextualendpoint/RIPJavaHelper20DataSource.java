package com.amazon.coral.util.contextualendpoint;

import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class RIPJavaHelper20DataSource implements DataSource {
    private final Class<?> iRIPHelperClass;
    private final Object iRIPHelperObject;
    private static final Logger LOGGER = LogManager.getLogger((Class<?>) RIPJavaHelper20DataSource.class);
    static final RIPJavaHelper20DataSource INSTANCE = newInstance();

    private RIPJavaHelper20DataSource(Object obj, Class<?> cls) {
        this.iRIPHelperObject = obj;
        this.iRIPHelperClass = cls;
    }

    private static RIPJavaHelper20DataSource newInstance() {
        try {
            Method declaredMethod = Class.forName("com.amazonaws.rip.RIPHelper").getDeclaredMethod("local", null);
            return new RIPJavaHelper20DataSource(declaredMethod.invoke(null, null), declaredMethod.getReturnType());
        } catch (Throwable th) {
            LOGGER.debug("Could not reflectively retrieve RIPJavaHelper-2.0", th);
            return null;
        }
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public String getRegion() {
        try {
            Method method = this.iRIPHelperClass.getMethod("currentRegion", null);
            return (String) method.getReturnType().getMethod("regionName", null).invoke(method.invoke(this.iRIPHelperObject, null), null);
        } catch (Throwable th) {
            throw new UnsupportedOperationException("Could not retrieve region from RIPJavaHelper-2.0", th);
        }
    }
}
