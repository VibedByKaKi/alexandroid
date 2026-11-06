package com.amazon.alexa.hho.navigation.transit.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/Waypoint;", "", "segmentIndex", "", "location", "Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "<init>", "(ILcom/amazon/alexa/hho/navigation/transit/model/Location;)V", "getSegmentIndex", "()I", "getLocation", "()Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Waypoint {

    @NotNull
    private final Location location;
    private final int segmentIndex;

    public Waypoint(int i, @NotNull Location location) {
        location.getClass();
        this.segmentIndex = i;
        this.location = location;
    }

    public static /* synthetic */ Waypoint copy$default(Waypoint waypoint, int i, Location location, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = waypoint.segmentIndex;
        }
        if ((i2 & 2) != 0) {
            location = waypoint.location;
        }
        return waypoint.copy(i, location);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    public final Waypoint copy(int segmentIndex, @NotNull Location location) {
        location.getClass();
        return new Waypoint(segmentIndex, location);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Waypoint)) {
            return false;
        }
        Waypoint waypoint = (Waypoint) other;
        return this.segmentIndex == waypoint.segmentIndex && Intrinsics.areEqual(this.location, waypoint.location);
    }

    @NotNull
    public final Location getLocation() {
        return this.location;
    }

    public final int getSegmentIndex() {
        return this.segmentIndex;
    }

    public int hashCode() {
        return this.location.hashCode() + (Integer.hashCode(this.segmentIndex) * 31);
    }

    @NotNull
    public String toString() {
        return "Waypoint(segmentIndex=" + this.segmentIndex + ", location=" + this.location + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
