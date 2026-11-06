package com.amazon.alexa.preload.attribution.utils;

import android.os.Build;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DeviceUtils {
    private boolean isCurrentDeviceEmma() {
        return Build.BRAND.equals("lge") && Build.DEVICE.equals("judyp") && Build.MANUFACTURER.equals("LGE") && Build.MODEL.equals("LM-V350") && Build.PRODUCT.equals("judyp_lao_com");
    }

    private boolean isCurrentDeviceIbis() {
        return Build.BRAND.equals("motorola") && Build.DEVICE.equals("payton") && Build.MANUFACTURER.equals("motorola") && Build.MODEL.equals("moto x4");
    }

    public String getBrand() {
        return Build.BRAND;
    }

    public String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getProduct() {
        return Build.PRODUCT;
    }

    public boolean isCurrentDeviceAmokEnabled() {
        return isCurrentDeviceEmma() || isCurrentDeviceIbis();
    }
}
