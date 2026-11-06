package com.amazon.alexa.ra.core.features.conversations;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bJ\u0014\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J\u0006\u0010\u0011\u001a\u00020\fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/features/conversations/ConversationsCache;", "", "<init>", "()V", "titleCache", "Lcom/amazon/alexa/ra/core/features/conversations/ConversationsCache$MemoryCache;", "Lcom/amazon/alexa/ra/core/features/conversations/ConversationsCache$ConversationTitles;", "getConversationTitle", "", "conversationId", "startTimestamp", "setConversationTitle", "", "title", "removeConversations", ContactsModuleConstants.CONTACT_IDS, "", MetricsConstants.Method.CACHE_CLEAR, "ConversationTitles", "MemoryCache", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationsCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationsCache.kt\ncom/amazon/alexa/ra/core/features/conversations/ConversationsCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1863#2,2:67\n*S KotlinDebug\n*F\n+ 1 ConversationsCache.kt\ncom/amazon/alexa/ra/core/features/conversations/ConversationsCache\n*L\n34#1:67,2\n*E\n"})
/* loaded from: classes18.dex */
public final class ConversationsCache {
    public static final int $stable = 8;

    @NotNull
    private final MemoryCache<ConversationTitles> titleCache = new MemoryCache<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/features/conversations/ConversationsCache$MemoryCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", BuildConfig.FLAVOR_authType, "", "", MetricsConstants.Method.CACHE_GET, "key", "(Ljava/lang/String;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", BulkOperationType.remove, MetricsConstants.Method.CACHE_CLEAR, "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MemoryCache<T> {

        @NotNull
        private final Map<String, T> map = new LinkedHashMap();

        public final void clear() {
            this.map.clear();
        }

        @Nullable
        public final T get(@NotNull String key) {
            key.getClass();
            return this.map.get(key);
        }

        public final void remove(@NotNull String key) {
            key.getClass();
            this.map.remove(key);
        }

        public final void set(@NotNull String key, T value) {
            key.getClass();
            this.map.put(key, value);
        }
    }

    public final void clear() {
        this.titleCache.clear();
    }

    @Nullable
    public final String getConversationTitle(@NotNull String conversationId, @NotNull String startTimestamp) {
        Map<String, String> topics;
        conversationId.getClass();
        startTimestamp.getClass();
        ConversationTitles conversationTitles = this.titleCache.get(conversationId);
        if (conversationTitles == null || (topics = conversationTitles.getTopics()) == null) {
            return null;
        }
        return topics.get(startTimestamp);
    }

    public final void removeConversations(@NotNull List<String> ids) {
        ids.getClass();
        Iterator<T> it2 = ids.iterator();
        while (it2.hasNext()) {
            this.titleCache.remove((String) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setConversationTitle(@NotNull String conversationId, @NotNull String title) {
        conversationId.getClass();
        title.getClass();
        ConversationTitles conversationTitles = this.titleCache.get(conversationId);
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (conversationTitles == null) {
            conversationTitles = new ConversationTitles(str, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        this.titleCache.set(conversationId, ConversationTitles.copy$default(conversationTitles, title, null, 2, null));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/features/conversations/ConversationsCache$ConversationTitles;", "", "title", "", "topics", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTopics", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConversationTitles {

        @NotNull
        private final String title;

        @NotNull
        private final Map<String, String> topics;

        public /* synthetic */ ConversationTitles(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new LinkedHashMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationTitles copy$default(ConversationTitles conversationTitles, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationTitles.title;
            }
            if ((i & 2) != 0) {
                map = conversationTitles.topics;
            }
            return conversationTitles.copy(str, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Map<String, String> component2() {
            return this.topics;
        }

        @NotNull
        public final ConversationTitles copy(@NotNull String title, @NotNull Map<String, String> topics) {
            title.getClass();
            topics.getClass();
            return new ConversationTitles(title, topics);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationTitles)) {
                return false;
            }
            ConversationTitles conversationTitles = (ConversationTitles) other;
            return Intrinsics.areEqual(this.title, conversationTitles.title) && Intrinsics.areEqual(this.topics, conversationTitles.topics);
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final Map<String, String> getTopics() {
            return this.topics;
        }

        public int hashCode() {
            return this.topics.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ConversationTitles(title=" + this.title + ", topics=" + this.topics + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public ConversationTitles(@NotNull String str, @NotNull Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.title = str;
            this.topics = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ConversationTitles() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Nullable
    public final String getConversationTitle(@NotNull String conversationId) {
        conversationId.getClass();
        ConversationTitles conversationTitles = this.titleCache.get(conversationId);
        if (conversationTitles != null) {
            return conversationTitles.getTitle();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setConversationTitle(@NotNull String conversationId, @NotNull String startTimestamp, @NotNull String title) {
        ParcelCompat$$ExternalSyntheticOutline0.m(conversationId, startTimestamp, title);
        ConversationTitles conversationTitles = this.titleCache.get(conversationId);
        if (conversationTitles == null) {
            conversationTitles = new ConversationTitles(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        conversationTitles.getTopics().put(startTimestamp, title);
        this.titleCache.set(conversationId, conversationTitles);
    }
}
