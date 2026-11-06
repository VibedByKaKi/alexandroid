package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.colorspace.Rgb;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Rgb$Companion$$ExternalSyntheticLambda0 implements DoubleFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TransferParameters f$0;

    public /* synthetic */ Rgb$Companion$$ExternalSyntheticLambda0(TransferParameters transferParameters, int i) {
        this.$r8$classId = i;
        this.f$0 = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        double generateEotf$lambda$4;
        double generateEotf$lambda$5;
        double generateEotf$lambda$6;
        double generateEotf$lambda$7;
        double generateOetf$lambda$0;
        double generateOetf$lambda$1;
        double generateOetf$lambda$2;
        double generateOetf$lambda$3;
        int i = this.$r8$classId;
        TransferParameters transferParameters = this.f$0;
        switch (i) {
            case 0:
                generateEotf$lambda$4 = Rgb.Companion.generateEotf$lambda$4(transferParameters, d);
                return generateEotf$lambda$4;
            case 1:
                generateEotf$lambda$5 = Rgb.Companion.generateEotf$lambda$5(transferParameters, d);
                return generateEotf$lambda$5;
            case 2:
                generateEotf$lambda$6 = Rgb.Companion.generateEotf$lambda$6(transferParameters, d);
                return generateEotf$lambda$6;
            case 3:
                generateEotf$lambda$7 = Rgb.Companion.generateEotf$lambda$7(transferParameters, d);
                return generateEotf$lambda$7;
            case 4:
                generateOetf$lambda$0 = Rgb.Companion.generateOetf$lambda$0(transferParameters, d);
                return generateOetf$lambda$0;
            case 5:
                generateOetf$lambda$1 = Rgb.Companion.generateOetf$lambda$1(transferParameters, d);
                return generateOetf$lambda$1;
            case 6:
                generateOetf$lambda$2 = Rgb.Companion.generateOetf$lambda$2(transferParameters, d);
                return generateOetf$lambda$2;
            default:
                generateOetf$lambda$3 = Rgb.Companion.generateOetf$lambda$3(transferParameters, d);
                return generateOetf$lambda$3;
        }
    }
}
