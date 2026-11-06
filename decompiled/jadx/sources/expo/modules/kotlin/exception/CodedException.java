package expo.modules.kotlin.exception;

import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.DoNotStrip;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0017\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0001\u0010B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "()V", "providedCode", "getCode", "()Ljava/lang/String;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public class CodedException extends Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String providedCode;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(@NotNull Throwable th) {
        this(th.getLocalizedMessage(), th);
        th.getClass();
    }

    @DoNotStrip
    @NotNull
    public final String getCode() {
        String str = this.providedCode;
        return str == null ? INSTANCE.inferCode(getClass()) : str;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0001¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/CodedException$Companion;", "", "<init>", "()V", "inferCode", "", "clazz", "Ljava/lang/Class;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCodedException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodedException.kt\nexpo/modules/kotlin/exception/CodedException$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @PublishedApi
        @NotNull
        public final String inferCode(@NotNull Class<?> clazz) {
            clazz.getClass();
            String replace = new Regex("(.)([A-Z])").replace(new Regex("(Exception)$").replace(clazz.getSimpleName(), ""), "$1_$2");
            Locale locale = Locale.ROOT;
            locale.getClass();
            String upperCase = replace.toUpperCase(locale);
            upperCase.getClass();
            return a$$ExternalSyntheticOutline0.m("ERR_", upperCase);
        }

        private Companion() {
        }
    }

    public CodedException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CodedException(@NotNull String str, @Nullable String str2, @Nullable Throwable th) {
        this(str2, th);
        str.getClass();
        this.providedCode = str;
    }

    public /* synthetic */ CodedException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public CodedException() {
        this(null, null);
    }
}
