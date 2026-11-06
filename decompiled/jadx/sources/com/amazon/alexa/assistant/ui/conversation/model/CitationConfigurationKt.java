package com.amazon.alexa.assistant.ui.conversation.model;

import com.amazon.alexa.ra.core.data.model.CitationUiConfig;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toUiConfig", "Lcom/amazon/alexa/ra/core/data/model/CitationUiConfig;", "Lcom/amazon/alexa/assistant/ui/conversation/model/CitationConfiguration;", "toRaMode", "Lcom/amazon/alexa/ra/core/data/model/CitationDisplayMode;", "Lcom/amazon/alexa/assistant/ui/conversation/model/CitationDisplayMode;", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CitationConfigurationKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CitationDisplayMode.values().length];
            try {
                iArr[CitationDisplayMode.INLINE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CitationDisplayMode.GLOBAL_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CitationDisplayMode.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final com.amazon.alexa.ra.core.data.model.CitationDisplayMode toRaMode(@NotNull CitationDisplayMode citationDisplayMode) {
        citationDisplayMode.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[citationDisplayMode.ordinal()];
        if (i == 1) {
            return com.amazon.alexa.ra.core.data.model.CitationDisplayMode.INLINE_ONLY;
        }
        if (i == 2) {
            return com.amazon.alexa.ra.core.data.model.CitationDisplayMode.GLOBAL_ONLY;
        }
        if (i == 3) {
            return com.amazon.alexa.ra.core.data.model.CitationDisplayMode.ALL;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public static final CitationUiConfig toUiConfig(@NotNull CitationConfiguration citationConfiguration) {
        citationConfiguration.getClass();
        return new CitationUiConfig(toRaMode(citationConfiguration.getDisplayMode()));
    }
}
