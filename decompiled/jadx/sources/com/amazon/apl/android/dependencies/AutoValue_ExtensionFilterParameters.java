package com.amazon.apl.android.dependencies;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_ExtensionFilterParameters extends ExtensionFilterParameters {
    private final String URI;
    private final Integer destination;
    private final Map<String, Object> filterParams;
    private final String name;
    private final Integer source;

    public AutoValue_ExtensionFilterParameters(String str, String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable Map<String, Object> map) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null URI");
            throw null;
        }
        this.URI = str;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null name");
            throw null;
        }
        this.name = str2;
        this.source = num;
        this.destination = num2;
        this.filterParams = map;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Map<String, Object> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExtensionFilterParameters) {
            ExtensionFilterParameters extensionFilterParameters = (ExtensionFilterParameters) obj;
            if (this.URI.equals(extensionFilterParameters.getURI()) && this.name.equals(extensionFilterParameters.getName()) && ((num = this.source) != null ? num.equals(extensionFilterParameters.getSource()) : extensionFilterParameters.getSource() == null) && ((num2 = this.destination) != null ? num2.equals(extensionFilterParameters.getDestination()) : extensionFilterParameters.getDestination() == null) && ((map = this.filterParams) != null ? map.equals(extensionFilterParameters.getFilterParams()) : extensionFilterParameters.getFilterParams() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.dependencies.ExtensionFilterParameters
    @Nullable
    public Integer getDestination() {
        return this.destination;
    }

    @Override // com.amazon.apl.android.dependencies.ExtensionFilterParameters
    @Nullable
    public Map<String, Object> getFilterParams() {
        return this.filterParams;
    }

    @Override // com.amazon.apl.android.dependencies.ExtensionFilterParameters
    @NonNull
    public String getName() {
        return this.name;
    }

    @Override // com.amazon.apl.android.dependencies.ExtensionFilterParameters
    @Nullable
    public Integer getSource() {
        return this.source;
    }

    @Override // com.amazon.apl.android.dependencies.ExtensionFilterParameters
    @NonNull
    public String getURI() {
        return this.URI;
    }

    public int hashCode() {
        int hashCode = (((this.URI.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003;
        Integer num = this.source;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.destination;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Map<String, Object> map = this.filterParams;
        return hashCode3 ^ (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtensionFilterParameters{URI=");
        sb.append(this.URI);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", destination=");
        sb.append(this.destination);
        sb.append(", filterParams=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.filterParams, StringSubstitutor.DEFAULT_VAR_END);
    }
}
