package com.amazon.alexa.presence.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.Date;
import java.util.UUID;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class GuestConnectNotifInfo {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) GuestConnectNotifInfo.class);
    private static final ObjectMapper MAPPER;
    private final SavedData data;

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        MAPPER = objectMapper;
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public GuestConnectNotifInfo() {
        this(new SavedData(0, new Date().getTime(), new Date().getTime(), false));
    }

    public static GuestConnectNotifInfo deserialize(String str) {
        try {
            return new GuestConnectNotifInfo((SavedData) MAPPER.readValue(str, SavedData.class));
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public long getDateLastNotified() {
        return this.data.dateLastNotified;
    }

    public String getID() {
        return this.data.recordId;
    }

    public int getNumSent() {
        return this.data.numSent;
    }

    public long getOpenOrDismissDate() {
        return this.data.openOrDismissDate;
    }

    public boolean hasOpened() {
        return this.data.hasOpened;
    }

    public String serialize() {
        try {
            return MAPPER.writeValueAsString(this.data);
        } catch (JsonProcessingException e) {
            LOG.warn("Failed to serialize data", (Throwable) e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SavedData {
        public long dateLastNotified;
        public boolean hasOpened;
        public int numSent;
        public long openOrDismissDate;
        public String recordId;

        public SavedData(int i, long j, long j2, boolean z) {
            this.numSent = i;
            this.dateLastNotified = j;
            this.recordId = UUID.randomUUID().toString();
            this.hasOpened = z;
            this.openOrDismissDate = j2;
        }

        public SavedData() {
        }
    }

    public GuestConnectNotifInfo(int i, long j, long j2, boolean z) {
        this(new SavedData(i, j, j2, z));
    }

    public GuestConnectNotifInfo(SavedData savedData) {
        this.data = savedData;
    }
}
