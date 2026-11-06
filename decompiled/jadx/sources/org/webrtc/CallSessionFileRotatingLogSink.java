package org.webrtc;

import org.webrtc.Logging;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public CallSessionFileRotatingLogSink(String str, int i, Logging.Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i, severity.ordinal());
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("dirPath may not be null.");
            throw null;
        }
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("dirPath may not be null.");
        return null;
    }

    private static native long nativeAddSink(String str, int i, int i2);

    private static native void nativeDeleteSink(long j);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        long j = this.nativeSink;
        if (j != 0) {
            nativeDeleteSink(j);
            this.nativeSink = 0L;
        }
    }
}
