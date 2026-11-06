package com.amazon.alexa.voice.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.LocaleManagerCompat;
import androidx.core.os.LocaleListCompat;
import com.amazon.alexa.api.compat.migration.sdk.PreconditionResult;
import com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition;
import com.amazon.alexa.voice.locale.LocalePreference;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class LocalePrecondition implements SdkPrecondition {
    private static final Locale HELIX_SUPPORTED_LOCALE = Locale.US;
    private static final String TAG = "LocalePrecondition";
    private final Supplier<Locale> deviceLocaleSupplier;
    private final LocalePreference localePreference;
    private final Supplier<Locale> systemLocaleSupplier;

    public LocalePrecondition(@NonNull Context context, @NonNull LocalePreference localePreference) {
        this(localePreference, new LocalePrecondition$$ExternalSyntheticLambda0(), new StreamsKt$$ExternalSyntheticLambda0(context, 2));
    }

    private static boolean isHelixSupported(@Nullable Locale locale) {
        if (locale == null) {
            return false;
        }
        Locale locale2 = HELIX_SUPPORTED_LOCALE;
        return locale2.getLanguage().equals(locale.getLanguage()) && locale2.getCountry().equals(locale.getCountry());
    }

    public static boolean isHelixSupportedPrimary(@Nullable List<Locale> list) {
        return (list == null || list.isEmpty() || !isHelixSupported(list.get(0))) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Locale lambda$new$0() {
        return LocaleListCompat.getDefault().get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Locale lambda$new$1(Context context) {
        return LocaleManagerCompat.getSystemLocales(context).get(0);
    }

    @Nullable
    private Locale resolveRegion(@Nullable Locale locale) {
        Locale locale2;
        return (locale == null || !locale.getCountry().isEmpty() || (locale2 = this.systemLocaleSupplier.get()) == null || locale2.getCountry().isEmpty()) ? locale : new Locale(locale.getLanguage(), locale2.getCountry());
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    public PreconditionResult evaluate() {
        Locale resolveRegion = resolveRegion(this.deviceLocaleSupplier.get());
        List<Locale> fetchCurrentLocale = this.localePreference.fetchCurrentLocale();
        boolean z = false;
        Locale locale = (fetchCurrentLocale == null || fetchCurrentLocale.isEmpty()) ? resolveRegion : fetchCurrentLocale.get(0);
        if (isHelixSupported(resolveRegion) && isHelixSupported(locale)) {
            z = true;
        }
        StringBuilder sb = new StringBuilder("Locale gate: device=");
        sb.append(resolveRegion);
        sb.append(", alexa=");
        sb.append(fetchCurrentLocale);
        sb.append(", satisfied=");
        a$$ExternalSyntheticOutline0.m5m(sb, z, TAG);
        return z ? PreconditionResult.SATISFIED : PreconditionResult.UNSATISFIED;
    }

    @Override // com.amazon.alexa.api.compat.migration.sdk.SdkPrecondition
    public String getFeatureName() {
        return "locale-gate";
    }

    @VisibleForTesting
    public LocalePrecondition(@NonNull LocalePreference localePreference, @NonNull Supplier<Locale> supplier, @NonNull Supplier<Locale> supplier2) {
        this.localePreference = localePreference;
        this.deviceLocaleSupplier = supplier;
        this.systemLocaleSupplier = supplier2;
    }
}
