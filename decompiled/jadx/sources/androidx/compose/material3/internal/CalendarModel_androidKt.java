package androidx.compose.material3.internal;

import android.text.format.DateFormat;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.utils.Constants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0000\u001a8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bH\u0000¨\u0006\r"}, d2 = {"createCalendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "formatWithSkeleton", "", "utcTimeMillis", "", Constants.SKELETON, "cache", "", "", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/internal/CalendarModel_androidKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,67:1\n361#2,7:68\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/internal/CalendarModel_androidKt\n*L\n57#1:68,7\n*E\n"})
/* loaded from: classes13.dex */
public final class CalendarModel_androidKt {
    @NotNull
    public static final CalendarModel createCalendarModel(@NotNull Locale locale) {
        return new CalendarModelImpl(locale);
    }

    @NotNull
    public static final String formatWithSkeleton(long j, @NotNull String str, @NotNull Locale locale, @NotNull Map<String, Object> map) {
        StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m("S:", str);
        m3869m.append(locale.toLanguageTag());
        String sb = m3869m.toString();
        Object obj = map.get(sb);
        if (obj == null) {
            obj = DateFormat.getBestDateTimePattern(locale, str);
            map.put(sb, obj);
        }
        return CalendarModelImpl.INSTANCE.formatWithPattern(j, obj.toString(), locale, map);
    }
}
