package com.amazon.alexa.biloba.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TimeZoneRegionItem {
    private final TimeZoneItem region;
    private final List<TimeZoneItem> zones;

    public TimeZoneRegionItem(TimeZoneItem timeZoneItem, List<TimeZoneItem> list) {
        this.region = timeZoneItem;
        this.zones = list;
    }

    public TimeZoneItem getRegion() {
        return this.region;
    }

    public List<TimeZoneItem> getZones() {
        return this.zones;
    }
}
