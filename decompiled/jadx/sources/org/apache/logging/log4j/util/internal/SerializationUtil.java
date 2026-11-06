package org.apache.logging.log4j.util.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.internal.annotation.SuppressFBWarnings;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.FilteredObjectInputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class SerializationUtil {
    private static final String DEFAULT_FILTER_CLASS = "org.apache.logging.log4j.util.internal.DefaultObjectInputFilter";
    public static final List<String> REQUIRED_JAVA_CLASSES;
    public static final List<String> REQUIRED_JAVA_PACKAGES;
    private static final Method getObjectInputFilter;
    private static final Method newObjectInputFilter;
    private static final Method setObjectInputFilter;

    static {
        Method method = null;
        int i = 0;
        Method method2 = null;
        Method method3 = null;
        for (Method method4 : ObjectInputStream.class.getMethods()) {
            if (method4.getName().equals("setObjectInputFilter")) {
                method2 = method4;
            } else if (method4.getName().equals("getObjectInputFilter")) {
                method3 = method4;
            }
        }
        if (method2 != null) {
            try {
                Method[] methods = Class.forName(DEFAULT_FILTER_CLASS).getMethods();
                int length = methods.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method5 = methods[i];
                    if (method5.getName().equals(SmartFragmentEventProcessor.NEW_INSTANCE) && Modifier.isStatic(method5.getModifiers())) {
                        method = method5;
                        break;
                    }
                    i++;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        newObjectInputFilter = method;
        setObjectInputFilter = method2;
        getObjectInputFilter = method3;
        REQUIRED_JAVA_CLASSES = Arrays.asList("java.math.BigDecimal", "java.math.BigInteger", "java.rmi.MarshalledObject", TypedValues.Custom.S_BOOLEAN, "byte", "char", "double", TypedValues.Custom.S_FLOAT, "int", "long", "short");
        REQUIRED_JAVA_PACKAGES = Arrays.asList("java.lang.", "java.time.", "java.util.", "org.apache.logging.log4j.");
    }

    private SerializationUtil() {
    }

    public static void assertFiltered(ObjectInputStream objectInputStream) {
        if ((objectInputStream instanceof FilteredObjectInputStream) || setObjectInputFilter != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("readObject requires a FilteredObjectInputStream or an ObjectInputStream that accepts an ObjectInputFilter");
    }

    @SuppressFBWarnings(justification = "Object deserialization uses either Java 9 native filter or our custom filter to limit the kinds of classes deserialized.", value = {"OBJECT_DESERIALIZATION"})
    public static Object readWrappedObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream2;
        assertFiltered(objectInputStream);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) objectInputStream.readObject());
        if (objectInputStream instanceof FilteredObjectInputStream) {
            objectInputStream2 = new FilteredObjectInputStream(byteArrayInputStream, ((FilteredObjectInputStream) objectInputStream).getAllowedClasses());
        } else {
            try {
                Object invoke = newObjectInputFilter.invoke(null, getObjectInputFilter.invoke(objectInputStream, null));
                objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
                setObjectInputFilter.invoke(objectInputStream2, invoke);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new StreamCorruptedException("Unable to set ObjectInputFilter on stream");
            }
        }
        try {
            return objectInputStream2.readObject();
        } catch (Exception | LinkageError e) {
            StatusLogger.getLogger().warn("Ignoring {} during deserialization", e.getMessage());
            return null;
        } finally {
            objectInputStream2.close();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r0.equals("D") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String stripArray(java.lang.String r6) {
        /*
            r0 = 91
            int r0 = r6.lastIndexOf(r0)
            int r1 = r0 + 1
            if (r1 != 0) goto Lb
            return r6
        Lb:
            char r2 = r6.charAt(r1)
            r3 = 76
            r4 = 2
            r5 = 1
            if (r2 != r3) goto L1b
            int r0 = r0 + r4
            java.lang.String r6 = androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0.m(r5, r0, r6)
            return r6
        L1b:
            java.lang.String r0 = r6.substring(r1)
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case 66: goto L74;
                case 67: goto L69;
                case 68: goto L60;
                case 70: goto L55;
                case 73: goto L4a;
                case 74: goto L3f;
                case 83: goto L34;
                case 90: goto L29;
                default: goto L27;
            }
        L27:
            r4 = r2
            goto L7e
        L29:
            java.lang.String r1 = "Z"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L27
        L32:
            r4 = 7
            goto L7e
        L34:
            java.lang.String r1 = "S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L27
        L3d:
            r4 = 6
            goto L7e
        L3f:
            java.lang.String r1 = "J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L27
        L48:
            r4 = 5
            goto L7e
        L4a:
            java.lang.String r1 = "I"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            goto L27
        L53:
            r4 = 4
            goto L7e
        L55:
            java.lang.String r1 = "F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L27
        L5e:
            r4 = 3
            goto L7e
        L60:
            java.lang.String r1 = "D"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e
            goto L27
        L69:
            java.lang.String r1 = "C"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L27
        L72:
            r4 = r5
            goto L7e
        L74:
            java.lang.String r1 = "B"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto L27
        L7d:
            r4 = 0
        L7e:
            switch(r4) {
                case 0: goto La3;
                case 1: goto La0;
                case 2: goto L9d;
                case 3: goto L9a;
                case 4: goto L97;
                case 5: goto L94;
                case 6: goto L91;
                case 7: goto L8e;
                default: goto L81;
            }
        L81:
            java.lang.String r0 = "Unsupported array class signature '"
            java.lang.String r1 = "'"
            java.lang.String r6 = defpackage.a$$ExternalSyntheticOutline0.m(r0, r6, r1)
            rx.Single$$ExternalSyntheticBUOutline0.m$3(r6)
            r6 = 0
            return r6
        L8e:
            java.lang.String r6 = "boolean"
            return r6
        L91:
            java.lang.String r6 = "short"
            return r6
        L94:
            java.lang.String r6 = "long"
            return r6
        L97:
            java.lang.String r6 = "int"
            return r6
        L9a:
            java.lang.String r6 = "float"
            return r6
        L9d:
            java.lang.String r6 = "double"
            return r6
        La0:
            java.lang.String r6 = "char"
            return r6
        La3:
            java.lang.String r6 = "byte"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.logging.log4j.util.internal.SerializationUtil.stripArray(java.lang.String):java.lang.String");
    }

    public static void writeWrappedObject(Serializable serializable, ObjectOutputStream objectOutputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
        try {
            objectOutputStream2.writeObject(serializable);
            objectOutputStream2.flush();
            objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
            objectOutputStream2.close();
        } catch (Throwable th) {
            try {
                objectOutputStream2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String stripArray(Class<?> cls) {
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.getName();
    }
}
