package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"toUpperCase", "", "locale", "Landroidx/compose/ui/text/intl/Locale;", "toLowerCase", "capitalize", "decapitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StringKt {

    @NotNull
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    @NotNull
    public static final String capitalize(@NotNull String str, @NotNull LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String decapitalize(@NotNull String str, @NotNull LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String toLowerCase(@NotNull String str, @NotNull LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String toUpperCase(@NotNull String str, @NotNull LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? Locale.INSTANCE.getCurrent() : localeList.get(0));
    }

    @NotNull
    public static final String capitalize(@NotNull String str, @NotNull Locale locale) {
        return stringDelegate.capitalize(str, locale.getPlatformLocale());
    }

    @NotNull
    public static final String decapitalize(@NotNull String str, @NotNull Locale locale) {
        return stringDelegate.decapitalize(str, locale.getPlatformLocale());
    }

    @NotNull
    public static final String toLowerCase(@NotNull String str, @NotNull Locale locale) {
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale());
    }

    @NotNull
    public static final String toUpperCase(@NotNull String str, @NotNull Locale locale) {
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale());
    }
}
