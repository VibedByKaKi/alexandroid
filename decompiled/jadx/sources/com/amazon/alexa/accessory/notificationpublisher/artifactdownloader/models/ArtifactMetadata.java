package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.AutoValue_ArtifactMetadata;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.C$AutoValue_ArtifactMetadata;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class ArtifactMetadata {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ArtifactMetadata build();

        public abstract Builder setArtifactKey(String str);

        public abstract Builder setArtifactType(String str);

        public abstract Builder setFilters(Map<String, List<String>> map);
    }

    public static Builder builder() {
        return new C$AutoValue_ArtifactMetadata.Builder();
    }

    public static TypeAdapter<ArtifactMetadata> typeAdapter(Gson gson) {
        return new AutoValue_ArtifactMetadata.GsonTypeAdapter(gson);
    }

    public boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public abstract String getArtifactKey();

    public abstract String getArtifactType();

    public abstract Map<String, List<String>> getFilters();

    public int hashCode() {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, List<String>> entry : getFilters().entrySet()) {
            List<String> value = entry.getValue();
            Collections.sort(value);
            treeMap.put(entry.getKey(), value);
        }
        return treeMap.toString().toUpperCase().hashCode() + ((getArtifactType().toUpperCase().hashCode() + (getArtifactKey().toUpperCase().hashCode() * 31)) * 31);
    }
}
