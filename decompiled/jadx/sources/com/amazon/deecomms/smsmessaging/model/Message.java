package com.amazon.deecomms.smsmessaging.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Message {
    public String id;
    public Long lastStatusChangedTime;
    public MessagePayload payload;
    public CommunicableEntity sender;
    public MessageStatus status;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MessageStatus {
        unread,
        read
    }
}
