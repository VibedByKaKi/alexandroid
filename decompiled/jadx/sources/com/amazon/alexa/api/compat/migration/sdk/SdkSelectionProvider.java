package com.amazon.alexa.api.compat.migration.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016JM\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J1\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0017J;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/SdkSelectionProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", "", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "values", "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkSelectionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkSelectionProvider.kt\ncom/amazon/alexa/api/compat/migration/sdk/SdkSelectionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: classes16.dex */
public final class SdkSelectionProvider extends ContentProvider {

    @NotNull
    private static final String COLUMN_SDK_TYPE = "sdk_type";

    @NotNull
    private static final String KEY_SDK_TYPE = "sdk_type";

    @NotNull
    private static final String PREFS_NAME = "sdk_selection";

    @NotNull
    private static final String TAG = "SdkSelectionProvider";

    @Nullable
    private static volatile SdkType selectedType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Object lock = new Object();

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        uri.getClass();
        throw new UnsupportedOperationException("SdkSelectionProvider is read-only");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues values) {
        uri.getClass();
        throw new UnsupportedOperationException("SdkSelectionProvider is read-only");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @NotNull
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        SdkType sdkType;
        uri.getClass();
        Context context = getContext();
        if (context == null) {
            Log.w(TAG, "Context unavailable in query");
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sdk_type"});
            matrixCursor.addRow(new String[]{SdkType.INSTANCE.getDEFAULT().name()});
            return matrixCursor;
        }
        synchronized (lock) {
            sdkType = selectedType;
        }
        if (sdkType == null) {
            sdkType = INSTANCE.readFromPrefs(context);
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"sdk_type"});
        matrixCursor2.addRow(new String[]{sdkType.name()});
        return matrixCursor2;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        uri.getClass();
        throw new UnsupportedOperationException("SdkSelectionProvider is read-only");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\rJ\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/SdkSelectionProvider$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "PREFS_NAME", "KEY_SDK_TYPE", "COLUMN_SDK_TYPE", JoinPoint.SYNCHRONIZATION_LOCK, "selectedType", "Lcom/amazon/alexa/api/compat/migration/sdk/SdkType;", "write", "", "context", "Landroid/content/Context;", "type", "read", "reset", "readFromPrefs", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSdkSelectionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkSelectionProvider.kt\ncom/amazon/alexa/api/compat/migration/sdk/SdkSelectionProvider$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SdkType readFromPrefs(Context context) {
            try {
                String string = context.getSharedPreferences(SdkSelectionProvider.PREFS_NAME, 0).getString("sdk_type", null);
                return string != null ? SdkType.valueOf(string) : SdkType.INSTANCE.getDEFAULT();
            } catch (Exception e) {
                Log.w(SdkSelectionProvider.TAG, "Failed to read SDK type from SharedPrefs", e);
                return SdkType.INSTANCE.getDEFAULT();
            }
        }

        @NotNull
        public final SdkType read(@NotNull Context context) {
            context.getClass();
            synchronized (SdkSelectionProvider.lock) {
                SdkType sdkType = SdkSelectionProvider.selectedType;
                if (sdkType != null) {
                    return sdkType;
                }
                SdkType readFromPrefs = SdkSelectionProvider.INSTANCE.readFromPrefs(context);
                SdkSelectionProvider.selectedType = readFromPrefs;
                Log.i(SdkSelectionProvider.TAG, "Read SDK type: " + readFromPrefs);
                return readFromPrefs;
            }
        }

        public final void reset() {
            synchronized (SdkSelectionProvider.lock) {
                SdkSelectionProvider.selectedType = null;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void write(@NotNull Context context, @NotNull SdkType type) {
            context.getClass();
            type.getClass();
            synchronized (SdkSelectionProvider.lock) {
                try {
                    try {
                        if (context.getSharedPreferences(SdkSelectionProvider.PREFS_NAME, 0).edit().putString("sdk_type", type.name()).commit()) {
                            SdkSelectionProvider.selectedType = type;
                            Log.i(SdkSelectionProvider.TAG, "Wrote SDK type: " + type);
                        } else {
                            Log.w(SdkSelectionProvider.TAG, "SharedPreferences commit returned false for SDK type: " + type);
                        }
                    } catch (Exception e) {
                        Log.e(SdkSelectionProvider.TAG, "Failed to write SDK type", e);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private Companion() {
        }
    }
}
