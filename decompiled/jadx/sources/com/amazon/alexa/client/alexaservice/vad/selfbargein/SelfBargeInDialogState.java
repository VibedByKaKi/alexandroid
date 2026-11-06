package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class SelfBargeInDialogState {

    @Nullable
    Long bargeInAt;

    @Nullable
    DialogRequestIdentifier bestMatchCaptionDrid;

    @Nullable
    String bestMatchCaptionText;

    @NonNull
    final DialogRequestIdentifier drid;

    @Nullable
    ScheduledFuture<?> timeoutHandle;
    double maxScore = 0.0d;
    int maxTotalMatched = 0;
    int maxContiguousMatched = 0;
    double lastScore = 0.0d;
    int lastTotalMatched = 0;
    int lastContiguousMatched = 0;
    int totalTranscriptWords = 0;

    @NonNull
    String lastTranscriptText = "";
    int livePreviewCount = 0;

    public SelfBargeInDialogState(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        this.drid = dialogRequestIdentifier;
    }
}
