package com.amazon.alexa.api.compat.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationExtrasBundleKeys;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationExtras;", "", AlexaConversationExtrasBundleKeys.PERSON_IDS, "", "", AlexaConversationExtrasBundleKeys.EXCLUDES, "paginationContext", "Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;)V", "getPersonIds", "()Ljava/util/List;", "getExcludes", "getPaginationContext", "()Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AlexaConversationExtras {

    @NotNull
    private final List<String> excludes;

    @Nullable
    private final AlexaConversationsPaginationContext paginationContext;

    @NotNull
    private final List<String> personIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationExtras$Builder;", "", "<init>", "()V", AlexaConversationExtrasBundleKeys.PERSON_IDS, "", "", AlexaConversationExtrasBundleKeys.EXCLUDES, "paginationContext", "Lcom/amazon/alexa/api/compat/model/AlexaConversationsPaginationContext;", "setPersonIds", ContactsModuleConstants.CONTACT_IDS, "setExcludes", "setPaginationContext", "context", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/api/compat/model/AlexaConversationExtras;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAlexaConversationExtras.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaConversationExtras.kt\ncom/amazon/alexa/api/compat/model/AlexaConversationExtras$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class Builder {
        public static final int $stable = 8;

        @Nullable
        private AlexaConversationsPaginationContext paginationContext;

        @NotNull
        private List<String> personIds = CollectionsKt.emptyList();

        @NotNull
        private List<String> excludes = CollectionsKt.emptyList();

        @NotNull
        public final AlexaConversationExtras build() {
            return new AlexaConversationExtras(this.personIds, this.excludes, this.paginationContext);
        }

        @NotNull
        public final Builder setExcludes(@NotNull List<String> excludes) {
            excludes.getClass();
            this.excludes = excludes;
            return this;
        }

        @NotNull
        public final Builder setPaginationContext(@Nullable AlexaConversationsPaginationContext context) {
            this.paginationContext = context;
            return this;
        }

        @NotNull
        public final Builder setPersonIds(@NotNull List<String> ids) {
            ids.getClass();
            this.personIds = ids;
            return this;
        }
    }

    public /* synthetic */ AlexaConversationExtras(List list, List list2, AlexaConversationsPaginationContext alexaConversationsPaginationContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? null : alexaConversationsPaginationContext);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlexaConversationExtras copy$default(AlexaConversationExtras alexaConversationExtras, List list, List list2, AlexaConversationsPaginationContext alexaConversationsPaginationContext, int i, Object obj) {
        if ((i & 1) != 0) {
            list = alexaConversationExtras.personIds;
        }
        if ((i & 2) != 0) {
            list2 = alexaConversationExtras.excludes;
        }
        if ((i & 4) != 0) {
            alexaConversationsPaginationContext = alexaConversationExtras.paginationContext;
        }
        return alexaConversationExtras.copy(list, list2, alexaConversationsPaginationContext);
    }

    @NotNull
    public final List<String> component1() {
        return this.personIds;
    }

    @NotNull
    public final List<String> component2() {
        return this.excludes;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AlexaConversationsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final AlexaConversationExtras copy(@NotNull List<String> personIds, @NotNull List<String> excludes, @Nullable AlexaConversationsPaginationContext paginationContext) {
        personIds.getClass();
        excludes.getClass();
        return new AlexaConversationExtras(personIds, excludes, paginationContext);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaConversationExtras)) {
            return false;
        }
        AlexaConversationExtras alexaConversationExtras = (AlexaConversationExtras) other;
        return Intrinsics.areEqual(this.personIds, alexaConversationExtras.personIds) && Intrinsics.areEqual(this.excludes, alexaConversationExtras.excludes) && Intrinsics.areEqual(this.paginationContext, alexaConversationExtras.paginationContext);
    }

    @NotNull
    public final List<String> getExcludes() {
        return this.excludes;
    }

    @Nullable
    public final AlexaConversationsPaginationContext getPaginationContext() {
        return this.paginationContext;
    }

    @NotNull
    public final List<String> getPersonIds() {
        return this.personIds;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.excludes, this.personIds.hashCode() * 31, 31);
        AlexaConversationsPaginationContext alexaConversationsPaginationContext = this.paginationContext;
        return m + (alexaConversationsPaginationContext == null ? 0 : alexaConversationsPaginationContext.hashCode());
    }

    @NotNull
    public String toString() {
        return "AlexaConversationExtras(personIds=" + this.personIds + ", excludes=" + this.excludes + ", paginationContext=" + this.paginationContext + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConversationExtras$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/api/compat/model/AlexaConversationExtras$Builder;", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public AlexaConversationExtras(@NotNull List<String> list, @NotNull List<String> list2, @Nullable AlexaConversationsPaginationContext alexaConversationsPaginationContext) {
        list.getClass();
        list2.getClass();
        this.personIds = list;
        this.excludes = list2;
        this.paginationContext = alexaConversationsPaginationContext;
    }

    public AlexaConversationExtras() {
        this(null, null, null, 7, null);
    }
}
