package com.amazon.rtcsc.wrappers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCCustomMetricsPublisherAdapterInterface {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public RTCCustomMetricsPublisherAdapterInterface() {
        this(RTCControllerAndroidJNI.new_RTCCustomMetricsPublisherAdapterInterface(), true);
        RTCControllerAndroidJNI.RTCCustomMetricsPublisherAdapterInterface_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(RTCCustomMetricsPublisherAdapterInterface rTCCustomMetricsPublisherAdapterInterface) {
        if (rTCCustomMetricsPublisherAdapterInterface == null) {
            return 0L;
        }
        return rTCCustomMetricsPublisherAdapterInterface.swigCPtr;
    }

    public synchronized void delete() {
        try {
            if (this.swigCPtr != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    throw new UnsupportedOperationException("C++ destructor does not have public access");
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean recordMetric(RTCCustomMetricInterface rTCCustomMetricInterface) {
        return RTCControllerAndroidJNI.RTCCustomMetricsPublisherAdapterInterface_recordMetric(this.swigCPtr, this, RTCCustomMetricInterface.getCPtr(rTCCustomMetricInterface), rTCCustomMetricInterface);
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        RTCControllerAndroidJNI.RTCCustomMetricsPublisherAdapterInterface_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        RTCControllerAndroidJNI.RTCCustomMetricsPublisherAdapterInterface_change_ownership(this, this.swigCPtr, true);
    }

    public RTCCustomMetricsPublisherAdapterInterface(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
