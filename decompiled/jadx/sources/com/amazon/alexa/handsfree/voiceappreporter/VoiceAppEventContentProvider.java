package com.amazon.alexa.handsfree.voiceappreporter;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.metrics.dependencies.AlexaMobileMetricsComponent;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.protocols.voiceappreporter.VoiceAppEventReporterContract;
import com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper;
import com.amazon.alexa.handsfree.voiceappreporter.receivers.VoiceAppEventReceiver;
import com.amazon.alexa.utils.security.SignatureVerifier;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoiceAppEventContentProvider extends ContentProvider {
    private static final int CRASH_REPORTS_REQUEST_CODE = 100;
    private static final String TAG = "VoiceAppEventContentProvider";
    private static final UriMatcher URI_MATCHER = getUriMatcher();
    private SignatureVerifier mSignatureVerifier;

    @Inject
    VoiceAppEventReporterDatabaseHelper mVoiceAppEventReporterDatabaseHelper;

    @NonNull
    private static UriMatcher getUriMatcher() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(VoiceAppEventReporterContract.CONTENT_AUTHORITY, VoiceAppEventReporterContract.VoiceAppEventsTable.VOICE_APP_EVENT_DIRECTORY, 100);
        return uriMatcher;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        if (this.mSignatureVerifier.verify(getCallingPackage())) {
            if (URI_MATCHER.match(uri) == 100) {
                return VoiceAppEventReporterContract.VoiceAppEventsTable.CONTENT_ITEM_TYPE;
            }
            Log.e(TAG, "Content provider getType() operation called with an invalid URI.");
            return null;
        }
        Log.w(TAG, "Package " + getCallingPackage() + " does not have permissions to write");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        if (!this.mSignatureVerifier.verify(getCallingPackage())) {
            Log.w(TAG, "Package " + getCallingPackage() + " does not have permissions to write");
            return null;
        }
        if (URI_MATCHER.match(uri) != 100) {
            Log.e(TAG, "Content provider insert() operation called with an invalid URI.");
            return null;
        }
        long insertVoiceEvent = this.mVoiceAppEventReporterDatabaseHelper.insertVoiceEvent(contentValues);
        if (insertVoiceEvent <= 0) {
            Log.e(TAG, "Failed to insert Event Report record.");
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(VoiceAppEventReporterContract.VoiceAppEventsTable.CONTENT_URI, insertVoiceEvent);
        getContext().sendBroadcast(new Intent(getContext(), (Class<?>) VoiceAppEventReceiver.class));
        return withAppendedId;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        ((AlexaMobileMetricsComponent) AhfComponentsProvider.getComponent(getContext(), AlexaMobileMetricsComponent.class)).inject(this);
        return onCreate(new SignatureVerifier(getContext()));
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @VisibleForTesting
    public boolean onCreate(@NonNull SignatureVerifier signatureVerifier) {
        this.mSignatureVerifier = signatureVerifier;
        return true;
    }
}
