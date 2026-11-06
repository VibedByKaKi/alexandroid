package com.amazon.alexa.ra.core.viewmodel;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/ConversationIdStoreApi;", "", "getId", "", "updateId", "", "id", "newChats", "Lkotlinx/coroutines/flow/Flow;", "getNewChats", "()Lkotlinx/coroutines/flow/Flow;", "announceNewChat", "origin", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ConversationIdStoreApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void announceNewChat(@NotNull ConversationIdStoreApi conversationIdStoreApi, @NotNull Object obj) {
            obj.getClass();
            ConversationIdStoreApi.super.announceNewChat(obj);
        }

        @Deprecated
        @NotNull
        public static Flow<Object> getNewChats(@NotNull ConversationIdStoreApi conversationIdStoreApi) {
            return ConversationIdStoreApi.super.getNewChats();
        }
    }

    default void announceNewChat(@NotNull Object origin) {
        origin.getClass();
    }

    @Nullable
    String getId();

    @NotNull
    default Flow<Object> getNewChats() {
        return FlowKt.emptyFlow();
    }

    void updateId(@Nullable String id);
}
