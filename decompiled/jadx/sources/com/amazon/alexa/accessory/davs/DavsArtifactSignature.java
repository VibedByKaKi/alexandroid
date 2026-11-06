package com.amazon.alexa.accessory.davs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.JsonObjectSerializable;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DavsArtifactSignature implements JsonObjectSerializable {
    public static final Factory FACTORY = new Factory();
    static final String JSON_ALGORITHM_KEY = "algorithm";
    static final String JSON_CREATOR_ID_KEY = "creatorId";
    static final String JSON_SIGNATURE_KEY = "signature";
    static final String JSON_VERSION_KEY = "version";
    private final String algorithm;
    private final String creatorId;
    private final String signature;
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String algorithm;
        private String creatorId;
        private String signature;
        private String version;

        public Builder algorithm(String str) {
            this.algorithm = str;
            return this;
        }

        public DavsArtifactSignature build() {
            return new DavsArtifactSignature(this, 0);
        }

        public Builder creatorId(String str) {
            this.creatorId = str;
            return this;
        }

        public Builder signature(String str) {
            this.signature = str;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory implements JsonObjectSerializable.Factory<DavsArtifactSignature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable.Factory
        public DavsArtifactSignature create(JSONObject jSONObject) throws JSONException {
            return new Builder().algorithm(jSONObject.getString(DavsArtifactSignature.JSON_ALGORITHM_KEY)).creatorId(jSONObject.optString(DavsArtifactSignature.JSON_CREATOR_ID_KEY)).signature(jSONObject.getString("signature")).version(jSONObject.optString("version")).build();
        }
    }

    private DavsArtifactSignature(Builder builder) {
        this.algorithm = builder.algorithm;
        this.creatorId = builder.creatorId;
        this.signature = builder.signature;
        this.version = builder.version;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DavsArtifactSignature.class != obj.getClass()) {
            return false;
        }
        DavsArtifactSignature davsArtifactSignature = (DavsArtifactSignature) obj;
        if (this.algorithm.equals(davsArtifactSignature.algorithm) && this.creatorId.equals(davsArtifactSignature.creatorId) && this.signature.equals(davsArtifactSignature.signature)) {
            return this.version.equals(davsArtifactSignature.version);
        }
        return false;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.algorithm, this.creatorId, this.signature, this.version);
    }

    @Override // com.amazon.alexa.accessory.internal.util.JsonObjectSerializable
    public JSONObject toJsonObject() throws JSONException {
        return new JSONObject().put(JSON_ALGORITHM_KEY, this.algorithm).put(JSON_CREATOR_ID_KEY, this.creatorId).put("signature", this.signature).put("version", this.version);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DavsArtifactSignature={\"algorithm\":");
        sb.append(this.algorithm);
        sb.append(", \"creatorId\":");
        sb.append(this.creatorId);
        sb.append(", \"signature\":");
        sb.append(this.signature);
        sb.append(", \"version\":");
        return a$$ExternalSyntheticOutline0.m(sb, this.version, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ DavsArtifactSignature(Builder builder, int i) {
        this(builder);
    }
}
