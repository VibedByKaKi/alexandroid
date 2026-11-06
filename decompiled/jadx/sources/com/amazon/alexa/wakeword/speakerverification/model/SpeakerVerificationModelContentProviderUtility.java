package com.amazon.alexa.wakeword.speakerverification.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.davs.ArtifactModel;
import com.amazon.alexa.wakeword.pryon.WakeWordModelContentProvider;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SpeakerVerificationModelContentProviderUtility {
    private static final String LOG_TAG = "SpeakerVerificationModelContentProviderUtility";

    private SpeakerVerificationModelContentProviderUtility() {
    }

    @Nullable
    public static ArtifactModel getArtifactModel(@NonNull Context context, @NonNull ModelType modelType) {
        Uri contentUri = getContentUri(context, modelType);
        ArtifactModel.Builder builder = ArtifactModel.builder();
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(contentUri, "r");
            try {
                if (openFileDescriptor == null) {
                    Log.e(LOG_TAG, String.format("File descriptor from content resolver is null, uri: %s", contentUri));
                    if (openFileDescriptor == null) {
                        return null;
                    }
                    openFileDescriptor.close();
                    return null;
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        builder.setArtifactData(IOUtils.toByteArray(fileInputStream));
                        fileInputStream.close();
                        openFileDescriptor.close();
                        Cursor query = context.getContentResolver().query(contentUri, null, null, null, null);
                        try {
                            if (query == null) {
                                Log.e(LOG_TAG, String.format("Cursor is null for uri: %s", contentUri));
                                if (query != null) {
                                    query.close();
                                }
                                return null;
                            }
                            query.moveToFirst();
                            if (!query.isAfterLast()) {
                                builder.setArtifactDownloadedTime(Long.valueOf(query.getLong(query.getColumnIndex(WakeWordModelContentProvider.KEY_ARTIFACT_DOWNLOADED_TIME))));
                                builder.setEngineCompatibilityId(query.getString(query.getColumnIndex(WakeWordModelContentProvider.KEY_LAST_USED_ENGINE_COMPAT_ID)));
                                builder.setArtifactIdentifier(query.getString(query.getColumnIndex(WakeWordModelContentProvider.KEY_ARTIFACT_IDENTIFIER)));
                                builder.setLocale(query.getString(query.getColumnIndex(WakeWordModelContentProvider.KEY_LAST_USED_LOCALE)));
                            }
                            query.close();
                            return builder.build();
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e(LOG_TAG, "File cannot be read", e, new Object[0]);
                    openFileDescriptor.close();
                    return null;
                }
            } finally {
            }
        } catch (IOException e2) {
            Log.e(LOG_TAG, "File cannot be read", e2, new Object[0]);
            return null;
        }
    }

    @NonNull
    private static Uri getContentUri(@NonNull Context context, @NonNull ModelType modelType) {
        return ErrorUtils$$ExternalSyntheticOutline0.m28m("content").encodedAuthority(context.getString(SpeakerVerificationModelContentProvider.SPEAKER_VERIFICATION_FILE_PROVIDER_AUTHORITY_RES_ID)).appendPath(modelType == ModelType.REGENERATION ? "regeneration" : "classification").build();
    }

    public static boolean updateArtifactModel(Context context, ArtifactModel artifactModel, ModelType modelType) {
        Uri contentUri = getContentUri(context, modelType);
        ContentValues contentValues = new ContentValues();
        contentValues.put(WakeWordModelContentProvider.KEY_ARTIFACT_DOWNLOADED_TIME, artifactModel.getArtifactDownloadedTime());
        contentValues.put(WakeWordModelContentProvider.KEY_LAST_USED_ENGINE_COMPAT_ID, artifactModel.getEngineCompatibilityId());
        contentValues.put(WakeWordModelContentProvider.KEY_ARTIFACT_IDENTIFIER, artifactModel.getArtifactIdentifier());
        contentValues.put(WakeWordModelContentProvider.KEY_LAST_USED_LOCALE, artifactModel.getLocale());
        return context.getContentResolver().update(contentUri, contentValues, null, null) != 0;
    }
}
