package androidx.compose.runtime.tooling;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.comms.calling.foundation.network.recipes.NetworkConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionGroup;", "Landroidx/compose/runtime/tooling/CompositionData;", "key", "", "getKey", "()Ljava/lang/Object;", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "node", "getNode", "data", "", "getData", "()Ljava/lang/Iterable;", "identity", NetworkConstants.NAMES.GET_IDENTITY, "groupSize", "", "getGroupSize", "()I", "slotsSize", "getSlotsSize", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CompositionGroup extends CompositionData {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static CompositionGroup find(@NotNull CompositionGroup compositionGroup, @NotNull Object obj) {
            return CompositionGroup.super.find(obj);
        }

        @Deprecated
        public static int getGroupSize(@NotNull CompositionGroup compositionGroup) {
            return CompositionGroup.super.getGroupSize();
        }

        @Deprecated
        @Nullable
        public static Object getIdentity(@NotNull CompositionGroup compositionGroup) {
            return CompositionGroup.super.getIdentity();
        }

        @Deprecated
        public static int getSlotsSize(@NotNull CompositionGroup compositionGroup) {
            return CompositionGroup.super.getSlotsSize();
        }
    }

    @NotNull
    Iterable<Object> getData();

    default int getGroupSize() {
        return 0;
    }

    @Nullable
    default Object getIdentity() {
        return null;
    }

    @NotNull
    Object getKey();

    @Nullable
    Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    @Nullable
    String getSourceInfo();
}
