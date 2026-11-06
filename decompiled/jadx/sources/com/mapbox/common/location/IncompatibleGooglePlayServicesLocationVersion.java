package com.mapbox.common.location;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/location/IncompatibleGooglePlayServicesLocationVersion;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class IncompatibleGooglePlayServicesLocationVersion extends Exception {
    public IncompatibleGooglePlayServicesLocationVersion() {
        super("Incompatible Google Play Services location version found. Please check https://docs.mapbox.com/android/maps/guides/user-location/ for more details.");
    }
}
