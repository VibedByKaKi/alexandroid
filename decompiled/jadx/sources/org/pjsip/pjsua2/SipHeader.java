package org.pjsip.pjsua2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SipHeader {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SipHeader() {
        this(pjsua2JNI.new_SipHeader(), true);
    }

    public static long getCPtr(SipHeader sipHeader) {
        if (sipHeader == null) {
            return 0L;
        }
        return sipHeader.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    pjsua2JNI.delete_SipHeader(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public String getHName() {
        return pjsua2JNI.SipHeader_hName_get(this.swigCPtr, this);
    }

    public String getHValue() {
        return pjsua2JNI.SipHeader_hValue_get(this.swigCPtr, this);
    }

    public void setHName(String str) {
        pjsua2JNI.SipHeader_hName_set(this.swigCPtr, this, str);
    }

    public void setHValue(String str) {
        pjsua2JNI.SipHeader_hValue_set(this.swigCPtr, this, str);
    }

    public SipHeader(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
