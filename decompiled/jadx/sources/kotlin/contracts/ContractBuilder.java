package kotlin.contracts;

import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SinceKotlin(version = "1.3")
@ContractsDsl
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\u0005\u001a\u00020\u0006H'J&\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH'J\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0006H§\u0004J!\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\t*\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH§\u0004¨\u0006\u0013"}, d2 = {"Lkotlin/contracts/ContractBuilder;", "", "returns", "Lkotlin/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/contracts/ReturnsNotNull;", "callsInPlace", "Lkotlin/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lkotlin/contracts/InvocationKind;", "implies", "", "", "holdsIn", "Lkotlin/contracts/HoldsIn;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalContracts
/* loaded from: classes10.dex */
public interface ContractBuilder {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ CallsInPlace callsInPlace$default(ContractBuilder contractBuilder, Function function, InvocationKind invocationKind, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: callsInPlace");
                return null;
            }
            if ((i & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return contractBuilder.callsInPlace(function, invocationKind);
        }
    }

    @ContractsDsl
    @NotNull
    <R> CallsInPlace callsInPlace(@NotNull Function<? extends R> lambda, @NotNull InvocationKind kind);

    @ExperimentalExtendedContracts
    @ContractsDsl
    @NotNull
    <R> HoldsIn holdsIn(boolean z, @NotNull Function<? extends R> function);

    @ExperimentalExtendedContracts
    @ContractsDsl
    void implies(boolean z, @NotNull ReturnsNotNull returnsNotNull);

    @ContractsDsl
    @NotNull
    Returns returns();

    @ContractsDsl
    @NotNull
    Returns returns(@Nullable Object value);

    @ContractsDsl
    @NotNull
    ReturnsNotNull returnsNotNull();
}
