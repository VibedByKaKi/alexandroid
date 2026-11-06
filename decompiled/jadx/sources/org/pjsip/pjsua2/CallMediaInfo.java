package org.pjsip.pjsua2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class CallMediaInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CallMediaInfo() {
        this(pjsua2JNI.new_CallMediaInfo(), true);
    }

    public static long getCPtr(CallMediaInfo callMediaInfo) {
        if (callMediaInfo == null) {
            return 0L;
        }
        return callMediaInfo.swigCPtr;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    pjsua2JNI.delete_CallMediaInfo(j);
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

    public int getAudioConfSlot() {
        return pjsua2JNI.CallMediaInfo_audioConfSlot_get(this.swigCPtr, this);
    }

    public pjmedia_dir getDir() {
        return pjmedia_dir.swigToEnum(pjsua2JNI.CallMediaInfo_dir_get(this.swigCPtr, this));
    }

    public long getIndex() {
        return pjsua2JNI.CallMediaInfo_index_get(this.swigCPtr, this);
    }

    public pjsua_call_media_status getStatus() {
        return pjsua_call_media_status.swigToEnum(pjsua2JNI.CallMediaInfo_status_get(this.swigCPtr, this));
    }

    public pjmedia_type getType() {
        return pjmedia_type.swigToEnum(pjsua2JNI.CallMediaInfo_type_get(this.swigCPtr, this));
    }

    public int getVideoCapDev() {
        return pjsua2JNI.CallMediaInfo_videoCapDev_get(this.swigCPtr, this);
    }

    public int getVideoIncomingWindowId() {
        return pjsua2JNI.CallMediaInfo_videoIncomingWindowId_get(this.swigCPtr, this);
    }

    public VideoWindow getVideoWindow() {
        long CallMediaInfo_videoWindow_get = pjsua2JNI.CallMediaInfo_videoWindow_get(this.swigCPtr, this);
        if (CallMediaInfo_videoWindow_get == 0) {
            return null;
        }
        return new VideoWindow(CallMediaInfo_videoWindow_get, false);
    }

    public void setAudioConfSlot(int i) {
        pjsua2JNI.CallMediaInfo_audioConfSlot_set(this.swigCPtr, this, i);
    }

    public void setDir(pjmedia_dir pjmedia_dirVar) {
        pjsua2JNI.CallMediaInfo_dir_set(this.swigCPtr, this, pjmedia_dirVar.swigValue());
    }

    public void setIndex(long j) {
        pjsua2JNI.CallMediaInfo_index_set(this.swigCPtr, this, j);
    }

    public void setStatus(pjsua_call_media_status pjsua_call_media_statusVar) {
        pjsua2JNI.CallMediaInfo_status_set(this.swigCPtr, this, pjsua_call_media_statusVar.swigValue());
    }

    public void setType(pjmedia_type pjmedia_typeVar) {
        pjsua2JNI.CallMediaInfo_type_set(this.swigCPtr, this, pjmedia_typeVar.swigValue());
    }

    public void setVideoCapDev(int i) {
        pjsua2JNI.CallMediaInfo_videoCapDev_set(this.swigCPtr, this, i);
    }

    public void setVideoIncomingWindowId(int i) {
        pjsua2JNI.CallMediaInfo_videoIncomingWindowId_set(this.swigCPtr, this, i);
    }

    public void setVideoWindow(VideoWindow videoWindow) {
        pjsua2JNI.CallMediaInfo_videoWindow_set(this.swigCPtr, this, VideoWindow.getCPtr(videoWindow), videoWindow);
    }

    public CallMediaInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
