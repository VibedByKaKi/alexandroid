package com.amazon.apl.devtools.models;

import com.amazon.alexa.voice.pryon.asr.PryonWakeWordDetector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ViewTypeTarget$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ ViewTypeTarget$$ExternalSyntheticLambda4(Object obj, int i, int i2, long j) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ViewTypeTarget) this.f$0).lambda$onFrameIncidentEnded$28(this.f$1, this.f$2);
                break;
            default:
                ((PryonWakeWordDetector) this.f$0).lambda$vadStateChanged$1(this.f$1, this.f$2);
                break;
        }
    }
}
