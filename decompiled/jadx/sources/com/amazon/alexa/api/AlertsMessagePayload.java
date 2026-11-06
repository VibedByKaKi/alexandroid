package com.amazon.alexa.api;

import com.amazon.alexa.api.Bundles;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class AlertsMessagePayload extends BaseMessagePayload {
    public AlertsMessagePayload(ExtendedClient extendedClient, String str, AlertType alertType) {
        super(extendedClient);
        add(AlertsArgumentKey.ALERT_ID, str);
        add((Bundles.Key) AlertsArgumentKey.ALERT_TYPE, alertType.ordinal());
    }
}
