package com.amazon.alexa.accessory.engagement;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
enum DemType {
    APP_CONNECTION("ANDROID", "PowerReporter", "DevicePowerStats", "amaAccessory"),
    INTERNET_CONNECTED("ANDROID", "InternetReporter", "InternetStats", "internet"),
    USER_PRESENT("ANDROID", "UsageReporter", "UsageStats", "user");

    private final String event;
    private final String pageType;
    private final String reasonCode;
    private final String sourceName;

    DemType(String str, String str2, String str3, String str4) {
        Objects.requireNonNull(str);
        this.reasonCode = str;
        Objects.requireNonNull(str2);
        this.sourceName = str2;
        Objects.requireNonNull(str3);
        this.pageType = str3;
        Objects.requireNonNull(str4);
        this.event = str4;
    }

    public String getEvent() {
        return this.event;
    }

    public String getPageAction() {
        return name();
    }

    public String getPageType() {
        return this.pageType;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public String getSourceName() {
        return this.sourceName;
    }
}
