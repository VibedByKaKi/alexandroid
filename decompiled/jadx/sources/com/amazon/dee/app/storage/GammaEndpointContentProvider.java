package com.amazon.dee.app.storage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.dee.app.services.logging.Log;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J9\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013JK\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0018J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/dee/app/storage/GammaEndpointContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "onCreate", "", "insert", "Landroid/net/Uri;", "uri", "values", "Landroid/content/ContentValues;", "update", "", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "Companion", "storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GammaEndpointContentProvider extends ContentProvider {

    @NotNull
    private static final String AUTHORITY = "com.amazon.dee.app.beta.storage.GammaEndpointContentProvider";

    @NotNull
    private static final String COLUMN_KEY = "key";

    @NotNull
    private static final String COLUMN_VALUE = "value";

    @JvmField
    @NotNull
    public static final Uri CONTENT_URI;

    @NotNull
    public static final String GAMMA_ENDPOINT_KEY = "GAMMA_ENDPOINT";

    @NotNull
    private static final String PATH_SETTINGS = "gammaEndPointSetting";

    @NotNull
    private static final String PREFS_NAME = "com.amazon.dee.app.storage.GAMMA_ENDPOINT_SHARED_PREF";
    private static final int SETTINGS = 1;

    @NotNull
    private static final UriMatcher uriMatcher;
    private SharedPreferences sharedPreferences;

    @NotNull
    private static final String TAG = Log.tag((Class<?>) GammaEndpointContentProvider.class);

    static {
        Uri parse = Uri.parse("content://com.amazon.dee.app.beta.storage.GammaEndpointContentProvider/gammaEndPointSetting");
        parse.getClass();
        CONTENT_URI = parse;
        UriMatcher uriMatcher2 = new UriMatcher(-1);
        uriMatcher2.addURI(AUTHORITY, PATH_SETTINGS, 1);
        uriMatcher = uriMatcher2;
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        uri.getClass();
        if (uriMatcher.match(uri) != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI for deletion: "));
            return 0;
        }
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        selectionArgs.getClass();
        edit.remove(selectionArgs[0]).apply();
        Log.i(TAG, "GammaEndpointContentProvider::delete " + selectionArgs[0]);
        Context context = getContext();
        context.getClass();
        context.getContentResolver().notifyChange(uri, null);
        return 1;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        uri.getClass();
        if (uriMatcher.match(uri) == 1) {
            return "vnd.android.cursor.item/vnd.com.amazon.dee.app.beta.storage.GammaEndpointContentProvider.gammaEndPointSetting";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI: "));
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        uri.getClass();
        if (uriMatcher.match(uri) != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI for insertion: "));
            return null;
        }
        values.getClass();
        String asString = values.getAsString("key");
        Boolean asBoolean = values.getAsBoolean("value");
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        asBoolean.getClass();
        edit.putBoolean(asString, asBoolean.booleanValue()).apply();
        Log.i(TAG, "GammaEndpointContentProvider::insert key, " + asString);
        Context context = getContext();
        context.getClass();
        context.getContentResolver().notifyChange(uri, null);
        return Uri.withAppendedPath(CONTENT_URI, asString);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        sharedPreferences.getClass();
        this.sharedPreferences = sharedPreferences;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        String str;
        uri.getClass();
        if (uriMatcher.match(uri) != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI for query: "));
            return null;
        }
        String str2 = TAG;
        Log.i(str2, "GammaEndpointContentProvider::query key, GAMMA_ENDPOINT");
        if (selectionArgs == null || selectionArgs.length == 0) {
            str = GAMMA_ENDPOINT_KEY;
        } else {
            str = selectionArgs[0];
            Log.i(str2, "GammaEndpointContentProvider::query updated new key, " + str);
        }
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        boolean z = sharedPreferences.getBoolean(str, false);
        Log.i(str2, "GammaEndpointContentProvider::query value from sharedPreferences for key: " + str + ", value: " + z);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "value"});
        matrixCursor.addRow(new Object[]{str, Boolean.valueOf(z)});
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        uri.getClass();
        if (uriMatcher.match(uri) != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI for update: "));
            return 0;
        }
        values.getClass();
        String asString = values.getAsString("key");
        Boolean asBoolean = values.getAsBoolean("value");
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        asBoolean.getClass();
        edit.putBoolean(asString, asBoolean.booleanValue()).apply();
        Log.i(TAG, "GammaEndpointContentProvider::update key, " + asString);
        Context context = getContext();
        context.getClass();
        context.getContentResolver().notifyChange(uri, null);
        return 1;
    }
}
