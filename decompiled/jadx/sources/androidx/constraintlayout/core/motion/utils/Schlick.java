package androidx.constraintlayout.core.motion.utils;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;
    double mS;
    double mT;

    public Schlick(String str) {
        this.mStr = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.mS = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double dfunc(double d) {
        double d2;
        double d3;
        double d4 = this.mT;
        double d5 = this.mS;
        if (d < d4) {
            d2 = d5 * d4 * d4;
            d3 = (((d4 - d) * d5) + d) * AppLaunchChecker$$ExternalSyntheticOutline0.m$2(d4, d, d5, d);
        } else {
            d2 = (d4 - 1.0d) * (d4 - 1.0d) * d5;
            d3 = ((((d4 - d) * (-d5)) - d) + 1.0d) * ((((d4 - d) * (-d5)) - d) + 1.0d);
        }
        return d2 / d3;
    }

    private double func(double d) {
        double d2 = this.mT;
        double d3 = this.mS;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d) {
        return func(d);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d) {
        return dfunc(d);
    }
}
