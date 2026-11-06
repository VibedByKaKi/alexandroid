package okhttp3;

import androidx.autofill.HintConstants;
import com.amazon.coral.annotation.generator.ModelValidation;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.http.auth.HttpAuthHeader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", ModelValidation.Basic, "", HintConstants.AUTOFILL_HINT_USERNAME, "password", HttpAuthHeader.Parameters.Charset, "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Credentials {

    @NotNull
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String basic(@NotNull String username, @NotNull String password, @NotNull Charset charset) {
        username.getClass();
        password.getClass();
        charset.getClass();
        return a$$ExternalSyntheticOutline0.m("Basic ", ByteString.INSTANCE.encodeString(username + AbstractJsonLexerKt.COLON + password, charset).base64());
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            charset.getClass();
        }
        return basic(str, str2, charset);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String basic(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return basic$default(str, str2, null, 4, null);
    }
}
