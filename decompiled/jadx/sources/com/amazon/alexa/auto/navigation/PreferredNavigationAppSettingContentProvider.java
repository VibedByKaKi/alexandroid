package com.amazon.alexa.auto.navigation;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.auto.storage.StorageModule;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor;
import dagger.Component;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class PreferredNavigationAppSettingContentProvider extends ContentProvider {
    static final int CODE_PREFERRED_NAV_APP = 1;
    private static final String TAG = "PreferredNavigationAppSettingContentProvider";
    static final String URI_MATCH_PATTERN = "/preferredNavApp";

    @Inject
    PreferredNavigationAppSettingManager preferredNavAppManager;

    @Inject
    @Named("preferred_nav_app_content_uri_matcher")
    UriMatcher uriMatcher;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {StorageModule.class, PreferredNavigationAppContentProviderModule.class})
    @Singleton
    public interface Injector {
        void inject(PreferredNavigationAppSettingContentProvider preferredNavigationAppSettingContentProvider);
    }

    private Cursor createCursor(String str, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{str}, 1);
        matrixCursor.newRow().add(str2);
        return matrixCursor;
    }

    private void injectDependencies() {
        DaggerPreferredNavigationAppSettingContentProvider_Injector.builder().preferredNavigationAppContentProviderModule(new PreferredNavigationAppContentProviderModule(getContext())).build().inject(this);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        update(uri, contentValues, null, null);
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        injectDependencies();
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (this.uriMatcher.match(uri) != 1) {
            return null;
        }
        return createCursor(PreferredNavigationAppContentAccessor.PREFERRED_NAVIGATION_APP_PREFERENCE_KEY, this.preferredNavAppManager.getPreferredNavigationApp());
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (this.uriMatcher.match(uri) != 1) {
            return 0;
        }
        if (contentValues == null) {
            Log.e(TAG, "ContentValues is null");
            return 0;
        }
        String asString = contentValues.getAsString(PreferredNavigationAppContentAccessor.PREFERRED_NAVIGATION_APP_PREFERENCE_KEY);
        if (asString == null) {
            Log.e(TAG, "PreferredNavApp is null");
            return 0;
        }
        this.preferredNavAppManager.setPreferredNavigationApp(asString);
        return 1;
    }
}
