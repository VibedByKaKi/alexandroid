package com.amazon.alexa.redesign.view.container;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics;", "", "<init>", "()V", "DimensionValue", "Surface", "Greeting", "Carousel", "Dismiss", "Route", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class CardStudioAgentSpaceMetrics {
    public static final int $stable = 0;

    @NotNull
    public static final CardStudioAgentSpaceMetrics INSTANCE = new CardStudioAgentSpaceMetrics();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Carousel;", "", "<init>", "()V", "RENDERED", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Carousel {
        public static final int $stable = 0;

        @NotNull
        public static final Carousel INSTANCE = new Carousel();

        @NotNull
        public static final String RENDERED = "agentspace.carousel.rendered";

        private Carousel() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$DimensionValue;", "", "<init>", "()V", "HEADER_PROACTIVE", "", "HEADER_FALLBACK", "SCHEME_CONVERSATION", "SCHEME_OTHER", "SOURCE_GREETING_BUCKET", "SOURCE_CLIENT_HARDCODED", "TRIGGER_COLD_START", "TRIGGER_CLICK_RETURN", "TRIGGER_NAV_HOME", "TRIGGER_WARM_START", "TRIGGER_PULL_TO_REFRESH", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DimensionValue {
        public static final int $stable = 0;

        @NotNull
        public static final String HEADER_FALLBACK = "fallback_greeting_only";

        @NotNull
        public static final String HEADER_PROACTIVE = "proactive";

        @NotNull
        public static final DimensionValue INSTANCE = new DimensionValue();

        @NotNull
        public static final String SCHEME_CONVERSATION = "conversation";

        @NotNull
        public static final String SCHEME_OTHER = "other";

        @NotNull
        public static final String SOURCE_CLIENT_HARDCODED = "client_hardcoded";

        @NotNull
        public static final String SOURCE_GREETING_BUCKET = "greeting_bucket";

        @NotNull
        public static final String TRIGGER_CLICK_RETURN = "click_and_return";

        @NotNull
        public static final String TRIGGER_COLD_START = "cold_start";

        @NotNull
        public static final String TRIGGER_NAV_HOME = "navigate_to_home";

        @NotNull
        public static final String TRIGGER_PULL_TO_REFRESH = "pull_to_refresh";

        @NotNull
        public static final String TRIGGER_WARM_START = "warm_start";

        private DimensionValue() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Dismiss;", "", "<init>", "()V", "DISPATCHED", "", "SKIPPED", "PUBLISH_ERROR", "SkipReason", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dismiss {
        public static final int $stable = 0;

        @NotNull
        public static final String DISPATCHED = "agentspace.dismiss.dispatched";

        @NotNull
        public static final Dismiss INSTANCE = new Dismiss();

        @NotNull
        public static final String PUBLISH_ERROR = "agentspace.dismiss.publish_error";

        @NotNull
        public static final String SKIPPED = "agentspace.dismiss.skipped";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Dismiss$SkipReason;", "", "<init>", "()V", "PPC_ID_ABSENT", "", "PPC_ID_EMPTY", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SkipReason {
            public static final int $stable = 0;

            @NotNull
            public static final SkipReason INSTANCE = new SkipReason();

            @NotNull
            public static final String PPC_ID_ABSENT = "ppc_id_absent";

            @NotNull
            public static final String PPC_ID_EMPTY = "ppc_id_empty";

            private SkipReason() {
            }
        }

        private Dismiss() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Greeting;", "", "<init>", "()V", "SELECTED", "", "BUCKET_POPULATED", "BUCKET_ABSENT", "CLIENT_FALLBACK_DAYPART", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Greeting {
        public static final int $stable = 0;

        @NotNull
        public static final String BUCKET_ABSENT = "agentspace.greeting.bucket.absent";

        @NotNull
        public static final String BUCKET_POPULATED = "agentspace.greeting.bucket.populated";

        @NotNull
        public static final String CLIENT_FALLBACK_DAYPART = "agentspace.greeting.client_fallback.daypart_slot";

        @NotNull
        public static final Greeting INSTANCE = new Greeting();

        @NotNull
        public static final String SELECTED = "agentspace.greeting.selected";

        private Greeting() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Route;", "", "<init>", "()V", "MATCH_SUCCESS", "", "MATCH_FAILURE", HHOMetricsConstants.Event.EXCEPTION, "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Route {
        public static final int $stable = 0;

        @NotNull
        public static final String EXCEPTION = "agentspace.route.exception";

        @NotNull
        public static final Route INSTANCE = new Route();

        @NotNull
        public static final String MATCH_FAILURE = "agentspace.route.match.failure";

        @NotNull
        public static final String MATCH_SUCCESS = "agentspace.route.match.success";

        private Route() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/CardStudioAgentSpaceMetrics$Surface;", "", "<init>", "()V", "MOUNT_ATTEMPTED", "", "MOUNT_SUCCESS", "MOUNT_FAILED", "UNMOUNT", "REFRESH_TRIGGERED", "RENDER_SKIPPED", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Surface {
        public static final int $stable = 0;

        @NotNull
        public static final Surface INSTANCE = new Surface();

        @NotNull
        public static final String MOUNT_ATTEMPTED = "agentspace.surface.mount.attempted";

        @NotNull
        public static final String MOUNT_FAILED = "agentspace.surface.mount.failed";

        @NotNull
        public static final String MOUNT_SUCCESS = "agentspace.surface.mount.success";

        @NotNull
        public static final String REFRESH_TRIGGERED = "agentspace.surface.refresh.triggered";

        @NotNull
        public static final String RENDER_SKIPPED = "agentspace.surface.render.skipped";

        @NotNull
        public static final String UNMOUNT = "agentspace.surface.unmount";

        private Surface() {
        }
    }

    private CardStudioAgentSpaceMetrics() {
    }
}
