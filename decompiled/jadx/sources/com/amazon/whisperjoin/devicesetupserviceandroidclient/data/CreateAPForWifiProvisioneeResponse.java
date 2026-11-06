package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CreateAPForWifiProvisioneeResponse {
    private String mBlacklistTimeout;
    private boolean mCanProceed;
    private String mDeviceId;
    private List<String> mHostPortList;
    private String mPassphrase;
    private String mSSID;
    private int mTimeoutMs;

    public CreateAPForWifiProvisioneeResponse(boolean z, String str, String str2, String str3, int i, List<String> list, String str4) {
        this.mCanProceed = z;
        this.mSSID = str;
        this.mPassphrase = str2;
        this.mDeviceId = str3;
        this.mTimeoutMs = i;
        this.mHostPortList = list;
        this.mBlacklistTimeout = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CreateAPForWifiProvisioneeResponse createAPForWifiProvisioneeResponse = (CreateAPForWifiProvisioneeResponse) obj;
            if (this.mCanProceed == createAPForWifiProvisioneeResponse.mCanProceed && this.mTimeoutMs == createAPForWifiProvisioneeResponse.mTimeoutMs && Objects.equal(this.mSSID, createAPForWifiProvisioneeResponse.mSSID) && Objects.equal(this.mPassphrase, createAPForWifiProvisioneeResponse.mPassphrase) && Objects.equal(this.mDeviceId, createAPForWifiProvisioneeResponse.mDeviceId) && Objects.equal(this.mHostPortList, createAPForWifiProvisioneeResponse.mHostPortList) && Objects.equal(this.mBlacklistTimeout, createAPForWifiProvisioneeResponse.mBlacklistTimeout)) {
                return true;
            }
        }
        return false;
    }

    public String getBlacklistTimeout() {
        return this.mBlacklistTimeout;
    }

    public boolean getCanProceed() {
        return this.mCanProceed;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public List<String> getHostPortList() {
        return this.mHostPortList;
    }

    public String getPassphrase() {
        return this.mPassphrase;
    }

    public String getSSID() {
        return this.mSSID;
    }

    public int getTimeoutMs() {
        return this.mTimeoutMs;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.mCanProceed), this.mSSID, this.mPassphrase, this.mDeviceId, Integer.valueOf(this.mTimeoutMs), this.mHostPortList, this.mBlacklistTimeout);
    }

    public void setBlacklistTimeout(String str) {
        this.mBlacklistTimeout = str;
    }

    public void setCanProceed(boolean z) {
        this.mCanProceed = z;
    }

    public void setDeviceId(String str) {
        this.mDeviceId = str;
    }

    public void setHostPortList(List<String> list) {
        this.mHostPortList = list;
    }

    public void setPassphrase(String str) {
        this.mPassphrase = str;
    }

    public void setSSID(String str) {
        this.mSSID = str;
    }

    public void setTimeoutMs(int i) {
        this.mTimeoutMs = i;
    }

    public String toString() {
        MoreObjects.ToStringHelper add = MoreObjects.toStringHelper(this).add("canProceed", this.mCanProceed).add("ssid", this.mSSID).add("passphrase", this.mPassphrase).add("deviceId", this.mDeviceId).add("timeoutMs", this.mTimeoutMs);
        List<String> list = this.mHostPortList;
        return add.add("hostPortList", list == null ? null : list.toString()).add("blacklistTimeout", this.mBlacklistTimeout).toString();
    }
}
