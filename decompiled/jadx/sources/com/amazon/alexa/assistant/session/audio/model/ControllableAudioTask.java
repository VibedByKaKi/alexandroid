package com.amazon.alexa.assistant.session.audio.model;

import com.amazon.alexa.assistant.session.audio.model.AudioTaskState;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u00060\nj\u0002`\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/ControllableAudioTask;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelTask;", "foreground", "", AppStateModule.APP_STATE_BACKGROUND, "stop", "reason", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "fail", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "interrupt", "resume", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ControllableAudioTask extends AudioChannelTask {
    void background();

    void fail(@NotNull Exception exception);

    void foreground();

    void interrupt();

    void resume();

    void stop(@NotNull AudioTaskState.StoppedReason reason);
}
