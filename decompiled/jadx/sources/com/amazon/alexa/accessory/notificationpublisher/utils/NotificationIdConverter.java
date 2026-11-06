package com.amazon.alexa.accessory.notificationpublisher.utils;

import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class NotificationIdConverter {
    private NotificationIdConverter() {
    }

    public static String toNotificationId(String str) {
        return str.substring(0, str.lastIndexOf("|"));
    }

    public static String toUUID(String str, long j) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "|");
        m1m.append(String.valueOf(j));
        return m1m.toString();
    }
}
