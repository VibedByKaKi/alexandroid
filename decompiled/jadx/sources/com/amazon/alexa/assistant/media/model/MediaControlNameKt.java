package com.amazon.alexa.assistant.media.model;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"metric", "", "Lcom/amazon/alexa/assistant/media/model/MediaControlName;", "voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaControlNameKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaControlName.values().length];
            try {
                iArr[MediaControlName.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaControlName.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaControlName.NEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaControlName.PREVIOUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaControlName.SKIP_FORWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MediaControlName.SKIP_BACKWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MediaControlName.SHUFFLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MediaControlName.LOOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MediaControlName.REPEAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MediaControlName.THUMBS_UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MediaControlName.THUMBS_DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String metric(@NotNull MediaControlName mediaControlName) {
        mediaControlName.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[mediaControlName.ordinal()]) {
            case 1:
                return "play";
            case 2:
                return "pause";
            case 3:
                return "next";
            case 4:
                return VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS;
            case 5:
                return "skipForward";
            case 6:
                return "skipBackward";
            case 7:
                return "shuffle";
            case 8:
                return "loop";
            case 9:
                return "repeat";
            case 10:
                return "thumbsup";
            case 11:
                return "thumbsdown";
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
        }
    }
}
