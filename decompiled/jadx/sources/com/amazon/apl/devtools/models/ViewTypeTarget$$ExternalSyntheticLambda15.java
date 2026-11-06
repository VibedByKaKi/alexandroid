package com.amazon.apl.devtools.models;

import com.amazon.apl.devtools.util.IDTCallback;
import com.amazon.apl.devtools.views.IAPLView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewTypeTarget$$ExternalSyntheticLambda15 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IAPLView f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ IDTCallback f$2;

    public /* synthetic */ ViewTypeTarget$$ExternalSyntheticLambda15(IAPLView iAPLView, int i, IDTCallback iDTCallback, int i2) {
        this.$r8$classId = i2;
        this.f$0 = iAPLView;
        this.f$1 = i;
        this.f$2 = iDTCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.stopSessionRecorderRecording(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.stopFrameMetricsRecording(this.f$1, this.f$2);
                break;
            default:
                this.f$0.startFrameMetricsRecording(this.f$1, this.f$2);
                break;
        }
    }
}
