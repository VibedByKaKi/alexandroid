package com.amazon.whisperjoin.common.sharedtypes.utility;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemTime {
    private static final TimeSource REAL_TIME;
    private static TimeSource sTimeSource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface TimeSource {
        long now();

        long nowNano();
    }

    static {
        TimeSource timeSource = new TimeSource() { // from class: com.amazon.whisperjoin.common.sharedtypes.utility.SystemTime.1
            @Override // com.amazon.whisperjoin.common.sharedtypes.utility.SystemTime.TimeSource
            public long now() {
                return System.currentTimeMillis();
            }

            @Override // com.amazon.whisperjoin.common.sharedtypes.utility.SystemTime.TimeSource
            public long nowNano() {
                return System.nanoTime();
            }
        };
        REAL_TIME = timeSource;
        sTimeSource = timeSource;
    }

    public static long now() {
        return sTimeSource.now();
    }

    public static long nowNano() {
        return sTimeSource.nowNano();
    }

    public static synchronized void setTimeSource(TimeSource timeSource) {
        synchronized (SystemTime.class) {
            sTimeSource = timeSource;
        }
    }
}
