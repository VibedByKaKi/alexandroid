package com.amazon.alexa.hho.navigation.transit.session.state;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "", "<init>", "()V", "NotStarted", "FindingStartPoint", "OnRoute", "OffRoute", "Arrived", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$Arrived;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$FindingStartPoint;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$NotStarted;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$OffRoute;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$OnRoute;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SessionProgressState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$Arrived;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "<init>", "()V", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Arrived extends SessionProgressState {

        @NotNull
        public static final Arrived INSTANCE = new Arrived();

        private Arrived() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$NotStarted;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "<init>", "()V", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotStarted extends SessionProgressState {

        @NotNull
        public static final NotStarted INSTANCE = new NotStarted();

        private NotStarted() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$OffRoute;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "<init>", "()V", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OffRoute extends SessionProgressState {

        @NotNull
        public static final OffRoute INSTANCE = new OffRoute();

        private OffRoute() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$OnRoute;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "shouldAdvanceCurrentSegmentToNext", "", "distanceToEndOfCurrentSegment", "", "<init>", "(ZD)V", "getShouldAdvanceCurrentSegmentToNext", "()Z", "getDistanceToEndOfCurrentSegment", "()D", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRoute extends SessionProgressState {
        private final double distanceToEndOfCurrentSegment;
        private final boolean shouldAdvanceCurrentSegmentToNext;

        public OnRoute(boolean z, double d) {
            super(null);
            this.shouldAdvanceCurrentSegmentToNext = z;
            this.distanceToEndOfCurrentSegment = d;
        }

        public static /* synthetic */ OnRoute copy$default(OnRoute onRoute, boolean z, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                z = onRoute.shouldAdvanceCurrentSegmentToNext;
            }
            if ((i & 2) != 0) {
                d = onRoute.distanceToEndOfCurrentSegment;
            }
            return onRoute.copy(z, d);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldAdvanceCurrentSegmentToNext() {
            return this.shouldAdvanceCurrentSegmentToNext;
        }

        /* renamed from: component2, reason: from getter */
        public final double getDistanceToEndOfCurrentSegment() {
            return this.distanceToEndOfCurrentSegment;
        }

        @NotNull
        public final OnRoute copy(boolean shouldAdvanceCurrentSegmentToNext, double distanceToEndOfCurrentSegment) {
            return new OnRoute(shouldAdvanceCurrentSegmentToNext, distanceToEndOfCurrentSegment);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnRoute)) {
                return false;
            }
            OnRoute onRoute = (OnRoute) other;
            return this.shouldAdvanceCurrentSegmentToNext == onRoute.shouldAdvanceCurrentSegmentToNext && Double.compare(this.distanceToEndOfCurrentSegment, onRoute.distanceToEndOfCurrentSegment) == 0;
        }

        public final double getDistanceToEndOfCurrentSegment() {
            return this.distanceToEndOfCurrentSegment;
        }

        public final boolean getShouldAdvanceCurrentSegmentToNext() {
            return this.shouldAdvanceCurrentSegmentToNext;
        }

        public int hashCode() {
            return Double.hashCode(this.distanceToEndOfCurrentSegment) + (Boolean.hashCode(this.shouldAdvanceCurrentSegmentToNext) * 31);
        }

        @NotNull
        public String toString() {
            return "OnRoute(shouldAdvanceCurrentSegmentToNext=" + this.shouldAdvanceCurrentSegmentToNext + ", distanceToEndOfCurrentSegment=" + this.distanceToEndOfCurrentSegment + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ SessionProgressState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SessionProgressState() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState$FindingStartPoint;", "Lcom/amazon/alexa/hho/navigation/transit/session/state/SessionProgressState;", "isHeadingWrongDirection", "", "closestRecordedDistanceToStart", "", "<init>", "(ZD)V", "()Z", "getClosestRecordedDistanceToStart", "()D", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FindingStartPoint extends SessionProgressState {
        private final double closestRecordedDistanceToStart;
        private final boolean isHeadingWrongDirection;

        public /* synthetic */ FindingStartPoint(boolean z, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Double.MAX_VALUE : d);
        }

        public static /* synthetic */ FindingStartPoint copy$default(FindingStartPoint findingStartPoint, boolean z, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                z = findingStartPoint.isHeadingWrongDirection;
            }
            if ((i & 2) != 0) {
                d = findingStartPoint.closestRecordedDistanceToStart;
            }
            return findingStartPoint.copy(z, d);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsHeadingWrongDirection() {
            return this.isHeadingWrongDirection;
        }

        /* renamed from: component2, reason: from getter */
        public final double getClosestRecordedDistanceToStart() {
            return this.closestRecordedDistanceToStart;
        }

        @NotNull
        public final FindingStartPoint copy(boolean isHeadingWrongDirection, double closestRecordedDistanceToStart) {
            return new FindingStartPoint(isHeadingWrongDirection, closestRecordedDistanceToStart);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FindingStartPoint)) {
                return false;
            }
            FindingStartPoint findingStartPoint = (FindingStartPoint) other;
            return this.isHeadingWrongDirection == findingStartPoint.isHeadingWrongDirection && Double.compare(this.closestRecordedDistanceToStart, findingStartPoint.closestRecordedDistanceToStart) == 0;
        }

        public final double getClosestRecordedDistanceToStart() {
            return this.closestRecordedDistanceToStart;
        }

        public int hashCode() {
            return Double.hashCode(this.closestRecordedDistanceToStart) + (Boolean.hashCode(this.isHeadingWrongDirection) * 31);
        }

        public final boolean isHeadingWrongDirection() {
            return this.isHeadingWrongDirection;
        }

        @NotNull
        public String toString() {
            return "FindingStartPoint(isHeadingWrongDirection=" + this.isHeadingWrongDirection + ", closestRecordedDistanceToStart=" + this.closestRecordedDistanceToStart + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public FindingStartPoint() {
            this(false, 0.0d, 3, null);
        }

        public FindingStartPoint(boolean z, double d) {
            super(null);
            this.isHeadingWrongDirection = z;
            this.closestRecordedDistanceToStart = d;
        }
    }
}
