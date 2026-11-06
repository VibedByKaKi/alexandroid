package net.zetetic.database.sqlcipher;

import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class CloseGuard {
    private Throwable allocationSite;
    private static final CloseGuard NOOP = new CloseGuard();
    private static volatile boolean ENABLED = true;
    private static volatile Reporter REPORTER = new DefaultReporter();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DefaultReporter implements Reporter {
        private DefaultReporter() {
        }

        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public void report(String str, Throwable th) {
            Log.w(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Reporter {
        void report(String str, Throwable th);
    }

    private CloseGuard() {
    }

    public static CloseGuard get() {
        return !ENABLED ? NOOP : new CloseGuard();
    }

    public static Reporter getReporter() {
        return REPORTER;
    }

    public static void setEnabled(boolean z) {
        ENABLED = z;
    }

    public static void setReporter(Reporter reporter) {
        if (reporter != null) {
            REPORTER = reporter;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("reporter == null");
        }
    }

    public void close() {
        this.allocationSite = null;
    }

    public void open(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("closer == null");
        } else {
            if (this == NOOP || !ENABLED) {
                return;
            }
            this.allocationSite = new Throwable(a$$ExternalSyntheticOutline0.m("Explicit termination method '", str, "' not called"));
        }
    }

    public void warnIfOpen() {
        if (this.allocationSite == null || !ENABLED) {
            return;
        }
        REPORTER.report("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.allocationSite);
    }
}
