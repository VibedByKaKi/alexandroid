package com.amazon.alexa.voice.tta.features;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.configuration.KinesisEndpoint;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.maps.MapboxMap;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0004\u0082\u0001\u0004\b\u0005\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Feature;", "", "<init>", "()V", "or", "Lcom/amazon/alexa/voice/tta/features/Feature$Any;", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "and", "Lcom/amazon/alexa/voice/tta/features/Feature$All;", "Named", "NameSpaced", KinesisEndpoint.AppState.ANY, "All", "Lcom/amazon/alexa/voice/tta/features/Feature$NameSpaced;", "Lcom/amazon/alexa/voice/tta/features/Feature$Named;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class Feature {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Feature$NameSpaced;", "Lcom/amazon/alexa/voice/tta/features/Feature;", "name", "", "namespace", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNamespace", "toString", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NameSpaced extends Feature {

        @NotNull
        private final String name;

        @NotNull
        private final String namespace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NameSpaced(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.name = str;
            this.namespace = str2;
        }

        public static /* synthetic */ NameSpaced copy$default(NameSpaced nameSpaced, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nameSpaced.name;
            }
            if ((i & 2) != 0) {
                str2 = nameSpaced.namespace;
            }
            return nameSpaced.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getNamespace() {
            return this.namespace;
        }

        @NotNull
        public final NameSpaced copy(@NotNull String name, @NotNull String namespace) {
            name.getClass();
            namespace.getClass();
            return new NameSpaced(name, namespace);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NameSpaced)) {
                return false;
            }
            NameSpaced nameSpaced = (NameSpaced) other;
            return Intrinsics.areEqual(this.name, nameSpaced.name) && Intrinsics.areEqual(this.namespace, nameSpaced.namespace);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getNamespace() {
            return this.namespace;
        }

        public int hashCode() {
            return this.namespace.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return BitVector$$ExternalSyntheticOutline0.m(this.name, this.namespace);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Feature$Named;", "Lcom/amazon/alexa/voice/tta/features/Feature;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Named extends Feature {

        @NotNull
        private final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Named(@NotNull String str) {
            super(null);
            str.getClass();
            this.name = str;
        }

        public static /* synthetic */ Named copy$default(Named named, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = named.name;
            }
            return named.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Named copy(@NotNull String name) {
            name.getClass();
            return new Named(name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Named) && Intrinsics.areEqual(this.name, ((Named) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ Feature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public All and(@NotNull Feature other) {
        other.getClass();
        return new All(this, other);
    }

    @NotNull
    public Any or(@NotNull Feature other) {
        other.getClass();
        return new Any(this, other);
    }

    private Feature() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0096\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Feature$All;", "Lcom/amazon/alexa/voice/tta/features/Feature;", MapboxMap.QFE_CHILDREN, "", "<init>", "(Ljava/util/List;)V", "", "([Lcom/amazon/alexa/voice/tta/features/Feature;)V", "getChildren", "()Ljava/util/List;", "and", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", "component1", "copy", "equals", "", "", "hashCode", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class All extends Feature {

        @NotNull
        private final List<Feature> children;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public All(@NotNull Feature... featureArr) {
            this((List<? extends Feature>) CollectionsKt.listOf(Arrays.copyOf(featureArr, featureArr.length)));
            featureArr.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ All copy$default(All all, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = all.children;
            }
            return all.copy(list);
        }

        @Override // com.amazon.alexa.voice.tta.features.Feature
        @NotNull
        public All and(@NotNull Feature other) {
            other.getClass();
            return new All((List<? extends Feature>) CollectionsKt.plus((Collection<? extends Feature>) this.children, other));
        }

        @NotNull
        public final List<Feature> component1() {
            return this.children;
        }

        @NotNull
        public final All copy(@NotNull List<? extends Feature> children) {
            children.getClass();
            return new All(children);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof All) && Intrinsics.areEqual(this.children, ((All) other).children);
        }

        @NotNull
        public final List<Feature> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_PARENTHESIS, CollectionsKt.joinToString$default(this.children, " and ", null, null, null, 62), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public All(@NotNull List<? extends Feature> list) {
            super(null);
            list.getClass();
            this.children = list;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0096\u0004J\b\u0010\f\u001a\u00020\rH\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/voice/tta/features/Feature$Any;", "Lcom/amazon/alexa/voice/tta/features/Feature;", MapboxMap.QFE_CHILDREN, "", "<init>", "(Ljava/util/List;)V", "", "([Lcom/amazon/alexa/voice/tta/features/Feature;)V", "getChildren", "()Ljava/util/List;", "or", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "toString", "", "component1", "copy", "equals", "", "", "hashCode", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Any extends Feature {

        @NotNull
        private final List<Feature> children;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Any(@NotNull Feature... featureArr) {
            this((List<? extends Feature>) CollectionsKt.listOf(Arrays.copyOf(featureArr, featureArr.length)));
            featureArr.getClass();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Any copy$default(Any any, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = any.children;
            }
            return any.copy(list);
        }

        @NotNull
        public final List<Feature> component1() {
            return this.children;
        }

        @NotNull
        public final Any copy(@NotNull List<? extends Feature> children) {
            children.getClass();
            return new Any(children);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Any) && Intrinsics.areEqual(this.children, ((Any) other).children);
        }

        @NotNull
        public final List<Feature> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        @Override // com.amazon.alexa.voice.tta.features.Feature
        @NotNull
        public Any or(@NotNull Feature other) {
            other.getClass();
            return new Any((List<? extends Feature>) CollectionsKt.plus((Collection<? extends Feature>) this.children, other));
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_PARENTHESIS, CollectionsKt.joinToString$default(this.children, " or ", null, null, null, 62), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Any(@NotNull List<? extends Feature> list) {
            super(null);
            list.getClass();
            this.children = list;
        }
    }
}
