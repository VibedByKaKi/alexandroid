package com.amazon.rtcsc.appclient;

import com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter;
import com.amazon.rtcsc.interfaces.RtcscCustomMetric;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class RtcscCustomMetricsPublisherAdapter extends IRtcscCustomMetricsPublisherAdapter.Stub {
    @Override // com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter
    public int getAPIVersion() {
        return 1;
    }

    public void onError(RtcscErrorCode rtcscErrorCode) {
        throw new UnsupportedOperationException("onError is not implemented.");
    }

    public void recordMetric(RtcscCustomMetric rtcscCustomMetric) {
        throw new UnsupportedOperationException("recordMetric is not implemented");
    }
}
