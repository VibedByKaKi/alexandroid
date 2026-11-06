package com.amazon.apl.android;

import com.amazon.apl.devtools.util.IDTCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IDTCallback f$0;

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda3(IDTCallback iDTCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = iDTCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        IDTCallback iDTCallback = this.f$0;
        switch (i) {
            case 0:
                APLLayout.lambda$startSessionRecorderRecording$5(iDTCallback);
                break;
            case 1:
                APLLayout.lambda$replaySessionRecorderRecording$8(iDTCallback);
                break;
            case 2:
                APLLayout.lambda$stopSessionRecorderRecording$6(iDTCallback);
                break;
            case 3:
                APLLayout.lambda$startFrameMetricsRecording$1(iDTCallback);
                break;
            case 4:
                APLLayout.lambda$documentCommandRequest$10(iDTCallback);
                break;
            default:
                APLLayout.lambda$documentCommandRequest$12(iDTCallback);
                break;
        }
    }
}
