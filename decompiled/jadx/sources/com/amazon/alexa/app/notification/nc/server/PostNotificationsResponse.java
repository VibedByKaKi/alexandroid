package com.amazon.alexa.app.notification.nc.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class PostNotificationsResponse {
    private final List<NotificationStatus> statuses;

    public PostNotificationsResponse(List<NotificationStatus> list) {
        this.statuses = list != null ? new ArrayList(list) : new ArrayList();
    }

    public List<NotificationStatus> getStatuses() {
        return Collections.unmodifiableList(this.statuses);
    }
}
