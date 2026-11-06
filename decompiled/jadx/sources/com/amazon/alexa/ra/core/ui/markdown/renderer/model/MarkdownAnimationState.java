package com.amazon.alexa.ra.core.ui.markdown.renderer.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.model.AstContentSection;
import com.amazon.alexa.voice.tta.Constants;
import com.amazon.deecomms.common.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005<=>?@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070$0#H\u0000¢\u0006\u0002\b%J\u001d\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020-2\u0006\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0002\b.R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00068@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010/\u001a\u00020-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R,\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002090$\u0012\u0004\u0012\u00020:08X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\f¨\u0006A"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState;", "", "<init>", "()V", "mutableSectionCache", "Ljava/util/LinkedHashMap;", "", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/CachedSection;", "Lkotlin/collections/LinkedHashMap;", "sectionCache", "", "getSectionCache$ui_core_release", "()Ljava/util/Map;", "<set-?>", "cacheRevision", "getCacheRevision$ui_core_release", "()I", "setCacheRevision", "(I)V", "cacheRevision$delegate", "Landroidx/compose/runtime/MutableState;", "", "animatedIndices", "getAnimatedIndices$ui_core_release", "()Ljava/util/Set;", "setAnimatedIndices$ui_core_release", "(Ljava/util/Set;)V", "animatedIndices$delegate", "currentAnimatingIndex", "getCurrentAnimatingIndex$ui_core_release", "()Ljava/lang/Integer;", "setCurrentAnimatingIndex$ui_core_release", "(Ljava/lang/Integer;)V", "currentAnimatingIndex$delegate", "cachedSections", "", "Lkotlin/Pair;", "cachedSections$ui_core_release", "putSection", "", "index", "section", "Lcom/amazon/alexa/ra/core/ui/markdown/parser/model/AstContentSection;", "putSection$ui_core_release", "removeSection", "", "removeSection$ui_core_release", "streamingAnimationCompleteEmitted", "getStreamingAnimationCompleteEmitted$ui_core_release", "()Z", "setStreamingAnimationCompleteEmitted$ui_core_release", "(Z)V", "observedStreaming", "getObservedStreaming$ui_core_release", "setObservedStreaming$ui_core_release", "rendererStates", "", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/BaseRendererState;", "getRendererStates$ui_core_release", "ListRendererState", "TextRendererState", "CharAnimationState", "RendererType", "RendererTypeInfo", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMarkdownAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,185:1\n81#2:186\n107#2,2:187\n81#2:189\n107#2,2:190\n81#2:192\n107#2,2:193\n1#3:195\n126#4:196\n153#4,3:197\n*S KotlinDebug\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState\n*L\n57#1:186\n57#1:187,2\n60#1:189\n60#1:190,2\n61#1:192\n61#1:193,2\n86#1:196\n86#1:197,3\n*E\n"})
/* loaded from: classes18.dex */
public final class MarkdownAnimationState {
    public static final int $stable = 0;
    private boolean observedStreaming;
    private boolean streamingAnimationCompleteEmitted;

    @NotNull
    private final LinkedHashMap<Integer, CachedSection> mutableSectionCache = new LinkedHashMap<>();

    /* renamed from: cacheRevision$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState cacheRevision = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* renamed from: animatedIndices$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animatedIndices = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null);

    /* renamed from: currentAnimatingIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentAnimatingIndex = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final Map<Pair<Integer, RendererType>, BaseRendererState> rendererStates = new LinkedHashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$CharAnimationState;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/BaseRendererState;", "<init>", "()V", "<set-?>", "", "animatedCharCount", "getAnimatedCharCount$ui_core_release", "()I", "setAnimatedCharCount$ui_core_release", "(I)V", "animatedCharCount$delegate", "Landroidx/compose/runtime/MutableState;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nMarkdownAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$CharAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n81#2:186\n107#2,2:187\n*S KotlinDebug\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$CharAnimationState\n*L\n142#1:186\n142#1:187,2\n*E\n"})
    public static final class CharAnimationState implements BaseRendererState {
        public static final int $stable = 0;

        /* renamed from: animatedCharCount$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState animatedCharCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

        /* JADX WARN: Multi-variable type inference failed */
        public final int getAnimatedCharCount$ui_core_release() {
            return ((Number) this.animatedCharCount.getValue()).intValue();
        }

