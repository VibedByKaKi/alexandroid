package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.MediaStreamsModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/MediaStreamsRepository;", "", "toggleLocalVideo", "", "updateLocalVideo", "", "isEnabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchCamera", "getMediaStreams", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/domain/model/MediaStreamsModel;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface MediaStreamsRepository {
    @NotNull
    Flow<MediaStreamsModel> getMediaStreams();

    void switchCamera();

    boolean toggleLocalVideo();

    @Nullable
    Object updateLocalVideo(boolean z, @NotNull Continuation<? super Unit> continuation);
}
