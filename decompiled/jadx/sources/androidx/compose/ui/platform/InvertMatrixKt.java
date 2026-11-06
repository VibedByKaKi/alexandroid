package androidx.compose.ui.platform;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,81:1\n49#2:82\n49#2:83\n49#2:84\n49#2:85\n49#2:86\n49#2:87\n49#2:88\n49#2:89\n49#2:90\n49#2:91\n49#2:92\n49#2:93\n49#2:94\n49#2:95\n49#2:96\n49#2:97\n52#2,2:98\n52#2,2:100\n52#2,2:102\n52#2,2:104\n52#2,2:106\n52#2,2:108\n52#2,2:110\n52#2,2:112\n52#2,2:114\n52#2,2:116\n52#2,2:118\n52#2,2:120\n52#2,2:122\n52#2,2:124\n52#2,2:126\n52#2,2:128\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n42#1:95\n43#1:96\n44#1:97\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n76#1:126,2\n77#1:128,2\n*E\n"})
/* loaded from: classes13.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m6518invertToJiSxe2E(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = DoubleList$$ExternalSyntheticOutline0.m(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
            fArr2[2] = DoubleList$$ExternalSyntheticOutline0.m(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
            float f31 = -f5;
            fArr2[4] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f8, f24, (f7 * f25) + (f31 * f28), f30);
            fArr2[5] = DoubleList$$ExternalSyntheticOutline0.m(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f16, f18, (f15 * f19) + (f32 * f22), f30);
            fArr2[7] = DoubleList$$ExternalSyntheticOutline0.m(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = DoubleList$$ExternalSyntheticOutline0.m(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f4, f23, (f25 * f2) + ((-f) * f27), f30);
            fArr2[10] = DoubleList$$ExternalSyntheticOutline0.m(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
            fArr2[12] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f7, f23, (f6 * f24) + (f31 * f26), f30);
            fArr2[13] = DoubleList$$ExternalSyntheticOutline0.m(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f15, f17, (f14 * f18) + (f32 * f20), f30);
            fArr2[15] = DoubleList$$ExternalSyntheticOutline0.m(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == 0.0f);
    }
}
