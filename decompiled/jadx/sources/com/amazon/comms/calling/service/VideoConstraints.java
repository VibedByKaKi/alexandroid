package com.amazon.comms.calling.service;

import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoConstraints implements Comparable<VideoConstraints> {
    private int videoFps;
    private int videoHeight;
    private int videoWidth;

    public VideoConstraints(int i, int i2, int i3) {
        this.videoWidth = i;
        this.videoHeight = i2;
        this.videoFps = i3;
    }

    @Override // java.lang.Comparable
    public int compareTo(VideoConstraints videoConstraints) {
        if (videoConstraints == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("compareTo requires a valid object");
            return 0;
        }
        if (videoConstraints == this) {
            return 0;
        }
        return ((this.videoHeight * this.videoWidth) * this.videoFps) - (videoConstraints.getVideoFps() * (videoConstraints.getVideoWidth() * videoConstraints.getVideoHeight()));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoConstraints)) {
            return false;
        }
        VideoConstraints videoConstraints = (VideoConstraints) obj;
        return this.videoWidth == videoConstraints.getVideoWidth() && this.videoHeight == videoConstraints.getVideoHeight() && this.videoFps == videoConstraints.getVideoFps();
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.videoHeight), Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoFps));
    }

    public String toString() {
        return this.videoWidth + "x" + this.videoHeight + "@" + this.videoFps;
    }
}
