package kotlin;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\b\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0007\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0007\"!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u00028F¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"printStackTrace", "", "", "writer", "Ljava/io/PrintWriter;", "stream", "Ljava/io/PrintStream;", "stackTrace", "", "Ljava/lang/StackTraceElement;", "getStackTrace$annotations", "(Ljava/lang/Throwable;)V", "getStackTrace", "(Ljava/lang/Throwable;)[Ljava/lang/StackTraceElement;", "stackTraceToString", "", "addSuppressed", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "suppressedExceptions", "", "getSuppressedExceptions$annotations", "getSuppressedExceptions", "(Ljava/lang/Throwable;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* loaded from: classes10.dex */
public class ExceptionsKt__ExceptionsKt {
    @SinceKotlin(version = "1.1")
    @HidesMembers
    public static void addSuppressed(@NotNull Throwable th, @NotNull Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed(th, th2);
        }
    }

    @NotNull
    public static final StackTraceElement[] getStackTrace(@NotNull Throwable th) {
        th.getClass();
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        return stackTrace;
    }

    @NotNull
    public static List<Throwable> getSuppressedExceptions(@NotNull Throwable th) {
        th.getClass();
        return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed(th);
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th, PrintWriter printWriter) {
        th.getClass();
        printWriter.getClass();
        th.printStackTrace(printWriter);
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static String stackTraceToString(@NotNull Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th) {
        th.getClass();
        th.printStackTrace();
    }

    @InlineOnly
    private static final void printStackTrace(Throwable th, PrintStream printStream) {
        th.getClass();
        printStream.getClass();
        th.printStackTrace(printStream);
    }

    public static /* synthetic */ void getStackTrace$annotations(Throwable th) {
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void getSuppressedExceptions$annotations(Throwable th) {
    }
}
