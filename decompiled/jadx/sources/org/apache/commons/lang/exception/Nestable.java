package org.apache.commons.lang.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Nestable {
    Throwable getCause();

    String getMessage();

    String getMessage(int i);

    String[] getMessages();

    Throwable getThrowable(int i);

    int getThrowableCount();

    Throwable[] getThrowables();

    int indexOfThrowable(Class cls);

    int indexOfThrowable(Class cls, int i);

    void printPartialStackTrace(PrintWriter printWriter);

    void printStackTrace(PrintStream printStream);

    void printStackTrace(PrintWriter printWriter);
}
