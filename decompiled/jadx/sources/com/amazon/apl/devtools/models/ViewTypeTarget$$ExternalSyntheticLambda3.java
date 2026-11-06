package com.amazon.apl.devtools.models;

import com.amazon.apl.devtools.util.IDTCallback;
import com.amazon.apl.devtools.views.IAPLView;
import com.amazon.common.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewTypeTarget$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ IDTCallback f$1;

    public /* synthetic */ ViewTypeTarget$$ExternalSyntheticLambda3(int i, int i2, IDTCallback iDTCallback) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = iDTCallback;
    }

    @Override // com.amazon.common.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ViewTypeTarget.lambda$stopSessionRecorderRecording$11(this.f$0, this.f$1, (IAPLView) obj);
                break;
            case 1:
                ViewTypeTarget.lambda$stopFrameMetricsRecording$7(this.f$0, this.f$1, (IAPLView) obj);
                break;
            default:
                ViewTypeTarget.lambda$startFrameMetricsRecording$5(this.f$0, this.f$1, (IAPLView) obj);
                break;
        }
    }
}
