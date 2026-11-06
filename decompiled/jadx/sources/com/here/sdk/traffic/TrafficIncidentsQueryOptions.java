package com.here.sdk.traffic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imageutils.JfifUtil;
import com.here.sdk.core.LanguageCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TrafficIncidentsQueryOptions {

    @NonNull
    public List<TrafficIncidentType> typeFilter = new ArrayList();

    @NonNull
    public List<TrafficIncidentImpact> impactFilter = new ArrayList();

    @Nullable
    public Date earliestStartTime = null;

    @Nullable
    public Date latestEndTime = null;

    @Nullable
    public LanguageCode languageCode = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrafficIncidentsQueryOptions)) {
            return false;
        }
        TrafficIncidentsQueryOptions trafficIncidentsQueryOptions = (TrafficIncidentsQueryOptions) obj;
        return Objects.equals(this.typeFilter, trafficIncidentsQueryOptions.typeFilter) && Objects.equals(this.impactFilter, trafficIncidentsQueryOptions.impactFilter) && Objects.equals(this.earliestStartTime, trafficIncidentsQueryOptions.earliestStartTime) && Objects.equals(this.latestEndTime, trafficIncidentsQueryOptions.latestEndTime) && Objects.equals(this.languageCode, trafficIncidentsQueryOptions.languageCode);
    }

    public int hashCode() {
        List<TrafficIncidentType> list = this.typeFilter;
        int hashCode = (JfifUtil.MARKER_EOI + (list != null ? list.hashCode() : 0)) * 31;
        List<TrafficIncidentImpact> list2 = this.impactFilter;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Date date = this.earliestStartTime;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.latestEndTime;
        int hashCode4 = (hashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31;
        LanguageCode languageCode = this.languageCode;
        return hashCode4 + (languageCode != null ? languageCode.hashCode() : 0);
    }
}
