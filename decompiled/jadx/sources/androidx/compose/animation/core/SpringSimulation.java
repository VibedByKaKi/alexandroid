package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Error: Final position of the spring must be set before the animation starts");
            return;
        }
        float f = this.dampingRatio;
        double d = f * f;
        if (f > 1.0f) {
            double d2 = this.naturalFreq;
            double d3 = d - 1;
            this.gammaPlus = (Math.sqrt(d3) * d2) + ((-f) * d2);
            double d4 = -this.dampingRatio;
            double d5 = this.naturalFreq;
            this.gammaMinus = (d4 * d5) - (Math.sqrt(d3) * d5);
        } else if (f >= 0.0f && f < 1.0f) {
            this.dampedFreq = Math.sqrt(1 - d) * this.naturalFreq;
        }
        this.initialized = true;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f = lastDisplacement - this.finalPosition;
        double d = this.naturalFreq;
        return (float) (((-(d * d)) * f) - (((d * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d = this.naturalFreq;
        return (float) (d * d);
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            Single$$ExternalSyntheticBUOutline0.m$3("Damping ratio must be non-negative");
        } else {
            this.dampingRatio = f;
            this.initialized = false;
        }
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            Single$$ExternalSyntheticBUOutline0.m$3("Spring stiffness constant must be positive.");
        } else {
            this.naturalFreq = Math.sqrt(f);
            this.initialized = false;
        }
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m354updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double cos;
        double d;
        double d2;
        double exp;
        init();
        float f = lastDisplacement - this.finalPosition;
        double d3 = timeElapsed / 1000.0d;
        float f2 = this.dampingRatio;
        if (f2 > 1.0f) {
            double d4 = f;
            double d5 = this.gammaMinus;
            double d6 = lastVelocity;
            double d7 = this.gammaPlus;
            double d8 = d4 - (((d5 * d4) - d6) / (d5 - d7));
            double d9 = ((d4 * d5) - d6) / (d5 - d7);
            d = (Math.exp(this.gammaPlus * d3) * d9) + (Math.exp(d5 * d3) * d8);
            double d10 = this.gammaMinus;
            d2 = Math.exp(d10 * d3) * d8 * d10;
            double d11 = this.gammaPlus;
            exp = Math.exp(d11 * d3) * d9 * d11;
        } else {
            if (f2 != 1.0f) {
                double d12 = 1 / this.dampedFreq;
                double d13 = this.naturalFreq;
                double d14 = f;
                double d15 = ((f2 * d13 * d14) + lastVelocity) * d12;
                double exp2 = Math.exp((-f2) * d13 * d3) * ((Math.sin(this.dampedFreq * d3) * d15) + (Math.cos(this.dampedFreq * d3) * d14));
                double d16 = this.naturalFreq;
                double d17 = (-d16) * exp2 * this.dampingRatio;
                double exp3 = Math.exp((-r7) * d16 * d3);
                double d18 = this.dampedFreq;
                double sin = Math.sin(d18 * d3) * (-d18) * d14;
                double d19 = this.dampedFreq;
                cos = (((Math.cos(d19 * d3) * d15 * d19) + sin) * exp3) + d17;
                d = exp2;
                return SpringSimulationKt.Motion((float) (d + this.finalPosition), (float) cos);
            }
            double d20 = this.naturalFreq;
            double d21 = f;
            double d22 = (d20 * d21) + lastVelocity;
            double d23 = (d22 * d3) + d21;
            d = Math.exp((-d20) * d3) * d23;
            double exp4 = Math.exp((-this.naturalFreq) * d3) * d23;
            double d24 = this.naturalFreq;
            d2 = exp4 * (-d24);
            exp = Math.exp((-d24) * d3) * d22;
        }
        cos = exp + d2;
        return SpringSimulationKt.Motion((float) (d + this.finalPosition), (float) cos);
    }
}
