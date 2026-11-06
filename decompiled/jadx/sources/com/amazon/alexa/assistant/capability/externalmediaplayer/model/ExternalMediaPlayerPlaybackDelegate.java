package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import com.amazon.alexa.audiopersonalization.constants.EventBusConstants;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.clouddrive.cdasdk.cds.common.PhotoSearchCategory;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\b\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0011\u0010\u0006J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0013\u0010\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0015\u0010\u0006J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0017\u0010\u0006J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u0019\u0010\u0006J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\u001b\u0010\u0006J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001d\u001a\u00020\u001eH¦@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\"\u001a\u00020#H¦@¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b'\u0010\u0006J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b)\u0010\u0006J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b+\u0010\u0006J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b-\u0010\u0006J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b/\u0010\u0006J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b1\u0010\u0006J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b3\u0010\u0006¨\u00064"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerPlaybackDelegate;", "", "resume", "Lkotlin/Result;", "", "resume-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "stop-IoAF18A", "duck", EventBusConstants.VOLUME_KEY, "", "duck-gIAlu-s", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unduck", "unduck-gIAlu-s", "pause", "pause-IoAF18A", "startOver", "startOver-IoAF18A", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "previous-IoAF18A", "next", "next-IoAF18A", "rewind", "rewind-IoAF18A", "fastForward", "fastForward-IoAF18A", "adjustSeekPosition", "deltaPositionMilliseconds", "", "adjustSeekPosition-gIAlu-s", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSeekPosition", "positionMilliseconds", "", "setSeekPosition-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", PhotoSearchCategory.FAVORITE, "favorite-IoAF18A", "unfavorite", "unfavorite-IoAF18A", "enableShuffle", "enableShuffle-IoAF18A", "disableShuffle", "disableShuffle-IoAF18A", "enableRepeat", "enableRepeat-IoAF18A", "enableRepeatOne", "enableRepeatOne-IoAF18A", "disableRepeat", "disableRepeat-IoAF18A", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExternalMediaPlayerPlaybackDelegate {
    @Nullable
    /* renamed from: adjustSeekPosition-gIAlu-s */
    Object mo14927adjustSeekPositiongIAlus(int i, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: disableRepeat-IoAF18A */
    Object mo14928disableRepeatIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: disableShuffle-IoAF18A */
    Object mo14929disableShuffleIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: duck-gIAlu-s */
    Object mo14930duckgIAlus(float f, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: enableRepeat-IoAF18A */
    Object mo14931enableRepeatIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: enableRepeatOne-IoAF18A */
    Object mo14932enableRepeatOneIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: enableShuffle-IoAF18A */
    Object mo14933enableShuffleIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: fastForward-IoAF18A */
    Object mo14934fastForwardIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: favorite-IoAF18A */
    Object mo14935favoriteIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: next-IoAF18A */
    Object mo14938nextIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: pause-IoAF18A */
    Object mo14939pauseIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: previous-IoAF18A */
    Object mo14941previousIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: resume-IoAF18A */
    Object mo14942resumeIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: rewind-IoAF18A */
    Object mo14943rewindIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: setSeekPosition-gIAlu-s */
    Object mo14944setSeekPositiongIAlus(long j, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: startOver-IoAF18A */
    Object mo14945startOverIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: stop-IoAF18A */
    Object mo14946stopIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: unduck-gIAlu-s */
    Object mo14947unduckgIAlus(float f, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: unfavorite-IoAF18A */
    Object mo14948unfavoriteIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);
}
