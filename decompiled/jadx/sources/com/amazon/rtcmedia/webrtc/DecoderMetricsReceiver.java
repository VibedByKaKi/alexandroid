package com.amazon.rtcmedia.webrtc;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.rtcmedia.util.RtcscLogger;
import org.webrtc.DecoderMetricsSink;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DecoderMetricsReceiver implements DecoderMetricsSink {
    private static RtcscLogger mLog = RtcscLogger.getLogger(DecoderMetricsReceiver.class);

    @Override // org.webrtc.DecoderMetricsSink
    public void onFrameDropDueToTextureAvailability(int i, long j) {
        mLog.d(ParcelCompat$$ExternalSyntheticOutline0.m(j, "onFrameDropDueToTextureAvailability. count= ", i, " durationOverWhichDropOccurredMs= "));
    }

    @Override // org.webrtc.DecoderMetricsSink
    public void onMediaCodecFrameDropDetected(int i, boolean z, boolean z2) {
        mLog.d("onMediaCodecFrameDropDetected. count= " + i + " mediaCodecDropWorkaroundEnabled= " + z + " isFramedDroppedAfterCodecInit= " + z2);
    }
}
