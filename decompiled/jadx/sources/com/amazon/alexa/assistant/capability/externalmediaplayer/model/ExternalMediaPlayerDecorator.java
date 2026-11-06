package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import androidx.autofill.HintConstants;
import com.amazon.alexa.assistant.capability.audioactivitytracker.model.ChannelActivity;
import com.amazon.alexa.assistant.capability.externalmediaplayer.model.ExternalMediaPlayer;
import com.amazon.alexa.assistant.session.audio.model.AudioControllerConfigurationProvider;
import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u0018\u0010\u0017\u001a\u00020\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\nR\u001a\u0010\"\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerDecorator;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayer;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioControllerConfigurationProvider;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackDelegate;", "Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerAuthorizationDelegate;", "skillToken", "", "getSkillToken", "()Ljava/lang/String;", "setSkillToken", "(Ljava/lang/String;)V", "playbackSessionId", "getPlaybackSessionId", "setPlaybackSessionId", "pastPlaybackSessionId", "getPastPlaybackSessionId", "setPastPlaybackSessionId", "playbackSourceId", "getPlaybackSourceId", "setPlaybackSourceId", HintConstants.AUTOFILL_HINT_USERNAME, "getUsername", "setUsername", "isAuthorized", "", "()Z", "setAuthorized", "(Z)V", "playerId", "getPlayerId", "setPlayerId", "currentTrackId", "getCurrentTrackId", "setCurrentTrackId", "pastTrackId", "getPastTrackId", "setPastTrackId", "channelActivityFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/capability/audioactivitytracker/model/ChannelActivity;", "getChannelActivityFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExternalMediaPlayerDecorator extends ExternalMediaPlayer, AudioControllerConfigurationProvider, ExternalMediaPlayerPlaybackDelegate, ExternalMediaPlayerAuthorizationDelegate {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static SharedFlow<ExternalMediaPlayerError> getPlayerError(@NotNull ExternalMediaPlayerDecorator externalMediaPlayerDecorator) {
            return ExternalMediaPlayer.DefaultImpls.getPlayerError(externalMediaPlayerDecorator);
        }
    }

    @NotNull
    SharedFlow<ChannelActivity> getChannelActivityFlow();

    @Nullable
    String getCurrentTrackId();

    @Nullable
    String getPastPlaybackSessionId();

    @Nullable
    String getPastTrackId();

    @Nullable
    String getPlaybackSessionId();

    @Nullable
    String getPlaybackSourceId();

    @Nullable
    String getPlayerId();

    @Nullable
    String getSkillToken();

    @Nullable
    String getUsername();

    boolean isAuthorized();

    void setAuthorized(boolean z);

    void setCurrentTrackId(@Nullable String str);

    void setPastPlaybackSessionId(@Nullable String str);

    void setPastTrackId(@Nullable String str);

    void setPlaybackSessionId(@Nullable String str);

    void setPlaybackSourceId(@Nullable String str);

    void setPlayerId(@Nullable String str);

    void setSkillToken(@Nullable String str);

    void setUsername(@Nullable String str);
}
