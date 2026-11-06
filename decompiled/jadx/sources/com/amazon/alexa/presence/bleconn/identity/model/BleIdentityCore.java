package com.amazon.alexa.presence.bleconn.identity.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class BleIdentityCore {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) BleIdentityCore.class);
    private static final ObjectMapper MAPPER;
    private List<IdentityToken> tokens = new ArrayList();
    private List<Key> encryptionKeys = new ArrayList();
    private List<Key> relationshipVerificationKeys = new ArrayList();

    static {
        ObjectMapper objectMapper = new ObjectMapper();
        MAPPER = objectMapper;
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public BleIdentityCore(List<IdentityToken> list, List<Key> list2, List<Key> list3) {
        this.tokens.addAll(list);
        this.encryptionKeys.addAll(list2);
        this.relationshipVerificationKeys.addAll(list3);
    }

    public static BleIdentityCore deserialize(String str) {
        try {
            return (BleIdentityCore) MAPPER.readValue(str, BleIdentityCore.class);
        } catch (Throwable th) {
            LOG.warn("Unable to deserialize packet", th);
            return null;
        }
    }

    public static String serialize(BleIdentityCore bleIdentityCore) {
        Objects.requireNonNull(bleIdentityCore);
        try {
            return MAPPER.writeValueAsString(bleIdentityCore);
        } catch (JsonProcessingException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public List<Key> getEncryptionKeys() {
        return this.encryptionKeys;
    }

    public List<Key> getRelationshipVerificationKeys() {
        return this.relationshipVerificationKeys;
    }

    public List<IdentityToken> getTokens() {
        return this.tokens;
    }

    public void setEncryptionKeys(List<Key> list) {
        this.encryptionKeys = list;
    }

    public void setRelationshipVerificationKeys(List<Key> list) {
        this.relationshipVerificationKeys = list;
    }

    public void setTokens(List<IdentityToken> list) {
        this.tokens = list;
    }

    public BleIdentityCore() {
    }
}
