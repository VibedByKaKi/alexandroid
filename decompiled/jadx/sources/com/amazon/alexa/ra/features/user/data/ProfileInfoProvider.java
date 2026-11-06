package com.amazon.alexa.ra.features.user.data;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tJ\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000fJU\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u0016JC\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\tJ\b\u0010\u001f\u001a\u0004\u0018\u00010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/features/user/data/ProfileInfoProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "currentPersonId", "", "contentUri", "Landroid/net/Uri;", "getDisplayName", "pid", "getAllProfiles", "", "getProfileMap", "projection", "", "selection", ElementsRouteKeys.ARGS, "sortOrder", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "getCursor", "Landroid/database/Cursor;", "selectionClause", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getContentUri", "setPersonId", "", "personId", MetricsConstants.OperationalMetrics.GET_PERSON_ID, "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ProfileInfoProvider {

    @NotNull
    private static final String AUTHORITY_SIFFIX = ".alexa.ra";

    @NotNull
    public static final String COL_DISPLAY_NAME = "first_name";

    @NotNull
    public static final String COL_PID = "pid";

    @NotNull
    private static final String PATH = "profileInfo";

    @NotNull
    private static final String TAG = "ProfileInfoProvider";

    @Nullable
    private Uri contentUri;

    @Nullable
    private final Context context;

    @Nullable
    private String currentPersonId;
    public static final int $stable = 8;

    public ProfileInfoProvider(@Nullable Context context) {
        this.context = context;
    }

    private final Uri getContentUri() {
        if (this.contentUri == null) {
            Uri.Builder m28m = ErrorUtils$$ExternalSyntheticOutline0.m28m("content");
            Context context = this.context;
            this.contentUri = m28m.authority((context != null ? context.getPackageName() : null) + ".alexa.ra").path("profileInfo").build();
        }
        Uri uri = this.contentUri;
        uri.getClass();
        return uri;
    }

    private final Cursor getCursor(String[] projection, String selectionClause, String[] args, String sortOrder) {
        Context context = this.context;
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        if (contentResolver != null) {
            return contentResolver.query(getContentUri(), projection, selectionClause, args, sortOrder);
        }
        return null;
    }

    private final Map<String, String> getProfileMap(String[] projection, String selection, String[] args, String sortOrder) {
        Integer valueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursor = getCursor(projection, selection, args, sortOrder);
        try {
            if (cursor != null) {
                try {
                    valueOf = Integer.valueOf(cursor.getCount());
                } catch (Exception e) {
                    Log.e(TAG, "Error while querying display name", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } else {
                valueOf = null;
            }
            if (valueOf != null && valueOf.intValue() != 0) {
                while (cursor.moveToNext()) {
                    int columnIndex = cursor.getColumnIndex("pid");
                    int columnIndex2 = cursor.getColumnIndex("first_name");
                    if (-1 != columnIndex2 && -1 != columnIndex) {
                        linkedHashMap.put(cursor.getString(columnIndex), cursor.getString(columnIndex2));
                    }
                }
            }
            return linkedHashMap;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static /* synthetic */ Map getProfileMap$default(ProfileInfoProvider profileInfoProvider, String[] strArr, String str, String[] strArr2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            strArr2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return profileInfoProvider.getProfileMap(strArr, str, strArr2, str2);
    }

    @NotNull
    public final Map<String, String> getAllProfiles() {
        return getProfileMap$default(this, null, null, null, null, 15, null);
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final String getDisplayName(@NotNull String pid) {
        pid.getClass();
        return getProfileMap(new String[]{"pid", "first_name"}, "pid = ?", new String[]{pid}, null).get(pid);
    }

    @Nullable
    /* renamed from: getPersonId, reason: from getter */
    public final String getCurrentPersonId() {
        return this.currentPersonId;
    }

    public final void setPersonId(@Nullable String personId) {
        this.currentPersonId = personId;
    }
}
