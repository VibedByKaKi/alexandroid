package com.amazon.apl.android;

import com.amazon.apl.devtools.enums.DTError;
import com.amazon.apl.devtools.util.IDTCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IDTCallback f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ DTError f$2;

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda2(IDTCallback iDTCallback, int i, DTError dTError, int i2) {
        this.$r8$classId = i2;
        this.f$0 = iDTCallback;
        this.f$1 = i;
        this.f$2 = dTError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                APLLayout.lambda$startSessionRecorderRecording$4(this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                APLLayout.lambda$replaySessionRecorderRecording$7(this.f$0, this.f$1, this.f$2);
                break;
            default:
                APLLayout.lambda$startFrameMetricsRecording$0(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
