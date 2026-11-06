package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.model.SourceInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BasicSourceInfo {
    private String mDeviceId;
    private String mSourceId;

    public BasicSourceInfo(SourceInfo sourceInfo) {
        this.mSourceId = sourceInfo.getSourceId();
        this.mDeviceId = sourceInfo.getDevice().getDeviceId();
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getSourceId() {
        return this.mSourceId;
    }

    public BasicSourceInfo(String str, String str2) {
        this.mSourceId = str;
        this.mDeviceId = str2;
    }
}
