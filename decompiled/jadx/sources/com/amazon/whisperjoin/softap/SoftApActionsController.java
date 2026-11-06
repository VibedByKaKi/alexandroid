package com.amazon.whisperjoin.softap;

import com.amazon.whisperjoin.softap.callbacks.DeviceConnectionEstablishedCallback;
import com.amazon.whisperjoin.softap.callbacks.DeviceConnectionStateChangedListener;
import com.amazon.whisperjoin.softap.callbacks.OnDeviceDetailsFetchedCallback;
import com.amazon.whisperjoin.softap.callbacks.OnProvisioningDataSavedCallback;
import com.amazon.whisperjoin.softap.callbacks.OnRegistrationTokenSavedCallback;
import com.amazon.whisperjoin.softap.callbacks.OnWifiConfigurationSavedCallback;
import com.amazon.whisperjoin.softap.pojos.ProvisioningData;
import com.amazon.whisperjoin.softap.pojos.RegistrationToken;
import com.amazon.whisperjoin.softap.pojos.WifiConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public interface SoftApActionsController {
    void disconnect();

    void establishNetworkConnection(String str, DeviceConnectionEstablishedCallback deviceConnectionEstablishedCallback, DeviceConnectionStateChangedListener deviceConnectionStateChangedListener);

    void establishNetworkConnection(String str, String str2, DeviceConnectionEstablishedCallback deviceConnectionEstablishedCallback, DeviceConnectionStateChangedListener deviceConnectionStateChangedListener);

    void getDeviceDetails(OnDeviceDetailsFetchedCallback onDeviceDetailsFetchedCallback);

    void provisionDevice(WifiConfiguration wifiConfiguration, OnWifiConfigurationSavedCallback onWifiConfigurationSavedCallback);

    void saveProvisioningData(ProvisioningData provisioningData, OnProvisioningDataSavedCallback onProvisioningDataSavedCallback);

    void saveRegistrationToken(RegistrationToken registrationToken, OnRegistrationTokenSavedCallback onRegistrationTokenSavedCallback);
}
