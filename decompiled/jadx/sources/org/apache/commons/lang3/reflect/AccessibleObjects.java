package org.apache.commons.lang3.reflect;

import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class AccessibleObjects {
    public static boolean isAccessible(AccessibleObject accessibleObject) {
        return accessibleObject == null || accessibleObject.isAccessible();
    }

    public static boolean setAccessible(AccessibleObject accessibleObject) {
        if (isAccessible(accessibleObject)) {
            return false;
        }
        accessibleObject.setAccessible(true);
        return true;
    }
}
