package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent;

import com.amazon.alexa.api.AlexaCapability;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AnnounceWithContentCapability {
    static final String DIRECTIVE_NAME = "AnnounceWithContent";
    public static final String INTERFACE_NAME = "Alexa.Notifications.Multipart";
    static final String TYPE = "AlexaInterface";
    static final String VERSION = "1.0";

    private AnnounceWithContentCapability() {
    }

    public static AlexaCapability create() {
        return AlexaCapability.create("AlexaInterface", "Alexa.Notifications.Multipart", "1.0");
    }
}
