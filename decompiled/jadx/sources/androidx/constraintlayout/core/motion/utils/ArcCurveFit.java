package androidx.constraintlayout.core.motion.utils;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        boolean mLinear;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        public Arc(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.mLinear = false;
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (i == 1) {
                this.mVertical = true;
            } else if (i == 4) {
                this.mVertical = d8 > 0.0d;
            } else if (i != 5) {
                this.mVertical = false;
            } else {
                this.mVertical = d8 < 0.0d;
            }
            this.mTime1 = d;
            this.mTime2 = d2;
            this.mOneOverDeltaTime = 1.0d / (d2 - d);
            if (3 == i) {
                this.mLinear = true;
            }
            if (!this.mLinear && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.mLut = new double[101];
                boolean z = this.mVertical;
                this.mEllipseA = d7 * (z ? -1 : 1);
                this.mEllipseB = d8 * (z ? 1 : -1);
                this.mEllipseCenterX = z ? d5 : d3;
                this.mEllipseCenterY = z ? d4 : d6;
                buildTable(d3, d4, d5, d6);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.mLinear = true;
            this.mX1 = d3;
            this.mX2 = d5;
            this.mY1 = d4;
            this.mY2 = d6;
            double hypot = Math.hypot(d8, d7);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d9 = this.mTime2;
            double d10 = this.mTime1;
            this.mEllipseCenterX = d7 / (d9 - d10);
            this.mEllipseCenterY = d8 / (d9 - d10);
        }

        private void buildTable(double d, double d2, double d3, double d4) {
            double d5 = d3 - d;
            double d6 = d2 - d4;
            int i = 0;
            double d7 = 0.0d;
            double d8 = 0.0d;
            double d9 = 0.0d;
            while (true) {
                if (i >= sOurPercent.length) {
                    break;
                }
                int i2 = i;
                double radians = Math.toRadians((i * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d5;
                double cos = Math.cos(radians) * d6;
                if (i2 > 0) {
                    d7 += Math.hypot(sin - d8, cos - d9);
                    sOurPercent[i2] = d7;
                }
                i = i2 + 1;
                d8 = sin;
                d9 = cos;
            }
            this.mArcDistance = d7;
            int i3 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / d7;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.mLut.length) {
                    return;
                }
                double length = i4 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(sOurPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i4] = binarySearch / (sOurPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i4] = 0.0d;
                } else {
                    int i5 = -binarySearch;
                    int i6 = i5 - 2;
                    double[] dArr2 = sOurPercent;
                    double d10 = dArr2[i6];
                    this.mLut[i4] = (((length - d10) / (dArr2[i5 - 1] - d10)) + i6) / (dArr2.length - 1);
                }
                i4++;
            }
        }

        public double getDX() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d) * hypot : d * hypot;
        }

        public double getDY() {
            double d = this.mEllipseA * this.mTmpCosAngle;
            double d2 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d, d2);
            return this.mVertical ? (-d2) * hypot : d2 * hypot;
        }

        public double getLinearDX(double d) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mX1;
            return AppLaunchChecker$$ExternalSyntheticOutline0.m$2(this.mX2, d3, d2, d3);
        }

        public double getLinearY(double d) {
            double d2 = (d - this.mTime1) * this.mOneOverDeltaTime;
            double d3 = this.mY1;
            return AppLaunchChecker$$ExternalSyntheticOutline0.m$2(this.mY2, d3, d2, d3);
        }

        public double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        public double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        public double lookup(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return AppLaunchChecker$$ExternalSyntheticOutline0.m$2(dArr[i + 1], d3, d2, d3);
        }

        public void setPoint(double d) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d : d - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r5 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r23, double[] r24, double[][] r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r0.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 - r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L16:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L58
            r8 = r23[r4]
            r9 = 3
            if (r8 == 0) goto L38
            if (r8 == r2) goto L36
            r10 = 2
            if (r8 == r10) goto L34
            if (r8 == r9) goto L2f
            r9 = 4
            if (r8 == r9) goto L38
            r9 = 5
            if (r8 == r9) goto L38
            r9 = r6
            goto L38
        L2f:
            if (r5 != r2) goto L36
            goto L34
        L32:
            r9 = r5
            goto L38
        L34:
            r5 = r10
            goto L32
        L36:
            r5 = r2
            goto L32
        L38:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r8 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r25[r4]
            r16 = r14
            r14 = r16[r3]
            r16 = r16[r2]
            r18 = r25[r6]
            r20 = r18
            r18 = r20[r3]
            r20 = r20[r2]
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L16
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, double[] dArr) {
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        if (z) {
            Arc arc = arcArr[0];
            double d2 = arc.mTime1;
            if (d < d2) {
                double d3 = d - d2;
                if (arc.mLinear) {
                    dArr[0] = (this.mArcs[0].getLinearDX(d2) * d3) + arc.getLinearX(d2);
                    dArr[1] = (d3 * this.mArcs[0].getLinearDY(d2)) + this.mArcs[0].getLinearY(d2);
                    return;
                }
                arc.setPoint(d2);
                dArr[0] = (this.mArcs[0].getDX() * d3) + this.mArcs[0].getX();
                dArr[1] = (d3 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
                return;
            }
            if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                double d5 = d - d4;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    dArr[0] = (this.mArcs[length].getLinearDX(d4) * d5) + arc2.getLinearX(d4);
                    dArr[1] = (d5 * this.mArcs[length].getLinearDY(d4)) + this.mArcs[length].getLinearY(d4);
                    return;
                }
                arc2.setPoint(d);
                dArr[0] = (this.mArcs[length].getDX() * d5) + this.mArcs[length].getX();
                dArr[1] = (d5 * this.mArcs[length].getDY()) + this.mArcs[length].getY();
                return;
            }
        } else {
            double d6 = arcArr[0].mTime1;
            if (d < d6) {
                d = d6;
            }
            if (d > arcArr[arcArr.length - 1].mTime2) {
                d = arcArr[arcArr.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc3 = arcArr2[i];
            if (d <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d);
                    dArr[1] = this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    arc3.setPoint(d);
                    dArr[0] = this.mArcs[i].getX();
                    dArr[1] = this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        } else if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc = arcArr2[i];
            if (d <= arc.mTime2) {
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearDX(d);
                    dArr[1] = this.mArcs[i].getLinearDY(d);
                    return;
                } else {
                    arc.setPoint(d);
                    dArr[0] = this.mArcs[i].getDX();
                    dArr[1] = this.mArcs[i].getDY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d, int i) {
        Arc[] arcArr = this.mArcs;
        int i2 = 0;
        double d2 = arcArr[0].mTime1;
        if (d < d2) {
            d = d2;
        }
        if (d > arcArr[arcArr.length - 1].mTime2) {
            d = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i2];
            if (d <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i == 0) {
                        return arc.getLinearDX(d);
                    }
                    return arc.getLinearDY(d);
                }
                arc.setPoint(d);
                Arc[] arcArr3 = this.mArcs;
                if (i == 0) {
                    return arcArr3[i2].getDX();
                }
                return arcArr3[i2].getDY();
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d, float[] fArr) {
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        if (z) {
            Arc arc = arcArr[0];
            double d2 = arc.mTime1;
            if (d < d2) {
                double d3 = d - d2;
                if (arc.mLinear) {
                    fArr[0] = (float) ((this.mArcs[0].getLinearDX(d2) * d3) + arc.getLinearX(d2));
                    fArr[1] = (float) ((d3 * this.mArcs[0].getLinearDY(d2)) + this.mArcs[0].getLinearY(d2));
                    return;
                }
                arc.setPoint(d2);
                fArr[0] = (float) ((this.mArcs[0].getDX() * d3) + this.mArcs[0].getX());
                fArr[1] = (float) ((d3 * this.mArcs[0].getDY()) + this.mArcs[0].getY());
                return;
            }
            if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                double d5 = d - d4;
                int length = arcArr.length - 1;
                Arc arc2 = arcArr[length];
                if (arc2.mLinear) {
                    fArr[0] = (float) ((this.mArcs[length].getLinearDX(d4) * d5) + arc2.getLinearX(d4));
                    fArr[1] = (float) ((d5 * this.mArcs[length].getLinearDY(d4)) + this.mArcs[length].getLinearY(d4));
                    return;
                }
                arc2.setPoint(d);
                fArr[0] = (float) this.mArcs[length].getX();
                fArr[1] = (float) this.mArcs[length].getY();
                return;
            }
        } else {
            double d6 = arcArr[0].mTime1;
            if (d < d6) {
                d = d6;
            } else if (d > arcArr[arcArr.length - 1].mTime2) {
                d = arcArr[arcArr.length - 1].mTime2;
            }
        }
        int i = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i >= arcArr2.length) {
                return;
            }
            Arc arc3 = arcArr2[i];
            if (d <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d);
                    fArr[1] = (float) this.mArcs[i].getLinearY(d);
                    return;
                } else {
                    arc3.setPoint(d);
                    fArr[0] = (float) this.mArcs[i].getX();
                    fArr[1] = (float) this.mArcs[i].getY();
                    return;
                }
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d, int i) {
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        int i2 = 0;
        if (z) {
            Arc arc = arcArr[0];
            double d2 = arc.mTime1;
            if (d < d2) {
                double d3 = d - d2;
                if (arc.mLinear) {
                    if (i == 0) {
                        return (d3 * this.mArcs[0].getLinearDX(d2)) + arc.getLinearX(d2);
                    }
                    return (d3 * this.mArcs[0].getLinearDY(d2)) + arc.getLinearY(d2);
                }
                arc.setPoint(d2);
                Arc[] arcArr2 = this.mArcs;
                if (i == 0) {
                    return (d3 * this.mArcs[0].getDX()) + arcArr2[0].getX();
                }
                return (d3 * this.mArcs[0].getDY()) + arcArr2[0].getY();
            }
            if (d > arcArr[arcArr.length - 1].mTime2) {
                double d4 = arcArr[arcArr.length - 1].mTime2;
                double d5 = d - d4;
                int length = arcArr.length - 1;
                if (i == 0) {
                    return (d5 * this.mArcs[length].getLinearDX(d4)) + arcArr[length].getLinearX(d4);
                }
                return (d5 * this.mArcs[length].getLinearDY(d4)) + arcArr[length].getLinearY(d4);
            }
        } else {
            double d6 = arcArr[0].mTime1;
            if (d < d6) {
                d = d6;
            } else if (d > arcArr[arcArr.length - 1].mTime2) {
                d = arcArr[arcArr.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i2 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc2 = arcArr3[i2];
            if (d <= arc2.mTime2) {
                if (arc2.mLinear) {
                    if (i == 0) {
                        return arc2.getLinearX(d);
                    }
                    return arc2.getLinearY(d);
                }
                arc2.setPoint(d);
                Arc[] arcArr4 = this.mArcs;
                if (i == 0) {
                    return arcArr4[i2].getX();
                }
                return arcArr4[i2].getY();
            }
            i2++;
        }
    }
}
