package com.amazon.alexa.enrollment.unified.model;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Speaker {
    private String firstName;
    private String personId;
    private String speakerCID;
    private String speakerUUID;
    private VoiceTrainingStatus voiceTrainingStatus;

    public String getFirstName() {
        return this.firstName;
    }

    public String getPersonId() {
        return this.personId;
    }

    public String getSpeakerCID() {
        return this.speakerCID;
    }

    @Nullable
    public String getSpeakerUUID() {
        return this.speakerUUID;
    }

    public VoiceTrainingStatus getVoiceTrainingStatus() {
        return this.voiceTrainingStatus;
    }
}
