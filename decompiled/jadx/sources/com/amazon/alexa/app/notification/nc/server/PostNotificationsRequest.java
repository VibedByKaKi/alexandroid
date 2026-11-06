package com.amazon.alexa.app.notification.nc.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class PostNotificationsRequest {
    private final List<NCItem> notifications;

    public PostNotificationsRequest(List<NCItem> list) {
        this.notifications = new ArrayList(list);
    }

    public List<NCItem> getNotifications() {
        return Collections.unmodifiableList(this.notifications);
    }
}
