package com.amazon.rtcsc.android.typedapi.types;

import com.amazon.rtcsc.android.typedapi.constants.BundlePolicy;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaStreams {

    @NonNull
    private final AudioStream audio;
    private String bundlePolicy;

    @NonNull
    private final VideoStream video;

    public MediaStreams(@NonNull AudioStream audioStream, @NonNull VideoStream videoStream) {
        if (audioStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("audio is marked non-null but is null");
            throw null;
        }
        if (videoStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("video is marked non-null but is null");
            throw null;
        }
        this.audio = audioStream;
        this.video = videoStream;
    }

    @NonNull
    public AudioStream getAudio() {
        return this.audio;
    }

    public String getBundlePolicy() {
        return this.bundlePolicy;
    }

    @NonNull
    public VideoStream getVideo() {
        return this.video;
    }

    public MediaStreams(BundlePolicy bundlePolicy, AudioStream audioStream, VideoStream videoStream) {
        this.bundlePolicy = bundlePolicy.name();
        this.audio = audioStream;
        this.video = videoStream;
    }
}
