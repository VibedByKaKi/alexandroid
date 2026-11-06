package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState;", "", "Active", "Inactive", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Inactive;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface NavigateToTurnState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState;", "NotificationIngress", "TopicIngress", "FetchLatestFragmentsInitiated", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$FetchLatestFragmentsInitiated;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$NotificationIngress;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$TopicIngress;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Active extends NavigateToTurnState {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$FetchLatestFragmentsInitiated;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FetchLatestFragmentsInitiated implements Active {
            public static final int $stable = 0;

            @NotNull
            public static final FetchLatestFragmentsInitiated INSTANCE = new FetchLatestFragmentsInitiated();

            private FetchLatestFragmentsInitiated() {
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$NotificationIngress;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NotificationIngress implements Active {
            public static final int $stable = 0;

            @NotNull
            public static final NotificationIngress INSTANCE = new NotificationIngress();

            private NotificationIngress() {
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active$TopicIngress;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Active;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TopicIngress implements Active {
            public static final int $stable = 0;

            @NotNull
            public static final TopicIngress INSTANCE = new TopicIngress();

            private TopicIngress() {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState$Inactive;", "Lcom/amazon/alexa/ra/core/data/model/NavigateToTurnState;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Inactive implements NavigateToTurnState {
        public static final int $stable = 0;

        @NotNull
        public static final Inactive INSTANCE = new Inactive();

        private Inactive() {
        }
    }
}
