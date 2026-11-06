package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.vision.barcode.common.Barcode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes8.dex */
public interface BarcodeSource {
    @Nullable
    @KeepForSdk
    Rect getBoundingBox();

    @Nullable
    @KeepForSdk
    Barcode.CalendarEvent getCalendarEvent();

    @Nullable
    @KeepForSdk
    Barcode.ContactInfo getContactInfo();

    @Nullable
    @KeepForSdk
    Point[] getCornerPoints();

    @Nullable
    @KeepForSdk
    String getDisplayValue();

    @Nullable
    @KeepForSdk
    Barcode.DriverLicense getDriverLicense();

    @Nullable
    @KeepForSdk
    Barcode.Email getEmail();

    @KeepForSdk
    int getFormat();

    @Nullable
    @KeepForSdk
    Barcode.GeoPoint getGeoPoint();

    @Nullable
    @KeepForSdk
    Barcode.Phone getPhone();

    @Nullable
    @KeepForSdk
    byte[] getRawBytes();

    @Nullable
    @KeepForSdk
    String getRawValue();

    @Nullable
    @KeepForSdk
    Barcode.Sms getSms();

    @Nullable
    @KeepForSdk
    Barcode.UrlBookmark getUrl();

    @KeepForSdk
    int getValueType();

    @Nullable
    @KeepForSdk
    Barcode.WiFi getWifi();
}
