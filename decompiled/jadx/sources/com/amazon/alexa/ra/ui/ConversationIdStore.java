package com.amazon.alexa.ra.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/ui/ConversationIdStore;", "Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdStoreApi;", "<init>", "()V", "getId", "", "updateId", "", "id", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ConversationIdStore implements ConversationIdStoreApi {
    public static final int $stable = 0;

    @NotNull
    public static final ConversationIdStore INSTANCE = new ConversationIdStore();

    private ConversationIdStore() {
    }

    @Override // com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi
    @Nullable
    public String getId() {
        return RaUiOptions.lastConversationId;
    }

    @Override // com.amazon.alexa.ra.core.viewmodel.ConversationIdStoreApi
    public void updateId(@Nullable String id) {
        RaUiOptions.lastConversationId = id;
    }
}
