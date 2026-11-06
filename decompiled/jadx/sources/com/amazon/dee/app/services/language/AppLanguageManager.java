package com.amazon.dee.app.services.language;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;
import com.amazon.dee.app.dependencies.ApplicationScope;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/dee/app/services/language/AppLanguageManager;", "", "<init>", "()V", "appInitiatedLocaleChange", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumeAppInitiatedLocaleChange", "", "current", "Landroidx/core/os/LocaleListCompat;", "getCurrent", "()Landroidx/core/os/LocaleListCompat;", "currentTag", "", "getCurrentTag", "()Ljava/lang/String;", "apply", "", "tag", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class AppLanguageManager {

    @NotNull
    private final AtomicBoolean appInitiatedLocaleChange = new AtomicBoolean(false);

    @Inject
    public AppLanguageManager() {
    }

    public final void apply(@Nullable String tag) {
        LocaleListCompat emptyLocaleList = (tag == null || tag.length() == 0) ? LocaleListCompat.getEmptyLocaleList() : LocaleListCompat.forLanguageTags(tag);
        emptyLocaleList.getClass();
        if (Intrinsics.areEqual(emptyLocaleList, getCurrent())) {
            return;
        }
        this.appInitiatedLocaleChange.set(true);
        try {
            AppCompatDelegate.setApplicationLocales(emptyLocaleList);
        } catch (RuntimeException e) {
            this.appInitiatedLocaleChange.set(false);
            throw e;
        }
    }

    public final boolean consumeAppInitiatedLocaleChange() {
        return this.appInitiatedLocaleChange.getAndSet(false);
    }

    @NotNull
    public final LocaleListCompat getCurrent() {
        LocaleListCompat applicationLocales = AppCompatDelegate.getApplicationLocales();
        applicationLocales.getClass();
        return applicationLocales;
    }

    @NotNull
    public final String getCurrentTag() {
        String languageTag;
        Locale locale = getCurrent().get(0);
        return (locale == null || (languageTag = locale.toLanguageTag()) == null) ? "" : languageTag;
    }
}
