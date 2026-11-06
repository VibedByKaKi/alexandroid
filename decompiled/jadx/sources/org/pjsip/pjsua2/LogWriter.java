package org.pjsip.pjsua2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class LogWriter {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public LogWriter() {
        this(pjsua2JNI.new_LogWriter(), true);
        pjsua2JNI.LogWriter_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(LogWriter logWriter) {
        if (logWriter == null) {
            return 0L;
        }
        return logWriter.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    pjsua2JNI.delete_LogWriter(j);
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

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        pjsua2JNI.LogWriter_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        pjsua2JNI.LogWriter_change_ownership(this, this.swigCPtr, true);
    }

    public void write(LogEntry logEntry) {
        pjsua2JNI.LogWriter_write(this.swigCPtr, this, LogEntry.getCPtr(logEntry), logEntry);
    }

    public LogWriter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
