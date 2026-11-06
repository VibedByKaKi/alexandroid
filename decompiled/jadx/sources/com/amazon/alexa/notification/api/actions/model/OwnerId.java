package com.amazon.alexa.notification.api.actions.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public enum OwnerId {
    NOTIFICATIONS("Alexa", "Mobile", "Notifications"),
    REMINDERS("Alexa", "HHO", "Mobile");

    private final String category;
    private final String item;
    private final String type;

    OwnerId(String str, String str2, String str3) {
        this.category = str;
        this.type = str2;
        this.item = str3;
    }

    public String getCategory() {
        return this.category;
    }

    public String getItem() {
        return this.item;
    }

    public String getType() {
        return this.type;
    }
}
