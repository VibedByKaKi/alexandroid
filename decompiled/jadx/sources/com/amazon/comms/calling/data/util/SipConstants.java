package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/data/util/SipConstants;", "", "<init>", "()V", "SIP_HEADER_ALEXA_VUA", "", "SIP_HEADER_ALEXA_VUA_ENABLED", "SIP_PROXY_REGISTRATION_TIMEOUT_SEC", "SIP_PROXY_REGISTRATION_PORT_NUMBER", "SIP_ENDPOINT_KEY", "SCHEME", "SIP_DOMAIN", "SIP_URI_PREFIX", "SIP_EDGE_PROD_DOMAIN", "SIP_EDGE_GAMMA_DOMAIN", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SipConstants {

    @NotNull
    public static final SipConstants INSTANCE = new SipConstants();

    @NotNull
    public static final String SCHEME = "sips";

    @NotNull
    public static final String SIP_DOMAIN = "amcs-tachyon.com";

    @NotNull
    public static final String SIP_EDGE_GAMMA_DOMAIN = "gamma.sip-edge.amc.amazon.dev";

    @NotNull
    public static final String SIP_EDGE_PROD_DOMAIN = "prod.sip-edge.amc.amazon.dev";

    @NotNull
    public static final String SIP_ENDPOINT_KEY = "SIPProxy.Endpoints.PFM.${PFM}";

    @NotNull
    public static final String SIP_HEADER_ALEXA_VUA = "X-Alexa-Vua";

    @NotNull
    public static final String SIP_HEADER_ALEXA_VUA_ENABLED = "Enabled";

    @NotNull
    public static final String SIP_PROXY_REGISTRATION_PORT_NUMBER = "arcus.SIPProxy_Registration_PortNumber";

    @NotNull
    public static final String SIP_PROXY_REGISTRATION_TIMEOUT_SEC = "SIPProxy.Registration.TimeoutSec";

    @NotNull
    public static final String SIP_URI_PREFIX = "amzn1.comms.";

    private SipConstants() {
    }
}
