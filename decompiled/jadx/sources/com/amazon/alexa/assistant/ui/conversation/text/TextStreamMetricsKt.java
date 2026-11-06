package com.amazon.alexa.assistant.ui.conversation.text;

import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {ShortcutConstants.METRIC_NAME_KEY, "Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamMetricName;", "Lcom/amazon/alexa/assistant/ui/conversation/text/TextStreamCloseReason;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TextStreamMetricsKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStreamCloseReason.values().length];
            try {
                iArr[TextStreamCloseReason.SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStreamCloseReason.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStreamCloseReason.LIFETIME_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final TextStreamMetricName metricName(@NotNull TextStreamCloseReason textStreamCloseReason) {
        textStreamCloseReason.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[textStreamCloseReason.ordinal()];
        if (i == 1) {
            return TextStreamMetricName.CLOSED_ERROR;
        }
        if (i == 2) {
            return TextStreamMetricName.CLOSED_CANCELLED;
        }
        if (i == 3) {
            return TextStreamMetricName.CLOSED_LIFETIME_EXPIRED;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
