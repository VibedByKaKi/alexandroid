package com.amazon.alexa.assistant.transport;

import com.amazon.alexa.assistant.foundation.audio.BuildType$$ExternalSyntheticLambda0;
import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import com.amazon.alexa.assistant.toolkit.model.EventRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJU\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u001e\b\u0002\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/transport/TransportClient;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "start", "", "stop", "sendEvent", "eventRequest", "Lcom/amazon/alexa/assistant/toolkit/model/EventRequest;", "(Lcom/amazon/alexa/assistant/toolkit/model/EventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDownchannelRecovery", "reason", "", "stillSuspect", "Lkotlin/Function0;", "", "awaitTurnResponse", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "turnIdle", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TransportClient extends LifecycleComponent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void requestDownchannelRecovery(@NotNull TransportClient transportClient, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Function0<Boolean> function02) {
            str.getClass();
            function0.getClass();
            function1.getClass();
            function02.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestDownchannelRecovery$default(TransportClient transportClient, String str, Function0 function0, Function1 function1, Function0 function02, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: requestDownchannelRecovery");
                return;
            }
            if ((i & 2) != 0) {
                function0 = new BuildType$$ExternalSyntheticLambda0(26);
            }
            if ((i & 4) != 0) {
                function1 = new TransportClient$requestDownchannelRecovery$2(null);
            }
            if ((i & 8) != 0) {
                function02 = new BuildType$$ExternalSyntheticLambda0(27);
            }
            transportClient.requestDownchannelRecovery(str, function0, function1, function02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean requestDownchannelRecovery$lambda$0() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean requestDownchannelRecovery$lambda$1() {
            return true;
        }
    }

    void requestDownchannelRecovery(@NotNull String reason, @NotNull Function0<Boolean> stillSuspect, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> awaitTurnResponse, @NotNull Function0<Boolean> turnIdle);

    @Nullable
    Object sendEvent(@NotNull EventRequest eventRequest, @NotNull Continuation<? super Unit> continuation);

    @Override // com.amazon.alexa.assistant.toolkit.lifecycle.Startable
    void start();

    void stop();
}
