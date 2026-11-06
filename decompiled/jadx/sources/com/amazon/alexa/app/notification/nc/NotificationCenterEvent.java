package com.amazon.alexa.app.notification.nc;

import com.amazon.alexa.redesign.utils.Constants;
import com.amazon.alexa.tarazed.acrs.TarazedACRSSubscriber;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public enum NotificationCenterEvent {
    SEND_HOME_BADGE_UPDATE_EVENT("notificationCenter:sendHomeBadgeUpdate"),
    SEND_LEGAL_HOME_BADGE_UPDATE_EVENT("notificationCenter:sendHomeBadgeUpdate:legal"),
    HOME_REFRESH_EVENT(Constants.HOME_REFRESH_EVENT_BUS),
    DIRECTIVE_RECEIVED(TarazedACRSSubscriber.ACRS_TCOMM_EVENT);

    public final String name;

    NotificationCenterEvent(String str) {
        this.name = str;
    }
}
