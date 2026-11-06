package org.joda.time.tz;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ZoneInfoLogger {
    static ThreadLocal<Boolean> cVerbose = new ThreadLocal<Boolean>() { // from class: org.joda.time.tz.ZoneInfoLogger.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };

    public static void set(boolean z) {
        cVerbose.set(Boolean.valueOf(z));
    }

    public static boolean verbose() {
        return cVerbose.get().booleanValue();
    }
}
