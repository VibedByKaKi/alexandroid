package com.amazon.alexa.handsfree.settings;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeUserIdentity;
import com.amazon.alexa.handsfree.protocols.metrics.utils.AnonymousDeviceIdProvider;
import com.amazon.alexa.handsfree.settings.contract.SettingsContract;
import com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract;
import com.amazon.alexa.handsfree.settings.event.EventSubscriber;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum SettingsModule {
    INSTANCE;

    private static final String TAG = "SettingsModule";
    private AMPDInformationProvider mAMPDInformationProvider;
    private AnonymousDeviceIdProvider mAnonymousDeviceIdProvider;
    private Context mContext;
    private DeviceTypeInformationProvider mDeviceTypeInformationProvider;
    private HandsFreeUserIdentity mHandsFreeUserIdentity;
    private boolean mIsInitialized;
    private boolean mIsUserSignedIn;
    private SettingsContract mSettingsContract;
    private SettingsSetupFlowContract mSettingsSetupFlowContract;

    public AnonymousDeviceIdProvider getAnonymousDeviceIdProvider() {
        return this.mAnonymousDeviceIdProvider;
    }

    public SettingsContract getContract() {
        return this.mSettingsContract;
    }

    public DeviceTypeInformationProvider getDeviceTypeInformationProvider() {
        return this.mDeviceTypeInformationProvider;
    }

    public SettingsSetupFlowContract getSetupFlowContract() {
        return this.mSettingsSetupFlowContract;
    }

    @VisibleForTesting
    public void initialize(@NonNull Context context, @NonNull SettingsSetupFlowContract settingsSetupFlowContract, @NonNull SettingsContract settingsContract, @NonNull AnonymousDeviceIdProvider anonymousDeviceIdProvider, @NonNull DeviceTypeInformationProvider deviceTypeInformationProvider, @NonNull AMPDInformationProvider aMPDInformationProvider, @NonNull EventSubscriber eventSubscriber) {
        if (!this.mIsInitialized) {
            Objects.requireNonNull(settingsSetupFlowContract, "SettingsSetupFlowContract expected");
            this.mSettingsSetupFlowContract = settingsSetupFlowContract;
            Objects.requireNonNull(settingsContract, "SettingsContract expected");
            this.mSettingsContract = settingsContract;
            this.mAnonymousDeviceIdProvider = anonymousDeviceIdProvider;
            this.mDeviceTypeInformationProvider = deviceTypeInformationProvider;
            this.mAMPDInformationProvider = aMPDInformationProvider;
            eventSubscriber.subscribe();
            this.mContext = context;
        }
        this.mIsInitialized = true;
    }

    public boolean isComponentsEnabled() {
        if (this.mDeviceTypeInformationProvider == null) {
            this.mDeviceTypeInformationProvider = DeviceTypeInformationProvider.getInstance(this.mContext);
        }
        if (this.mAMPDInformationProvider == null) {
            this.mAMPDInformationProvider = AMPDInformationProvider.getInstance(this.mContext);
        }
        if (!this.mAMPDInformationProvider.isHandsFreeCapable()) {
            return false;
        }
        DeviceInformation supportedDeviceInformation = this.mDeviceTypeInformationProvider.getSupportedDeviceInformation(this.mContext);
        return (supportedDeviceInformation == null || !supportedDeviceInformation.isDeviceLaunched()) ? this.mIsUserSignedIn && this.mHandsFreeUserIdentity != null : this.mHandsFreeUserIdentity != null;
    }

    public synchronized boolean isInitialized() {
        return this.mIsInitialized;
    }

    public void setComponentsEnabled(boolean z, @NonNull HandsFreeUserIdentity handsFreeUserIdentity) {
        this.mIsUserSignedIn = z;
        this.mHandsFreeUserIdentity = handsFreeUserIdentity;
    }

    public synchronized void initialize(@NonNull Context context, @NonNull SettingsSetupFlowContract settingsSetupFlowContract, @NonNull SettingsContract settingsContract, @NonNull AnonymousDeviceIdProvider anonymousDeviceIdProvider) {
        try {
            try {
                initialize(context, settingsSetupFlowContract, settingsContract, anonymousDeviceIdProvider, DeviceTypeInformationProvider.getInstance(context), AMPDInformationProvider.getInstance(context), new EventSubscriber(context));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
