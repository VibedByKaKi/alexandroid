package com.amazon.coral.metrics;

import com.amazon.coral.metrics.helper.Dimension;
import com.amazon.coral.shared.CoralInternalLogger;
import com.amazon.coral.shared.CoralInternalLoggerFactory;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import javax.measure.unit.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class Metrics implements Closeable {
    private static final AtomicLong LAST_ADD_METRIC_WARNING = new AtomicLong();
    private static final AtomicLong LAST_ADD_RATIO_WARNING = new AtomicLong();
    private static final long ONE_MINUTE = 60000;
    private static volatile Warner WARNER;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class CILWarner implements Warner {
        private final CoralInternalLogger logger;

        private CILWarner() {
            this.logger = CoralInternalLoggerFactory.getLogger((Class<?>) Metrics.class);
        }

        @Override // com.amazon.coral.metrics.Metrics.Warner
        public void warn(String str, String str2) {
            this.logger.warn("{} called on a metrics object of type {} that doesn't support this method.", str, str2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class JULWarner implements Warner {
        private final Logger logger;

        private JULWarner() {
            this.logger = Logger.getLogger(Metrics.class.getName());
        }

        @Override // com.amazon.coral.metrics.Metrics.Warner
        public void warn(String str, String str2) {
            this.logger.warning(str + " called on a metrics object of type " + str2 + " that doesn't support this method.");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Warner {
        void warn(String str, String str2);
    }

    private static Warner getWarner() {
        Warner warner;
        Warner jULWarner;
        Warner warner2 = WARNER;
        if (warner2 != null) {
            return warner2;
        }
        synchronized (Metrics.class) {
            try {
                warner = WARNER;
                if (warner == null) {
                    try {
                        jULWarner = new CILWarner();
                    } catch (Throwable unused) {
                        jULWarner = new JULWarner();
                    }
                    warner = jULWarner;
                    WARNER = warner;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return warner;
    }

    private void warnOncePerMinute(AtomicLong atomicLong, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = atomicLong.get();
        if (currentTimeMillis - j < ONE_MINUTE || !atomicLong.compareAndSet(j, currentTimeMillis)) {
            return;
        }
        getWarner().warn(str, getClass().getName());
    }

    public abstract void addCount(String str, double d, Unit<?> unit, int i);

    public void addCount(String str, boolean z) {
        addCount(str, z ? 1.0d : 0.0d, Unit.ONE, 1);
    }

    public abstract void addDate(String str, double d);

    public void addLevel(String str, double d, Unit<?> unit) {
        addLevel(str, d, unit, 1);
    }

    public abstract void addLevel(String str, double d, Unit<?> unit, int i);

    public void addMetric(String str, double d, Unit<?> unit, Dimension... dimensionArr) {
        addMetric(str, d, 1, unit, dimensionArr);
    }

    public abstract void addProperty(String str, CharSequence charSequence);

    public void addRatio(String str, double d, int i, Dimension... dimensionArr) {
        warnOncePerMinute(LAST_ADD_RATIO_WARNING, "addRatio()");
    }

    public void addTime(String str, double d, Unit<?> unit) {
        addTime(str, d, unit, 1);
    }

    public abstract void addTime(String str, double d, Unit<?> unit, int i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean discard() {
        return false;
    }

    public abstract MetricsFactory getMetricsFactory();

    public Metrics newMetrics() {
        return newMetrics(GroupBuilder.DEFAULT_GROUP);
    }

    public abstract Metrics newMetrics(Group group);

    public void addMetric(String str, double d, int i, Unit<?> unit, Dimension... dimensionArr) {
        warnOncePerMinute(LAST_ADD_METRIC_WARNING, "addMetric()");
    }

    public void addCount(String str, double d, Unit<?> unit) {
        addCount(str, d, unit, 1);
    }
}
