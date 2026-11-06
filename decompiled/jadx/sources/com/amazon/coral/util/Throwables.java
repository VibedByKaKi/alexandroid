package com.amazon.coral.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class Throwables {
    private Throwables() {
    }

    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static RuntimeException sneakyThrow(Throwable th) {
        return (RuntimeException) unsafeCastAndRethrow(th);
    }

    private static <X extends Throwable> X unsafeCastAndRethrow(Throwable th) throws Throwable {
        throw th;
    }
}
