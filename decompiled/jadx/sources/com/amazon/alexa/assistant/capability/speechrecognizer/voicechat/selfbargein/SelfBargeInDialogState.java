package com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein;

import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInScheduler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0005R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u0005R\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\u0005R\u001a\u0010,\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R\u001e\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInDialogState;", "", "dialogRequestId", "", "<init>", "(Ljava/lang/String;)V", "getDialogRequestId", "()Ljava/lang/String;", "maxScore", "", "getMaxScore", "()D", "setMaxScore", "(D)V", "maxTotalMatched", "", "getMaxTotalMatched", "()I", "setMaxTotalMatched", "(I)V", "maxContiguousMatched", "getMaxContiguousMatched", "setMaxContiguousMatched", "bestMatchCaptionDrid", "getBestMatchCaptionDrid", "setBestMatchCaptionDrid", "bestMatchCaptionText", "getBestMatchCaptionText", "setBestMatchCaptionText", "lastScore", "getLastScore", "setLastScore", "lastTotalMatched", "getLastTotalMatched", "setLastTotalMatched", "lastContiguousMatched", "getLastContiguousMatched", "setLastContiguousMatched", "totalTranscriptWords", "getTotalTranscriptWords", "setTotalTranscriptWords", "lastTranscriptText", "getLastTranscriptText", "setLastTranscriptText", "livePreviewCount", "getLivePreviewCount", "setLivePreviewCount", "bargeInAt", "", "getBargeInAt", "()Ljava/lang/Long;", "setBargeInAt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "timeoutHandle", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Cancellable;", "getTimeoutHandle", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Cancellable;", "setTimeoutHandle", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/voicechat/selfbargein/SelfBargeInScheduler$Cancellable;)V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelfBargeInDialogState {

    @Nullable
    private Long bargeInAt;

    @Nullable
    private String bestMatchCaptionDrid;

    @Nullable
    private String bestMatchCaptionText;

    @NotNull
    private final String dialogRequestId;
    private int lastContiguousMatched;
    private double lastScore;
    private int lastTotalMatched;

    @NotNull
    private String lastTranscriptText;
    private int livePreviewCount;
    private int maxContiguousMatched;
    private double maxScore;
    private int maxTotalMatched;

    @Nullable
    private SelfBargeInScheduler.Cancellable timeoutHandle;
    private int totalTranscriptWords;

    public SelfBargeInDialogState(@NotNull String str) {
        str.getClass();
        this.dialogRequestId = str;
        this.lastTranscriptText = "";
    }

    @Nullable
    public final Long getBargeInAt() {
        return this.bargeInAt;
    }

    @Nullable
    public final String getBestMatchCaptionDrid() {
        return this.bestMatchCaptionDrid;
    }

    @Nullable
    public final String getBestMatchCaptionText() {
        return this.bestMatchCaptionText;
    }

    @NotNull
    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final int getLastContiguousMatched() {
        return this.lastContiguousMatched;
    }

    public final double getLastScore() {
        return this.lastScore;
    }

    public final int getLastTotalMatched() {
        return this.lastTotalMatched;
    }

    @NotNull
    public final String getLastTranscriptText() {
        return this.lastTranscriptText;
    }

    public final int getLivePreviewCount() {
        return this.livePreviewCount;
    }

    public final int getMaxContiguousMatched() {
        return this.maxContiguousMatched;
    }

    public final double getMaxScore() {
        return this.maxScore;
    }

    public final int getMaxTotalMatched() {
        return this.maxTotalMatched;
    }

    @Nullable
    public final SelfBargeInScheduler.Cancellable getTimeoutHandle() {
        return this.timeoutHandle;
    }

    public final int getTotalTranscriptWords() {
        return this.totalTranscriptWords;
    }

    public final void setBargeInAt(@Nullable Long l) {
        this.bargeInAt = l;
    }

    public final void setBestMatchCaptionDrid(@Nullable String str) {
        this.bestMatchCaptionDrid = str;
    }

    public final void setBestMatchCaptionText(@Nullable String str) {
        this.bestMatchCaptionText = str;
    }

    public final void setLastContiguousMatched(int i) {
        this.lastContiguousMatched = i;
    }

    public final void setLastScore(double d) {
        this.lastScore = d;
    }

    public final void setLastTotalMatched(int i) {
        this.lastTotalMatched = i;
    }

    public final void setLastTranscriptText(@NotNull String str) {
        str.getClass();
        this.lastTranscriptText = str;
    }

    public final void setLivePreviewCount(int i) {
        this.livePreviewCount = i;
    }

    public final void setMaxContiguousMatched(int i) {
        this.maxContiguousMatched = i;
    }

    public final void setMaxScore(double d) {
        this.maxScore = d;
    }

    public final void setMaxTotalMatched(int i) {
        this.maxTotalMatched = i;
    }

    public final void setTimeoutHandle(@Nullable SelfBargeInScheduler.Cancellable cancellable) {
        this.timeoutHandle = cancellable;
    }

    public final void setTotalTranscriptWords(int i) {
        this.totalTranscriptWords = i;
    }
}
