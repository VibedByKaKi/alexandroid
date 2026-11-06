package org.apache.commons.lang;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Validate {
    public static void allElementsOfType(Collection collection, Class cls) {
        notNull(collection);
        notNull(cls);
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!cls.isInstance(it2.next())) {
                StringBuffer stringBuffer = new StringBuffer("The validated collection contains an element not of type ");
                stringBuffer.append(cls.getName());
                stringBuffer.append(" at index: ");
                stringBuffer.append(i);
                XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                return;
            }
            i++;
        }
    }

    public static void isTrue(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(obj);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void noNullElements(Collection collection) {
        notNull(collection);
        Iterator it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next() == null) {
                StringBuffer stringBuffer = new StringBuffer("The validated collection contains null element at index: ");
                stringBuffer.append(i);
                XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                return;
            }
            i++;
        }
    }

    public static void notEmpty(Collection collection, String str) {
        if (collection == null || collection.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void notNull(Object obj) {
        notNull(obj, "The validated object is null");
    }

    public static void notEmpty(Object[] objArr) {
        notEmpty(objArr, "The validated array is empty");
    }

    public static void notEmpty(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void notEmpty(Collection collection) {
        notEmpty(collection, "The validated collection is empty");
    }

    public static void notEmpty(Map map, String str) {
        if (map == null || map.size() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(str);
        }
    }

    public static void isTrue(boolean z, String str, long j) {
        if (z) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(j);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void isTrue(boolean z, String str, double d) {
        if (z) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(d);
        XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
    }

    public static void notEmpty(Map map) {
        notEmpty(map, "The validated map is empty");
    }

    public static void isTrue(boolean z, String str) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void notEmpty(String str, String str2) {
        if (str == null || str.length() == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3(str2);
        }
    }

    public static void isTrue(boolean z) {
        if (z) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The validated expression is false");
    }

    public static void notEmpty(String str) {
        notEmpty(str, "The validated string is empty");
    }

    public static void noNullElements(Object[] objArr) {
        notNull(objArr);
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                StringBuffer stringBuffer = new StringBuffer("The validated array contains null element at index: ");
                stringBuffer.append(i);
                XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                return;
            }
        }
    }

    public static void noNullElements(Collection collection, String str) {
        notNull(collection);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }

    public static void noNullElements(Object[] objArr, String str) {
        notNull(objArr);
        for (Object obj : objArr) {
            if (obj == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }

    public static void allElementsOfType(Collection collection, Class cls, String str) {
        notNull(collection);
        notNull(cls);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!cls.isInstance(it2.next())) {
                Single$$ExternalSyntheticBUOutline0.m$3(str);
                return;
            }
        }
    }
}
