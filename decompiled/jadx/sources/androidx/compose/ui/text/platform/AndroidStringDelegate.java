package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "<init>", "()V", "toUpperCase", "", TypedValues.Custom.S_STRING, "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "toLowerCase", "capitalize", "decapitalize", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes13.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String capitalize(@NotNull String string, @NotNull Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = string.charAt(0);
        sb.append((Object) (Character.isLowerCase(charAt) ? CharsKt.titlecase(charAt, locale) : String.valueOf(charAt)));
        sb.append(string.substring(1));
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String decapitalize(@NotNull String string, @NotNull Locale locale) {
        if (string.length() <= 0) {
            return string;
        }
        return ((Object) CharsKt.lowercase(string.charAt(0), locale)) + string.substring(1);
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toLowerCase(@NotNull String string, @NotNull Locale locale) {
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toUpperCase(@NotNull String string, @NotNull Locale locale) {
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        return upperCase;
    }
}
