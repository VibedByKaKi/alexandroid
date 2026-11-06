package com.amazon.deecomms.calling.api;

import com.amazon.comms.calling.sipclient.SipHeaders;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonSubTypes({@JsonSubTypes.Type(name = SipHeaders.SIP_HEADER_CONTACT, value = ContactCallTarget.class), @JsonSubTypes.Type(name = "Device", value = DeviceCallTarget.class), @JsonSubTypes.Type(name = "Group", value = GroupCallTarget.class), @JsonSubTypes.Type(name = "RawAddress", value = RawAddressTarget.class), @JsonSubTypes.Type(name = "Resolvable", value = ResolvableTarget.class)})
@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, property = "type", use = JsonTypeInfo.Id.NAME)
/* loaded from: classes5.dex */
public abstract class CallTarget {
}
