package com.amazon.deecomms.calling.incallexperiences.model;

import com.amazon.alexa.ra.core.data.fragments.CardContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GetAvailableActionsResponse {

    @JsonProperty(CardContext.ACTIONS)
    private List<ApplicationAction> applicationActions;

    public List<ApplicationAction> getApplicationActions() {
        return this.applicationActions;
    }

    public void setApplicationActions(List<ApplicationAction> list) {
        this.applicationActions = list;
    }
}
