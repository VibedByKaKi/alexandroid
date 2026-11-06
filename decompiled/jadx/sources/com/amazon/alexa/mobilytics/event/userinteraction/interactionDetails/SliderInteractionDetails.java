package com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class SliderInteractionDetails implements InteractionDetails {
    private Integer endPosition;
    private final String interactionType = InteractionType.SLIDER;
    private Integer startPosition;

    public SliderInteractionDetails(@Nullable Integer num, @Nullable Integer num2) {
        this.startPosition = num;
        this.endPosition = num2;
    }

    @Nullable
    public Integer getEndPosition() {
        return this.endPosition;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails
    public String getInteractionType() {
        return InteractionType.SLIDER;
    }

    @Nullable
    public Integer getStartPosition() {
        return this.startPosition;
    }

    public void setEndPosition(@Nullable Integer num) {
        this.endPosition = num;
    }

    public void setStartPosition(@Nullable Integer num) {
        this.startPosition = num;
    }
}
