package com.amazon.alexa.client.alexaservice.base.device;

import android.os.Build;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Device {
    public static Device create() {
        return create(Build.BRAND, Build.DEVICE, Build.MANUFACTURER, Build.MODEL, Build.PRODUCT);
    }

    public abstract String getBrand();

    public abstract String getDevice();

    public abstract String getManufacturer();

    public abstract String getModel();

    public abstract String getProduct();

    public static Device create(String str, String str2, String str3, String str4, String str5) {
        return new AutoValue_Device(str, str2, str3, str4, str5);
    }
}
