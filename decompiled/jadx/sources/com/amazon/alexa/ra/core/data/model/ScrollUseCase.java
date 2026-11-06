package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "", "policy", "Lcom/amazon/alexa/ra/core/data/model/AutoScrollPolicy;", "direction", "Lcom/amazon/alexa/ra/core/data/model/ScrollDirection;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/AutoScrollPolicy;Lcom/amazon/alexa/ra/core/data/model/ScrollDirection;)V", "getPolicy", "()Lcom/amazon/alexa/ra/core/data/model/AutoScrollPolicy;", "getDirection", "()Lcom/amazon/alexa/ra/core/data/model/ScrollDirection;", "NotificationIngress", "LastTopicIngress", "UserQueryAdded", "AgentResponseReceived", "MediaAttached", "NavigateToTurnComplete", "UserPaginationBackward", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$AgentResponseReceived;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$LastTopicIngress;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$MediaAttached;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$NavigateToTurnComplete;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$NotificationIngress;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$UserPaginationBackward;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$UserQueryAdded;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class ScrollUseCase {
    public static final int $stable = 0;

    @NotNull
    private final ScrollDirection direction;

    @NotNull
    private final AutoScrollPolicy policy;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$AgentResponseReceived;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AgentResponseReceived extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final AgentResponseReceived INSTANCE = new AgentResponseReceived();

        /* JADX WARN: Multi-variable type inference failed */
        private AgentResponseReceived() {
            super(AutoScrollPolicy.HONOR_USER, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$LastTopicIngress;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LastTopicIngress extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final LastTopicIngress INSTANCE = new LastTopicIngress();

        /* JADX WARN: Multi-variable type inference failed */
        private LastTopicIngress() {
            super(AutoScrollPolicy.FORCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$MediaAttached;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MediaAttached extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final MediaAttached INSTANCE = new MediaAttached();

        /* JADX WARN: Multi-variable type inference failed */
        private MediaAttached() {
            super(AutoScrollPolicy.HONOR_USER, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$NavigateToTurnComplete;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToTurnComplete extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final NavigateToTurnComplete INSTANCE = new NavigateToTurnComplete();

        /* JADX WARN: Multi-variable type inference failed */
        private NavigateToTurnComplete() {
            super(AutoScrollPolicy.HONOR_USER, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$NotificationIngress;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationIngress extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final NotificationIngress INSTANCE = new NotificationIngress();

        /* JADX WARN: Multi-variable type inference failed */
        private NotificationIngress() {
            super(AutoScrollPolicy.FORCE, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$UserPaginationBackward;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserPaginationBackward extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final UserPaginationBackward INSTANCE = new UserPaginationBackward();

        private UserPaginationBackward() {
            super(AutoScrollPolicy.FORCE, ScrollDirection.BACKWARD, null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase$UserQueryAdded;", "Lcom/amazon/alexa/ra/core/data/model/ScrollUseCase;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserQueryAdded extends ScrollUseCase {
        public static final int $stable = 0;

        @NotNull
        public static final UserQueryAdded INSTANCE = new UserQueryAdded();

        /* JADX WARN: Multi-variable type inference failed */
        private UserQueryAdded() {
            super(AutoScrollPolicy.HONOR_USER, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ScrollUseCase(AutoScrollPolicy autoScrollPolicy, ScrollDirection scrollDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoScrollPolicy, (i & 2) != 0 ? ScrollDirection.FORWARD : scrollDirection, null);
    }

    @NotNull
    public final ScrollDirection getDirection() {
        return this.direction;
    }

    @NotNull
    public final AutoScrollPolicy getPolicy() {
        return this.policy;
    }

    private ScrollUseCase(AutoScrollPolicy autoScrollPolicy, ScrollDirection scrollDirection) {
        this.policy = autoScrollPolicy;
        this.direction = scrollDirection;
    }

    public /* synthetic */ ScrollUseCase(AutoScrollPolicy autoScrollPolicy, ScrollDirection scrollDirection, DefaultConstructorMarker defaultConstructorMarker) {
        this(autoScrollPolicy, scrollDirection);
    }
}
