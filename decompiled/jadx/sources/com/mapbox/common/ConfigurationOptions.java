package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class ConfigurationOptions implements Serializable {

    @NonNull
    private final Value data;

    @Nullable
    private final String digest;

    @NonNull
    private final ConfigurationOptionsSource source;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationOptions(@NonNull Value value, @Nullable String str, @NonNull ConfigurationOptionsSource configurationOptionsSource) {
        this.data = value;
        this.digest = str;
        this.source = configurationOptionsSource;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationOptions configurationOptions = (ConfigurationOptions) obj;
        return Objects.equals(this.data, configurationOptions.data) && Objects.equals(this.digest, configurationOptions.digest) && Objects.equals(this.source, configurationOptions.source);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Value getData() {
        return this.data;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getDigest() {
        return this.digest;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ConfigurationOptionsSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.digest, this.source);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", digest: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.digest, ", source: ", sb);
        sb.append(RecordUtils.fieldToString(this.source));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
