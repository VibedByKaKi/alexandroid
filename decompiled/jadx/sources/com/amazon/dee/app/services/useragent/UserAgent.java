package com.amazon.dee.app.services.useragent;

import android.os.Build;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.dee.app.metrics.MetricsConstants;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J \u0010\n\u001a\u00020\b*\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/dee/app/services/useragent/UserAgent;", "", "<init>", "()V", "USER_AGENT_HEADER", "", ModelTransformer.KEY_FIRMWARE_VERSION_NAME, "initialize", "", MetricsConstants.Method.CACHE_GET, "appendEntry", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", "value", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAgent {

    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    @NotNull
    public static final String USER_AGENT_HEADER = "User-Agent";

    @Nullable
    private static volatile String versionName;

    private UserAgent() {
    }

    private final void appendEntry(StringBuilder sb, String str, String str2) {
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        sb.append(str);
        sb.append('=');
        sb.append(str2);
        sb.append(AbstractJsonLexerKt.END_LIST);
    }

    @JvmStatic
    @NotNull
    public static final String get() {
        String str = versionName;
        if (str == null) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PitanguiBridge/");
        sb.append(str);
        sb.append('-');
        UserAgent userAgent = INSTANCE;
        userAgent.appendEntry(sb, "PLATFORM", "Android");
        String str2 = Build.MANUFACTURER;
        if (str2 == null) {
            str2 = "";
        }
        userAgent.appendEntry(sb, "MANUFACTURER", str2);
        String str3 = Build.VERSION.RELEASE;
        if (str3 == null) {
            str3 = "";
        }
        userAgent.appendEntry(sb, "RELEASE", str3);
        String str4 = Build.BRAND;
        if (str4 == null) {
            str4 = "";
        }
        userAgent.appendEntry(sb, "BRAND", str4);
        userAgent.appendEntry(sb, "SDK", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MODEL;
        userAgent.appendEntry(sb, "MODEL", str5 != null ? str5 : "");
        return sb.toString();
    }

    @JvmStatic
    public static final void initialize(@NotNull String versionName2) {
        versionName2.getClass();
        versionName = versionName2;
    }
}
