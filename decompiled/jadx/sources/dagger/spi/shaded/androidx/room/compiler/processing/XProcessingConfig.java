package dagger.spi.shaded.androidx.room.compiler.processing;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingConfig;", "", "()V", "PROP_PREFIX", "", "STRICT_MODE", "", "getSTRICT_MODE", "()Z", "STRICT_MODE$delegate", "Lkotlin/Lazy;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class XProcessingConfig {

    @NotNull
    private static final String PROP_PREFIX = "dagger.spi.shaded.androidx.room.compiler.processing";

    @NotNull
    public static final XProcessingConfig INSTANCE = new XProcessingConfig();

    /* renamed from: STRICT_MODE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy STRICT_MODE = LazyKt.lazy(new Function0<Boolean>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.XProcessingConfig$STRICT_MODE$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(Boolean.parseBoolean(System.getProperty("dagger.spi.shaded.androidx.room.compiler.processing.strict")));
        }
    });

    private XProcessingConfig() {
    }

    public final boolean getSTRICT_MODE() {
        return ((Boolean) STRICT_MODE.getValue()).booleanValue();
    }
}
