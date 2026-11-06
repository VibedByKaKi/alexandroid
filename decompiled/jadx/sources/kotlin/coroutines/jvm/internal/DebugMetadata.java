package kotlin.coroutines.jvm.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.JvmName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0015\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0092\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0004\u0012\u000e\b\u0002\u0010\u0004\u001a\u00020\u0005B\u0004\b\b(\u0006\u0012\f\b\u0002\u0010\u0007\u001a\u00020\bB\u0002\b\f\u0012\u0012\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nB\u0002\b\f\u0012\u0012\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nB\u0002\b\f\u0012\f\b\u0002\u0010\f\u001a\u00020\bB\u0002\b\f\u0012\u000e\b\u0002\u0010\r\u001a\u00020\u0005B\u0004\b\b(\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\u00020\u0005B\u0004\b\b(\u0006\u0012\f\b\u0002\u0010\u000f\u001a\u00020\bB\u0002\b\fR\u0011\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0007¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u000f\u001a\u00020\bX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006\u001f"}, d2 = {"Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "version", "", "sourceFile", "", "", "lineNumbers", "", "localNames", "", "spilled", "indexToLabel", "methodName", "className", "nextLineNumbers", "v", "()I", "f", "()Ljava/lang/String;", CmcdData.Factory.STREAM_TYPE_LIVE, "()[I", "n", "()[Ljava/lang/String;", CmcdData.Factory.STREAMING_FORMAT_SS, "i", "m", "c", "nl$annotations", "()V", "nl", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@PublishedApi
/* loaded from: classes10.dex */
public @interface DebugMetadata {
    @JvmName(name = "c")
    String c() default "";

    @JvmName(name = "f")
    String f() default "";

    @JvmName(name = "i")
    int[] i() default {};

    @JvmName(name = CmcdData.Factory.STREAM_TYPE_LIVE)
    int[] l() default {};

    @JvmName(name = "m")
    String m() default "";

    @JvmName(name = "n")
    String[] n() default {};

    @JvmName(name = "nl")
    int[] nl() default {};

    @JvmName(name = CmcdData.Factory.STREAMING_FORMAT_SS)
    String[] s() default {};

    @JvmName(name = "v")
    int v() default 2;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @SinceKotlin(version = "2.2")
        public static /* synthetic */ void nl$annotations() {
        }
    }
}
