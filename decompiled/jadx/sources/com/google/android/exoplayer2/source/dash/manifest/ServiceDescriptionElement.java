package com.google.android.exoplayer2.source.dash.manifest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j, long j2, long j3, float f, float f2) {
        this.targetOffsetMs = j;
        this.minOffsetMs = j2;
        this.maxOffsetMs = j3;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f2;
    }
}
