package com.amazon.comms.debug;

import com.amazon.comms.log.CommsLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DebugAssert {
    public static final CommsLogger sLog = CommsLogger.getLogger(DebugAssert.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DieHardException extends RuntimeException {
        public DieHardException(String str, Throwable th) {
            super(str, th);
        }
    }

    private DebugAssert() {
    }

    public static void expect(boolean z, String str) {
        if (z) {
            return;
        }
        fail(str);
    }

    public static void fail(Throwable th, String str) {
        sLog.e(str, th);
        throw new DieHardException(str, th);
    }

    public static void fail(String str) {
        fail(new RuntimeException(), str);
    }
}
