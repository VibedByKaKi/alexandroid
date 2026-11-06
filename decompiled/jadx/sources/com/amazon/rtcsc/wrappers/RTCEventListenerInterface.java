package com.amazon.rtcsc.wrappers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RTCEventListenerInterface {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public RTCEventListenerInterface() {
        this(RTCControllerAndroidJNI.new_RTCEventListenerInterface(), true);
        RTCControllerAndroidJNI.RTCEventListenerInterface_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(RTCEventListenerInterface rTCEventListenerInterface) {
        if (rTCEventListenerInterface == null) {
            return 0L;
        }
        return rTCEventListenerInterface.swigCPtr;
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

    public void onRTCSessionContextUpdated(String str) {
        RTCControllerAndroidJNI.RTCEventListenerInterface_onRTCSessionContextUpdated(this.swigCPtr, this, str);
    }

    public void onSendEvent(String str, String str2, String str3, String str4) {
        RTCControllerAndroidJNI.RTCEventListenerInterface_onSendEvent(this.swigCPtr, this, str, str2, str3, str4);
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        RTCControllerAndroidJNI.RTCEventListenerInterface_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        RTCControllerAndroidJNI.RTCEventListenerInterface_change_ownership(this, this.swigCPtr, true);
    }

    public RTCEventListenerInterface(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
