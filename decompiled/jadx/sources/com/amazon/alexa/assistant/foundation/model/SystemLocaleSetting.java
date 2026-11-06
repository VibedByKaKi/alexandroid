package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "", "<init>", "()V", "primaryLocale", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "secondaryLocales", "", "toArray", "", "Single", "Multiple", "Companion", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting$Multiple;", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting$Single;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemLocale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemLocale.kt\ncom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n1563#2:399\n1634#2,3:400\n*S KotlinDebug\n*F\n+ 1 SystemLocale.kt\ncom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting\n*L\n39#1:399\n39#1:400,3\n*E\n"})
/* loaded from: classes15.dex */
public abstract class SystemLocaleSetting {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting$Multiple;", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "localeCombination", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleCombination;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleCombination;)V", "getLocaleCombination", "()Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleCombination;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Multiple extends SystemLocaleSetting {

        @NotNull
        private final SystemLocaleCombination localeCombination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Multiple(@NotNull SystemLocaleCombination systemLocaleCombination) {
            super(null);
            systemLocaleCombination.getClass();
            this.localeCombination = systemLocaleCombination;
        }

        public static /* synthetic */ Multiple copy$default(Multiple multiple, SystemLocaleCombination systemLocaleCombination, int i, Object obj) {
            if ((i & 1) != 0) {
                systemLocaleCombination = multiple.localeCombination;
            }
            return multiple.copy(systemLocaleCombination);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SystemLocaleCombination getLocaleCombination() {
            return this.localeCombination;
        }

        @NotNull
        public final Multiple copy(@NotNull SystemLocaleCombination localeCombination) {
            localeCombination.getClass();
            return new Multiple(localeCombination);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Multiple) && this.localeCombination == ((Multiple) other).localeCombination;
        }

        @NotNull
        public final SystemLocaleCombination getLocaleCombination() {
            return this.localeCombination;
        }

        public int hashCode() {
            return this.localeCombination.hashCode();
        }

        @NotNull
        public String toString() {
            return "Multiple(localeCombination=" + this.localeCombination + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting$Single;", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "locale", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;)V", "getLocale", "()Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Single extends SystemLocaleSetting {

        @NotNull
        private final SystemLocale locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(@NotNull SystemLocale systemLocale) {
            super(null);
            systemLocale.getClass();
            this.locale = systemLocale;
        }

        public static /* synthetic */ Single copy$default(Single single, SystemLocale systemLocale, int i, Object obj) {
            if ((i & 1) != 0) {
                systemLocale = single.locale;
            }
            return single.copy(systemLocale);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SystemLocale getLocale() {
            return this.locale;
        }

        @NotNull
        public final Single copy(@NotNull SystemLocale locale) {
            locale.getClass();
            return new Single(locale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Single) && this.locale == ((Single) other).locale;
        }

        @NotNull
        public final SystemLocale getLocale() {
            return this.locale;
        }

        public int hashCode() {
            return this.locale.hashCode();
        }

        @NotNull
        public String toString() {
            return "Single(locale=" + this.locale + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ SystemLocaleSetting(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final SystemLocale primaryLocale() {
        if (this instanceof Single) {
            return ((Single) this).getLocale();
        }
        if (this instanceof Multiple) {
            return ((Multiple) this).getLocaleCombination().primaryLocale();
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final List<SystemLocale> secondaryLocales() {
        if (this instanceof Single) {
            return CollectionsKt.emptyList();
        }
        if (this instanceof Multiple) {
            return ((Multiple) this).getLocaleCombination().secondaryLocales();
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @NotNull
    public final List<String> toArray() {
        List listOf = CollectionsKt.listOf(primaryLocale().getValue());
        List<SystemLocale> secondaryLocales = secondaryLocales();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(secondaryLocales, 10));
        Iterator<T> it2 = secondaryLocales.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SystemLocale) it2.next()).getValue());
        }
        return CollectionsKt.plus((Collection) listOf, (Iterable) arrayList);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting$Companion;", "", "<init>", "()V", "from", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocaleSetting;", "locales", "", "Lcom/amazon/alexa/assistant/foundation/model/SystemLocale;", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SystemLocaleSetting from(@NotNull List<? extends SystemLocale> locales) {
            SystemLocale systemLocale;
            locales.getClass();
            if (locales.isEmpty() || (systemLocale = (SystemLocale) CollectionsKt.firstOrNull((List) locales)) == null) {
                return null;
            }
            if (locales.size() == 1) {
                return new Single(systemLocale);
            }
            SystemLocaleCombination from = SystemLocaleCombination.INSTANCE.from(locales);
            if (from == null) {
                return null;
            }
            return new Multiple(from);
        }

        private Companion() {
        }
    }

    private SystemLocaleSetting() {
    }
}
