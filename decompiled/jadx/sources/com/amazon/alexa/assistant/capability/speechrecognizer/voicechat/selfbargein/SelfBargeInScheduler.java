package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein;

import androidx.compose.ui.Actual_androidKt$$ExternalSyntheticLambda0;
import com.amazon.alexa.biloba.storage.DevicesStore$$ExternalSyntheticLambda1;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \n2\u00020\u0001:\u0002\t\nJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler;", "", "schedule", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Cancellable;", "delayMs", "", "action", "Lkotlin/Function0;", "", "Cancellable", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SelfBargeInScheduler {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Cancellable;", "", "cancel", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Cancellable {
        void cancel();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Companion;", "", "<init>", "()V", "backedBy", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler;", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "newDefaultExecutor", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSelfBargeInScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelfBargeInScheduler.kt\ncom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Cancellable backedBy$lambda$2(ScheduledExecutorService scheduledExecutorService, long j, Function0 function0) {
            function0.getClass();
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Actual_androidKt$$ExternalSyntheticLambda0(function0, 2), j, TimeUnit.MILLISECONDS);
            return new Cancellable() { // from class: com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInScheduler$Companion$$ExternalSyntheticLambda2
                @Override // com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInScheduler.Cancellable
                public final void cancel() {
                    schedule.cancel(false);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread newDefaultExecutor$lambda$4(Runnable runnable) {
            Thread thread = new Thread(runnable, "alexa-self-bargein");
            thread.setDaemon(true);
            return thread;
        }

        @NotNull
        public final SelfBargeInScheduler backedBy(@NotNull ScheduledExecutorService executor) {
            executor.getClass();
            return new DevicesStore$$ExternalSyntheticLambda1(executor, 19);
        }

        @NotNull
        public final ScheduledExecutorService newDefaultExecutor() {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(7));
            newSingleThreadScheduledExecutor.getClass();
            return newSingleThreadScheduledExecutor;
        }
    }

    @NotNull
    Cancellable schedule(long delayMs, @NotNull Function0<Unit> action);
}
