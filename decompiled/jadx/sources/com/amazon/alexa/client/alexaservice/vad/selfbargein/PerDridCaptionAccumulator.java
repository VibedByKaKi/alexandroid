package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.core.SpeechToken;
import com.amazon.alexa.client.alexaservice.dialog.voice.speechsynthesizer.payload.CaptionData;
import com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackEndedEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class PerDridCaptionAccumulator {
    private static final String TAG = "PerDridCaptionAccumulator";
    private final Clock clock;
    private final SelfBargeInConfig config;
    private final CaptionRingBuffer ringBuffer;
    private final ScheduledExecutorService scheduler;
    private final Map<SpeechToken, PendingSpeak> pendingSpeaksByToken = new HashMap();
    private final LinkedHashMap<DialogRequestIdentifier, InflightCaptions> inflightByDrid = new LinkedHashMap<>();
    private final Map<DialogRequestIdentifier, ScheduledFuture<?>> idleTimers = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Clock {
        long now();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PendingSpeak {
        final String captionText;
        final DialogRequestIdentifier drid;

        public PendingSpeak(DialogRequestIdentifier dialogRequestIdentifier, String str) {
            this.drid = dialogRequestIdentifier;
            this.captionText = str;
        }
    }

    public PerDridCaptionAccumulator(@NonNull SelfBargeInConfig selfBargeInConfig, @NonNull CaptionRingBuffer captionRingBuffer, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Clock clock) {
        this.config = selfBargeInConfig;
        this.ringBuffer = captionRingBuffer;
        this.scheduler = scheduledExecutorService;
        this.clock = clock;
    }

    private void armIdleTimer(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        cancelIdleTimer(dialogRequestIdentifier);
        this.idleTimers.put(dialogRequestIdentifier, this.scheduler.schedule(new SelfBargeInObserver$$ExternalSyntheticLambda5(this, dialogRequestIdentifier, 1), this.config.getDridIdleSealMs(), TimeUnit.MILLISECONDS));
    }

    private void cancelIdleTimer(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        ScheduledFuture<?> remove = this.idleTimers.remove(dialogRequestIdentifier);
        if (remove != null) {
            remove.cancel(false);
        }
    }

    @VisibleForTesting
    public static boolean isVoiceEnrollmentPrompt(@NonNull String str, @NonNull String str2) {
        Locale locale = Locale.ROOT;
        return str.toLowerCase(locale).contains(str2.toLowerCase(locale));
    }

    @Nullable
    private DialogRequestIdentifier newestInflightDrid() {
        Iterator<DialogRequestIdentifier> it2 = this.inflightByDrid.keySet().iterator();
        DialogRequestIdentifier dialogRequestIdentifier = null;
        while (it2.hasNext()) {
            dialogRequestIdentifier = it2.next();
        }
        return dialogRequestIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sealNow, reason: merged with bridge method [inline-methods] */
    public void lambda$armIdleTimer$0(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        cancelIdleTimer(dialogRequestIdentifier);
        InflightCaptions remove = this.inflightByDrid.remove(dialogRequestIdentifier);
        if (remove == null) {
            return;
        }
        this.ringBuffer.add(remove.toSealedCaption());
    }

    @Nullable
    public InflightCaptions findInflight(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        return this.inflightByDrid.get(dialogRequestIdentifier);
    }

    @NonNull
    public CaptionRingBuffer getRingBuffer() {
        return this.ringBuffer;
    }

    public void onDialogRequestStopped(@NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        lambda$armIdleTimer$0(dialogRequestIdentifier);
    }

    public void onPlaybackEnded(@NonNull SpeechToken speechToken, @NonNull SpeechPlaybackEndedEvent.Reason reason) {
        DialogRequestIdentifier dialogRequestIdentifier;
        if (this.pendingSpeaksByToken.remove(speechToken) != null) {
            return;
        }
        Iterator<InflightCaptions> it2 = this.inflightByDrid.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                dialogRequestIdentifier = null;
                break;
            }
            InflightCaptions next = it2.next();
            if (next.containsToken(speechToken)) {
                next.setPlaybackEndedAt(this.clock.now());
                dialogRequestIdentifier = next.getDialogRequestIdentifier();
                break;
            }
        }
        if (dialogRequestIdentifier == null) {
            return;
        }
        armIdleTimer(dialogRequestIdentifier);
    }

    public void onPlaybackStarted(@NonNull SpeechToken speechToken) {
        PendingSpeak remove = this.pendingSpeaksByToken.remove(speechToken);
        if (remove == null) {
            return;
        }
        cancelIdleTimer(remove.drid);
        InflightCaptions inflightCaptions = this.inflightByDrid.get(remove.drid);
        long now = this.clock.now();
        if (inflightCaptions == null) {
            inflightCaptions = new InflightCaptions(remove.drid, speechToken, now);
            this.inflightByDrid.put(remove.drid, inflightCaptions);
        }
        inflightCaptions.appendCaption(speechToken, remove.captionText);
    }

    public void onSpeakReceived(@NonNull DialogRequestIdentifier dialogRequestIdentifier, @NonNull SpeechToken speechToken, @Nullable CaptionData captionData) {
        String content;
        if (captionData == null || (content = captionData.getContent()) == null || content.isEmpty()) {
            return;
        }
        if (isVoiceEnrollmentPrompt(content, this.config.getVoiceEnrollmentSubstring())) {
            dialogRequestIdentifier.getValue();
            return;
        }
        DialogRequestIdentifier newestInflightDrid = newestInflightDrid();
        if (newestInflightDrid != null && !newestInflightDrid.equals(dialogRequestIdentifier)) {
            lambda$armIdleTimer$0(newestInflightDrid);
        }
        this.pendingSpeaksByToken.put(speechToken, new PendingSpeak(dialogRequestIdentifier, content));
    }

    public void reset() {
        Iterator<ScheduledFuture<?>> it2 = this.idleTimers.values().iterator();
        while (it2.hasNext()) {
            it2.next().cancel(false);
        }
        this.idleTimers.clear();
        this.inflightByDrid.clear();
        this.pendingSpeaksByToken.clear();
        this.ringBuffer.clear();
    }

    @NonNull
    public Iterable<InflightCaptions> snapshotInflight() {
        return new ArrayList(this.inflightByDrid.values());
    }
}
