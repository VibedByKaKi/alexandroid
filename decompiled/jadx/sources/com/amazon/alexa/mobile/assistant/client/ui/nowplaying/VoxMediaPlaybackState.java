package com.amazon.alexa.mobile.assistant.client.ui.nowplaying;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.presence.service.PresenceBleService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/nowplaying/VoxMediaPlaybackState;", "", "<init>", "()V", PresenceBleService.ServiceState.STOPPED, "", "PLAYING", CareActorsStore.SubscriptionStatus.PAUSED, "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoxMediaPlaybackState {
    public static final int $stable = 0;

    @NotNull
    public static final VoxMediaPlaybackState INSTANCE = new VoxMediaPlaybackState();
    public static final int PAUSED = 2;
    public static final int PLAYING = 1;
    public static final int STOPPED = 0;

    private VoxMediaPlaybackState() {
    }
}
