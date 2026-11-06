package com.amazon.alexa.client.core.capabilities;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.JsonObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Capability {
    public static Capability create(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable String str2) {
        return new AutoValue_Capability(capabilityType, capabilityInterface, str, jsonObject, jsonObject2, str2);
    }

    public static Capability createV3(CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject) {
        return create(CapabilityType.createAlexaInterface(), capabilityInterface, str, null, jsonObject);
    }

    @Nullable
    public abstract JsonObject getConfigurations();

    @Nullable
    public abstract String getInstance();

    public abstract CapabilityInterface getInterface();

    @Nullable
    public abstract JsonObject getProperties();

    public abstract CapabilityType getType();

    public abstract String getVersion();

    public static Capability createV3(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject) {
        return create(capabilityType, capabilityInterface, str, null, jsonObject);
    }

    public static Capability create(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str) {
        return create(capabilityType, capabilityInterface, str, null, null);
    }

    public static Capability create(CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject) {
        return create(CapabilityType.createAlexaInterface(), capabilityInterface, str, jsonObject, null);
    }

    public static Capability create(CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2) {
        return create(CapabilityType.createAlexaInterface(), capabilityInterface, str, jsonObject, jsonObject2);
    }

    public static Capability create(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject) {
        return create(capabilityType, capabilityInterface, str, jsonObject, null);
    }

    public static Capability create(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2) {
        return create(capabilityType, capabilityInterface, str, jsonObject, jsonObject2, null);
    }

    public static Capability create(CapabilityInterface capabilityInterface, String str) {
        return create(CapabilityType.createAlexaInterface(), capabilityInterface, str);
    }
}
