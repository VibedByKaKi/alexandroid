package com.amazon.alexa.accessory.frames.ota;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.protocol.Assettransfer;
import com.amazon.coral.util.AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class OtaProgressCalculator {
    private static final long ETA_APPLY_MIN_SAMPLE_INTERVAL_MS = 2000;
    private static final double ETA_APPLY_SMOOTHING_FACTOR = 0.1d;
    private static final int ETA_MAX_MINUTES = 60;
    private static final long ETA_MIN_SAMPLE_INTERVAL_MS = 1000;
    private static final double ETA_SMOOTHING_FACTOR = 0.3d;
    private static final int P2P_APPLY_BASE_OFFSET = 50;
    private static final int P2P_DOWNLOAD_RANGE = 40;
    private static final int P2P_UPLOAD_BASE_OFFSET = 40;
    private static final int P2P_UPLOAD_RANGE = 10;
    private static final double STATIC_APPLICATION_SECONDS = 240.0d;
    private static final double STATIC_TRANSFER_SECONDS = 60.0d;
    private final OtaEtaEstimator applyEstimator;
    private final LongSupplier clockMillis;
    private final OtaEtaEstimator downloadEstimator;
    private long firmwareTotalBytes;

    @Nullable
    private Integer lastReportedMinutes;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.ota.OtaProgressCalculator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus;

        static {
            int[] iArr = new int[Assettransfer.TransferStatus.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus = iArr;
            try {
                iArr[Assettransfer.TransferStatus.TRANSFER_STATUS_BATCH_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus[Assettransfer.TransferStatus.TRANSFER_STATUS_BATCH_IMPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus[Assettransfer.TransferStatus.TRANSFER_STATUS_APPLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OtaEtaEstimator {

        @Nullable
        private Double anchorPercentage;

        @Nullable
        private Long anchorTimestampMillis;

        @Nullable
        private Double averageSpeedPerSecond;
        private final long minSampleIntervalMillis;
        private final double smoothingFactor;

        public OtaEtaEstimator(double d, long j) {
            this.smoothingFactor = d;
            this.minSampleIntervalMillis = j;
        }

        public void reset() {
            this.anchorPercentage = null;
            this.anchorTimestampMillis = null;
            this.averageSpeedPerSecond = null;
        }

        @Nullable
        public Double secondsRemaining(double d, double d2) {
            Double d3 = this.averageSpeedPerSecond;
            if (d3 != null && d3.doubleValue() > 0.0d) {
                double max = Math.max(0.0d, d2 - d) / this.averageSpeedPerSecond.doubleValue();
                if (Double.isFinite(max)) {
                    return Double.valueOf(max);
                }
            }
            return null;
        }

        @Nullable
        public Double update(double d, long j) {
            Long l;
            if (this.anchorPercentage == null || (l = this.anchorTimestampMillis) == null) {
                this.anchorPercentage = Double.valueOf(d);
                this.anchorTimestampMillis = Long.valueOf(j);
                return this.averageSpeedPerSecond;
            }
            long longValue = j - l.longValue();
            if (longValue < this.minSampleIntervalMillis) {
                return this.averageSpeedPerSecond;
            }
            double doubleValue = d - this.anchorPercentage.doubleValue();
            this.anchorPercentage = Double.valueOf(d);
            this.anchorTimestampMillis = Long.valueOf(j);
            Double d2 = this.averageSpeedPerSecond;
            if (doubleValue <= 0.0d) {
                return d2;
            }
            double d3 = doubleValue / (longValue / 1000.0d);
            if (d2 != null) {
                double d4 = this.smoothingFactor;
                this.averageSpeedPerSecond = Double.valueOf((d2.doubleValue() * (1.0d - d4)) + (d3 * d4));
            } else {
                this.averageSpeedPerSecond = Double.valueOf(d3);
            }
            return this.averageSpeedPerSecond;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OtaPhase {
        DOWNLOADING("downloading"),
        TRANSFERRING("transferring"),
        UPDATING("updating");

        private final String wireValue;

        OtaPhase(String str) {
            this.wireValue = str;
        }

        @Nullable
        public static OtaPhase resolve(@NonNull Assettransfer.TransferStatus transferStatus) {
            int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus[transferStatus.ordinal()];
            if (i == 1) {
                return DOWNLOADING;
            }
            if (i == 2) {
                return TRANSFERRING;
            }
            if (i != 3) {
                return null;
            }
            return UPDATING;
        }

        public String wireValue() {
            return this.wireValue;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class OtaProgressFields {

        @Nullable
        public final Long bytesDownloaded;

        @Nullable
        public final String phase;

        @Nullable
        public final Integer remainingMinutes;

        @Nullable
        public final Long totalBytes;

        public OtaProgressFields(@Nullable Integer num, @Nullable Long l, @Nullable Long l2, @Nullable String str) {
            this.remainingMinutes = num;
            this.bytesDownloaded = l;
            this.totalBytes = l2;
            this.phase = str;
        }
    }

    @VisibleForTesting
    public OtaProgressCalculator(@NonNull LongSupplier longSupplier) {
        this.downloadEstimator = new OtaEtaEstimator(0.3d, 1000L);
        this.applyEstimator = new OtaEtaEstimator(0.1d, 2000L);
        this.firmwareTotalBytes = 0L;
        this.clockMillis = longSupplier;
    }

    @Nullable
    private static Integer minutes(@Nullable Double d, int i) {
        if (i >= 100) {
            return 0;
        }
        if (d == null || !Double.isFinite(d.doubleValue()) || d.doubleValue() < 0.0d) {
            return null;
        }
        return Integer.valueOf((int) Math.min(Math.max(Math.ceil(d.doubleValue() / 60.0d), 1.0d), 60.0d));
    }

    @Nullable
    private Integer remainingMinutes(int i, @NonNull Assettransfer.TransferStatus transferStatus, long j) {
        int i2 = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferStatus[transferStatus.ordinal()];
        Double d = null;
        if (i2 == 1) {
            double d2 = i;
            this.downloadEstimator.update(d2, j);
            Double secondsRemaining = this.downloadEstimator.secondsRemaining(d2, 40.0d);
            if (secondsRemaining != null) {
                d = Double.valueOf(secondsRemaining.doubleValue() + 60.0d + STATIC_APPLICATION_SECONDS);
            }
        } else if (i2 == 2) {
            d = Double.valueOf(staticSecondsRemaining(i, 40, 50, 60.0d) + STATIC_APPLICATION_SECONDS);
        } else if (i2 == 3) {
            double d3 = i;
            this.applyEstimator.update(d3, j);
            Double secondsRemaining2 = this.applyEstimator.secondsRemaining(d3, 100.0d);
            d = Double.valueOf(secondsRemaining2 != null ? secondsRemaining2.doubleValue() : staticSecondsRemaining(i, 50, 100, STATIC_APPLICATION_SECONDS));
        }
        return minutes(d, i);
    }

    private static double staticSecondsRemaining(int i, int i2, int i3, double d) {
        if (i3 <= i2) {
            return 0.0d;
        }
        if (i <= i2) {
            return d;
        }
        if (i >= i3) {
            return 0.0d;
        }
        return (1.0d - ((i - i2) / (i3 - i2))) * d;
    }

    @NonNull
    public synchronized OtaProgressFields fields(int i, @NonNull Assettransfer.TransferStatus transferStatus, @Nullable Double d) {
        Integer remainingMinutes;
        Long l;
        String wireValue;
        Long l2;
        try {
            remainingMinutes = remainingMinutes(i, transferStatus, this.clockMillis.getAsLong());
            if (remainingMinutes != null) {
                this.lastReportedMinutes = remainingMinutes;
            }
            if (remainingMinutes == null) {
                remainingMinutes = this.lastReportedMinutes;
            }
            OtaPhase resolve = OtaPhase.resolve(transferStatus);
            l = null;
            wireValue = resolve != null ? resolve.wireValue() : null;
            if (d == null || this.firmwareTotalBytes <= 0) {
                l2 = null;
            } else {
                l = Long.valueOf(Math.round(Math.min(Math.max(d.doubleValue(), 0.0d), 1.0d) * this.firmwareTotalBytes));
                l2 = Long.valueOf(this.firmwareTotalBytes);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new OtaProgressFields(remainingMinutes, l, l2, wireValue);
    }

    public synchronized void reset() {
        this.downloadEstimator.reset();
        this.applyEstimator.reset();
        this.firmwareTotalBytes = 0L;
        this.lastReportedMinutes = null;
    }

    public synchronized void resetForNewTransfer() {
        this.downloadEstimator.reset();
        this.applyEstimator.reset();
        this.lastReportedMinutes = null;
    }

    public synchronized void setFirmwareTotalBytes(long j) {
        this.firmwareTotalBytes = j;
    }

    public OtaProgressCalculator() {
        this(new AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0(2));
    }
}
