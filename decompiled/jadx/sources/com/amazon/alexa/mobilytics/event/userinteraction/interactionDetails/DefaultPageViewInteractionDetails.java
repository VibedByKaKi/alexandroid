package com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails;

import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultPageViewInteractionDetails implements PageViewInteractionDetails {
    private final Long duration;
    private final String interactionType = InteractionType.PAGE_VIEW;

    public DefaultPageViewInteractionDetails(Long l) {
        this.duration = l;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.PageViewInteractionDetails
    public Long duration() {
        return this.duration;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails
    public String getInteractionType() {
        return InteractionType.PAGE_VIEW;
    }
}
