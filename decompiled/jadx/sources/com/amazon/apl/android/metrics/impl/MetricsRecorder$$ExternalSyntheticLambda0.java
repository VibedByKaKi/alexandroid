package com.amazon.apl.android.metrics.impl;

import com.amazon.alexa.voice.pryon.asr.PryonWakeWordDetector;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class MetricsRecorder$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ long f$4;

    public /* synthetic */ MetricsRecorder$$ExternalSyntheticLambda0(long j, long j2, MetricsRecorder metricsRecorder, String str, Map map) {
        this.$r8$classId = 2;
        this.f$0 = metricsRecorder;
        this.f$3 = j;
        this.f$1 = str;
        this.f$2 = map;
        this.f$4 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MetricsRecorder) this.f$0).lambda$recordSegmentEnd$2(this.f$1, (Map) this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                ((MetricsRecorder) this.f$0).lambda$recordSegmentFailed$3(this.f$1, (Map) this.f$2, this.f$3, this.f$4);
                break;
            case 2:
                ((MetricsRecorder) this.f$0).lambda$recordSegmentStart$1(this.f$3, this.f$1, (Map) this.f$2, this.f$4);
                break;
            default:
                ((PryonWakeWordDetector) this.f$0).lambda$wakeWordDetected$0(this.f$1, this.f$3, this.f$4, (byte[]) this.f$2);
                break;
        }
    }

    public /* synthetic */ MetricsRecorder$$ExternalSyntheticLambda0(PryonWakeWordDetector pryonWakeWordDetector, String str, long j, long j2, byte[] bArr) {
        this.$r8$classId = 3;
        this.f$0 = pryonWakeWordDetector;
        this.f$1 = str;
        this.f$3 = j;
        this.f$4 = j2;
        this.f$2 = bArr;
    }

    public /* synthetic */ MetricsRecorder$$ExternalSyntheticLambda0(MetricsRecorder metricsRecorder, String str, Map map, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = metricsRecorder;
        this.f$1 = str;
        this.f$2 = map;
        this.f$3 = j;
        this.f$4 = j2;
    }
}
