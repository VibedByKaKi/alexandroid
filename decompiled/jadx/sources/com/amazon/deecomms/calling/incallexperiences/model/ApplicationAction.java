package com.amazon.deecomms.calling.incallexperiences.model;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ApplicationAction {

    @JsonProperty(NotificationActionConstants.ACTION_ID_KEY)
    String actionId;

    @JsonProperty(Content.THUMBNAIL)
    String thumbnailUrl;

    public String getActionId() {
        return this.actionId;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public void setActionId(String str) {
        this.actionId = str;
    }

    public void setThumbnailUrl(String str) {
        this.thumbnailUrl = str;
    }
}
