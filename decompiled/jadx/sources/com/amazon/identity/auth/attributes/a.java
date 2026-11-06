package com.amazon.identity.auth.attributes;

import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f408a;
    public final String b;
    public final Long c;
    public final CORPFMResponse$ComputationConfidenceValue d;

    public a(String str, String str2, String str3, Long l) {
        this.f408a = str;
        this.b = str2;
        this.d = CORPFMResponse$ComputationConfidenceValue.parseFromValue(str3, CORPFMResponse$ComputationConfidenceValue.CUSTOMER_PROVIDED);
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f408a, aVar.f408a) && TextUtils.equals(this.b, aVar.b) && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f408a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CORPFMResponse$ComputationConfidenceValue cORPFMResponse$ComputationConfidenceValue = this.d;
        return hashCode2 + (cORPFMResponse$ComputationConfidenceValue != null ? cORPFMResponse$ComputationConfidenceValue.hashCode() : 0);
    }

    public a(String str, String str2, CORPFMResponse$ComputationConfidenceValue cORPFMResponse$ComputationConfidenceValue, Long l) {
        this.f408a = str;
        this.b = str2;
        this.d = cORPFMResponse$ComputationConfidenceValue;
        this.c = l;
    }
}
