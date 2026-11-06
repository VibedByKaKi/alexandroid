package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ExceptionUtil {
    private ExceptionUtil() {
    }

    private static boolean isFatal(Throwable th) {
        return (th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof ClassCircularityError) || (th instanceof ClassFormatError) || (th instanceof IncompatibleClassChangeError) || (th instanceof BootstrapMethodError) || (th instanceof VerifyError);
    }

    public static void rethrowIfFatal(Throwable th) throws Error, RuntimeException {
        if (isFatal(th)) {
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            Buffer$$ExternalSyntheticBUOutline0.m(th);
        }
    }

    public static <T> T throwSneaky(IOException iOException) {
        _sneaky(iOException);
        return null;
    }

    private static <E extends Throwable> void _sneaky(Throwable th) throws Throwable {
        throw th;
    }
}
