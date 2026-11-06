package org.pjsip.pjsua2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SipHeaderVector {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SipHeaderVector() {
        this(pjsua2JNI.new_SipHeaderVector__SWIG_0(), true);
    }

    public static long getCPtr(SipHeaderVector sipHeaderVector) {
        if (sipHeaderVector == null) {
            return 0L;
        }
        return sipHeaderVector.swigCPtr;
    }

    public void add(SipHeader sipHeader) {
        pjsua2JNI.SipHeaderVector_add(this.swigCPtr, this, SipHeader.getCPtr(sipHeader), sipHeader);
    }

    public long capacity() {
        return pjsua2JNI.SipHeaderVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        pjsua2JNI.SipHeaderVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    pjsua2JNI.delete_SipHeaderVector(j);
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

    public SipHeader get(int i) {
        return new SipHeader(pjsua2JNI.SipHeaderVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return pjsua2JNI.SipHeaderVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        pjsua2JNI.SipHeaderVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, SipHeader sipHeader) {
        pjsua2JNI.SipHeaderVector_set(this.swigCPtr, this, i, SipHeader.getCPtr(sipHeader), sipHeader);
    }

    public long size() {
        return pjsua2JNI.SipHeaderVector_size(this.swigCPtr, this);
    }

    public SipHeaderVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public SipHeaderVector(long j) {
        this(pjsua2JNI.new_SipHeaderVector__SWIG_1(j), true);
    }
}
