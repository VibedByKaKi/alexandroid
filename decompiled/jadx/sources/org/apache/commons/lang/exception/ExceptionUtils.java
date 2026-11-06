package org.apache.commons.lang.exception;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ExceptionUtils {
    private static final Method THROWABLE_CAUSE_METHOD;
    private static final Method THROWABLE_INITCAUSE_METHOD;
    static final String WRAPPED_MARKER = " [wrapped] ";
    static /* synthetic */ Class class$java$lang$Throwable;
    private static final Object CAUSE_METHOD_NAMES_LOCK = new Object();
    private static String[] CAUSE_METHOD_NAMES = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    static {
        Method method;
        Method method2 = null;
        try {
            Class cls = class$java$lang$Throwable;
            if (cls == null) {
                cls = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls;
            }
            method = cls.getMethod("getCause", null);
        } catch (Exception unused) {
            method = null;
        }
        THROWABLE_CAUSE_METHOD = method;
        try {
            Class cls2 = class$java$lang$Throwable;
            if (cls2 == null) {
                cls2 = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls2;
            }
            Class cls3 = class$java$lang$Throwable;
            if (cls3 == null) {
                cls3 = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls3;
            }
            method2 = cls2.getMethod("initCause", cls3);
        } catch (Exception unused2) {
        }
        THROWABLE_INITCAUSE_METHOD = method2;
    }

    public static void addCauseMethodName(String str) {
        if (!StringUtils.isNotEmpty(str) || isCauseMethodName(str)) {
            return;
        }
        ArrayList causeMethodNameList = getCauseMethodNameList();
        if (causeMethodNameList.add(str)) {
            synchronized (CAUSE_METHOD_NAMES_LOCK) {
                CAUSE_METHOD_NAMES = toArray(causeMethodNameList);
            }
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static Throwable getCause(Throwable th, String[] strArr) {
        String str;
        if (th == null) {
            return null;
        }
        Throwable causeUsingWellKnownTypes = getCauseUsingWellKnownTypes(th);
        if (causeUsingWellKnownTypes == null) {
            if (strArr == null) {
                synchronized (CAUSE_METHOD_NAMES_LOCK) {
                    strArr = CAUSE_METHOD_NAMES;
                }
            }
            for (int i = 0; i < strArr.length && ((str = strArr[i]) == null || (causeUsingWellKnownTypes = getCauseUsingMethodName(th, str)) == null); i++) {
            }
            if (causeUsingWellKnownTypes == null) {
                return getCauseUsingFieldName(th, MessagingControllerConstant.MESSAGING_CONTROLLER_DETAIL_KEY);
            }
        }
        return causeUsingWellKnownTypes;
    }

    private static ArrayList getCauseMethodNameList() {
        ArrayList arrayList;
        synchronized (CAUSE_METHOD_NAMES_LOCK) {
            arrayList = new ArrayList(Arrays.asList(CAUSE_METHOD_NAMES));
        }
        return arrayList;
    }

    private static Throwable getCauseUsingFieldName(Throwable th, String str) {
        Field field;
        try {
            field = th.getClass().getField(str);
        } catch (NoSuchFieldException | SecurityException unused) {
            field = null;
        }
        if (field != null) {
            Class cls = class$java$lang$Throwable;
            if (cls == null) {
                cls = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls;
            }
            if (cls.isAssignableFrom(field.getType())) {
                try {
                    return (Throwable) field.get(th);
                } catch (IllegalAccessException | IllegalArgumentException unused2) {
                }
            }
        }
        return null;
    }

    private static Throwable getCauseUsingMethodName(Throwable th, String str) {
        Method method;
        try {
            method = th.getClass().getMethod(str, null);
        } catch (NoSuchMethodException | SecurityException unused) {
            method = null;
        }
        if (method != null) {
            Class cls = class$java$lang$Throwable;
            if (cls == null) {
                cls = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls;
            }
            if (cls.isAssignableFrom(method.getReturnType())) {
                try {
                    return (Throwable) method.invoke(th, ArrayUtils.EMPTY_OBJECT_ARRAY);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Throwable getCauseUsingWellKnownTypes(Throwable th) {
        if (th instanceof Nestable) {
            return ((Nestable) th).getCause();
        }
        if (th instanceof SQLException) {
            return ((SQLException) th).getNextException();
        }
        if (th instanceof InvocationTargetException) {
            return ((InvocationTargetException) th).getTargetException();
        }
        return null;
    }

    public static String getFullStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        Throwable[] throwables = getThrowables(th);
        for (int i = 0; i < throwables.length; i++) {
            throwables[i].printStackTrace(printWriter);
            if (isNestedThrowable(throwables[i])) {
                break;
            }
        }
        return stringWriter.getBuffer().toString();
    }

    public static String getMessage(Throwable th) {
        if (th == null) {
            return "";
        }
        String shortClassName = ClassUtils.getShortClassName(th, null);
        String message = th.getMessage();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(shortClassName);
        stringBuffer.append(": ");
        stringBuffer.append(StringUtils.defaultString(message));
        return stringBuffer.toString();
    }

    public static Throwable getRootCause(Throwable th) {
        List throwableList = getThrowableList(th);
        if (throwableList.size() < 2) {
            return null;
        }
        return (Throwable) ErrorUtils$$ExternalSyntheticOutline0.m(throwableList, 1);
    }

    public static String getRootCauseMessage(Throwable th) {
        Throwable rootCause = getRootCause(th);
        if (rootCause != null) {
            th = rootCause;
        }
        return getMessage(th);
    }

    public static String[] getRootCauseStackTrace(Throwable th) {
        List list;
        if (th == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        Throwable[] throwables = getThrowables(th);
        int length = throwables.length;
        ArrayList arrayList = new ArrayList();
        int i = length - 1;
        List stackFrameList = getStackFrameList(throwables[i]);
        while (true) {
            int i2 = length - 1;
            if (i2 < 0) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            if (i2 != 0) {
                list = getStackFrameList(throwables[length - 2]);
                removeCommonFrames(stackFrameList, list);
            } else {
                list = stackFrameList;
            }
            if (i2 == i) {
                arrayList.add(throwables[i2].toString());
            } else {
                StringBuffer stringBuffer = new StringBuffer(WRAPPED_MARKER);
                stringBuffer.append(throwables[i2].toString());
                arrayList.add(stringBuffer.toString());
            }
            for (int i3 = 0; i3 < stackFrameList.size(); i3++) {
                arrayList.add(stackFrameList.get(i3));
            }
            stackFrameList = list;
            length = i2;
        }
    }

    public static List getStackFrameList(Throwable th) {
        StringTokenizer stringTokenizer = new StringTokenizer(getStackTrace(th), SystemUtils.LINE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().length() == 0) {
                arrayList.add(nextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }

    public static String[] getStackFrames(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, SystemUtils.LINE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return toArray(arrayList);
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static int getThrowableCount(Throwable th) {
        return getThrowableList(th).size();
    }

    public static List getThrowableList(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = getCause(th);
        }
        return arrayList;
    }

    public static Throwable[] getThrowables(Throwable th) {
        List throwableList = getThrowableList(th);
        return (Throwable[]) throwableList.toArray(new Throwable[throwableList.size()]);
    }

    private static int indexOf(Throwable th, Class cls, int i, boolean z) {
        if (th != null && cls != null) {
            if (i < 0) {
                i = 0;
            }
            Throwable[] throwables = getThrowables(th);
            if (i >= throwables.length) {
                return -1;
            }
            if (z) {
                while (i < throwables.length) {
                    if (cls.isAssignableFrom(throwables[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < throwables.length) {
                    if (cls.equals(throwables[i].getClass())) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    public static int indexOfThrowable(Throwable th, Class cls) {
        return indexOf(th, cls, 0, false);
    }

    public static int indexOfType(Throwable th, Class cls) {
        return indexOf(th, cls, 0, true);
    }

    public static boolean isCauseMethodName(String str) {
        boolean z;
        synchronized (CAUSE_METHOD_NAMES_LOCK) {
            z = ArrayUtils.indexOf(CAUSE_METHOD_NAMES, str) >= 0;
        }
        return z;
    }

    public static boolean isNestedThrowable(Throwable th) {
        if (th == null) {
            return false;
        }
        if ((th instanceof Nestable) || (th instanceof SQLException) || (th instanceof InvocationTargetException) || isThrowableNested()) {
            return true;
        }
        Class<?> cls = th.getClass();
        synchronized (CAUSE_METHOD_NAMES_LOCK) {
            try {
                int length = CAUSE_METHOD_NAMES.length;
                for (int i = 0; i < length; i++) {
                    try {
                        Method method = cls.getMethod(CAUSE_METHOD_NAMES[i], null);
                        if (method == null) {
                            continue;
                        } else {
                            Class cls2 = class$java$lang$Throwable;
                            if (cls2 == null) {
                                cls2 = class$("java.lang.Throwable");
                                class$java$lang$Throwable = cls2;
                            }
                            if (cls2.isAssignableFrom(method.getReturnType())) {
                                return true;
                            }
                        }
                    } catch (NoSuchMethodException | SecurityException unused) {
                    }
                }
                return cls.getField(MessagingControllerConstant.MESSAGING_CONTROLLER_DETAIL_KEY) != null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isThrowableNested() {
        return THROWABLE_CAUSE_METHOD != null;
    }

    public static void printRootCauseStackTrace(Throwable th, PrintStream printStream) {
        if (th == null) {
            return;
        }
        if (printStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The PrintStream must not be null");
            return;
        }
        for (String str : getRootCauseStackTrace(th)) {
            printStream.println(str);
        }
        printStream.flush();
    }

    public static void removeCauseMethodName(String str) {
        if (StringUtils.isNotEmpty(str)) {
            ArrayList causeMethodNameList = getCauseMethodNameList();
            if (causeMethodNameList.remove(str)) {
                synchronized (CAUSE_METHOD_NAMES_LOCK) {
                    CAUSE_METHOD_NAMES = toArray(causeMethodNameList);
                }
            }
        }
    }

    public static void removeCommonFrames(List list, List list2) {
        if (list == null || list2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The List must not be null");
            return;
        }
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b A[Catch: IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002f, TryCatch #0 {IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x002f, blocks: (B:6:0x0011, B:8:0x001b, B:9:0x0023), top: B:5:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean setCause(java.lang.Throwable r5, java.lang.Throwable r6) {
        /*
            if (r5 == 0) goto L31
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.reflect.Method r0 = org.apache.commons.lang.exception.ExceptionUtils.THROWABLE_INITCAUSE_METHOD
            r1 = 1
            if (r0 == 0) goto L10
            r0.invoke(r5, r6)     // Catch: java.lang.Throwable -> L10
            r0 = r1
            goto L11
        L10:
            r0 = 0
        L11:
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "setCause"
            java.lang.Class r4 = org.apache.commons.lang.exception.ExceptionUtils.class$java$lang$Throwable     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L23
            java.lang.String r4 = "java.lang.Throwable"
            java.lang.Class r4 = class$(r4)     // Catch: java.lang.Throwable -> L2f
            org.apache.commons.lang.exception.ExceptionUtils.class$java$lang$Throwable = r4     // Catch: java.lang.Throwable -> L2f
        L23:
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L2f
            r2.invoke(r5, r6)     // Catch: java.lang.Throwable -> L2f
            goto L30
        L2f:
            r1 = r0
        L30:
            return r1
        L31:
            org.apache.commons.lang.NullArgumentException r5 = new org.apache.commons.lang.NullArgumentException
            java.lang.String r6 = "target"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.exception.ExceptionUtils.setCause(java.lang.Throwable, java.lang.Throwable):boolean");
    }

    private static String[] toArray(List list) {
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static int indexOfThrowable(Throwable th, Class cls, int i) {
        return indexOf(th, cls, i, false);
    }

    public static int indexOfType(Throwable th, Class cls, int i) {
        return indexOf(th, cls, i, true);
    }

    public static String[] getStackFrames(Throwable th) {
        if (th == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return getStackFrames(getStackTrace(th));
    }

    public static void printRootCauseStackTrace(Throwable th) {
        printRootCauseStackTrace(th, System.err);
    }

    public static void printRootCauseStackTrace(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        if (printWriter != null) {
            for (String str : getRootCauseStackTrace(th)) {
                printWriter.println(str);
            }
            printWriter.flush();
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The PrintWriter must not be null");
    }

    public static Throwable getCause(Throwable th) {
        Throwable cause;
        synchronized (CAUSE_METHOD_NAMES_LOCK) {
            cause = getCause(th, CAUSE_METHOD_NAMES);
        }
        return cause;
    }
}
