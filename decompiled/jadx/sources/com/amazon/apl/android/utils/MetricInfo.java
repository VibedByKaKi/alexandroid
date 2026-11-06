package com.amazon.apl.android.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricInfo {
    private final String mName;
    private final double mValue;

    public MetricInfo(String str, double d) {
        this.mName = str;
        this.mValue = d;
    }

    public String getName() {
        return this.mName;
    }

    public double getValue() {
        return this.mValue;
    }
}
