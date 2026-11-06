package com.amazon.alexa.auto.navigation;

import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import com.amazon.alexa.auto.R;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class PreferredNavigationAppContentProviderModule {
    static final String PREFERRED_NAV_APP_CONTENT_URI_MATCHER = "preferred_nav_app_content_uri_matcher";
    private final Context context;

    public PreferredNavigationAppContentProviderModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return this.context;
    }

    @Provides
    @Singleton
    public PackageManager providePackageManager(Context context) {
        return context.getPackageManager();
    }

    @Provides
    @Singleton
    @Named(PREFERRED_NAV_APP_CONTENT_URI_MATCHER)
    public UriMatcher providePreferredNavAppContentUriMatcher() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(this.context.getString(R.string.preferredNavAppContentProviderAuthoritiesId), "/preferredNavApp", 1);
        return uriMatcher;
    }
}
