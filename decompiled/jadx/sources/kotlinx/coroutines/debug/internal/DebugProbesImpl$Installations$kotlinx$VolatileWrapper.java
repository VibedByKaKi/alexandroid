package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DebugProbesImpl$Installations$kotlinx$VolatileWrapper {

    @NotNull
    private static final AtomicIntegerFieldUpdater installations$FU = AtomicIntegerFieldUpdater.newUpdater(DebugProbesImpl$Installations$kotlinx$VolatileWrapper.class, "installations");

    @Volatile
    private volatile int installations;

    private DebugProbesImpl$Installations$kotlinx$VolatileWrapper() {
    }

    public /* synthetic */ DebugProbesImpl$Installations$kotlinx$VolatileWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
