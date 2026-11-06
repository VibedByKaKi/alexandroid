package com.amazon.apl.android;

import com.amazon.apl.devtools.util.IDTCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IDTCallback f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda4(int i, int i2, IDTCallback iDTCallback) {
        this.$r8$classId = i2;
        this.f$0 = iDTCallback;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                APLLayout.lambda$documentCommandRequest$9(this.f$0, this.f$1);
                break;
            case 1:
                APLLayout.lambda$stopFrameMetricsRecording$3(this.f$0, this.f$1);
                break;
            default:
                APLLayout.lambda$documentCommandRequest$11(this.f$0, this.f$1);
                break;
        }
    }
}
