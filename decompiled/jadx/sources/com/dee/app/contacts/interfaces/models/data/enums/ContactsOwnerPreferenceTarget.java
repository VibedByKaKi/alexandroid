package com.dee.app.contacts.interfaces.models.data.enums;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum ContactsOwnerPreferenceTarget {
    ALEXA_COMMS("AlexaComms"),
    AMAZON_PHOTOS("AmazonPhotos"),
    AMAZON_MUSIC("AmazonMusic"),
    ALL("ALL");

    final String value;

    ContactsOwnerPreferenceTarget(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
