package com.amazonaws;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public final class RequestClientOptions {
    public static final int DEFAULT_STREAM_BUFFER_SIZE = 131073;
    private static final int STREAM_BUFFER_SHIFT_VAL = 17;
    private final Map<Marker, String> markers = new EnumMap(Marker.class);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Marker {
        USER_AGENT
    }

    private String createUserAgentMarkerString(String str, String str2) {
        return str.contains(str2) ? str : a$$ExternalSyntheticOutline0.m$1(str, " ", str2);
    }

    @Deprecated
    public void addClientMarker(String str) {
        appendUserAgent(str);
    }

    public void appendUserAgent(String str) {
        Map<Marker, String> map = this.markers;
        Marker marker = Marker.USER_AGENT;
        String str2 = map.get(marker);
        if (str2 == null) {
            str2 = "";
        }
        putClientMarker(marker, createUserAgentMarkerString(str2, str));
    }

    public String getClientMarker(Marker marker) {
        return this.markers.get(marker);
    }

    public void putClientMarker(Marker marker, String str) {
        this.markers.put(marker, str);
    }

    @Deprecated
    public String getClientMarker() {
        return getClientMarker(Marker.USER_AGENT);
    }
}
