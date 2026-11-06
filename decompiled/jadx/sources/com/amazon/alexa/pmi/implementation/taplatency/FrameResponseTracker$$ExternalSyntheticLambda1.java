package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.FrameMetrics;
import android.view.Window;
import com.amazon.alexa.pmi.implementation.fluidity.FluidityMetricsRecorderImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class FrameResponseTracker$$ExternalSyntheticLambda1 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FrameResponseTracker$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                FrameResponseTracker.attachListener$lambda$6((FrameResponseTracker) obj, window, frameMetrics, i);
                break;
            default:
                ((FluidityMetricsRecorderImpl) obj).lambda$setupFrameMetricsListener$2(window, frameMetrics, i);
                break;
        }
    }
}
