package com.amazon.alexa.assistant.transport.connection;

import com.amazon.alexa.assistant.toolkit.model.EventRequest;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\u0003H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u000f\u0010\u0010JU\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001e\b\u0002\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/IConnectionManager;", "", "setToken", "", "newToken", "", MissingTokenPull.TRIGGER_CONNECT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "supersede", "sendEvent", "Lkotlin/Result;", "", "eventRequest", "Lcom/amazon/alexa/assistant/toolkit/model/EventRequest;", "sendEvent-gIAlu-s", "(Lcom/amazon/alexa/assistant/toolkit/model/EventRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDownchannelRecovery", "reason", "stillSuspect", "Lkotlin/Function0;", "", "awaitTurnResponse", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "turnIdle", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IConnectionManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void requestDownchannelRecovery(@NotNull IConnectionManager iConnectionManager, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Function0<Boolean> function02) {
            str.getClass();
            function0.getClass();
            function1.getClass();
            function02.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestDownchannelRecovery$default(IConnectionManager iConnectionManager, String str, Function0 function0, Function1 function1, Function0 function02, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: requestDownchannelRecovery");
                return;
            }
            if ((i & 2) != 0) {
                function0 = new ConnectionManager$$ExternalSyntheticLambda1(6);
            }
            if ((i & 4) != 0) {
                function1 = new IConnectionManager$requestDownchannelRecovery$2(null);
            }
            if ((i & 8) != 0) {
                function02 = new ConnectionManager$$ExternalSyntheticLambda1(7);
            }
            iConnectionManager.requestDownchannelRecovery(str, function0, function1, function02);
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

    @Nullable
    Object connect(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object disconnect(@NotNull Continuation<? super Unit> continuation);

    void requestDownchannelRecovery(@NotNull String reason, @NotNull Function0<Boolean> stillSuspect, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> awaitTurnResponse, @NotNull Function0<Boolean> turnIdle);

    @Nullable
    /* renamed from: sendEvent-gIAlu-s */
    Object mo15114sendEventgIAlus(@NotNull EventRequest eventRequest, @NotNull Continuation<? super Result<Integer>> continuation);

    void setToken(@Nullable String newToken);

    void supersede();
}
