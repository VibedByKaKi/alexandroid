package com.amazon.alexa.accessorykit.findmy.reporter;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessorykit.findmy.reporter.Geolocation;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_Geolocation extends Geolocation {

    @Nullable
    private final Altitude altitude;
    private final Coordinate coordinate;

    @Nullable
    private final Heading heading;

    @Nullable
    private final Speed speed;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends Geolocation.Builder {
        private Altitude altitude;
        private Coordinate coordinate;
        private Heading heading;
        private Speed speed;

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation.Builder
        public Geolocation build() {
            Coordinate coordinate = this.coordinate;
            if (coordinate != null) {
                return new AutoValue_Geolocation(coordinate, this.altitude, this.heading, this.speed, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: coordinate");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation.Builder
        public Geolocation.Builder setAltitude(Altitude altitude) {
            this.altitude = altitude;
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation.Builder
        public Geolocation.Builder setCoordinate(Coordinate coordinate) {
            if (coordinate != null) {
                this.coordinate = coordinate;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null coordinate");
            return null;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation.Builder
        public Geolocation.Builder setHeading(Heading heading) {
            this.heading = heading;
            return this;
        }

        @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation.Builder
        public Geolocation.Builder setSpeed(Speed speed) {
            this.speed = speed;
            return this;
        }
    }

    private AutoValue_Geolocation(Coordinate coordinate, @Nullable Altitude altitude, @Nullable Heading heading, @Nullable Speed speed) {
        this.coordinate = coordinate;
        this.altitude = altitude;
        this.heading = heading;
        this.speed = speed;
    }

    public boolean equals(Object obj) {
        Altitude altitude;
        Heading heading;
        Speed speed;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Geolocation) {
            Geolocation geolocation = (Geolocation) obj;
            if (this.coordinate.equals(geolocation.getCoordinate()) && ((altitude = this.altitude) != null ? altitude.equals(geolocation.getAltitude()) : geolocation.getAltitude() == null) && ((heading = this.heading) != null ? heading.equals(geolocation.getHeading()) : geolocation.getHeading() == null) && ((speed = this.speed) != null ? speed.equals(geolocation.getSpeed()) : geolocation.getSpeed() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation
    @Nullable
    @JsonProperty(ResponseFields.ALTITUDE)
    public Altitude getAltitude() {
        return this.altitude;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation
    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation
    @Nullable
    @JsonProperty(ResponseFields.HEADING)
    public Heading getHeading() {
        return this.heading;
    }

    @Override // com.amazon.alexa.accessorykit.findmy.reporter.Geolocation
    @Nullable
    @JsonProperty(TransferTable.COLUMN_SPEED)
    public Speed getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        int hashCode = (this.coordinate.hashCode() ^ 1000003) * 1000003;
        Altitude altitude = this.altitude;
        int hashCode2 = (hashCode ^ (altitude == null ? 0 : altitude.hashCode())) * 1000003;
        Heading heading = this.heading;
        int hashCode3 = (hashCode2 ^ (heading == null ? 0 : heading.hashCode())) * 1000003;
        Speed speed = this.speed;
        return hashCode3 ^ (speed != null ? speed.hashCode() : 0);
    }

    public String toString() {
        return "Geolocation{coordinate=" + this.coordinate + ", altitude=" + this.altitude + ", heading=" + this.heading + ", speed=" + this.speed + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_Geolocation(Coordinate coordinate, Altitude altitude, Heading heading, Speed speed, int i) {
        this(coordinate, altitude, heading, speed);
    }
}
