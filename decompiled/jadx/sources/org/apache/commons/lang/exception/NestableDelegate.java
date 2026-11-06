package org.apache.commons.lang.exception;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NestableDelegate implements Serializable {
    private static final transient String MUST_BE_THROWABLE = "The Nestable implementation passed to the NestableDelegate(Nestable) constructor must extend java.lang.Throwable";
    static /* synthetic */ Class class$org$apache$commons$lang$exception$Nestable = null;
    public static boolean matchSubclasses = true;
    private static final long serialVersionUID = 1;
    public static boolean topDown = true;
    public static boolean trimStackFrames = true;
    private Throwable nestable;

    /* JADX WARN: Multi-variable type inference failed */
    public NestableDelegate(Nestable nestable) {
        this.nestable = null;
        if (nestable instanceof Throwable) {
            this.nestable = (Throwable) nestable;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(MUST_BE_THROWABLE);
            throw null;
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public String getMessage(String str) {
        Throwable cause = ExceptionUtils.getCause(this.nestable);
        String message = cause == null ? null : cause.getMessage();
        if (cause == null || message == null) {
            return str;
        }
        if (str == null) {
            return message;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(": ");
        stringBuffer.append(message);
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String[] getMessages() {
        Throwable[] throwables = getThrowables();
        String[] strArr = new String[throwables.length];
        for (int i = 0; i < throwables.length; i++) {
            Class cls = class$org$apache$commons$lang$exception$Nestable;
            Class cls2 = cls;
            if (cls == null) {
                Class class$ = class$("org.apache.commons.lang.exception.Nestable");
                class$org$apache$commons$lang$exception$Nestable = class$;
                cls2 = class$;
            }
            strArr[i] = cls2.isInstance(throwables[i]) ? ((Nestable) throwables[i]).getMessage(0) : throwables[i].getMessage();
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String[] getStackFrames(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
        if (th instanceof Nestable) {
            ((Nestable) th).printPartialStackTrace(printWriter);
        } else {
            th.printStackTrace(printWriter);
        }
        return ExceptionUtils.getStackFrames(stringWriter.getBuffer().toString());
    }

    public Throwable getThrowable(int i) {
        return i == 0 ? this.nestable : getThrowables()[i];
    }

    public int getThrowableCount() {
        return ExceptionUtils.getThrowableCount(this.nestable);
    }

    public Throwable[] getThrowables() {
        return ExceptionUtils.getThrowables(this.nestable);
    }

    public int indexOfThrowable(Class cls, int i) {
        if (cls == null) {
            return -1;
        }
        if (i < 0) {
            StringBuffer stringBuffer = new StringBuffer("The start index was out of bounds: ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        Throwable[] throwables = ExceptionUtils.getThrowables(this.nestable);
        if (i >= throwables.length) {
            StringBuffer stringBuffer2 = new StringBuffer("The start index was out of bounds: ");
            stringBuffer2.append(i);
            stringBuffer2.append(" >= ");
            stringBuffer2.append(throwables.length);
            throw new IndexOutOfBoundsException(stringBuffer2.toString());
        }
        if (matchSubclasses) {
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
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void printStackTrace(PrintWriter printWriter) {
        Throwable th = this.nestable;
        if (ExceptionUtils.isThrowableNested()) {
            if (th instanceof Nestable) {
                ((Nestable) th).printPartialStackTrace(printWriter);
                return;
            } else {
                th.printStackTrace(printWriter);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 = th; th2 != null; th2 = ExceptionUtils.getCause(th2)) {
            arrayList.add(getStackFrames(th2));
        }
        String str = "Caused by: ";
        if (!topDown) {
            str = "Rethrown as: ";
            Collections.reverse(arrayList);
        }
        if (trimStackFrames) {
            trimStackFrames(arrayList);
        }
        synchronized (printWriter) {
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    for (String str2 : (String[]) it2.next()) {
                        printWriter.println(str2);
                    }
                    if (it2.hasNext()) {
                        printWriter.print(str);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void trimStackFrames(List list) {
        for (int size = list.size() - 1; size > 0; size--) {
            String[] strArr = (String[]) list.get(size);
            String[] strArr2 = (String[]) list.get(size - 1);
            ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
            ExceptionUtils.removeCommonFrames(arrayList, new ArrayList(Arrays.asList(strArr2)));
            int length = strArr.length - arrayList.size();
            if (length > 0) {
                StringBuffer stringBuffer = new StringBuffer("\t... ");
                stringBuffer.append(length);
                stringBuffer.append(" more");
                arrayList.add(stringBuffer.toString());
                list.set(size, arrayList.toArray(new String[arrayList.size()]));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getMessage(int i) {
        Throwable throwable = getThrowable(i);
        Class cls = class$org$apache$commons$lang$exception$Nestable;
        Class cls2 = cls;
        if (cls == null) {
            Class class$ = class$("org.apache.commons.lang.exception.Nestable");
            class$org$apache$commons$lang$exception$Nestable = class$;
            cls2 = class$;
        }
        if (cls2.isInstance(throwable)) {
            return ((Nestable) throwable).getMessage(0);
        }
        return throwable.getMessage();
    }

    public void printStackTrace(PrintStream printStream) {
        synchronized (printStream) {
            PrintWriter printWriter = new PrintWriter((OutputStream) printStream, false);
            printStackTrace(printWriter);
            printWriter.flush();
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }
}
