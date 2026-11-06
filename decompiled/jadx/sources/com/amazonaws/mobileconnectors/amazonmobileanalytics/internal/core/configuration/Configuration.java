package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface Configuration {
    Boolean getBoolean(String str);

    Double getDouble(String str);

    Integer getInt(String str);

    Long getLong(String str);

    Short getShort(String str);

    String getString(String str);

    Boolean optBoolean(String str, Boolean bool);

    Double optDouble(String str, Double d);

    Integer optInt(String str, Integer num);

    Long optLong(String str, Long l);

    Short optShort(String str, Short sh);

    String optString(String str, String str2);
}
