package com.amazon.alexa.client.alexaservice.base.device;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_Device extends Device {
    private final String brand;
    private final String device;
    private final String manufacturer;
    private final String model;
    private final String product;

    public AutoValue_Device(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null brand");
            throw null;
        }
        this.brand = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null device");
            throw null;
        }
        this.device = str2;
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null manufacturer");
            throw null;
        }
        this.manufacturer = str3;
        if (str4 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null model");
            throw null;
        }
        this.model = str4;
        if (str5 != null) {
            this.product = str5;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null product");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Device) {
            Device device = (Device) obj;
            if (this.brand.equals(device.getBrand()) && this.device.equals(device.getDevice()) && this.manufacturer.equals(device.getManufacturer()) && this.model.equals(device.getModel()) && this.product.equals(device.getProduct())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.Device
    public String getBrand() {
        return this.brand;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.Device
    public String getDevice() {
        return this.device;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.Device
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.Device
    public String getModel() {
        return this.model;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.device.Device
    public String getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.product.hashCode() ^ ((((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.manufacturer.hashCode()) * 1000003) ^ this.model.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device{brand=");
        sb.append(this.brand);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", product=");
        return a$$ExternalSyntheticOutline0.m(sb, this.product, StringSubstitutor.DEFAULT_VAR_END);
    }
}
