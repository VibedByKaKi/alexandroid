package com.amazon.rtcsc.capabilityagent.common.dependencies;

import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceHelix;
import com.amazon.rtcsc.capabilityagent.avs.RtcscContextProvider;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ApplicationModule.class})
@Singleton
/* loaded from: classes5.dex */
public interface RtcscComponent {
    RtcscContextProvider getRtcscContextProvider();

    void inject(RtcscCapabilityAgentServiceAVS rtcscCapabilityAgentServiceAVS);

    void inject(RtcscCapabilityAgentServiceHelix rtcscCapabilityAgentServiceHelix);

    void inject(RtcscContextProvider rtcscContextProvider);
}
