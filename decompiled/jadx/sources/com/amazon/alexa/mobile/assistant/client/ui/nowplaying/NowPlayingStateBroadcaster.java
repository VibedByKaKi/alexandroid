package com.amazon.alexa.mobile.assistant.client.ui.nowplaying;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.assistant.media.model.MediaPlaybackState;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/nowplaying/NowPlayingStateBroadcaster;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "broadcast", "", "state", "Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NowPlayingStateBroadcaster {

    @NotNull
    private static final String TAG = "NowPlayingStateBroadcaster";

    @NotNull
    private final LocalBroadcastManager localBroadcastManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public NowPlayingStateBroadcaster(@NotNull Context context) {
        context.getClass();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        localBroadcastManager.getClass();
        this.localBroadcastManager = localBroadcastManager;
    }

    public final void broadcast(@NotNull MediaPlaybackState state) {
        state.getClass();
        int broadcastInt = NowPlayingStateBroadcasterKt.toBroadcastInt(state);
        Objects.toString(state);
        Intent intent = new Intent("com.amazon.alexa.ra.NP_PLAYBACK_STATE");
        intent.putExtra("mediaPlaybackState", broadcastInt);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/ui/nowplaying/NowPlayingStateBroadcaster$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
