package com.amazon.whisperjoin.common.sharedtypes.devices;

import java.util.Date;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredRadio {
    private Date mFreshness;
    private final String mRadio;
    private final Object mRadioHandle;
    private int mSignalStrength;

    public DiscoveredRadio(String str, int i, Object obj) {
        if (obj == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("radio handle can not be null");
            throw null;
        }
        this.mRadio = str;
        this.mRadioHandle = obj;
        this.mFreshness = new Date();
        this.mSignalStrength = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DiscoveredRadio)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.mRadio.equals(((DiscoveredRadio) obj).mRadio);
    }

    public Date getFreshness() {
        return (Date) this.mFreshness.clone();
    }

    public String getRadio() {
        return this.mRadio;
    }

    public <HandleType> HandleType getRadioHandle() {
        try {
            return (HandleType) this.mRadioHandle;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public int getSignalStrength() {
        return this.mSignalStrength;
    }

    public int hashCode() {
        return this.mRadio.hashCode();
    }

    public void updateFreshness(Date date) {
        this.mFreshness = (Date) date.clone();
    }

    public void updateSignalStrength(int i) {
        this.mSignalStrength = i;
    }
}
