package com.amazon.apl.android;

import android.content.BroadcastReceiver;
import androidx.lifecycle.LiveDataPublisher;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import com.amazon.alexa.accessory.AccessoryReceiver;
import com.amazon.alexa.accessory.capabilities.accessproof.AccessProofChunkReassembler;
import com.amazon.alexa.accessory.notificationpublisher.conversation.orchestration.ConversationOrchestrator;
import com.amazon.alexa.pmi.implementation.taplatency.TapLatencyCloserHooks;
import com.amazon.rtvi.capture.client.CaptureSourceClient;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import java.util.concurrent.CompletableFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RootContext$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ RootContext$$ExternalSyntheticLambda6(long j, BroadcastReceiver.PendingResult pendingResult) {
        this.$r8$classId = 4;
        this.f$1 = j;
        this.f$0 = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((RootContext) this.f$0).lambda$onLocalTimeOffsetUpdated$1(this.f$1);
                break;
            case 1:
                LiveDataPublisher.LiveDataSubscription.request$lambda$0((LiveDataPublisher.LiveDataSubscription) this.f$0, this.f$1);
                break;
            case 2:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$positionAdvancing$3(this.f$1);
                break;
            case 3:
                ((PreloadMediaSource) this.f$0).lambda$preload$0(this.f$1);
                break;
            case 4:
                AccessoryReceiver.lambda$finishPendingResult$3(this.f$1, (BroadcastReceiver.PendingResult) this.f$0);
                break;
            case 5:
                ((AccessProofChunkReassembler) this.f$0).lambda$armInactivityTimer$0(this.f$1);
                break;
            case 6:
                ConversationOrchestrator.audioPlayingDidDownload$lambda$19((ConversationOrchestrator) this.f$0, this.f$1);
                break;
            case 7:
                TapLatencyCloserHooks.deferFocusLoss$lambda$8((TapLatencyCloserHooks) this.f$0, this.f$1);
                break;
            case 8:
                CaptureSourceClient.lambda$attemptSingleConnectionAsync$5((CompletableFuture) this.f$0, this.f$1);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.f$0).lambda$positionAdvancing$3(this.f$1);
                break;
        }
    }

    public /* synthetic */ RootContext$$ExternalSyntheticLambda6(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
