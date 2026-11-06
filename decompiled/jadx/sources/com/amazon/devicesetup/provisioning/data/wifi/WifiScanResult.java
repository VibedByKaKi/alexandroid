package com.amazon.devicesetup.provisioning.data.wifi;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.devicesetup.utility.InputValidator;
import javax.annotation.Nonnull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class WifiScanResult extends WifiNetwork implements Comparable<WifiScanResult> {
    protected int frequencyBand;
    protected int signalStrength;

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement, int i, int i2) {
        super(str, wifiKeyManagement);
        this.frequencyBand = i;
        this.signalStrength = InputValidator.getValidRssi(i2);
        validate();
    }

    @Override // java.lang.Comparable
    public int compareTo(@Nonnull WifiScanResult wifiScanResult) {
        int i = this.signalStrength;
        int i2 = wifiScanResult.signalStrength;
        int i3 = i < i2 ? 1 : i > i2 ? -1 : 0;
        if (i3 == 0) {
            i3 = this.ssid.compareTo(wifiScanResult.ssid);
        }
        return i3 == 0 ? this.wifiKeyManagement.compareTo(wifiScanResult.wifiKeyManagement) : i3;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public boolean equals(Object obj) {
        if (obj instanceof WifiScanResult) {
            WifiScanResult wifiScanResult = (WifiScanResult) obj;
            if (super.equals(obj) && this.frequencyBand == wifiScanResult.frequencyBand) {
                return true;
            }
        }
        return false;
    }

    public int getFrequencyBand() {
        return this.frequencyBand;
    }

    public int getSignalStrength() {
        return this.signalStrength;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public int hashCode() {
        return ((super.hashCode() + 41) * 41) + this.frequencyBand;
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(", rssi=", this.frequencyBand, this.signalStrength, ErrorUtils$$ExternalSyntheticOutline0.m("WifiScanResult [ssid=", this.ssid, ", key-mgmt=", String.valueOf(this.wifiKeyManagement), ", freq="), MarkdownConstants.RIGHT_BRACKET);
    }

    @Override // com.amazon.devicesetup.provisioning.data.wifi.WifiNetwork
    public void validate() {
        super.validate();
        if (InputValidator.isValidFrequency(this.frequencyBand)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Frequency of Wifi network cannot be negative. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator methods to validate parameters.");
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement) {
        this(str, wifiKeyManagement, null, 0, -100);
    }

    public WifiScanResult(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, int i, int i2) {
        super(str, wifiKeyManagement, wpaPskType);
        this.frequencyBand = i;
        this.signalStrength = InputValidator.getValidRssi(i2);
        validate();
    }
}
