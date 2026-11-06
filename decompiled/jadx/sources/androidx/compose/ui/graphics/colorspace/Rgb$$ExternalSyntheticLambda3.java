package androidx.compose.ui.graphics.colorspace;

import android.view.ScrollCaptureSession;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class Rgb$$ExternalSyntheticLambda3 implements DoubleFunction, ShouldPauseCallback, TextInclusionStrategy, VisualTransformation {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Rgb$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean m$3(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean m$4(Object obj) {
        return obj instanceof InsertGesture;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        TransformedText None$lambda$0;
        None$lambda$0 = VisualTransformation.Companion.None$lambda$0(annotatedString);
        return None$lambda$0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        double DoubleIdentity$lambda$8;
        double ExtendedSrgb$lambda$0;
        double ExtendedSrgb$lambda$1;
        double Bt2020Hlg$lambda$2;
        double Bt2020Hlg$lambda$3;
        double Bt2020Pq$lambda$4;
        double Bt2020Pq$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                DoubleIdentity$lambda$8 = Rgb.DoubleIdentity$lambda$8(d);
                return DoubleIdentity$lambda$8;
            case 17:
                ExtendedSrgb$lambda$0 = ColorSpaces.ExtendedSrgb$lambda$0(d);
                return ExtendedSrgb$lambda$0;
            case 18:
                ExtendedSrgb$lambda$1 = ColorSpaces.ExtendedSrgb$lambda$1(d);
                return ExtendedSrgb$lambda$1;
            case 19:
                Bt2020Hlg$lambda$2 = ColorSpaces.Bt2020Hlg$lambda$2(d);
                return Bt2020Hlg$lambda$2;
            case 20:
                Bt2020Hlg$lambda$3 = ColorSpaces.Bt2020Hlg$lambda$3(d);
                return Bt2020Hlg$lambda$3;
            case 21:
                Bt2020Pq$lambda$4 = ColorSpaces.Bt2020Pq$lambda$4(d);
                return Bt2020Pq$lambda$4;
            default:
                Bt2020Pq$lambda$5 = ColorSpaces.Bt2020Pq$lambda$5(d);
                return Bt2020Pq$lambda$5;
        }
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        boolean overlaps;
        boolean ContainsAll$lambda$1;
        boolean ContainsCenter$lambda$2;
        switch (this.$r8$classId) {
            case 26:
                overlaps = rect.overlaps(rect2);
                return overlaps;
            case 27:
                ContainsAll$lambda$1 = TextInclusionStrategy.Companion.ContainsAll$lambda$1(rect, rect2);
                return ContainsAll$lambda$1;
            default:
                ContainsCenter$lambda$2 = TextInclusionStrategy.Companion.ContainsCenter$lambda$2(rect, rect2);
                return ContainsCenter$lambda$2;
        }
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        boolean applyPausedPrecomposition$lambda$28$lambda$27$lambda$26;
        applyPausedPrecomposition$lambda$28$lambda$27$lambda$26 = LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$28$lambda$27$lambda$26();
        return applyPausedPrecomposition$lambda$28$lambda$27$lambda$26;
    }

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession m(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteGesture m5109m(Object obj) {
        return (DeleteGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m5110m(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InsertGesture m5111m(Object obj) {
        return (InsertGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m5112m(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m5113m(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectGesture m5114m(Object obj) {
        return (SelectGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m5115m(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m5116m(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }
}
