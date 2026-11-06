package com.amazon.alexa.benefits.models.beta;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BetaStatusChangeEventPayload {
    private final String mobilyticsOwnerID;
    private final String type;

    public BetaStatusChangeEventPayload(String str, String str2) {
        this.type = str;
        this.mobilyticsOwnerID = str2;
    }

    public String getMobilyticsOwnerID() {
        return this.mobilyticsOwnerID;
    }

    public String getType() {
        return this.type;
    }
}
