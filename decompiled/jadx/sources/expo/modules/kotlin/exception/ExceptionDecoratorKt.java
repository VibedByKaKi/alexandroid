package expo.modules.kotlin.exception;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"exceptionDecorator", ExifInterface.GPS_DIRECTION_TRUE, "decoratorBlock", "Lkotlin/Function1;", "Lexpo/modules/kotlin/exception/CodedException;", "Lkotlin/ParameterName;", "name", "e", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExceptionDecorator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionDecorator.kt\nexpo/modules/kotlin/exception/ExceptionDecoratorKt\n+ 2 CodedException.kt\nexpo/modules/kotlin/exception/CodedExceptionKt\n*L\n1#1,11:1\n11#2,6:12\n*S KotlinDebug\n*F\n+ 1 ExceptionDecorator.kt\nexpo/modules/kotlin/exception/ExceptionDecoratorKt\n*L\n8#1:12,6\n*E\n"})
/* loaded from: classes9.dex */
public final class ExceptionDecoratorKt {
    public static final <T> T exceptionDecorator(@NotNull Function1<? super CodedException, ? extends Throwable> function1, @NotNull Function0<? extends T> function0) throws CodedException {
        Throwable th;
        function1.getClass();
        function0.getClass();
        try {
            return function0.invoke();
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                th = (CodedException) th2;
            } else if (th2 instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th2;
                String code = codedException.getCode();
                code.getClass();
                th = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                th = new UnexpectedException(th2);
            }
            throw function1.invoke(th);
        }
    }
}
