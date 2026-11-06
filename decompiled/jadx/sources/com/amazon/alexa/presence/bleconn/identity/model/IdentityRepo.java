package com.amazon.alexa.presence.bleconn.identity.model;

import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class IdentityRepo {
    private static final String IDENTITY_DATA_ID = "IdentityDataSet";
    private final Map<String, String> storage;

    public IdentityRepo(Map<String, String> map) {
        this.storage = map;
    }

    public BleIdentityPacket loadWithV2Identity(BleIdentityCore bleIdentityCore) {
        BleIdentityPacket bleIdentityPacket = new BleIdentityPacket(bleIdentityCore);
        this.storage.put(IDENTITY_DATA_ID, bleIdentityPacket.serialize());
        return bleIdentityPacket;
    }

    public void resetIdentityData() {
        this.storage.remove(IDENTITY_DATA_ID);
    }

    public BleIdentityPacket retrieveIdentityData() {
        String str = this.storage.get(IDENTITY_DATA_ID);
        return str == null ? new BleIdentityPacket() : BleIdentityPacket.deserialize(str);
    }

    public String retrieveRawData() {
        BleIdentityPacket retrieveIdentityData = retrieveIdentityData();
        if (retrieveIdentityData == null) {
            return null;
        }
        return retrieveIdentityData.serialize();
    }

    public void store(BleIdentityPacket bleIdentityPacket) {
        this.storage.put(IDENTITY_DATA_ID, bleIdentityPacket.serialize());
    }
}
