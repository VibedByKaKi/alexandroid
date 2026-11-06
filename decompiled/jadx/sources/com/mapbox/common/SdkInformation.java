package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class SdkInformation implements Serializable {

    @NonNull
    private final String name;

    @Nullable
    private final String packageName;

    @NonNull
    private final String version;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SdkInformation(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        this.name = str;
        this.version = str2;
        this.packageName = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SdkInformation sdkInformation = (SdkInformation) obj;
        return Objects.equals(this.name, sdkInformation.name) && Objects.equals(this.version, sdkInformation.version) && Objects.equals(this.packageName, sdkInformation.packageName);
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getPackageName() {
        return this.packageName;
    }

    @NonNull
    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.packageName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.name, ", version: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.version, ", packageName: ", sb);
        return RegionDefaults$$ExternalSyntheticOutline0.m(this.packageName, MarkdownConstants.RIGHT_BRACKET, sb);
    }
}
