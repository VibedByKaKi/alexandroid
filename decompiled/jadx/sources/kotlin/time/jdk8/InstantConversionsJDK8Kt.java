package kotlin.time.jdk8;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toJavaInstant", "Ljava/time/Instant;", "Lkotlin/time/Instant;", "toKotlinInstant", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.time", xi = 48)
@JvmName(name = "InstantConversionsJDK8Kt")
/* loaded from: classes10.dex */
public final class InstantConversionsJDK8Kt {
    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @NotNull
    public static final Instant toJavaInstant(@NotNull kotlin.time.Instant instant) {
        instant.getClass();
        Instant ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
        ofEpochSecond.getClass();
        return ofEpochSecond;
    }

    @SinceKotlin(version = "2.1")
    @ExperimentalTime
    @NotNull
    public static final kotlin.time.Instant toKotlinInstant(@NotNull Instant instant) {
        instant.getClass();
        return kotlin.time.Instant.INSTANCE.fromEpochSeconds(instant.getEpochSecond(), instant.getNano());
    }
}
