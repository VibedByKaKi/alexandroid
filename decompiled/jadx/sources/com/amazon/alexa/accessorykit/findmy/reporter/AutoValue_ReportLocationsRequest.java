package com.amazon.alexa.accessorykit.findmy.reporter;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_ReportLocationsRequest extends ReportLocationsRequest {
    private final List<TrackableDevicesLocation> locations;

    public AutoValue_ReportLocationsRequest(List<TrackableDevicesLocation> list) {
        if (list != null) {
            this.locations = list;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null locations");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReportLocationsRequest) {
            return this.locations.equals(((ReportLocationsRequest) obj).getLocations());
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.ReportLocationsRequest
    @JsonProperty("locations")
    public List<TrackableDevicesLocation> getLocations() {
        return this.locations;
    }

    public int hashCode() {
        return this.locations.hashCode() ^ 1000003;
    }

    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.locations, new StringBuilder("ReportLocationsRequest{locations="));
    }
}