        public final void setAnimatedCharCount$ui_core_release(int i) {
            this.animatedCharCount.setValue(Integer.valueOf(i));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$ListRendererState;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/BaseRendererState;", "<init>", "()V", "<set-?>", "", "", "animatedItemIndices", "getAnimatedItemIndices$ui_core_release", "()Ljava/util/Set;", "setAnimatedItemIndices$ui_core_release", "(Ljava/util/Set;)V", "animatedItemIndices$delegate", "Landroidx/compose/runtime/MutableState;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nMarkdownAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$ListRendererState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n81#2:186\n107#2,2:187\n*S KotlinDebug\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$ListRendererState\n*L\n124#1:186\n124#1:187,2\n*E\n"})
    public static final class ListRendererState implements BaseRendererState {
        public static final int $stable = 0;

        /* renamed from: animatedItemIndices$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState animatedItemIndices = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null);

        @NotNull
        public final Set<Integer> getAnimatedItemIndices$ui_core_release() {
            return (Set) this.animatedItemIndices.getValue();
        }

        public final void setAnimatedItemIndices$ui_core_release(@NotNull Set<Integer> set) {
            set.getClass();
            this.animatedItemIndices.setValue(set);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "", "<init>", "(Ljava/lang/String;I)V", "LIST", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "HEADING", "CODE", "QUOTE", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RendererType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RendererType[] $VALUES;
        public static final RendererType LIST = new RendererType("LIST", 0);
        public static final RendererType TEXT = new RendererType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 1);
        public static final RendererType HEADING = new RendererType("HEADING", 2);
        public static final RendererType CODE = new RendererType("CODE", 3);
        public static final RendererType QUOTE = new RendererType("QUOTE", 4);

        private static final /* synthetic */ RendererType[] $values() {
            return new RendererType[]{LIST, TEXT, HEADING, CODE, QUOTE};
        }

        static {
            RendererType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private RendererType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<RendererType> getEntries() {
            return $ENTRIES;
        }

        public static RendererType valueOf(String str) {
            return (RendererType) Enum.valueOf(RendererType.class, str);
        }

        public static RendererType[] values() {
            return (RendererType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$TextRendererState;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/BaseRendererState;", "<init>", "()V", "<set-?>", "", "previousWordCount", "getPreviousWordCount$ui_core_release", "()I", "setPreviousWordCount$ui_core_release", "(I)V", "previousWordCount$delegate", "Landroidx/compose/runtime/MutableState;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nMarkdownAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$TextRendererState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,185:1\n81#2:186\n107#2,2:187\n*S KotlinDebug\n*F\n+ 1 MarkdownAnimationState.kt\ncom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$TextRendererState\n*L\n133#1:186\n133#1:187,2\n*E\n"})
    public static final class TextRendererState implements BaseRendererState {
        public static final int $stable = 0;

        /* renamed from: previousWordCount$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState previousWordCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

        /* JADX WARN: Multi-variable type inference failed */
        public final int getPreviousWordCount$ui_core_release() {
            return ((Number) this.previousWordCount.getValue()).intValue();
        }

        public final void setPreviousWordCount$ui_core_release(int i) {
            this.previousWordCount.setValue(Integer.valueOf(i));
        }
    }

    private final void setCacheRevision(int i) {
        this.cacheRevision.setValue(Integer.valueOf(i));
    }

    @NotNull
    public final List<Pair<Integer, CachedSection>> cachedSections$ui_core_release() {
        getCacheRevision$ui_core_release();
        LinkedHashMap<Integer, CachedSection> linkedHashMap = this.mutableSectionCache;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry<Integer, CachedSection> entry : linkedHashMap.entrySet()) {
            int intValue = entry.getKey().intValue();
            arrayList.add(TuplesKt.to(Integer.valueOf(intValue), entry.getValue()));
        }
        return arrayList;
    }

    @NotNull
    public final Set<Integer> getAnimatedIndices$ui_core_release() {
        return (Set) this.animatedIndices.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCacheRevision$ui_core_release() {
        return ((Number) this.cacheRevision.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Integer getCurrentAnimatingIndex$ui_core_release() {
        return (Integer) this.currentAnimatingIndex.getValue();
    }

    /* renamed from: getObservedStreaming$ui_core_release, reason: from getter */
    public final boolean getObservedStreaming() {
        return this.observedStreaming;
    }

    @NotNull
    public final Map<Pair<Integer, RendererType>, BaseRendererState> getRendererStates$ui_core_release() {
        return this.rendererStates;
    }

    @NotNull
    public final Map<Integer, CachedSection> getSectionCache$ui_core_release() {
        return this.mutableSectionCache;
    }

    /* renamed from: getStreamingAnimationCompleteEmitted$ui_core_release, reason: from getter */
    public final boolean getStreamingAnimationCompleteEmitted() {
        return this.streamingAnimationCompleteEmitted;
    }

    public final void putSection$ui_core_release(int index, @NotNull AstContentSection section) {
        section.getClass();
        this.mutableSectionCache.put(Integer.valueOf(index), new CachedSection(section));
        setCacheRevision(getCacheRevision$ui_core_release() + 1);
    }

    public final boolean removeSection$ui_core_release(int index) {
        boolean z = this.mutableSectionCache.remove(Integer.valueOf(index)) != null;
        if (z) {
            setCacheRevision(getCacheRevision$ui_core_release() + 1);
        }
        return z;
    }

    public final void setAnimatedIndices$ui_core_release(@NotNull Set<Integer> set) {
        set.getClass();
        this.animatedIndices.setValue(set);
    }

    public final void setCurrentAnimatingIndex$ui_core_release(@Nullable Integer num) {
        this.currentAnimatingIndex.setValue(num);
    }

    public final void setObservedStreaming$ui_core_release(boolean z) {
        this.observedStreaming = z;
    }

    public final void setStreamingAnimationCompleteEmitted$ui_core_release(boolean z) {
        this.streamingAnimationCompleteEmitted = z;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 2)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0005\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/BaseRendererState;", "", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "Heading", Constants.Namespaces.TEXT, "List", "Code", "Quote", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Code;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Heading;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$List;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Quote;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Text;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RendererTypeInfo<T extends BaseRendererState> {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Code;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$CharAnimationState;", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Code extends RendererTypeInfo<CharAnimationState> {
            public static final int $stable = 0;

            @NotNull
            public static final Code INSTANCE = new Code();

            @NotNull
            private static final RendererType type = RendererType.CODE;

            private Code() {
                super(null);
            }

            @Override // com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState.RendererTypeInfo
            @NotNull
            public RendererType getType() {
                return type;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Heading;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$TextRendererState;", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Heading extends RendererTypeInfo<TextRendererState> {
            public static final int $stable = 0;

            @NotNull
            public static final Heading INSTANCE = new Heading();

            @NotNull
            private static final RendererType type = RendererType.HEADING;

            private Heading() {
                super(null);
            }

            @Override // com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState.RendererTypeInfo
            @NotNull
            public RendererType getType() {
                return type;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$List;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$ListRendererState;", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class List extends RendererTypeInfo<ListRendererState> {
            public static final int $stable = 0;

            @NotNull
            public static final List INSTANCE = new List();

            @NotNull
            private static final RendererType type = RendererType.LIST;

            private List() {
                super(null);
            }

            @Override // com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState.RendererTypeInfo
            @NotNull
            public RendererType getType() {
                return type;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Quote;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$CharAnimationState;", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Quote extends RendererTypeInfo<CharAnimationState> {
            public static final int $stable = 0;

            @NotNull
            public static final Quote INSTANCE = new Quote();

            @NotNull
            private static final RendererType type = RendererType.QUOTE;

            private Quote() {
                super(null);
            }

            @Override // com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState.RendererTypeInfo
            @NotNull
            public RendererType getType() {
                return type;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo$Text;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererTypeInfo;", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$TextRendererState;", "<init>", "()V", "type", "Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "getType", "()Lcom/amazon/alexa/ra/core/ui/markdown/renderer/model/MarkdownAnimationState$RendererType;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Text extends RendererTypeInfo<TextRendererState> {
            public static final int $stable = 0;

            @NotNull
            public static final Text INSTANCE = new Text();

            @NotNull
            private static final RendererType type = RendererType.TEXT;

            private Text() {
                super(null);
            }

            @Override // com.amazon.alexa.ra.core.ui.markdown.renderer.model.MarkdownAnimationState.RendererTypeInfo
            @NotNull
            public RendererType getType() {
                return type;
            }
        }

        public /* synthetic */ RendererTypeInfo(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public abstract RendererType getType();

        private RendererTypeInfo() {
        }
    }
}
