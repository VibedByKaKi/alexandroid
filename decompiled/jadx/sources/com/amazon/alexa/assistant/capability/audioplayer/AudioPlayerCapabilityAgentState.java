package com.amazon.alexa.assistant.capability.audioplayer;

import com.amazon.alexa.assistant.foundation.audio.AudioPlayableTask;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "", "<init>", "()V", "Idle", "Playing", "Paused", "BufferUnderrun", "Finished", "Stopped", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Finished;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Idle;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Paused;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Playing;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Stopped;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AudioPlayerCapabilityAgentState {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$BufferUnderrun;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "startTime", "Ljava/util/Date;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;Ljava/util/Date;)V", "getTask", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "getStartTime", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BufferUnderrun extends AudioPlayerCapabilityAgentState {

        @NotNull
        private final Date startTime;

        @NotNull
        private final AudioPlayableTask task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BufferUnderrun(@NotNull AudioPlayableTask audioPlayableTask, @NotNull Date date) {
            super(null);
            audioPlayableTask.getClass();
            date.getClass();
            this.task = audioPlayableTask;
            this.startTime = date;
        }

        public static /* synthetic */ BufferUnderrun copy$default(BufferUnderrun bufferUnderrun, AudioPlayableTask audioPlayableTask, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                audioPlayableTask = bufferUnderrun.task;
            }
            if ((i & 2) != 0) {
                date = bufferUnderrun.startTime;
            }
            return bufferUnderrun.copy(audioPlayableTask, date);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Date getStartTime() {
            return this.startTime;
        }

        @NotNull
        public final BufferUnderrun copy(@NotNull AudioPlayableTask task, @NotNull Date startTime) {
            task.getClass();
            startTime.getClass();
            return new BufferUnderrun(task, startTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BufferUnderrun)) {
                return false;
            }
            BufferUnderrun bufferUnderrun = (BufferUnderrun) other;
            return Intrinsics.areEqual(this.task, bufferUnderrun.task) && Intrinsics.areEqual(this.startTime, bufferUnderrun.startTime);
        }

        @NotNull
        public final Date getStartTime() {
            return this.startTime;
        }

        @NotNull
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        public int hashCode() {
            return this.startTime.hashCode() + (this.task.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BufferUnderrun(task=" + this.task + ", startTime=" + this.startTime + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Finished;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "nextTaskAvailable", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;Z)V", "getTask", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "getNextTaskAvailable", "()Z", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Finished extends AudioPlayerCapabilityAgentState {
        private final boolean nextTaskAvailable;

        @NotNull
        private final AudioPlayableTask task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finished(@NotNull AudioPlayableTask audioPlayableTask, boolean z) {
            super(null);
            audioPlayableTask.getClass();
            this.task = audioPlayableTask;
            this.nextTaskAvailable = z;
        }

        public static /* synthetic */ Finished copy$default(Finished finished, AudioPlayableTask audioPlayableTask, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                audioPlayableTask = finished.task;
            }
            if ((i & 2) != 0) {
                z = finished.nextTaskAvailable;
            }
            return finished.copy(audioPlayableTask, z);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getNextTaskAvailable() {
            return this.nextTaskAvailable;
        }

        @NotNull
        public final Finished copy(@NotNull AudioPlayableTask task, boolean nextTaskAvailable) {
            task.getClass();
            return new Finished(task, nextTaskAvailable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) other;
            return Intrinsics.areEqual(this.task, finished.task) && this.nextTaskAvailable == finished.nextTaskAvailable;
        }

        public final boolean getNextTaskAvailable() {
            return this.nextTaskAvailable;
        }

        @NotNull
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        public int hashCode() {
            return Boolean.hashCode(this.nextTaskAvailable) + (this.task.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Finished(task=" + this.task + ", nextTaskAvailable=" + this.nextTaskAvailable + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Idle;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "<init>", "()V", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Idle extends AudioPlayerCapabilityAgentState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Paused;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;)V", "getTask", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Paused extends AudioPlayerCapabilityAgentState {

        @NotNull
        private final AudioPlayableTask task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paused(@NotNull AudioPlayableTask audioPlayableTask) {
            super(null);
            audioPlayableTask.getClass();
            this.task = audioPlayableTask;
        }

        public static /* synthetic */ Paused copy$default(Paused paused, AudioPlayableTask audioPlayableTask, int i, Object obj) {
            if ((i & 1) != 0) {
                audioPlayableTask = paused.task;
            }
            return paused.copy(audioPlayableTask);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        @NotNull
        public final Paused copy(@NotNull AudioPlayableTask task) {
            task.getClass();
            return new Paused(task);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Paused) && Intrinsics.areEqual(this.task, ((Paused) other).task);
        }

        @NotNull
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        public int hashCode() {
            return this.task.hashCode();
        }

        @NotNull
        public String toString() {
            return "Paused(task=" + this.task + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Playing;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;)V", "getTask", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Playing extends AudioPlayerCapabilityAgentState {

        @NotNull
        private final AudioPlayableTask task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Playing(@NotNull AudioPlayableTask audioPlayableTask) {
            super(null);
            audioPlayableTask.getClass();
            this.task = audioPlayableTask;
        }

        public static /* synthetic */ Playing copy$default(Playing playing, AudioPlayableTask audioPlayableTask, int i, Object obj) {
            if ((i & 1) != 0) {
                audioPlayableTask = playing.task;
            }
            return playing.copy(audioPlayableTask);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        @NotNull
        public final Playing copy(@NotNull AudioPlayableTask task) {
            task.getClass();
            return new Playing(task);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Playing) && Intrinsics.areEqual(this.task, ((Playing) other).task);
        }

        @NotNull
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        public int hashCode() {
            return this.task.hashCode();
        }

        @NotNull
        public String toString() {
            return "Playing(task=" + this.task + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState$Stopped;", "Lcom/amazon/alexa/assistant/capability/audioplayer/AudioPlayerCapabilityAgentState;", "task", "Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "error", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;Ljava/lang/Throwable;)V", "getTask", "()Lcom/amazon/alexa/assistant/foundation/audio/AudioPlayableTask;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Stopped extends AudioPlayerCapabilityAgentState {

        @Nullable
        private final Throwable error;

        @Nullable
        private final AudioPlayableTask task;

        public Stopped(@Nullable AudioPlayableTask audioPlayableTask, @Nullable Throwable th) {
            super(null);
            this.task = audioPlayableTask;
            this.error = th;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, AudioPlayableTask audioPlayableTask, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                audioPlayableTask = stopped.task;
            }
            if ((i & 2) != 0) {
                th = stopped.error;
            }
            return stopped.copy(audioPlayableTask, th);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        public final Stopped copy(@Nullable AudioPlayableTask task, @Nullable Throwable error) {
            return new Stopped(task, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stopped)) {
                return false;
            }
            Stopped stopped = (Stopped) other;
            return Intrinsics.areEqual(this.task, stopped.task) && Intrinsics.areEqual(this.error, stopped.error);
        }

        @Nullable
        public final Throwable getError() {
            return this.error;
        }

        @Nullable
        public final AudioPlayableTask getTask() {
            return this.task;
        }

        public int hashCode() {
            AudioPlayableTask audioPlayableTask = this.task;
            int hashCode = (audioPlayableTask == null ? 0 : audioPlayableTask.hashCode()) * 31;
            Throwable th = this.error;
            return hashCode + (th != null ? th.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Stopped(task=" + this.task + ", error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ AudioPlayerCapabilityAgentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AudioPlayerCapabilityAgentState() {
    }
}
