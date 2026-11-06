package com.amazon.alexa.wakeword.speakerverification.mlis;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Parts {
    private SpeakerVerificationAudio svAudio;
    private SpeakerVerificationMetadata svMetadata;

    public Parts(SpeakerVerificationAudio speakerVerificationAudio, SpeakerVerificationMetadata speakerVerificationMetadata) {
        this.svAudio = speakerVerificationAudio;
        this.svMetadata = speakerVerificationMetadata;
    }

    public SpeakerVerificationAudio getSvAudio() {
        return this.svAudio;
    }

    public SpeakerVerificationMetadata getSvMetadata() {
        return this.svMetadata;
    }
}
