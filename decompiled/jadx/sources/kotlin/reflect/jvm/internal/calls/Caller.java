package kotlin.reflect.jvm.internal.calls;

import com.amazon.dee.app.elements.ElementsRouteKeys;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\u00020\u0003J\u0019\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H&¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/Caller;", "M", "Ljava/lang/reflect/Member;", "", "member", "getMember", "()Ljava/lang/reflect/Member;", "returnType", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "checkArguments", "", ElementsRouteKeys.ARGS, "", "([Ljava/lang/Object;)V", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "isBoundInstanceCallWithValueClasses", "", "()Z", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Caller<M extends Member> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <M extends Member> void checkArguments(@NotNull Caller<? extends M> caller, @NotNull Object[] objArr) {
            objArr.getClass();
            if (CallerKt.getArity(caller) == objArr.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(CallerKt.getArity(caller));
            sb.append(" arguments, but ");
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(sb, objArr.length, " were provided."));
        }

        public static <M extends Member> boolean isBoundInstanceCallWithValueClasses(@NotNull Caller<? extends M> caller) {
            return false;
        }
    }

    @Nullable
    Object call(@NotNull Object[] args);

    /* renamed from: getMember */
    M mo26579getMember();

    @NotNull
    List<Type> getParameterTypes();

    @NotNull
    Type getReturnType();

    boolean isBoundInstanceCallWithValueClasses();
}
