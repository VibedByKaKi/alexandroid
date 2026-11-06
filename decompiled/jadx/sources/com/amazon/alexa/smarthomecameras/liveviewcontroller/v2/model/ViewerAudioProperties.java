package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.AudioState;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.enums.TalkMode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ViewerAudioProperties implements Serializable {

    @NonNull
    @SerializedName("microphoneState")
    private final AudioState microphoneState;

    @NonNull
    @SerializedName("speakerState")
    private final AudioState speakerState;

    @NonNull
    @SerializedName("talkMode")
    private final TalkMode talkMode;

    public ViewerAudioProperties(TalkMode talkMode, AudioState audioState, AudioState audioState2) {
        this.talkMode = talkMode;
        this.microphoneState = audioState;
        this.speakerState = audioState2;
    }

    @NonNull
    public AudioState getMicrophoneState() {
        return this.microphoneState;
    }

    @NonNull
    public AudioState getSpeakerState() {
        return this.speakerState;
    }

    @NonNull
    public TalkMode getTalkMode() {
        return this.talkMode;
    }
}
