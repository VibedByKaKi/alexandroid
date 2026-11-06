package com.amazon.whisperjoin.provisioning.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class SystemTime {
    public static final TimeSource REAL_TIME;
    private static TimeSource sTimeSource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TimeSource {
        long now();
    }

    static {
        TimeSource timeSource = new TimeSource() { // from class: com.amazon.whisperjoin.provisioning.utils.SystemTime.1
            @Override // com.amazon.whisperjoin.provisioning.utils.SystemTime.TimeSource
            public long now() {
                return System.currentTimeMillis();
            }
        };
        REAL_TIME = timeSource;
        sTimeSource = timeSource;
    }

    public static long now() {
        return sTimeSource.now();
    }

    public static synchronized void setTimeSource(TimeSource timeSource) {
        synchronized (SystemTime.class) {
            sTimeSource = timeSource;
        }
    }
}
