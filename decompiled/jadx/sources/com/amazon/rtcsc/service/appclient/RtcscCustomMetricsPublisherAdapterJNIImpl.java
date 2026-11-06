package com.amazon.rtcsc.service.appclient;

import android.os.RemoteException;
import com.amazon.rtcsc.interfaces.IRtcscCustomMetricsPublisherAdapter;
import com.amazon.rtcsc.interfaces.RtcscCustomMetric;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazon.rtcsc.wrappers.CounterVector;
import com.amazon.rtcsc.wrappers.MetadataVector;
import com.amazon.rtcsc.wrappers.RTCCustomMetricInterface;
import com.amazon.rtcsc.wrappers.RTCCustomMetricsPublisherAdapterInterface;
import com.amazon.rtcsc.wrappers.TimerVector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscCustomMetricsPublisherAdapterJNIImpl extends RTCCustomMetricsPublisherAdapterInterface {
    private IRtcscCustomMetricsPublisherAdapter mAdapter;
    private RtcscLogger mLog = RtcscLogger.getLogger(RtcscCustomMetricsPublisherAdapterJNIImpl.class);

    public RtcscCustomMetricsPublisherAdapterJNIImpl(IRtcscCustomMetricsPublisherAdapter iRtcscCustomMetricsPublisherAdapter) {
        this.mAdapter = null;
        this.mAdapter = iRtcscCustomMetricsPublisherAdapter;
    }

    public void onError(RtcscErrorCode rtcscErrorCode) {
        this.mLog.e("onError received with errorCode " + rtcscErrorCode + ". Forwarding to adapter.");
        try {
            this.mAdapter.onError(rtcscErrorCode);
        } catch (RemoteException unused) {
            this.mLog.w("onError callback could not be invoked.");
        }
    }

    @Override // com.amazon.rtcsc.wrappers.RTCCustomMetricsPublisherAdapterInterface
    public boolean recordMetric(RTCCustomMetricInterface rTCCustomMetricInterface) {
        boolean z = false;
        if (rTCCustomMetricInterface == null) {
            this.mLog.e("recordMetric. null metric passed.");
            return false;
        }
        String programName = rTCCustomMetricInterface.getProgramName();
        String sourceName = rTCCustomMetricInterface.getSourceName();
        TimerVector timers = rTCCustomMetricInterface.getTimers();
        int size = timers.size();
        CounterVector counters = rTCCustomMetricInterface.getCounters();
        int size2 = counters.size();
        MetadataVector metadata = rTCCustomMetricInterface.getMetadata();
        int size3 = metadata.size();
        RTCCustomMetricInterface.Priority priority = rTCCustomMetricInterface.getPriority();
        RtcscCustomMetric.Timer[] timerArr = new RtcscCustomMetric.Timer[size];
        int i = 0;
        while (i < size) {
            timerArr[i] = new RtcscCustomMetric.Timer(timers.get(i).getName(), timers.get(i).getValue());
            i++;
            z = z;
            timers = timers;
        }
        boolean z2 = z;
        RtcscCustomMetric.Counter[] counterArr = new RtcscCustomMetric.Counter[size2];
        for (int i2 = z2 ? 1 : 0; i2 < size2; i2++) {
            counterArr[i2] = new RtcscCustomMetric.Counter(counters.get(i2).getName(), counters.get(i2).getValue());
        }
        RtcscCustomMetric.Metadata[] metadataArr = new RtcscCustomMetric.Metadata[size3];
        for (int i3 = z2 ? 1 : 0; i3 < size3; i3++) {
            metadataArr[i3] = new RtcscCustomMetric.Metadata(metadata.get(i3).getName(), metadata.get(i3).getValue());
        }
        try {
            this.mAdapter.recordMetric(new RtcscCustomMetric(programName, sourceName, timerArr, counterArr, metadataArr, priority == RTCCustomMetricInterface.Priority.CRITICAL ? RtcscCustomMetric.Priority.CRITICAL : priority == RTCCustomMetricInterface.Priority.HIGH ? RtcscCustomMetric.Priority.HIGH : RtcscCustomMetric.Priority.NORMAL));
            return true;
        } catch (RemoteException unused) {
            this.mLog.w("recordMetric callback could not be invoked.");
            return z2;
        }
    }
}
