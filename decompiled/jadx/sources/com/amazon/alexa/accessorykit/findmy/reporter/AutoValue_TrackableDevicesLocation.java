package com.amazon.alexa.accessorykit.findmy.reporter;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_TrackableDevicesLocation extends TrackableDevicesLocation {
    private final Geolocation geolocation;
    private final String timestamp;
    private final List<TrackableDevice> trackableDevices;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends TrackableDevicesLocation.Builder {
        private Geolocation geolocation;
        private String timestamp;
        private List<TrackableDevice> trackableDevices;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation.Builder
        public TrackableDevicesLocation build() {
            List<TrackableDevice> list;
            String str;
            Geolocation geolocation = this.geolocation;
            if (geolocation != null && (list = this.trackableDevices) != null && (str = this.timestamp) != null) {
                return new AutoValue_TrackableDevicesLocation(geolocation, list, str, 0);
            }
            StringBuilder sb = new StringBuilder();
            if (this.geolocation == null) {
                sb.append(" geolocation");
            }
            if (this.trackableDevices == null) {
                sb.append(" trackableDevices");
            }
            if (this.timestamp == null) {
                sb.append(" timestamp");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation.Builder
        public TrackableDevicesLocation.Builder setGeolocation(Geolocation geolocation) {
            if (geolocation != null) {
                this.geolocation = geolocation;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null geolocation");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation.Builder
        public TrackableDevicesLocation.Builder setTimestamp(String str) {
            if (str != null) {
                this.timestamp = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null timestamp");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation.Builder
        public TrackableDevicesLocation.Builder setTrackableDevices(List<TrackableDevice> list) {
            if (list != null) {
                this.trackableDevices = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null trackableDevices");
            return null;
        }
    }

    private AutoValue_TrackableDevicesLocation(Geolocation geolocation, List<TrackableDevice> list, String str) {
        this.geolocation = geolocation;
        this.trackableDevices = list;
        this.timestamp = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TrackableDevicesLocation) {
            TrackableDevicesLocation trackableDevicesLocation = (TrackableDevicesLocation) obj;
            if (this.geolocation.equals(trackableDevicesLocation.getGeolocation()) && this.trackableDevices.equals(trackableDevicesLocation.getTrackableDevices()) && this.timestamp.equals(trackableDevicesLocation.getTimestamp())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation
    @JsonProperty("geolocation")
    public Geolocation getGeolocation() {
        return this.geolocation;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return this.timestamp;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.TrackableDevicesLocation
    @JsonProperty("trackableDevices")
    public List<TrackableDevice> getTrackableDevices() {
        return this.trackableDevices;
    }

    public int hashCode() {
        return this.timestamp.hashCode() ^ ((((this.geolocation.hashCode() ^ 1000003) * 1000003) ^ this.trackableDevices.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TrackableDevicesLocation{geolocation=");
        sb.append(this.geolocation);
        sb.append(", trackableDevices=");
        sb.append(this.trackableDevices);
        sb.append(", timestamp=");
        return a$$ExternalSyntheticOutline0.m(sb, this.timestamp, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_TrackableDevicesLocation(Geolocation geolocation, List list, String str, int i) {
        this(geolocation, list, str);
    }
}
