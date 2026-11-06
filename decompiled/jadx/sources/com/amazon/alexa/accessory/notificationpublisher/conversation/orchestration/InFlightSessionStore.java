package com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.mobilytics.event.operational.OperationalEventType;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSessionStore;", "", "markStarted", "", OperationalEventType.SESSION, "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSession;", MetricsConstants.Method.CACHE_CLEAR, LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "take", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface InFlightSessionStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSessionStore$Companion;", "", "<init>", "()V", "NONE", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSessionStore;", "getNONE", "()Lcom/amazon/alexa/accessory/notificationpublisher/conversation/orchestration/InFlightSessionStore;", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final InFlightSessionStore NONE = new InFlightSessionStore() { // from class: com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore$Companion$NONE$1
            @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
            public void clear(String sessionId) {
                sessionId.getClass();
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
            public void markStarted(InFlightSession session) {
                session.getClass();
            }

            @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.InFlightSessionStore
            public InFlightSession take() {
                return null;
            }
        };

        private Companion() {
        }

        @NotNull
        public final InFlightSessionStore getNONE() {
            return NONE;
        }
    }

    void clear(@NotNull String sessionId);

    void markStarted(@NotNull InFlightSession session);

    @Nullable
    InFlightSession take();
}
