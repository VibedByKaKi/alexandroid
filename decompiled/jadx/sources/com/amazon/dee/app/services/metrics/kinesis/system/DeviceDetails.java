package com.amazon.dee.app.services.metrics.kinesis.system;

import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/metrics/kinesis/system/DeviceDetails;", "", "platformVersion", "", "platform", "manufacturer", "model", "locale", "getCountry", "getLanguage", AMPDInformationProvider.DEVICE_CARRIER_KEY, CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeviceDetails {
    @Nullable
    String carrier();

    @NotNull
    String getCountry();

    @NotNull
    String getLanguage();

    @NotNull
    String locale();

    @NotNull
    String manufacturer();

    @NotNull
    String model();

    @NotNull
    String platform();

    @NotNull
    String platformVersion();
}
