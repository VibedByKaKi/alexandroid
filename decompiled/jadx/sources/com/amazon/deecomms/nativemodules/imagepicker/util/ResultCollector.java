package com.amazon.deecomms.nativemodules.imagepicker.util;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.call.active.ActiveVideoCallView$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ResultCollector {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ResultCollector.class);
    private WritableArray mArrayResult;
    private boolean mIsMultiple;
    private Promise mPromise;
    private boolean mResultSent;
    private int mWaitCount;
    private AtomicInteger mWaitCounter;

    private synchronized boolean isRequestValid() {
        if (this.mResultSent) {
            LOG.w("Skip result, already sent");
            return false;
        }
        if (this.mPromise != null) {
            return true;
        }
        LOG.w("Promise is null");
        return false;
    }

    public synchronized void notifyProblem(String str, Throwable th) {
        if (isRequestValid()) {
            LOG.e("Unexpected error occurred." + th.getMessage(), th);
            this.mPromise.reject(str, th);
            this.mResultSent = true;
        }
    }

    public synchronized void notifySuccess(WritableMap writableMap) {
        if (isRequestValid()) {
            if (!this.mIsMultiple) {
                this.mPromise.resolve(writableMap);
                this.mResultSent = true;
            } else {
                this.mArrayResult.pushMap(writableMap);
                if (this.mWaitCounter.addAndGet(1) == this.mWaitCount) {
                    this.mPromise.resolve(this.mArrayResult);
                    this.mResultSent = true;
                }
            }
        }
    }

    public synchronized void setWaitCount(int i) {
        this.mWaitCount = i;
        this.mWaitCounter = new AtomicInteger(0);
    }

    public synchronized void setup(Promise promise, boolean z) {
        this.mPromise = promise;
        this.mIsMultiple = z;
        this.mResultSent = false;
        this.mWaitCount = 0;
        this.mWaitCounter = new AtomicInteger(0);
        if (z) {
            this.mArrayResult = new WritableNativeArray();
        }
    }

    public synchronized void notifyProblem(String str, String str2) {
        if (isRequestValid()) {
            ActiveVideoCallView$$ExternalSyntheticOutline0.m(LOG, "Unexpected error occurred", str2);
            this.mPromise.reject(str, str2);
            this.mResultSent = true;
        }
    }
}
