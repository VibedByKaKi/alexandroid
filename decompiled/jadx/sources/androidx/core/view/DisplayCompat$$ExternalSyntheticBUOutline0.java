package androidx.core.view;

import android.content.Context;
import android.view.ContentInfo;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.DifferentialMotionFlingController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class DisplayCompat$$ExternalSyntheticBUOutline0 implements DifferentialMotionFlingController.FlingVelocityThresholdCalculator, DifferentialMotionFlingController.DifferentialVelocityProvider {
    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m7672m() {
        throw new NumberFormatException();
    }

    @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
    public void calculateFlingVelocityThresholds(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        DifferentialMotionFlingController.calculateFlingVelocityThresholds(context, iArr, motionEvent, i);
    }

    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    public float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        float currentVelocity;
        currentVelocity = DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i);
        return currentVelocity;
    }

    public static /* bridge */ /* synthetic */ ContentInfo m(Object obj) {
        return (ContentInfo) obj;
    }
}
