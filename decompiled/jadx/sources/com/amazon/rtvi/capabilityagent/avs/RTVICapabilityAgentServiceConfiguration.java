package com.amazon.rtvi.capabilityagent.avs;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/rtvi/capabilityagent/avs/RTVICapabilityAgentServiceConfiguration;", "", "alexaCapabilityInterfaceName", "", "alexaCapabilityInterfaceVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAlexaCapabilityInterfaceName", "()Ljava/lang/String;", "getAlexaCapabilityInterfaceVersion", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RTVICapabilityAgentServiceConfiguration {

    @NotNull
    private final String alexaCapabilityInterfaceName;

    @NotNull
    private final String alexaCapabilityInterfaceVersion;

    public RTVICapabilityAgentServiceConfiguration(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.alexaCapabilityInterfaceName = str;
        this.alexaCapabilityInterfaceVersion = str2;
    }

    @NotNull
    public final String getAlexaCapabilityInterfaceName() {
        return this.alexaCapabilityInterfaceName;
    }

    @NotNull
    public final String getAlexaCapabilityInterfaceVersion() {
        return this.alexaCapabilityInterfaceVersion;
    }
}
