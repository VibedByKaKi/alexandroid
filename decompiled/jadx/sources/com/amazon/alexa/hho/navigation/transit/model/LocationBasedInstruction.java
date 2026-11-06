package com.amazon.alexa.hho.navigation.transit.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/LocationBasedInstruction;", "", "distanceMeters", "", "instruction", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;", "<init>", "(Ljava/lang/Double;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;)V", "getDistanceMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getInstruction", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;", "component1", "component2", "copy", "(Ljava/lang/Double;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;)Lcom/amazon/alexa/hho/navigation/transit/model/LocationBasedInstruction;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LocationBasedInstruction {

    @Nullable
    private final Double distanceMeters;

    @NotNull
    private final NavigationInstruction instruction;

    public LocationBasedInstruction(@Nullable Double d, @NotNull NavigationInstruction navigationInstruction) {
        navigationInstruction.getClass();
        this.distanceMeters = d;
        this.instruction = navigationInstruction;
    }

    public static /* synthetic */ LocationBasedInstruction copy$default(LocationBasedInstruction locationBasedInstruction, Double d, NavigationInstruction navigationInstruction, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationBasedInstruction.distanceMeters;
        }
        if ((i & 2) != 0) {
            navigationInstruction = locationBasedInstruction.instruction;
        }
        return locationBasedInstruction.copy(d, navigationInstruction);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getDistanceMeters() {
        return this.distanceMeters;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavigationInstruction getInstruction() {
        return this.instruction;
    }

    @NotNull
    public final LocationBasedInstruction copy(@Nullable Double distanceMeters, @NotNull NavigationInstruction instruction) {
        instruction.getClass();
        return new LocationBasedInstruction(distanceMeters, instruction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationBasedInstruction)) {
            return false;
        }
        LocationBasedInstruction locationBasedInstruction = (LocationBasedInstruction) other;
        return Intrinsics.areEqual((Object) this.distanceMeters, (Object) locationBasedInstruction.distanceMeters) && Intrinsics.areEqual(this.instruction, locationBasedInstruction.instruction);
    }

    @Nullable
    public final Double getDistanceMeters() {
        return this.distanceMeters;
    }

    @NotNull
    public final NavigationInstruction getInstruction() {
        return this.instruction;
    }

    public int hashCode() {
        Double d = this.distanceMeters;
        return this.instruction.hashCode() + ((d == null ? 0 : d.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "LocationBasedInstruction(distanceMeters=" + this.distanceMeters + ", instruction=" + this.instruction + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ LocationBasedInstruction(Double d, NavigationInstruction navigationInstruction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, navigationInstruction);
    }
}
