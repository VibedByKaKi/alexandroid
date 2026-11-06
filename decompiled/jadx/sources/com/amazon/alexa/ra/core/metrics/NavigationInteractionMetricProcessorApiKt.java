package com.amazon.alexa.ra.core.metrics;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"getInteractionLabelForNavigationType", "", "navigationType", "Lcom/amazon/alexa/ra/core/metrics/NavigationType;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NavigationInteractionMetricProcessorApiKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationType.values().length];
            try {
                iArr[NavigationType.CONVERSATION_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationType.EXISTING_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NavigationType.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NavigationType.EXPAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getInteractionLabelForNavigationType(@NotNull NavigationType navigationType) {
        navigationType.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[navigationType.ordinal()];
        if (i == 1) {
            return "RecentChats";
        }
        if (i == 2) {
            return InteractionLabel.TIMELINE;
        }
        if (i == 3) {
            return InteractionLabel.OPEN_URL;
        }
        if (i == 4) {
            return "Expand";
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
