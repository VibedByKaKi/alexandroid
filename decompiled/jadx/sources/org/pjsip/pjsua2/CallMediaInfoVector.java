package org.pjsip.pjsua2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CallMediaInfoVector {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CallMediaInfoVector() {
        this(pjsua2JNI.new_CallMediaInfoVector__SWIG_0(), true);
    }

    public static long getCPtr(CallMediaInfoVector callMediaInfoVector) {
        if (callMediaInfoVector == null) {
            return 0L;
        }
        return callMediaInfoVector.swigCPtr;
    }

    public void add(CallMediaInfo callMediaInfo) {
        pjsua2JNI.CallMediaInfoVector_add(this.swigCPtr, this, CallMediaInfo.getCPtr(callMediaInfo), callMediaInfo);
    }

    public long capacity() {
        return pjsua2JNI.CallMediaInfoVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        pjsua2JNI.CallMediaInfoVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    pjsua2JNI.delete_CallMediaInfoVector(j);
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

    public CallMediaInfo get(int i) {
        return new CallMediaInfo(pjsua2JNI.CallMediaInfoVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return pjsua2JNI.CallMediaInfoVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        pjsua2JNI.CallMediaInfoVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, CallMediaInfo callMediaInfo) {
        pjsua2JNI.CallMediaInfoVector_set(this.swigCPtr, this, i, CallMediaInfo.getCPtr(callMediaInfo), callMediaInfo);
    }

    public long size() {
        return pjsua2JNI.CallMediaInfoVector_size(this.swigCPtr, this);
    }

    public CallMediaInfoVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public CallMediaInfoVector(long j) {
        this(pjsua2JNI.new_CallMediaInfoVector__SWIG_1(j), true);
    }
}
