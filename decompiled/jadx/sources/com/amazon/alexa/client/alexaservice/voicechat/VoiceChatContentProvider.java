package com.amazon.alexa.client.alexaservice.voicechat;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceChatContentProvider extends ContentProvider {
    private static final int MATCH_VOICE_CHAT_STATE = 1;
    private static final String MIME_TYPE_ITEM = "vnd.android.cursor.item/vnd.com.amazon.alexa.voicechat.state";
    private static final String TAG = "VoiceChatContentProvider";
    private UriMatcher uriMatcher;

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("VoiceChatContentProvider is read-only");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        if (this.uriMatcher.match(uri) == 1) {
            return MIME_TYPE_ITEM;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI: "));
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("VoiceChatContentProvider is read-only");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            Log.e(TAG, "onCreate with null context; provider unavailable");
            return false;
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(VoiceChatContract.getAuthority(context), VoiceChatContract.PATH_VOICE_CHAT_STATE, 1);
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (this.uriMatcher.match(uri) != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unsupported URI: "));
            return null;
        }
        boolean isActive = VoiceChatState.isActive();
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{VoiceChatContract.COLUMN_IS_ACTIVE}, 1);
        matrixCursor.addRow(new Object[]{Integer.valueOf(isActive ? 1 : 0)});
        Context context = getContext();
        if (context != null) {
            matrixCursor.setNotificationUri(context.getContentResolver(), uri);
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("VoiceChatContentProvider is read-only");
    }
}
