package com.amazon.whisperjoin.provisionerSDK.configuration;

import android.bluetooth.le.ScanFilter;
import android.content.Context;
import com.amazon.whisperjoin.common.sharedtypes.configuration.OveractiveConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.configuration.RadioConfiguration;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.DiscoveryEvent;
import com.amazon.whisperjoin.common.sharedtypes.provisioning.events.ProvisioningEvent;
import com.amazon.whisperjoin.provisionerSDK.utility.Observers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class DiscoveryConfiguration {
    private final Context mContext;
    private final Observers<ProvisioningEvent<DiscoveryEvent>> mObservers;
    private final OveractiveConfiguration mOveractiveConfiguration;
    private final Collection<RadioConfiguration> mRadioConfigurations;
    private final List<ScanFilter> mScanFilters;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DiscoveryConfigurationBuilder {
        Observers<ProvisioningEvent<DiscoveryEvent>> mObservers = null;
        Collection<RadioConfiguration> mRadioConfigurations = new ArrayList();
        Context mContext = null;
        List<ScanFilter> mScanFilters = null;
        OveractiveConfiguration mOveractiveConfiguration = null;

        public DiscoveryConfiguration build() {
            if (this.mObservers == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("observers must be set");
                return null;
            }
            if (this.mContext == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("context must be set");
                return null;
            }
            if (this.mScanFilters != null) {
                return new DiscoveryConfiguration(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("mScanFilters can not be null");
            return null;
        }

        public DiscoveryConfigurationBuilder withContext(Context context) {
            if (context != null) {
                this.mContext = context;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("context can not be null");
            return null;
        }

        public DiscoveryConfigurationBuilder withObservers(Observers<ProvisioningEvent<DiscoveryEvent>> observers) {
            if (observers != null) {
                this.mObservers = observers;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("observers can not be null");
            return null;
        }

        public DiscoveryConfigurationBuilder withOveractiveConfiguration(OveractiveConfiguration overactiveConfiguration) {
            this.mOveractiveConfiguration = overactiveConfiguration;
            return this;
        }

        public DiscoveryConfigurationBuilder withScanFilters(List<ScanFilter> list) {
            if (list != null) {
                this.mScanFilters = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("scanFilters can not be null");
            return null;
        }
    }

    public DiscoveryConfiguration(DiscoveryConfigurationBuilder discoveryConfigurationBuilder) {
        this.mObservers = discoveryConfigurationBuilder.mObservers;
        this.mRadioConfigurations = discoveryConfigurationBuilder.mRadioConfigurations;
        this.mContext = discoveryConfigurationBuilder.mContext;
        this.mScanFilters = discoveryConfigurationBuilder.mScanFilters;
        this.mOveractiveConfiguration = discoveryConfigurationBuilder.mOveractiveConfiguration;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Observers<ProvisioningEvent<DiscoveryEvent>> getObservers() {
        return this.mObservers;
    }

    public OveractiveConfiguration getOveractiveConfiguration() {
        return this.mOveractiveConfiguration;
    }

    public List<ScanFilter> getScanFilters() {
        return this.mScanFilters;
    }
}
