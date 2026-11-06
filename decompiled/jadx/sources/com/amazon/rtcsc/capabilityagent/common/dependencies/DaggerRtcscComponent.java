package com.amazon.rtcsc.capabilityagent.common.dependencies;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS_MembersInjector;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceHelix;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceHelix_MembersInjector;
import com.amazon.rtcsc.capabilityagent.avs.RtcscContextProvider;
import com.amazon.rtcsc.capabilityagent.common.core.RtcscCapabilityAgent;
import com.amazon.rtcsc.capabilityagent.common.core.RtcscCapabilityAgentEventListener;
import com.amazon.rtcsc.capabilityagent.common.core.RtcscCapabilityAgentEventListener_Factory;
import com.amazon.rtcsc.capabilityagent.common.core.RtcscCapabilityAgent_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes5.dex */
public final class DaggerRtcscComponent {
    private DaggerRtcscComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private ApplicationModule applicationModule;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder applicationModule(ApplicationModule applicationModule) {
            this.applicationModule = (ApplicationModule) Preconditions.checkNotNull(applicationModule);
            return this;
        }

        public RtcscComponent build() {
            Preconditions.checkBuilderRequirement(this.applicationModule, ApplicationModule.class);
            return new RtcscComponentImpl(this.applicationModule, 0);
        }

        private Builder() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class RtcscComponentImpl implements RtcscComponent {
        private Provider<Context> providesApplicationContextProvider;
        private Provider<AlexaMobileFrameworkApisV2> providesFrameworkApisV2Provider;
        private Provider<RtcscContextProvider> providesRtcscContextProvider;
        private Provider<RtcscCapabilityAgentEventListener> rtcscCapabilityAgentEventListenerProvider;
        private Provider<RtcscCapabilityAgent> rtcscCapabilityAgentProvider;
        private final RtcscComponentImpl rtcscComponentImpl;

        private RtcscComponentImpl(ApplicationModule applicationModule) {
            this.rtcscComponentImpl = this;
            initialize(applicationModule);
        }

        private void initialize(ApplicationModule applicationModule) {
            this.providesRtcscContextProvider = DoubleCheck.provider(ApplicationModule_ProvidesRtcscContextProviderFactory.create(applicationModule));
            Provider<Context> provider = DoubleCheck.provider(ApplicationModule_ProvidesApplicationContextFactory.create(applicationModule));
            this.providesApplicationContextProvider = provider;
            Provider<AlexaMobileFrameworkApisV2> provider2 = DoubleCheck.provider(ApplicationModule_ProvidesFrameworkApisV2Factory.create(applicationModule, provider));
            this.providesFrameworkApisV2Provider = provider2;
            Provider<RtcscCapabilityAgentEventListener> provider3 = DoubleCheck.provider(RtcscCapabilityAgentEventListener_Factory.create(this.providesApplicationContextProvider, provider2, this.providesRtcscContextProvider));
            this.rtcscCapabilityAgentEventListenerProvider = provider3;
            this.rtcscCapabilityAgentProvider = DoubleCheck.provider(RtcscCapabilityAgent_Factory.create(this.providesApplicationContextProvider, provider3));
        }

        private RtcscCapabilityAgentServiceAVS injectRtcscCapabilityAgentServiceAVS(RtcscCapabilityAgentServiceAVS rtcscCapabilityAgentServiceAVS) {
            RtcscCapabilityAgentServiceAVS_MembersInjector.injectMFrameworkApis(rtcscCapabilityAgentServiceAVS, DoubleCheck.lazy(this.providesFrameworkApisV2Provider));
            RtcscCapabilityAgentServiceAVS_MembersInjector.injectMRtcscCapabilityAgent(rtcscCapabilityAgentServiceAVS, this.rtcscCapabilityAgentProvider.get());
            RtcscCapabilityAgentServiceAVS_MembersInjector.injectMRtcscContextProvider(rtcscCapabilityAgentServiceAVS, this.providesRtcscContextProvider.get());
            return rtcscCapabilityAgentServiceAVS;
        }

        private RtcscCapabilityAgentServiceHelix injectRtcscCapabilityAgentServiceHelix(RtcscCapabilityAgentServiceHelix rtcscCapabilityAgentServiceHelix) {
            RtcscCapabilityAgentServiceHelix_MembersInjector.injectMFrameworkApis(rtcscCapabilityAgentServiceHelix, DoubleCheck.lazy(this.providesFrameworkApisV2Provider));
            RtcscCapabilityAgentServiceHelix_MembersInjector.injectMRtcscCapabilityAgent(rtcscCapabilityAgentServiceHelix, this.rtcscCapabilityAgentProvider.get());
            RtcscCapabilityAgentServiceHelix_MembersInjector.injectMRtcscContextProvider(rtcscCapabilityAgentServiceHelix, this.providesRtcscContextProvider.get());
            return rtcscCapabilityAgentServiceHelix;
        }

        @Override // com.amazon.rtcsc.capabilityagent.common.dependencies.RtcscComponent
        public RtcscContextProvider getRtcscContextProvider() {
            return this.providesRtcscContextProvider.get();
        }

        @Override // com.amazon.rtcsc.capabilityagent.common.dependencies.RtcscComponent
        public void inject(RtcscCapabilityAgentServiceAVS rtcscCapabilityAgentServiceAVS) {
            injectRtcscCapabilityAgentServiceAVS(rtcscCapabilityAgentServiceAVS);
        }

        @Override // com.amazon.rtcsc.capabilityagent.common.dependencies.RtcscComponent
        public void inject(RtcscContextProvider rtcscContextProvider) {
        }

        @Override // com.amazon.rtcsc.capabilityagent.common.dependencies.RtcscComponent
        public void inject(RtcscCapabilityAgentServiceHelix rtcscCapabilityAgentServiceHelix) {
            injectRtcscCapabilityAgentServiceHelix(rtcscCapabilityAgentServiceHelix);
        }

        public /* synthetic */ RtcscComponentImpl(ApplicationModule applicationModule, int i) {
            this(applicationModule);
        }
    }
}
