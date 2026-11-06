package com.amazon.rtvi.mobile.orchestrator;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/SignalMonitor;", "", "onDirectiveDispatched", "", "directiveType", "", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "onAccessoryResponse", "onDisconnect", "Companion", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SignalMonitor {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/SignalMonitor$Companion;", "", "<init>", "()V", "NOOP", "Lcom/amazon/rtvi/mobile/orchestrator/SignalMonitor;", "getNOOP", "()Lcom/amazon/rtvi/mobile/orchestrator/SignalMonitor;", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final SignalMonitor NOOP = new SignalMonitor() { // from class: com.amazon.rtvi.mobile.orchestrator.SignalMonitor$Companion$NOOP$1
            @Override // com.amazon.rtvi.mobile.orchestrator.SignalMonitor
            public void onAccessoryResponse(String sessionId) {
                sessionId.getClass();
            }

            @Override // com.amazon.rtvi.mobile.orchestrator.SignalMonitor
            public void onDirectiveDispatched(String directiveType, String sessionId) {
                directiveType.getClass();
                sessionId.getClass();
            }

            @Override // com.amazon.rtvi.mobile.orchestrator.SignalMonitor
            public void onDisconnect() {
            }
        };

        private Companion() {
        }

        @NotNull
        public final SignalMonitor getNOOP() {
            return NOOP;
        }
    }

    void onAccessoryResponse(@NotNull String sessionId);

    void onDirectiveDispatched(@NotNull String directiveType, @NotNull String sessionId);

    void onDisconnect();
}
