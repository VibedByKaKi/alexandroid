package com.amazon.alexa.notification.api.actions.model;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public abstract class NotificationActionList {
    private String actionListId;
    private List<NotificationAction> actions;
    private OwnerId ownerId;

    public String getActionListId() {
        return this.actionListId;
    }

    public List<NotificationAction> getActions() {
        if (this.actions == null) {
            return null;
        }
        return new ArrayList(this.actions);
    }

    public OwnerId getOwnerId() {
        return this.ownerId;
    }

    public void setActionListId(String str) {
        this.actionListId = str;
    }

    public void setActions(List<NotificationAction> list) {
        this.actions = list;
    }

    public void setOwnerId(OwnerId ownerId) {
        this.ownerId = ownerId;
    }
}
