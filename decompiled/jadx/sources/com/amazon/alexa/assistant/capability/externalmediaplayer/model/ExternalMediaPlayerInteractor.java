package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import androidx.autofill.HintConstants;
import com.amazon.alexa.assistant.capability.externalmediaplayer.ExternalMediaPlayerControlActionListener;
import com.amazon.alexa.assistant.capability.externalmediaplayer.ExternalMediaPlayerStateListener;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0002\u0010\rJ \u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010)\u001a\u00020$H¦@¢\u0006\u0002\u0010\rJ\u0016\u0010*\u001a\u00020$2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010+\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010,\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u00100\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J \u00101\u001a\u00020$2\b\u0010.\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u00105\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u00106\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u0010:\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001e\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u0010=\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J \u0010>\u001a\u00020$2\b\u0010<\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010/J\u0018\u0010?\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006@"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerInteractor;", "", "getAuthorizationDelegate", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerAuthorizationDelegate;", "playerId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaybackDelegate", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackDelegate;", "getAllExternalMediaPlayers", "", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayer;", "getAuthorizedExternalMediaPlayers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUnauthorizedExternalMediaPlayers", "localPlayerIdSet", "", "getLocalPlayerIdSet", "()Ljava/util/Set;", "focusedPlayer", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerDecorator;", "getFocusedPlayer", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerDecorator;", "externalMediaPlayerControlActionListener", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerControlActionListener;", "getExternalMediaPlayerControlActionListener", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerControlActionListener;", "externalMediaPlayerStateListener", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerStateListener;", "getExternalMediaPlayerStateListener", "()Lcom/amazon/alexa/assistant/capability/externalmediaplayer/ExternalMediaPlayerStateListener;", "getRefreshTokenTimerFlow", "Lkotlinx/coroutines/flow/Flow;", "", "time", "authorize", "", "localPlayerId", "skillToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deauthorize", "deauthorizeAll", "setFocusedPlayer", "getLocalPlayerId", "getPlayerId", "setPlaybackSessionId", "playbackSessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaybackSessionId", "setPastPlaybackSessionId", "getPastPlaybackSessionId", "setPlaybackSourceId", "playbackSourceId", "getPlaybackSourceId", "setSkillToken", "getSkillToken", "setUsername", HintConstants.AUTOFILL_HINT_USERNAME, "getUsername", "setCurrentTrackId", "trackId", "getCurrentTrackId", "setPastTrackId", "getPastTrackId", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExternalMediaPlayerInteractor {
    @Nullable
    Object authorize(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deauthorize(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deauthorizeAll(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    List<ExternalMediaPlayer> getAllExternalMediaPlayers();

    @Nullable
    Object getAuthorizationDelegate(@NotNull String str, @NotNull Continuation<? super ExternalMediaPlayerAuthorizationDelegate> continuation);

    @Nullable
    Object getAuthorizedExternalMediaPlayers(@NotNull Continuation<? super List<? extends ExternalMediaPlayer>> continuation);

    @Nullable
    Object getCurrentTrackId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @NotNull
    ExternalMediaPlayerControlActionListener getExternalMediaPlayerControlActionListener();

    @NotNull
    ExternalMediaPlayerStateListener getExternalMediaPlayerStateListener();

    @Nullable
    ExternalMediaPlayerDecorator getFocusedPlayer();

    @Nullable
    Object getLocalPlayerId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @NotNull
    Set<String> getLocalPlayerIdSet();

    @Nullable
    Object getPastPlaybackSessionId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getPastTrackId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getPlaybackDelegate(@NotNull String str, @NotNull Continuation<? super ExternalMediaPlayerPlaybackDelegate> continuation);

    @Nullable
    Object getPlaybackSessionId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getPlaybackSourceId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getPlayerId(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Flow<Long> getRefreshTokenTimerFlow(long time, @NotNull String playerId);

    @Nullable
    Object getSkillToken(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getUnauthorizedExternalMediaPlayers(@NotNull Continuation<? super List<? extends ExternalMediaPlayer>> continuation);

    @Nullable
    Object getUsername(@NotNull String str, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object setCurrentTrackId(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setFocusedPlayer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPastPlaybackSessionId(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPastTrackId(@Nullable String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPlaybackSessionId(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPlaybackSourceId(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setSkillToken(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setUsername(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);
}
