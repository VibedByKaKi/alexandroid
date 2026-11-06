package com.mapbox.annotation.module;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/annotation/module/MapboxModuleType;", "", "simplifiedName", "", "interfacePackage", "interfaceClassName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInterfaceClassName", "()Ljava/lang/String;", "getInterfacePackage", "getSimplifiedName", "CommonLibraryLoader", "CommonLogger", "MapTelemetry", "NavigationTripNotification", "annotations"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public enum MapboxModuleType {
    CommonLibraryLoader("LibraryLoader", "com.mapbox.common.module", "LibraryLoader"),
    CommonLogger("Logger", "com.mapbox.base.common.logger", "Logger"),
    MapTelemetry("MapTelemetry", "com.mapbox.maps.module", "MapTelemetry"),
    NavigationTripNotification("TripNotification", "com.mapbox.navigation.base.trip.notification", "TripNotification");


    @NotNull
    private final String interfaceClassName;

    @NotNull
    private final String interfacePackage;

    @NotNull
    private final String simplifiedName;

    MapboxModuleType(String str, String str2, String str3) {
        this.simplifiedName = str;
        this.interfacePackage = str2;
        this.interfaceClassName = str3;
    }

    @NotNull
    public final String getInterfaceClassName() {
        return this.interfaceClassName;
    }

    @NotNull
    public final String getInterfacePackage() {
        return this.interfacePackage;
    }

    @NotNull
    public final String getSimplifiedName() {
        return this.simplifiedName;
    }
}
