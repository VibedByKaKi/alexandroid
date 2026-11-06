package com.mapbox.common;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class CrashEvent implements Serializable {

    @Nullable
    private final String appStartDate;

    @Nullable
    private final HashMap<String, String> customData;
    private final boolean isSilent;

    @Nullable
    private final String threadDetails;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CrashEvent(boolean z, @Nullable String str, @Nullable String str2, @Nullable HashMap<String, String> hashMap) {
        this.isSilent = z;
        this.threadDetails = str;
        this.appStartDate = str2;
        this.customData = hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CrashEvent crashEvent = (CrashEvent) obj;
        return this.isSilent == crashEvent.isSilent && Objects.equals(this.threadDetails, crashEvent.threadDetails) && Objects.equals(this.appStartDate, crashEvent.appStartDate) && Objects.equals(this.customData, crashEvent.customData);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getAppStartDate() {
        return this.appStartDate;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public HashMap<String, String> getCustomData() {
        return this.customData;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean getIsSilent() {
        return this.isSilent;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public String getThreadDetails() {
        return this.threadDetails;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isSilent), this.threadDetails, this.appStartDate, this.customData);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[isSilent: ");
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(this.isSilent)));
        sb.append(", threadDetails: ");
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.threadDetails, ", appStartDate: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m23764m(this.appStartDate, ", customData: ", sb);
        sb.append(RecordUtils.fieldToString(this.customData));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }
}
