package dagger.spi.shaded.androidx.room.compiler.processing;

import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u001c\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XEquality;", "", "equalityItems", "", "getEqualityItems", "()[Ljava/lang/Object;", "Companion", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XEquality {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    Object[] getEqualityItems();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J/\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00072\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XEquality$Companion;", "", "()V", "equals", "", DefaultPreloadManager.METRIC_PATH_FIRST, "second", "", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "hashCode", "", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "([Ljava/lang/Object;)I", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final boolean equals(@NotNull Object[] first, @NotNull Object[] second) {
            first.getClass();
            second.getClass();
            if (first.length != second.length) {
                return false;
            }
            int length = first.length;
            for (int i = 0; i < length; i++) {
                if (!Intrinsics.areEqual(first[i], second[i])) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode(@NotNull Object[] elements) {
            elements.getClass();
            return Arrays.hashCode(elements);
        }

        public final boolean equals(@Nullable Object first, @Nullable Object second) {
            if ((first instanceof XEquality) && (second instanceof XEquality)) {
                return equals(((XEquality) first).getEqualityItems(), ((XEquality) second).getEqualityItems());
            }
            return false;
        }
    }
}
