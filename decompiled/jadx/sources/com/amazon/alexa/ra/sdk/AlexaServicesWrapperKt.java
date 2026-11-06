package com.amazon.alexa.ra.sdk;

import com.amazon.alexa.api.compat.model.ConversationEventExtras;
import com.amazon.alexa.api.compat.model.ResponseType;
import com.amazon.alexa.ra.core.data.model.CoreResponseType;
import com.amazon.alexa.ra.core.data.model.UiConversationEventExtras;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"toConversationEventExtras", "Lcom/amazon/alexa/api/compat/model/ConversationEventExtras;", "Lcom/amazon/alexa/ra/core/data/model/UiConversationEventExtras;", "toResponseType", "Lcom/amazon/alexa/api/compat/model/ResponseType;", "Lcom/amazon/alexa/ra/core/data/model/CoreResponseType;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class AlexaServicesWrapperKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoreResponseType.values().length];
            try {
                iArr[CoreResponseType.FRAGMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoreResponseType.APL_DEEP_BROWSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoreResponseType.URL_DEEP_BROWSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoreResponseType.EXISTING_CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ConversationEventExtras toConversationEventExtras(@NotNull UiConversationEventExtras uiConversationEventExtras) {
        uiConversationEventExtras.getClass();
        ConversationEventExtras.Builder suppressSpeechResponse = ConversationEventExtras.INSTANCE.builder().setInvocationType(uiConversationEventExtras.getInvocationType()).setPresentationUri(uiConversationEventExtras.getPresentationUri()).suppressSpeechResponse(uiConversationEventExtras.getSuppressSpeechResponse());
        Long startTimestampInMillis = uiConversationEventExtras.getStartTimestampInMillis();
        if (startTimestampInMillis != null) {
            suppressSpeechResponse.setStartTimestampInMillis(startTimestampInMillis.longValue());
        }
        String universalPrivacyCode = uiConversationEventExtras.getUniversalPrivacyCode();
        if (universalPrivacyCode != null) {
            suppressSpeechResponse.setUniversalPrivacyCode(universalPrivacyCode);
        }
        String interactionLabel = uiConversationEventExtras.getInteractionLabel();
        if (interactionLabel != null) {
            suppressSpeechResponse.setInteractionLabel(interactionLabel);
        }
        CoreResponseType responseType = uiConversationEventExtras.getResponseType();
        if (responseType != null) {
            suppressSpeechResponse.setResponseType(toResponseType(responseType));
        }
        return suppressSpeechResponse.build();
    }

    @NotNull
    public static final ResponseType toResponseType(@NotNull CoreResponseType coreResponseType) {
        coreResponseType.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[coreResponseType.ordinal()];
        if (i == 1) {
            return ResponseType.FRAGMENT;
        }
        if (i == 2) {
            return ResponseType.APL_DEEP_BROWSE;
        }
        if (i == 3) {
            return ResponseType.URL_DEEP_BROWSE;
        }
        if (i == 4) {
            return ResponseType.EXISTING_CHAT;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
