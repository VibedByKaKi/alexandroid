package com.amazon.alexa.pmi;

import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J)\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\u001e\u0010\u0013\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/pmi/PMI;", "", "startRootTimeline", "", "Lcom/amazon/alexa/pmi/TimelineID;", "input", "Lcom/amazon/alexa/pmi/TimelineInput;", "startTimeMs", "", "startTimeline", "parentTimelineID", "(Lcom/amazon/alexa/pmi/TimelineInput;I)Ljava/lang/Integer;", "mark", "", "timelineID", "event", "Lcom/amazon/alexa/pmi/TimelineEvent;", "metadata", "Lcom/amazon/alexa/pmi/EventMetadata;", "endTimeline", "exitCode", "Lcom/amazon/alexa/pmi/TimelineExitCode;", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PMI {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void endTimeline$default(PMI pmi, int i, TimelineExitCode timelineExitCode, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: endTimeline");
                return;
            }
            if ((i2 & 2) != 0) {
                timelineExitCode = TimelineExitCode.SUCCESS;
            }
            pmi.endTimeline(i, timelineExitCode);
        }

        public static /* synthetic */ void mark$default(PMI pmi, int i, TimelineEvent timelineEvent, EventMetadata eventMetadata, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: mark");
                return;
            }
            if ((i2 & 4) != 0) {
                eventMetadata = null;
            }
            pmi.mark(i, timelineEvent, eventMetadata);
        }
    }

    void endTimeline(int timelineID, @NotNull TimelineExitCode exitCode);

    void mark(int timelineID, @NotNull TimelineEvent event, @Nullable EventMetadata metadata);

    int startRootTimeline(@NotNull TimelineInput input, long startTimeMs);

    @Nullable
    Integer startTimeline(@NotNull TimelineInput input, int parentTimelineID);
}
