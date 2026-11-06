package com.amazon.tarazed.session.sessionEvents;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.presence.service.PresenceBleService;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/tarazed/session/sessionEvents/PlaybackStates;", "", "()V", "CONFIRMING_END", "", "ENDED", "ENDING", "INACTIVE", CareActorsStore.SubscriptionStatus.PAUSED, "PLAYING", "REQUESTING_RESUME", SimbaEventProcessor.SOURCE_STARTED, PresenceBleService.ServiceState.STARTING, "STARTING_BACKGROUND", DebugCoroutineInfoImplKt.SUSPENDED, "SUSPENDING", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class PlaybackStates {

    @NotNull
    public static final String CONFIRMING_END = "confirmingEnd";

    @NotNull
    public static final String ENDED = "ended";

    @NotNull
    public static final String ENDING = "ending";

    @NotNull
    public static final String INACTIVE = "inactive";

    @NotNull
    public static final PlaybackStates INSTANCE = new PlaybackStates();

    @NotNull
    public static final String PAUSED = "paused";

    @NotNull
    public static final String PLAYING = "playing";

    @NotNull
    public static final String REQUESTING_RESUME = "requestingResume";

    @NotNull
    public static final String STARTED = "started";

    @NotNull
    public static final String STARTING = "starting";

    @NotNull
    public static final String STARTING_BACKGROUND = "startingBackground";

    @NotNull
    public static final String SUSPENDED = "suspended";

    @NotNull
    public static final String SUSPENDING = "suspending";

    private PlaybackStates() {
    }
}
