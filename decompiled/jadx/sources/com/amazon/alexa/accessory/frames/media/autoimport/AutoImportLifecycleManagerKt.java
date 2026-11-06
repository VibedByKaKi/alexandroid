package com.amazon.alexa.accessory.frames.media.autoimport;

import com.amazon.alexa.accessory.frames.media.autoimport.models.ImportState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"resolveAutoImportReplayStatus", "Lcom/amazon/alexa/accessory/frames/media/autoimport/AutoImportReplayStatus;", "state", "Lcom/amazon/alexa/accessory/frames/media/autoimport/models/ImportState;", "importedAssetCount", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoImportLifecycleManagerKt {
    @NotNull
    public static final AutoImportReplayStatus resolveAutoImportReplayStatus(@NotNull ImportState importState, int i) {
        importState.getClass();
        boolean z = importState instanceof ImportState.InProgress;
        return (!z || i <= 0) ? (z || (importState instanceof ImportState.Preparing)) ? AutoImportReplayStatus.PREPARING : importState instanceof ImportState.Completed ? AutoImportReplayStatus.COMPLETED : AutoImportReplayStatus.ENABLED_IDLE : AutoImportReplayStatus.IN_PROGRESS;
    }
}
