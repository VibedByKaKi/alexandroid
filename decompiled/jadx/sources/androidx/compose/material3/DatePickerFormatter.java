package androidx.compose.material3;

import java.util.Locale;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH&¢\u0006\u0002\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/DatePickerFormatter;", "", "formatDate", "", "dateMillis", "", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "forContentDescription", "", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "formatMonthYear", "monthMillis", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DatePickerFormatter {
    static /* synthetic */ String formatDate$default(DatePickerFormatter datePickerFormatter, Long l, Locale locale, boolean z, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: formatDate");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return datePickerFormatter.formatDate(l, locale, z);
    }

    @Nullable
    String formatDate(@Nullable Long dateMillis, @NotNull Locale locale, boolean forContentDescription);

    @Nullable
    String formatMonthYear(@Nullable Long monthMillis, @NotNull Locale locale);
}
