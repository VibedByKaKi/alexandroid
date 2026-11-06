package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"asClock", "Lkotlin/time/Clock;", "Lkotlin/time/TimeSource;", "origin", "Lkotlin/time/Instant;", "fromTimeSource", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClocksKt {
    @SinceKotlin(version = "2.2")
    @JvmName(name = "fromTimeSource")
    @NotNull
    @ExperimentalTime
    public static final Clock fromTimeSource(@NotNull final TimeSource timeSource, @NotNull final Instant instant) {
        timeSource.getClass();
        instant.getClass();
        return new Clock(timeSource, instant) { // from class: kotlin.time.ClocksKt$asClock$1
            final /* synthetic */ Instant $origin;
            private final TimeMark startMark;

            {
                this.$origin = instant;
                this.startMark = timeSource.markNow();
            }

            @Override // kotlin.time.Clock
            public Instant now() {
                return this.$origin.m26761plusLRDsOJo(this.startMark.mo26651elapsedNowUwyO8pc());
            }
        };
    }
}
