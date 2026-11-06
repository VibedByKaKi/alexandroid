package com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UtteranceInteractionDetails implements InteractionDetails {
    private final String interactionType = InteractionType.UTTERANCE;
    private String utteranceID;

    public UtteranceInteractionDetails(@Nullable String str) {
        this.utteranceID = str;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails
    public String getInteractionType() {
        return InteractionType.UTTERANCE;
    }

    public String getUtteranceId() {
        return this.utteranceID;
    }

    public void setUtteranceId(@Nullable String str) {
        this.utteranceID = str;
    }
}
