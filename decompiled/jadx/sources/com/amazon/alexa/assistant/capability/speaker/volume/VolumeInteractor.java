package com.amazon.alexa.assistant.capability.speaker.volume;

import com.amazon.alexa.audiopersonalization.constants.EventBusConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speaker/volume/VolumeInteractor;", "", "getVolume", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMuted", "", "setVolume", "", EventBusConstants.VOLUME_KEY, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adjustVolume", "adjustment", "setMute", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface VolumeInteractor {
    @Nullable
    Object adjustVolume(int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getVolume(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object isMuted(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object setMute(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setVolume(int i, @NotNull Continuation<? super Unit> continuation);
}
