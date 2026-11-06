package com.amazon.alexa.accessorykit.echoauto;

import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Goertzel {
    private final double coefficient;
    private final double cosine;
    private double q1;
    private double q2;
    private final double sine;

    public Goertzel(float f, float f2, int i) {
        Preconditions.precondition(f > 0.0f, "samplingRate <= 0");
        Preconditions.precondition(i > 0, "numberOfSamples <= 0");
        Preconditions.precondition(f > 2.0f * f2, "samplingRate < targetFrequency * 2");
        double d = (((int) (((f2 * r7) / f) + 0.5d)) * 6.283185307179586d) / i;
        this.sine = Math.sin(d);
        double cos = Math.cos(d);
        this.cosine = cos;
        this.coefficient = cos * 2.0d;
    }

    public double getMagnitudeSquared() {
        double d = this.q1;
        double d2 = this.q2;
        return ((d2 * d2) + (d * d)) - ((d * d2) * this.coefficient);
    }

    public double[] getRealImag() {
        double d = this.q1;
        double d2 = this.q2;
        return new double[]{d - (this.cosine * d2), d2 * this.sine};
    }

    public void processSample(double d) {
        double d2 = this.coefficient;
        double d3 = this.q1;
        double d4 = ((d2 * d3) - this.q2) + d;
        this.q2 = d3;
        this.q1 = d4;
    }

    public void resetGoertzel() {
        this.q1 = 0.0d;
        this.q2 = 0.0d;
    }
}
