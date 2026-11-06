package com.amazon.apl.viewhost.primitives.transcoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SingleValueTranscoder {
    void transcode(double d);

    void transcode(float f);

    void transcode(int i);

    void transcode(long j);

    void transcode(String str);

    void transcode(boolean z);

    void transcodeNull();

    void transcodeUnsigned(int i);

    void transcodeUnsigned(long j);
}
