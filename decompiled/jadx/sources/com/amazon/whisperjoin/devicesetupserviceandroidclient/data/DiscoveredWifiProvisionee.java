package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DiscoveredWifiProvisionee implements Serializable {
    private String mEncodedSsid;
    private String mMacAddress;
    private String mRssi;

    public DiscoveredWifiProvisionee(String str, String str2, String str3) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("macAddress cannot be null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("encodedSsid cannot be null");
            throw null;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("rssi cannot be null");
            throw null;
        }
        this.mMacAddress = str;
        this.mEncodedSsid = str2;
        this.mRssi = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DiscoveredWifiProvisionee discoveredWifiProvisionee = (DiscoveredWifiProvisionee) obj;
            if (this.mMacAddress.equals(discoveredWifiProvisionee.getMacAddress()) && this.mEncodedSsid.equals(discoveredWifiProvisionee.getEncodedSsid()) && this.mRssi.equals(discoveredWifiProvisionee.getRssi())) {
                return true;
            }
        }
        return false;
    }

    public String getEncodedSsid() {
        return this.mEncodedSsid;
    }

    public String getMacAddress() {
        return this.mMacAddress;
    }

    public String getRssi() {
        return this.mRssi;
    }

    public int hashCode() {
        return Objects.hashCode(this.mMacAddress, this.mEncodedSsid, this.mRssi);
    }

    public void setEncodedSsid(String str) {
        this.mEncodedSsid = str;
    }

    public void setMacAddress(String str) {
        this.mMacAddress = str;
    }

    public void setRssi(String str) {
        this.mRssi = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("macAddress", this.mMacAddress).add("encodedSsid", this.mEncodedSsid).add("rssi", this.mRssi).toString();
    }
}
