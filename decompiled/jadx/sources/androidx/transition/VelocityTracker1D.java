package androidx.transition;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f) {
        return (float) (Math.sqrt(Math.abs(f) * 2.0f) * Math.signum(f));
    }

    public void addDataPoint(long j, float f) {
        int i = (this.mIndex + 1) % 20;
        this.mIndex = i;
        this.mTimeSamples[i] = j;
        this.mDataSamples[i] = f;
    }

    public float calculateVelocity() {
        int i = this.mIndex;
        if (i == 0 && this.mTimeSamples[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.mTimeSamples[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.mTimeSamples[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float abs = Math.abs(j3 - j2);
            if (f > 100.0f || abs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        int i3 = this.mIndex;
        if (i2 == 2) {
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.mTimeSamples;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            return ((fArr[i3] - fArr[i4]) / f2) * 1000.0f;
        }
        int i5 = ((i3 - i2) + 21) % 20;
        int i6 = (i3 + 21) % 20;
        long j4 = this.mTimeSamples[i5];
        float f3 = this.mDataSamples[i5];
        int i7 = i5 + 1;
        float f4 = 0.0f;
        for (int i8 = i7 % 20; i8 != i6; i8 = (i8 + 1) % 20) {
            long j5 = this.mTimeSamples[i8];
            float f5 = j5 - j4;
            if (f5 != 0.0f) {
                float f6 = this.mDataSamples[i8];
                float f7 = (f6 - f3) / f5;
                float abs2 = (Math.abs(f7) * (f7 - kineticEnergyToVelocity(f4))) + f4;
                if (i8 == i7) {
                    abs2 *= 0.5f;
                }
                f4 = abs2;
                f3 = f6;
                j4 = j5;
            }
        }
        return kineticEnergyToVelocity(f4) * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
