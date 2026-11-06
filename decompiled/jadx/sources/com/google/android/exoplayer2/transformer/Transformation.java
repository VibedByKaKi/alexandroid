package com.google.android.exoplayer2.transformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class Transformation {
    public final boolean flattenForSlowMotion;
    public final String outputMimeType;
    public final boolean removeAudio;
    public final boolean removeVideo;

    public Transformation(boolean z, boolean z2, boolean z3, String str) {
        this.removeAudio = z;
        this.removeVideo = z2;
        this.flattenForSlowMotion = z3;
        this.outputMimeType = str;
    }
}
