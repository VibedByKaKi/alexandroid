package com.amazon.alexa.client.core.capabilities;

import androidx.annotation.Nullable;
import com.google.gson.JsonObject;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_Capability extends Capability {

    @Nullable
    private final JsonObject configurations;

    @Nullable
    private final String instance;
    private final CapabilityInterface interface0;

    @Nullable
    private final JsonObject properties;
    private final CapabilityType type;
    private final String version;

    public AutoValue_Capability(CapabilityType capabilityType, CapabilityInterface capabilityInterface, String str, @Nullable JsonObject jsonObject, @Nullable JsonObject jsonObject2, @Nullable String str2) {
        if (capabilityType == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            throw null;
        }
        this.type = capabilityType;
        if (capabilityInterface == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null interface");
            throw null;
        }
        this.interface0 = capabilityInterface;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null version");
            throw null;
        }
        this.version = str;
        this.configurations = jsonObject;
        this.properties = jsonObject2;
        this.instance = str2;
    }

    public boolean equals(Object obj) {
        JsonObject jsonObject;
        JsonObject jsonObject2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Capability) {
            Capability capability = (Capability) obj;
            if (this.type.equals(capability.getType()) && this.interface0.equals(capability.getInterface()) && this.version.equals(capability.getVersion()) && ((jsonObject = this.configurations) != null ? jsonObject.equals(capability.getConfigurations()) : capability.getConfigurations() == null) && ((jsonObject2 = this.properties) != null ? jsonObject2.equals(capability.getProperties()) : capability.getProperties() == null) && ((str = this.instance) != null ? str.equals(capability.getInstance()) : capability.getInstance() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    @Nullable
    public JsonObject getConfigurations() {
        return this.configurations;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    @Nullable
    public String getInstance() {
        return this.instance;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    public CapabilityInterface getInterface() {
        return this.interface0;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    @Nullable
    public JsonObject getProperties() {
        return this.properties;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    public CapabilityType getType() {
        return this.type;
    }

    @Override // com.amazon.alexa.client.core.capabilities.Capability
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.interface0.hashCode()) * 1000003) ^ this.version.hashCode()) * 1000003;
        JsonObject jsonObject = this.configurations;
        int hashCode2 = (hashCode ^ (jsonObject == null ? 0 : jsonObject.hashCode())) * 1000003;
        JsonObject jsonObject2 = this.properties;
        int hashCode3 = (hashCode2 ^ (jsonObject2 == null ? 0 : jsonObject2.hashCode())) * 1000003;
        String str = this.instance;
        return hashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Capability{type=");
        sb.append(this.type);
        sb.append(", interface=");
        sb.append(this.interface0);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", configurations=");
        sb.append(this.configurations);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", instance=");
        return a$$ExternalSyntheticOutline0.m(sb, this.instance, StringSubstitutor.DEFAULT_VAR_END);
    }
}
