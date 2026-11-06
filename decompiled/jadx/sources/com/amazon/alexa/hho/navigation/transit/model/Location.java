package com.amazon.alexa.hho.navigation.transit.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.assistant.AssistantBuilder$$ExternalSyntheticLambda15;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "", "coordinates", "Lcom/amazon/alexa/hho/navigation/transit/model/Coordinates;", "address", "Lcom/amazon/alexa/hho/navigation/transit/model/Address;", "name", "", "id", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/Coordinates;Lcom/amazon/alexa/hho/navigation/transit/model/Address;Ljava/lang/String;Ljava/lang/String;)V", "getCoordinates", "()Lcom/amazon/alexa/hho/navigation/transit/model/Coordinates;", "getAddress", "()Lcom/amazon/alexa/hho/navigation/transit/model/Address;", "getName", "()Ljava/lang/String;", "getId", "androidLocation", "Landroid/location/Location;", "getAndroidLocation$AlexaMobileAndroidHHO_release", "()Landroid/location/Location;", "androidLocation$delegate", "Lkotlin/Lazy;", "distanceTo", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "", "toString", "Companion", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Location {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Address address;

    /* renamed from: androidLocation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy androidLocation;

    @NotNull
    private final Coordinates coordinates;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    public Location(@NotNull Coordinates coordinates, @Nullable Address address, @Nullable String str, @Nullable String str2) {
        coordinates.getClass();
        this.coordinates = coordinates;
        this.address = address;
        this.name = str;
        this.id = str2;
        this.androidLocation = LazyKt.lazy(new AssistantBuilder$$ExternalSyntheticLambda15(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.location.Location androidLocation_delegate$lambda$1(Location location) {
        android.location.Location location2 = new android.location.Location("");
        location2.setLatitude(location.coordinates.getLatitude());
        location2.setLongitude(location.coordinates.getLongitude());
        return location2;
    }

    public static /* synthetic */ Location copy$default(Location location, Coordinates coordinates, Address address, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            coordinates = location.coordinates;
        }
        if ((i & 2) != 0) {
            address = location.address;
        }
        if ((i & 4) != 0) {
            str = location.name;
        }
        if ((i & 8) != 0) {
            str2 = location.id;
        }
        return location.copy(coordinates, address, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Location copy(@NotNull Coordinates coordinates, @Nullable Address address, @Nullable String name, @Nullable String id) {
        coordinates.getClass();
        return new Location(coordinates, address, name, id);
    }

    public final float distanceTo(@NotNull Location other) {
        other.getClass();
        return getAndroidLocation$AlexaMobileAndroidHHO_release().distanceTo(other.getAndroidLocation$AlexaMobileAndroidHHO_release());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Location)) {
            return false;
        }
        Location location = (Location) other;
        return Intrinsics.areEqual(this.coordinates, location.coordinates) && Intrinsics.areEqual(this.address, location.address) && Intrinsics.areEqual(this.name, location.name) && Intrinsics.areEqual(this.id, location.id);
    }

    @Nullable
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final android.location.Location getAndroidLocation$AlexaMobileAndroidHHO_release() {
        return (android.location.Location) this.androidLocation.getValue();
    }

    @NotNull
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.coordinates.hashCode() * 31;
        Address address = this.address;
        int hashCode2 = (hashCode + (address == null ? 0 : address.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Coordinates coordinates = this.coordinates;
        Address address = this.address;
        String str = this.name;
        String str2 = this.id;
        StringBuilder sb = new StringBuilder("Location(coordinates=");
        sb.append(coordinates);
        sb.append(", address=");
        sb.append(address);
        sb.append(", name=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str, ", id=", str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/Location$Companion;", "", "<init>", "()V", "fromAndroidLocation", "Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "location", "Landroid/location/Location;", "fromCoordinates", "coordinates", "Lcom/amazon/alexa/hho/navigation/transit/model/Coordinates;", "fromLatitudeAndLongitude", "latitude", "", "longitude", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Location fromAndroidLocation(@NotNull android.location.Location location) {
            location.getClass();
            return new Location(new Coordinates(location.getLatitude(), location.getLongitude()), null, null, null, 14, null);
        }

        @NotNull
        public final Location fromCoordinates(@NotNull Coordinates coordinates) {
            coordinates.getClass();
            return new Location(coordinates, null, null, null, 14, null);
        }

        @NotNull
        public final Location fromLatitudeAndLongitude(double latitude, double longitude) {
            return new Location(new Coordinates(latitude, longitude), null, null, null, 14, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Location(Coordinates coordinates, Address address, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coordinates, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
