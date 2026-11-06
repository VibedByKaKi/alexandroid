package org.apache.logging.log4j.util;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class PrivateSecurityManagerStackTraceUtil {
    private static final PrivateSecurityManager SECURITY_MANAGER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PrivateSecurityManager extends SecurityManager {
        private PrivateSecurityManager() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    static {
        PrivateSecurityManager createPrivateSecurityManager = createPrivateSecurityManager();
        if (isCapable(createPrivateSecurityManager)) {
            SECURITY_MANAGER = createPrivateSecurityManager;
        } else {
            SECURITY_MANAGER = null;
        }
    }

    private PrivateSecurityManagerStackTraceUtil() {
    }

    private static PrivateSecurityManager createPrivateSecurityManager() {
        try {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new RuntimePermission("createSecurityManager"));
            }
            return new PrivateSecurityManager();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static Deque<Class<?>> getCurrentStackTrace() {
        Class<?>[] classContext = SECURITY_MANAGER.getClassContext();
        ArrayDeque arrayDeque = new ArrayDeque(classContext.length);
        Collections.addAll(arrayDeque, classContext);
        return arrayDeque;
    }

    private static boolean isCapable(PrivateSecurityManager privateSecurityManager) {
        if (privateSecurityManager == null) {
            return false;
        }
        try {
            Class<?>[] classContext = privateSecurityManager.getClassContext();
            if (classContext != null) {
                if (classContext.length != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isEnabled() {
        return SECURITY_MANAGER != null;
    }
}
