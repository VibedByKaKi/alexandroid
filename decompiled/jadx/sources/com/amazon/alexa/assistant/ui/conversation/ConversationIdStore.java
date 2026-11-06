package com.amazon.alexa.assistant.ui.conversation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ConversationIdStore;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdStoreApi;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", "id", "", "getId", "updateId", "", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConversationIdStore implements ConversationIdStoreApi {

    @NotNull
    private static final String TAG = "ConversationIdStore";

    @Nullable
    private volatile String id;

    @NotNull
    private final Logger logger;
    public static final int $stable = 8;

    public ConversationIdStore(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @Override // com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi
    @Nullable
    public String getId() {
        Logger.DefaultImpls.debug$default(this.logger, TAG, "getId called", null, 4, null);
        return this.id;
    }

    @Override // com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi
    public void updateId(@Nullable String id) {
        Logger.DefaultImpls.debug$default(this.logger, TAG, a$$ExternalSyntheticOutline0.m("updateId called with id: ", id), null, 4, null);
        this.id = id;
    }
}
