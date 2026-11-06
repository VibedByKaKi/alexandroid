package com.amazon.alexa.api.compat.model.assistant;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.ContextProviderApiV2;
import com.amazon.alexa.api.compat.model.ConversationUiApiV2;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0015\u001a\u00020\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/AssistantInProcessApis;", "", "<init>", "()V", "conversationUiProvider", "Lkotlin/Function0;", "Lcom/amazon/alexa/api/compat/model/ConversationUiApiV2;", "getConversationUiProvider", "()Lkotlin/jvm/functions/Function0;", "setConversationUiProvider", "(Lkotlin/jvm/functions/Function0;)V", "contextProviderApiProvider", "Lcom/amazon/alexa/api/compat/model/ContextProviderApiV2;", "getContextProviderApiProvider", "setContextProviderApiProvider", "conversationUi", "getConversationUi", "()Lcom/amazon/alexa/api/compat/model/ConversationUiApiV2;", "contextProviderApi", "getContextProviderApi", "()Lcom/amazon/alexa/api/compat/model/ContextProviderApiV2;", MetricsConstants.Method.CACHE_CLEAR, "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AssistantInProcessApis {

    @Nullable
    private static volatile Function0<? extends ContextProviderApiV2> contextProviderApiProvider;

    @Nullable
    private static volatile Function0<? extends ConversationUiApiV2> conversationUiProvider;

    @NotNull
    public static final AssistantInProcessApis INSTANCE = new AssistantInProcessApis();
    public static final int $stable = 8;

    private AssistantInProcessApis() {
    }

    public final void clear() {
        conversationUiProvider = null;
        contextProviderApiProvider = null;
    }

    @Nullable
    public final ContextProviderApiV2 getContextProviderApi() {
        Function0<? extends ContextProviderApiV2> function0 = contextProviderApiProvider;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Nullable
    public final Function0<ContextProviderApiV2> getContextProviderApiProvider() {
        return contextProviderApiProvider;
    }

    @Nullable
    public final ConversationUiApiV2 getConversationUi() {
        Function0<? extends ConversationUiApiV2> function0 = conversationUiProvider;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Nullable
    public final Function0<ConversationUiApiV2> getConversationUiProvider() {
        return conversationUiProvider;
    }

    public final void setContextProviderApiProvider(@Nullable Function0<? extends ContextProviderApiV2> function0) {
        contextProviderApiProvider = function0;
    }

    public final void setConversationUiProvider(@Nullable Function0<? extends ConversationUiApiV2> function0) {
        conversationUiProvider = function0;
    }
}
