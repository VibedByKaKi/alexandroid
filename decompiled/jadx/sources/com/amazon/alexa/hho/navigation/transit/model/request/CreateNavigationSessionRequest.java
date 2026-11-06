package com.amazon.alexa.hho.navigation.transit.model.request;

import com.amazon.alexa.hho.navigation.transit.model.Location;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/request/CreateNavigationSessionRequest;", "", "startLocation", "Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "endLocation", "navigationPreferences", "Lcom/amazon/alexa/hho/navigation/transit/model/request/NavigationPreferences;", "contentFilter", "Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/Location;Lcom/amazon/alexa/hho/navigation/transit/model/Location;Lcom/amazon/alexa/hho/navigation/transit/model/request/NavigationPreferences;Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;)V", "getStartLocation", "()Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "getEndLocation", "getNavigationPreferences", "()Lcom/amazon/alexa/hho/navigation/transit/model/request/NavigationPreferences;", "getContentFilter", "()Lcom/amazon/alexa/hho/navigation/transit/model/request/ContentFilter;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CreateNavigationSessionRequest {

    @NotNull
    private final ContentFilter contentFilter;

    @NotNull
    private final Location endLocation;

    @NotNull
    private final NavigationPreferences navigationPreferences;

    @NotNull
    private final Location startLocation;

    public CreateNavigationSessionRequest(@NotNull Location location, @NotNull Location location2, @NotNull NavigationPreferences navigationPreferences, @NotNull ContentFilter contentFilter) {
        location.getClass();
        location2.getClass();
        navigationPreferences.getClass();
        contentFilter.getClass();
        this.startLocation = location;
        this.endLocation = location2;
        this.navigationPreferences = navigationPreferences;
        this.contentFilter = contentFilter;
    }

    public static /* synthetic */ CreateNavigationSessionRequest copy$default(CreateNavigationSessionRequest createNavigationSessionRequest, Location location, Location location2, NavigationPreferences navigationPreferences, ContentFilter contentFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            location = createNavigationSessionRequest.startLocation;
        }
        if ((i & 2) != 0) {
            location2 = createNavigationSessionRequest.endLocation;
        }
        if ((i & 4) != 0) {
            navigationPreferences = createNavigationSessionRequest.navigationPreferences;
        }
        if ((i & 8) != 0) {
            contentFilter = createNavigationSessionRequest.contentFilter;
        }
        return createNavigationSessionRequest.copy(location, location2, navigationPreferences, contentFilter);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Location getStartLocation() {
        return this.startLocation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Location getEndLocation() {
        return this.endLocation;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NavigationPreferences getNavigationPreferences() {
        return this.navigationPreferences;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @NotNull
    public final CreateNavigationSessionRequest copy(@NotNull Location startLocation, @NotNull Location endLocation, @NotNull NavigationPreferences navigationPreferences, @NotNull ContentFilter contentFilter) {
        startLocation.getClass();
        endLocation.getClass();
        navigationPreferences.getClass();
        contentFilter.getClass();
        return new CreateNavigationSessionRequest(startLocation, endLocation, navigationPreferences, contentFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateNavigationSessionRequest)) {
            return false;
        }
        CreateNavigationSessionRequest createNavigationSessionRequest = (CreateNavigationSessionRequest) other;
        return Intrinsics.areEqual(this.startLocation, createNavigationSessionRequest.startLocation) && Intrinsics.areEqual(this.endLocation, createNavigationSessionRequest.endLocation) && Intrinsics.areEqual(this.navigationPreferences, createNavigationSessionRequest.navigationPreferences) && Intrinsics.areEqual(this.contentFilter, createNavigationSessionRequest.contentFilter);
    }

    @NotNull
    public final ContentFilter getContentFilter() {
        return this.contentFilter;
    }

    @NotNull
    public final Location getEndLocation() {
        return this.endLocation;
    }

    @NotNull
    public final NavigationPreferences getNavigationPreferences() {
        return this.navigationPreferences;
    }

    @NotNull
    public final Location getStartLocation() {
        return this.startLocation;
    }

    public int hashCode() {
        return this.contentFilter.hashCode() + ((this.navigationPreferences.hashCode() + ((this.endLocation.hashCode() + (this.startLocation.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CreateNavigationSessionRequest(startLocation=" + this.startLocation + ", endLocation=" + this.endLocation + ", navigationPreferences=" + this.navigationPreferences + ", contentFilter=" + this.contentFilter + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ CreateNavigationSessionRequest(Location location, Location location2, NavigationPreferences navigationPreferences, ContentFilter contentFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(location, location2, navigationPreferences, (i & 8) != 0 ? new ContentFilter(0, 0, 3, null) : contentFilter);
    }
}
