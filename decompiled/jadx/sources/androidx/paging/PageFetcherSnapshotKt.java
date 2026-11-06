package androidx.paging;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"shouldPrioritizeOver", "", "Landroidx/paging/GenerationalViewportHint;", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "loadType", "Landroidx/paging/LoadType;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes14.dex */
public final class PageFetcherSnapshotKt {
    public static final boolean shouldPrioritizeOver(@NotNull GenerationalViewportHint generationalViewportHint, @NotNull GenerationalViewportHint generationalViewportHint2, @NotNull LoadType loadType) {
        generationalViewportHint.getClass();
        generationalViewportHint2.getClass();
        loadType.getClass();
        if (generationalViewportHint.getGenerationId() > generationalViewportHint2.getGenerationId()) {
            return true;
        }
        if (generationalViewportHint.getGenerationId() < generationalViewportHint2.getGenerationId()) {
            return false;
        }
        return HintHandlerKt.shouldPrioritizeOver(generationalViewportHint.getHint(), generationalViewportHint2.getHint(), loadType);
    }
}
