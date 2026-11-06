package com.amazon.alexa.featureservice.repo.model;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AppStartStatus {
    private long appStartTime;
    private long bugSnagCompleteTime;
    private long featureRefreshCompleteTime;
    private long featureRefreshStartTime;
    private long incompleteStartCount;

    public AppStartStatus(long j, long j2, long j3, long j4) {
        this.appStartTime = j;
        this.featureRefreshStartTime = j2;
        this.featureRefreshCompleteTime = j3;
        this.bugSnagCompleteTime = j4;
    }

    public long getAppStartTime() {
        return this.appStartTime;
    }

    public long getBugSnagCompleteTime() {
        return this.bugSnagCompleteTime;
    }

    public long getFeatureRefreshCompleteTime() {
        return this.featureRefreshCompleteTime;
    }

    public long getFeatureRefreshStartTime() {
        return this.featureRefreshStartTime;
    }

    public long getIncompleteStartCount() {
        return this.incompleteStartCount;
    }

    public boolean isCrashDetected() {
        if (this.appStartTime <= 0) {
            return false;
        }
        if (this.bugSnagCompleteTime <= 0) {
            return true;
        }
        return this.featureRefreshStartTime > 0 && this.featureRefreshCompleteTime <= 0;
    }

    public boolean isCrashLoopDetected() {
        return isCrashDetected() && this.incompleteStartCount >= 3;
    }

    public boolean isValidFeatureRefreshStart() {
        return this.appStartTime <= 0 || this.featureRefreshStartTime > 0;
    }

    public void setAppStartTime(long j) {
        this.appStartTime = j;
    }

    public void setBugSnagCompleteTime(long j) {
        this.bugSnagCompleteTime = j;
    }

    public void setFeatureRefreshCompleteTime(long j) {
        this.featureRefreshCompleteTime = j;
    }

    public void setFeatureRefreshStartTime(long j) {
        this.featureRefreshStartTime = j;
    }

    public void setIncompleteStartCount(long j) {
        this.incompleteStartCount = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppStartStatus{appStartTime='");
        sb.append(this.appStartTime);
        sb.append("', BugSnagCompleteTime='");
        sb.append(this.bugSnagCompleteTime);
        sb.append("', featureRefreshStartTime='");
        sb.append(this.featureRefreshStartTime);
        sb.append("', featureRefreshCompleteTime='");
        sb.append(this.featureRefreshCompleteTime);
        sb.append("', incompleteStartCount='");
        return a$$ExternalSyntheticOutline0.m(this.incompleteStartCount, "'}", sb);
    }

    public AppStartStatus(long j, long j2, long j3) {
        this(j, j2, j3, 0L);
    }

    public AppStartStatus() {
        this(0L, 0L, 0L);
    }
}
