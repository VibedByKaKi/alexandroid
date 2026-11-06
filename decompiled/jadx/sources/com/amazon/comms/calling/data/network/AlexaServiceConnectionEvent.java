package com.amazon.comms.calling.data.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent;", "", "<init>", "()V", "OnConnected", "OnDisconnected", "OnConnectingFailed", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnConnected;", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnConnectingFailed;", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnDisconnected;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class AlexaServiceConnectionEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnConnected;", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnConnected extends AlexaServiceConnectionEvent {

        @NotNull
        public static final OnConnected INSTANCE = new OnConnected();

        private OnConnected() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnConnectingFailed;", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnConnectingFailed extends AlexaServiceConnectionEvent {

        @NotNull
        public static final OnConnectingFailed INSTANCE = new OnConnectingFailed();

        private OnConnectingFailed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent$OnDisconnected;", "Lcom/amazon/comms/calling/data/network/AlexaServiceConnectionEvent;", "<init>", "()V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDisconnected extends AlexaServiceConnectionEvent {

        @NotNull
        public static final OnDisconnected INSTANCE = new OnDisconnected();

        private OnDisconnected() {
            super(null);
        }
    }

    public /* synthetic */ AlexaServiceConnectionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AlexaServiceConnectionEvent() {
    }
}
