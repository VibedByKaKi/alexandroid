package com.amazon.deecomms.nativemodules.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaMetadata {
    private int duration;
    private String fileName;

    public MediaMetadata(String str, int i) {
        this.fileName = str;
        this.duration = i;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }
}
