package com.amazon.alexa.mobile.assistant.client.ui.nowplaying;

import com.amazon.alexa.assistant.media.model.MediaPlaybackState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toBroadcastInt", "", "Lcom/amazon/alexa/assistant/media/model/MediaPlaybackState;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NowPlayingStateBroadcasterKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPlaybackState.values().length];
            try {
                iArr[MediaPlaybackState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPlaybackState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPlaybackState.BUFFERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaPlaybackState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaPlaybackState.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toBroadcastInt(@NotNull MediaPlaybackState mediaPlaybackState) {
        mediaPlaybackState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[mediaPlaybackState.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    return 0;
                }
                PathKt$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
        }
        return i2;
    }
}
