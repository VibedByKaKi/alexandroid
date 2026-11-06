package com.amazon.apl.viewhost.primitives.transcoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface KeyedContainerTranscoder {
    Transcoder transcode(String str);

    void transcode(String str, double d);

    void transcode(String str, float f);

    void transcode(String str, int i);

    void transcode(String str, long j);

    void transcode(String str, String str2);

    void transcode(String str, boolean z);

    KeyedContainerTranscoder transcodeKeyedContainer(String str);

    void transcodeNull(String str);

    SingleValueTranscoder transcodeSingleValue(String str);

    UnkeyedContainerTranscoder transcodeUnkeyedContainer(String str);
}
