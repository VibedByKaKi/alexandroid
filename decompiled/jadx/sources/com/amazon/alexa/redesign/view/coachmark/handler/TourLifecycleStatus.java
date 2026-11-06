package com.amazon.alexa.redesign.view.coachmark.handler;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.AAMBMetrics;
import com.amazon.alexa.growth.coachmark.TourCoachMark;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "", "<init>", "()V", "NotEntitled", "NotEnabled", "TourIsEmpty", "Entitled", "RenderIssue", "Ready", "Started", "Next", AAMBMetrics.Button.CANCEL, "Completed", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Cancel;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Completed;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Entitled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Next;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$NotEnabled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$NotEntitled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Ready;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$RenderIssue;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Started;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$TourIsEmpty;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class TourLifecycleStatus {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Cancel;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "tourCoachMark", "Lcom/amazon/alexa/growth/coachmark/TourCoachMark;", "seenCount", "", "<init>", "(Lcom/amazon/alexa/growth/coachmark/TourCoachMark;I)V", "getTourCoachMark", "()Lcom/amazon/alexa/growth/coachmark/TourCoachMark;", "getSeenCount", "()I", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cancel extends TourLifecycleStatus {
        public static final int $stable = 8;
        private final int seenCount;

        @NotNull
        private final TourCoachMark tourCoachMark;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(@NotNull TourCoachMark tourCoachMark, int i) {
            super(null);
            tourCoachMark.getClass();
            this.tourCoachMark = tourCoachMark;
            this.seenCount = i;
        }

        public static /* synthetic */ Cancel copy$default(Cancel cancel, TourCoachMark tourCoachMark, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                tourCoachMark = cancel.tourCoachMark;
            }
            if ((i2 & 2) != 0) {
                i = cancel.seenCount;
            }
            return cancel.copy(tourCoachMark, i);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TourCoachMark getTourCoachMark() {
            return this.tourCoachMark;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSeenCount() {
            return this.seenCount;
        }

        @NotNull
        public final Cancel copy(@NotNull TourCoachMark tourCoachMark, int seenCount) {
            tourCoachMark.getClass();
            return new Cancel(tourCoachMark, seenCount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cancel)) {
                return false;
            }
            Cancel cancel = (Cancel) other;
            return Intrinsics.areEqual(this.tourCoachMark, cancel.tourCoachMark) && this.seenCount == cancel.seenCount;
        }

        public final int getSeenCount() {
            return this.seenCount;
        }

        @NotNull
        public final TourCoachMark getTourCoachMark() {
            return this.tourCoachMark;
        }

        public int hashCode() {
            return Integer.hashCode(this.seenCount) + (this.tourCoachMark.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Cancel(tourCoachMark=" + this.tourCoachMark + ", seenCount=" + this.seenCount + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Completed;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Completed extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Entitled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Entitled extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final Entitled INSTANCE = new Entitled();

        private Entitled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Next;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "tourCoachMark", "Lcom/amazon/alexa/growth/coachmark/TourCoachMark;", "<init>", "(Lcom/amazon/alexa/growth/coachmark/TourCoachMark;)V", "getTourCoachMark", "()Lcom/amazon/alexa/growth/coachmark/TourCoachMark;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Next extends TourLifecycleStatus {
        public static final int $stable = 8;

        @NotNull
        private final TourCoachMark tourCoachMark;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Next(@NotNull TourCoachMark tourCoachMark) {
            super(null);
            tourCoachMark.getClass();
            this.tourCoachMark = tourCoachMark;
        }

        public static /* synthetic */ Next copy$default(Next next, TourCoachMark tourCoachMark, int i, Object obj) {
            if ((i & 1) != 0) {
                tourCoachMark = next.tourCoachMark;
            }
            return next.copy(tourCoachMark);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TourCoachMark getTourCoachMark() {
            return this.tourCoachMark;
        }

        @NotNull
        public final Next copy(@NotNull TourCoachMark tourCoachMark) {
            tourCoachMark.getClass();
            return new Next(tourCoachMark);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Next) && Intrinsics.areEqual(this.tourCoachMark, ((Next) other).tourCoachMark);
        }

        @NotNull
        public final TourCoachMark getTourCoachMark() {
            return this.tourCoachMark;
        }

        public int hashCode() {
            return this.tourCoachMark.hashCode();
        }

        @NotNull
        public String toString() {
            return "Next(tourCoachMark=" + this.tourCoachMark + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$NotEnabled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotEnabled extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final NotEnabled INSTANCE = new NotEnabled();

        private NotEnabled() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$NotEntitled;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotEntitled extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotEntitled(@NotNull String str) {
            super(null);
            str.getClass();
            this.reason = str;
        }

        public static /* synthetic */ NotEntitled copy$default(NotEntitled notEntitled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notEntitled.reason;
            }
            return notEntitled.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final NotEntitled copy(@NotNull String reason) {
            reason.getClass();
            return new NotEntitled(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotEntitled) && Intrinsics.areEqual(this.reason, ((NotEntitled) other).reason);
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("NotEntitled(reason=", this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Ready;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ready extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$RenderIssue;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RenderIssue extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final String LIST_IS_EMPTY_ERROR = "Tour destination list is empty";

        @NotNull
        public static final String SIZE_DOES_NOT_MATCH_ERROR = "Tour destination list size is less than the actual view rendered";

        @NotNull
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RenderIssue(@NotNull String str) {
            super(null);
            str.getClass();
            this.reason = str;
        }

        public static /* synthetic */ RenderIssue copy$default(RenderIssue renderIssue, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = renderIssue.reason;
            }
            return renderIssue.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final RenderIssue copy(@NotNull String reason) {
            reason.getClass();
            return new RenderIssue(reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RenderIssue) && Intrinsics.areEqual(this.reason, ((RenderIssue) other).reason);
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("RenderIssue(reason=", this.reason, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$Started;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Started extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final Started INSTANCE = new Started();

        private Started() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus$TourIsEmpty;", "Lcom/amazon/alexa/redesign/view/coachmark/handler/TourLifecycleStatus;", "<init>", "()V", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TourIsEmpty extends TourLifecycleStatus {
        public static final int $stable = 0;

        @NotNull
        public static final TourIsEmpty INSTANCE = new TourIsEmpty();

        private TourIsEmpty() {
            super(null);
        }
    }

    public /* synthetic */ TourLifecycleStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TourLifecycleStatus() {
    }
}
