package com.amazon.alexa.hho.navigation.transit.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0003Jg\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00061"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "status", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;", "startLocation", "Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "waypoints", "", "Lcom/amazon/alexa/hho/navigation/transit/model/Waypoint;", "endLocation", "transportMode", "Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;", "navigationRoute", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationRoute;", "systemMessages", "Lcom/amazon/alexa/hho/navigation/transit/model/SystemMessage;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;Lcom/amazon/alexa/hho/navigation/transit/model/Location;Ljava/util/List;Lcom/amazon/alexa/hho/navigation/transit/model/Location;Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationRoute;Ljava/util/List;)V", "getSessionId", "()Ljava/lang/String;", "getStatus", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;", "getStartLocation", "()Lcom/amazon/alexa/hho/navigation/transit/model/Location;", "getWaypoints", "()Ljava/util/List;", "getEndLocation", "getTransportMode", "()Lcom/amazon/alexa/hho/navigation/transit/model/TransportMode;", "getNavigationRoute", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationRoute;", "getSystemMessages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavigationSession {

    @NotNull
    private final Location endLocation;

    @Nullable
    private final NavigationRoute navigationRoute;

    @NotNull
    private final String sessionId;

    @NotNull
    private final Location startLocation;

    @NotNull
    private final NavigationSessionStatus status;

    @NotNull
    private final List<SystemMessage> systemMessages;

    @NotNull
    private final TransportMode transportMode;

    @NotNull
    private final List<Waypoint> waypoints;

    public /* synthetic */ NavigationSession(String str, NavigationSessionStatus navigationSessionStatus, Location location, List list, Location location2, TransportMode transportMode, NavigationRoute navigationRoute, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, navigationSessionStatus, location, (i & 8) != 0 ? CollectionsKt.emptyList() : list, location2, transportMode, (i & 64) != 0 ? null : navigationRoute, (i & 128) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public static /* synthetic */ NavigationSession copy$default(NavigationSession navigationSession, String str, NavigationSessionStatus navigationSessionStatus, Location location, List list, Location location2, TransportMode transportMode, NavigationRoute navigationRoute, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationSession.sessionId;
        }
        if ((i & 2) != 0) {
            navigationSessionStatus = navigationSession.status;
        }
        if ((i & 4) != 0) {
            location = navigationSession.startLocation;
        }
        if ((i & 8) != 0) {
            list = navigationSession.waypoints;
        }
        if ((i & 16) != 0) {
            location2 = navigationSession.endLocation;
        }
        if ((i & 32) != 0) {
            transportMode = navigationSession.transportMode;
        }
        if ((i & 64) != 0) {
            navigationRoute = navigationSession.navigationRoute;
        }
        if ((i & 128) != 0) {
            list2 = navigationSession.systemMessages;
        }
        NavigationRoute navigationRoute2 = navigationRoute;
        List list3 = list2;
        Location location3 = location2;
        TransportMode transportMode2 = transportMode;
        return navigationSession.copy(str, navigationSessionStatus, location, list, location3, transportMode2, navigationRoute2, list3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavigationSessionStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Location getStartLocation() {
        return this.startLocation;
    }

    @NotNull
    public final List<Waypoint> component4() {
        return this.waypoints;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Location getEndLocation() {
        return this.endLocation;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TransportMode getTransportMode() {
        return this.transportMode;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final NavigationRoute getNavigationRoute() {
        return this.navigationRoute;
    }

    @NotNull
    public final List<SystemMessage> component8() {
        return this.systemMessages;
    }

    @NotNull
    public final NavigationSession copy(@NotNull String sessionId, @NotNull NavigationSessionStatus status, @NotNull Location startLocation, @NotNull List<Waypoint> waypoints, @NotNull Location endLocation, @NotNull TransportMode transportMode, @Nullable NavigationRoute navigationRoute, @NotNull List<SystemMessage> systemMessages) {
        sessionId.getClass();
        status.getClass();
        startLocation.getClass();
        waypoints.getClass();
        endLocation.getClass();
        transportMode.getClass();
        systemMessages.getClass();
        return new NavigationSession(sessionId, status, startLocation, waypoints, endLocation, transportMode, navigationRoute, systemMessages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSession)) {
            return false;
        }
        NavigationSession navigationSession = (NavigationSession) other;
        return Intrinsics.areEqual(this.sessionId, navigationSession.sessionId) && this.status == navigationSession.status && Intrinsics.areEqual(this.startLocation, navigationSession.startLocation) && Intrinsics.areEqual(this.waypoints, navigationSession.waypoints) && Intrinsics.areEqual(this.endLocation, navigationSession.endLocation) && this.transportMode == navigationSession.transportMode && Intrinsics.areEqual(this.navigationRoute, navigationSession.navigationRoute) && Intrinsics.areEqual(this.systemMessages, navigationSession.systemMessages);
    }

    @NotNull
    public final Location getEndLocation() {
        return this.endLocation;
    }

    @Nullable
    public final NavigationRoute getNavigationRoute() {
        return this.navigationRoute;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final Location getStartLocation() {
        return this.startLocation;
    }

    @NotNull
    public final NavigationSessionStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final List<SystemMessage> getSystemMessages() {
        return this.systemMessages;
    }

    @NotNull
    public final TransportMode getTransportMode() {
        return this.transportMode;
    }

    @NotNull
    public final List<Waypoint> getWaypoints() {
        return this.waypoints;
    }

    public int hashCode() {
        int hashCode = (this.transportMode.hashCode() + ((this.endLocation.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.waypoints, (this.startLocation.hashCode() + ((this.status.hashCode() + (this.sessionId.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31;
        NavigationRoute navigationRoute = this.navigationRoute;
        return this.systemMessages.hashCode() + ((hashCode + (navigationRoute == null ? 0 : navigationRoute.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "NavigationSession(sessionId=" + this.sessionId + ", status=" + this.status + ", startLocation=" + this.startLocation + ", waypoints=" + this.waypoints + ", endLocation=" + this.endLocation + ", transportMode=" + this.transportMode + ", navigationRoute=" + this.navigationRoute + ", systemMessages=" + this.systemMessages + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public NavigationSession(@NotNull String str, @NotNull NavigationSessionStatus navigationSessionStatus, @NotNull Location location, @NotNull List<Waypoint> list, @NotNull Location location2, @NotNull TransportMode transportMode, @Nullable NavigationRoute navigationRoute, @NotNull List<SystemMessage> list2) {
        str.getClass();
        navigationSessionStatus.getClass();
        location.getClass();
        list.getClass();
        location2.getClass();
        transportMode.getClass();
        list2.getClass();
        this.sessionId = str;
        this.status = navigationSessionStatus;
        this.startLocation = location;
        this.waypoints = list;
        this.endLocation = location2;
        this.transportMode = transportMode;
        this.navigationRoute = navigationRoute;
        this.systemMessages = list2;
    }
}
