package com.amazon.alexa.accessorykit.echoauto;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class GoertzelManager {
    private static final String TAG = "PlaybackLatency";
    private long[] detectionTimes;
    private final Goertzel[] goertzels;
    private int index;
    private final double[] maxMagnitudes;
    private int samplesProcessed;
    private int[] samplesProcessedBeforeDetection;
    private final int size;
    private final boolean[] switches;
    private final double[] thresholds;

    public GoertzelManager(float f, int i, float[] fArr, double[] dArr) {
        Preconditions.precondition(f > 0.0f, "samplingRate <= 0");
        Preconditions.precondition(i > 0, "numberOfSamples <= 0");
        Preconditions.equals(fArr.length, dArr.length, "frequencies.length != thresholds.length");
        this.thresholds = dArr;
        int length = fArr.length;
        this.size = length;
        this.maxMagnitudes = new double[length];
        this.goertzels = new Goertzel[length];
        int i2 = 0;
        while (true) {
            int i3 = this.size;
            if (i2 >= i3) {
                this.switches = new boolean[i3];
                this.detectionTimes = new long[i3];
                this.samplesProcessedBeforeDetection = new int[i3];
                this.index = 0;
                this.samplesProcessed = 0;
                return;
            }
            this.goertzels[i2] = new Goertzel(f, fArr[i2], i);
            i2++;
        }
    }

    private boolean detectedUpToHere(int i) {
        if (i >= this.size) {
            return false;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            if (!this.switches[i2]) {
                return false;
            }
        }
        return true;
    }

    private int maxMagnitudeIndex(double d) {
        int i = -1;
        double d2 = 0.0d;
        for (int i2 = 0; i2 < this.size; i2++) {
            double sqrt = Math.sqrt(this.goertzels[i2].getMagnitudeSquared()) / (d == 0.0d ? 1.0d : d);
            if (sqrt > this.thresholds[i2] && sqrt > d2) {
                i = i2;
                d2 = sqrt;
            }
            double[] dArr = this.maxMagnitudes;
            if (dArr[i2] < sqrt) {
                dArr[i2] = sqrt;
            }
            String.format("%.2f ", Double.valueOf(sqrt));
        }
        return i;
    }

    private double rootMeanSquare(float[] fArr) {
        int length = fArr.length;
        double d = 0.0d;
        if (length == 0) {
            return 0.0d;
        }
        for (float f : fArr) {
            d += f * f;
        }
        return Math.sqrt(d / length);
    }

    public long detectionTime(int i) {
        if (i >= this.size) {
            return -1L;
        }
        return this.detectionTimes[i];
    }

    public double[] getMaxMagnitudes() {
        return this.maxMagnitudes;
    }

    public boolean isDetected() {
        int i = this.index;
        int i2 = this.size;
        if (i < i2 - 1) {
            return false;
        }
        return detectedUpToHere(i2 - 1);
    }

    public int processSamples(float[] fArr) {
        for (int i = 0; i < this.size; i++) {
            this.goertzels[i].resetGoertzel();
        }
        for (float f : fArr) {
            for (int i2 = 0; i2 < this.size; i2++) {
                this.goertzels[i2].processSample(f);
            }
        }
        this.samplesProcessed += fArr.length;
        int maxMagnitudeIndex = maxMagnitudeIndex(rootMeanSquare(fArr));
        if (maxMagnitudeIndex != -1 && detectedUpToHere(maxMagnitudeIndex - 1) && !this.switches[maxMagnitudeIndex]) {
            this.detectionTimes[maxMagnitudeIndex] = System.currentTimeMillis();
            this.samplesProcessedBeforeDetection[maxMagnitudeIndex] = this.samplesProcessed;
            this.switches[maxMagnitudeIndex] = true;
            int i3 = this.index + 1;
            this.index = i3;
            String.format("new index: %d", Integer.valueOf(i3));
        }
        return maxMagnitudeIndex;
    }

    public int samplesProcessedBeforeDetection(int i) {
        if (i >= this.size) {
            return -1;
        }
        return this.samplesProcessedBeforeDetection[i];
    }
}
