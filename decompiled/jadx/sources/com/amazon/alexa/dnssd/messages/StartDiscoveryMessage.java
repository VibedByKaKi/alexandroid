package com.amazon.alexa.dnssd.messages;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes17.dex */
public class StartDiscoveryMessage {
    public String serviceType;
    public Integer timeout;
}
