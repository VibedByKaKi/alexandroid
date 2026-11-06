package com.amazon.alexa.assistant.foundation.audio;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0015\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0016\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0018\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u0013J.\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001dH¦@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0012H&J\b\u0010!\u001a\u00020\u0012H&J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u000eH&J*\u0010$\u001a\u00020\u00122\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u001dH&J$\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00192\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00120\u001dH&J\b\u0010*\u001a\u00020\u0012H&J\b\u0010+\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006,"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "token", "getToken", "audioItem", "Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "getAudioItem", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioItem;", "taskStatePublisher", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlaybackTaskState;", "getTaskStatePublisher", "()Lkotlinx/coroutines/flow/Flow;", "insert", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "play", "resume", "pause", "cancel", "offsetInMilliseconds", "", VoiceBridgePayloadUtil.PayloadCommand.SEEK, "timeMs", "completion", "Lkotlin/Function1;", "", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeToPlayerEvents", "unsubscribeFromPlayerEvents", "transition", "state", "addBoundaryTimeObserver", "times", "", "observer", "addPeriodicTimeObserver", "intervalMs", "cancelBoundaryTimeObserver", "cancelPeriodicTimeObserver", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AudioPlayableTask {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getToken(@NotNull AudioPlayableTask audioPlayableTask) {
            return audioPlayableTask.getAudioItem().getToken();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object seek$default(AudioPlayableTask audioPlayableTask, long j, Function1 function1, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: seek");
                return null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            return audioPlayableTask.seek(j, function1, continuation);
        }
    }

    void addBoundaryTimeObserver(@NotNull List<Long> times, @NotNull Function1<? super Long, Unit> observer);

    void addPeriodicTimeObserver(long intervalMs, @NotNull Function1<? super Long, Unit> observer);

    @Nullable
    Object cancel(@NotNull Continuation<? super Unit> continuation);

    void cancelBoundaryTimeObserver();

    void cancelPeriodicTimeObserver();

    @NotNull
    AudioItem getAudioItem();

    @NotNull
    String getIdentifier();

    @NotNull
    Flow<AudioPlaybackTaskState> getTaskStatePublisher();

    @NotNull
    String getToken();

    @Nullable
    Object insert(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object offsetInMilliseconds(@NotNull Continuation<? super Long> continuation);

    @Nullable
    Object pause(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object play(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object resume(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object seek(long j, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    void subscribeToPlayerEvents();

    void transition(@NotNull AudioPlaybackTaskState state);

    void unsubscribeFromPlayerEvents();
}
