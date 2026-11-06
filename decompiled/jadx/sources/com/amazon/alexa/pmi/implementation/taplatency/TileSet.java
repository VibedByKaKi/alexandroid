package com.amazon.alexa.pmi.implementation.taplatency;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0086\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0012J\u001a\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0012J\u0013\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;", "", "words", "", "columns", "", "<init>", "([JI)V", "getColumns", "()I", "isEmpty", "", "()Z", "contains", "tile", "forEach", "", "action", "Lkotlin/Function1;", "highestTile", "getHighestTile", "all", "predicate", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrameChangeDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TileSet\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n12490#2,2:132\n*S KotlinDebug\n*F\n+ 1 FrameChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TileSet\n*L\n77#1:132,2\n*E\n"})
/* loaded from: classes18.dex */
public final class TileSet {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TileSet NONE = new TileSet(new long[0], 0);
    private final int columns;

    @NotNull
    private final long[] words;

    public TileSet(@NotNull long[] jArr, int i) {
        jArr.getClass();
        this.words = jArr;
        this.columns = i;
    }

    public final boolean all(@NotNull Function1<? super Integer, Boolean> predicate) {
        predicate.getClass();
        int length = this.words.length;
        for (int i = 0; i < length; i++) {
            for (long j = this.words[i]; j != 0; j &= j - 1) {
                if (!predicate.invoke(Integer.valueOf(Long.numberOfTrailingZeros(j) + (i * 64))).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean contains(int tile) {
        if (tile < 0) {
            return false;
        }
        int i = tile / 64;
        long[] jArr = this.words;
        if (i < jArr.length) {
            return ((1 << tile) & jArr[i]) != 0;
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof TileSet)) {
            return false;
        }
        TileSet tileSet = (TileSet) other;
        return this.columns == tileSet.columns && Arrays.equals(this.words, tileSet.words);
    }

    public final void forEach(@NotNull Function1<? super Integer, Unit> action) {
        action.getClass();
        int length = this.words.length;
        for (int i = 0; i < length; i++) {
            for (long j = this.words[i]; j != 0; j &= j - 1) {
                action.invoke(Integer.valueOf(Long.numberOfTrailingZeros(j) + (i * 64)));
            }
        }
    }

    public final int getColumns() {
        return this.columns;
    }

    public final int getHighestTile() {
        int length = this.words.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                long j = this.words[length];
                if (j != 0) {
                    return ((length * 64) + 63) - Long.numberOfLeadingZeros(j);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public int hashCode() {
        return Arrays.hashCode(this.words) + (this.columns * 31);
    }

    public final boolean isEmpty() {
        for (long j : this.words) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00020\f\"\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet$Companion;", "", "<init>", "()V", "NONE", "Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;", "getNONE", "()Lcom/amazon/alexa/pmi/implementation/taplatency/TileSet;", "of", "columns", "", "tiles", "", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFrameChangeDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TileSet$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n13493#2,2:132\n*S KotlinDebug\n*F\n+ 1 FrameChangeDetector.kt\ncom/amazon/alexa/pmi/implementation/taplatency/TileSet$Companion\n*L\n123#1:132,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TileSet getNONE() {
            return TileSet.NONE;
        }

        @NotNull
        public final TileSet of(int columns, @NotNull int... tiles) {
            tiles.getClass();
            Integer maxOrNull = ArraysKt.maxOrNull(tiles);
            long[] jArr = new long[((maxOrNull != null ? maxOrNull.intValue() : -1) / 64) + 1];
            for (int i : tiles) {
                int i2 = i / 64;
                jArr[i2] = jArr[i2] | (1 << i);
            }
            return new TileSet(jArr, columns);
        }

        private Companion() {
        }
    }
}
