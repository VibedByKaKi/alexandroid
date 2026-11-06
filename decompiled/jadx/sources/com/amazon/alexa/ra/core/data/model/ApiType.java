package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.UpdateFragmentApiType;
import com.amazon.alexa.ra.sdk.capability.ConversationCapability;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType;", "", "<init>", "()V", "Unsupported", "UpdateFragments", "UpdateConversations", "Synchronize", ConversationCapability.DELETE_CONVERSATIONS_DIRECTIVE, "Lcom/amazon/alexa/ra/core/data/model/ApiType$DeleteConversations;", "Lcom/amazon/alexa/ra/core/data/model/ApiType$Synchronize;", "Lcom/amazon/alexa/ra/core/data/model/ApiType$Unsupported;", "Lcom/amazon/alexa/ra/core/data/model/ApiType$UpdateConversations;", "Lcom/amazon/alexa/ra/core/data/model/ApiType$UpdateFragments;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class ApiType {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType$DeleteConversations;", "Lcom/amazon/alexa/ra/core/data/model/ApiType;", "conversationIds", "", "", "<init>", "(Ljava/util/List;)V", "getConversationIds", "()Ljava/util/List;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteConversations extends ApiType {
        public static final int $stable = 8;

        @NotNull
        private final List<String> conversationIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteConversations(@NotNull List<String> list) {
            super(null);
            list.getClass();
            this.conversationIds = list;
        }

        @NotNull
        public final List<String> getConversationIds() {
            return this.conversationIds;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType$Synchronize;", "Lcom/amazon/alexa/ra/core/data/model/ApiType;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Synchronize extends ApiType {
        public static final int $stable = 0;

        @NotNull
        public static final Synchronize INSTANCE = new Synchronize();

        private Synchronize() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType$Unsupported;", "Lcom/amazon/alexa/ra/core/data/model/ApiType;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unsupported extends ApiType {
        public static final int $stable = 0;

        @NotNull
        public static final Unsupported INSTANCE = new Unsupported();

        private Unsupported() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType$UpdateConversations;", "Lcom/amazon/alexa/ra/core/data/model/ApiType;", "<init>", "()V", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateConversations extends ApiType {
        public static final int $stable = 0;

        @NotNull
        public static final UpdateConversations INSTANCE = new UpdateConversations();

        private UpdateConversations() {
            super(null);
        }
    }

    public /* synthetic */ ApiType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ApiType() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ApiType$UpdateFragments;", "Lcom/amazon/alexa/ra/core/data/model/ApiType;", "type", "Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;)V", "getType", "()Lcom/amazon/alexa/ra/core/data/model/UpdateFragmentApiType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateFragments extends ApiType {
        public static final int $stable = 0;

        @NotNull
        private final UpdateFragmentApiType type;

        public /* synthetic */ UpdateFragments(UpdateFragmentApiType updateFragmentApiType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UpdateFragmentApiType.NonPaginated.INSTANCE : updateFragmentApiType);
        }

        @NotNull
        public final UpdateFragmentApiType getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateFragments() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFragments(@NotNull UpdateFragmentApiType updateFragmentApiType) {
            super(null);
            updateFragmentApiType.getClass();
            this.type = updateFragmentApiType;
        }
    }
}
