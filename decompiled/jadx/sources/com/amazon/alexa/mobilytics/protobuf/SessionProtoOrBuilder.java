package com.amazon.alexa.mobilytics.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface SessionProtoOrBuilder extends MessageOrBuilder {
    long getDuration();

    String getSessionId();

    ByteString getSessionIdBytes();

    long getStartTimestamp();

    long getStopTimestamp();
}
