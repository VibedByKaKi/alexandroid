package com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.R;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FalcoProtocolScope
/* loaded from: classes17.dex */
public class EnrollmentStatusManager {
    public static final String COLUMN_ENROLLMENT_STATUS = "enrollment_status";
    public static final String UVR_ENROLLMENT_STATUS_FILE_PATH = "file";
    private static EnrollmentStatusManager sInstance;
    private Set<StatusListener> listeners = new CopyOnWriteArraySet();
    private final String mAuthority;
    private final ContentResolver mContentResolver;
    private final Uri mUri;
    public static final int AUTHORITY_RES_ID = R.string.uvrEnrollmentStatusProviderId;
    private static final String TAG = "EnrollmentStatusManager";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface StatusListener {
        void onStatusChanged(EnrollmentStatus enrollmentStatus);
    }

    @Inject
    @VisibleForTesting
    public EnrollmentStatusManager(@NonNull Context context) {
        this.mContentResolver = context.getApplicationContext().getContentResolver();
        String string = context.getString(AUTHORITY_RES_ID);
        this.mAuthority = string;
        this.mUri = new Uri.Builder().scheme("content").authority(string).path("file").build();
    }

    public static synchronized EnrollmentStatusManager getInstance(@NonNull Context context) {
        EnrollmentStatusManager enrollmentStatusManager;
        synchronized (EnrollmentStatusManager.class) {
            try {
                if (sInstance == null) {
                    sInstance = new EnrollmentStatusManager(context);
                }
                enrollmentStatusManager = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return enrollmentStatusManager;
    }

    public void addStatusListener(StatusListener statusListener) {
        this.listeners.add(statusListener);
    }

    public EnrollmentStatus getEnrollmentStatus() {
        EnrollmentStatus fromValue;
        try {
            Cursor query = this.mContentResolver.query(this.mUri, null, null, null, null);
            try {
                if (query == null) {
                    Log.e(TAG, "Cursor is null when querying enrollment status");
                    fromValue = EnrollmentStatus.SETUP_NOT_SET;
                    if (query == null) {
                        return fromValue;
                    }
                } else if (query.getCount() == 0) {
                    fromValue = EnrollmentStatus.SETUP_NOT_SET;
                } else if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex(COLUMN_ENROLLMENT_STATUS);
                    if (columnIndex < 0) {
                        Log.e(TAG, "Enrollment status column not found in cursor");
                        fromValue = EnrollmentStatus.SETUP_NOT_SET;
                    } else {
                        fromValue = EnrollmentStatus.fromValue(query.getInt(columnIndex));
                    }
                } else {
                    Log.e(TAG, "Failed to move cursor to first position");
                    fromValue = EnrollmentStatus.SETUP_NOT_SET;
                }
                query.close();
                return fromValue;
            } catch (Throwable th) {
                if (query == null) {
                    throw th;
                }
                try {
                    query.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            Log.e(TAG, "Unexpected runtime exception while getting enrollment status: " + e.getMessage());
            return EnrollmentStatus.SETUP_NOT_SET;
        } catch (Exception e2) {
            Log.e(TAG, "Unexpected error while getting enrollment status: " + e2.getMessage());
            return EnrollmentStatus.SETUP_NOT_SET;
        }
    }

    public Uri getUri() {
        return this.mUri;
    }

    public void removeStatusListener(StatusListener statusListener) {
        this.listeners.remove(statusListener);
    }

    public void setEnrollmentStatus(@NonNull EnrollmentStatus enrollmentStatus) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_ENROLLMENT_STATUS, Integer.valueOf(enrollmentStatus.getValue()));
        try {
            this.mContentResolver.update(this.mUri, contentValues, null, null);
        } catch (RuntimeException e) {
            Log.e(TAG, "Exception when updating AHF enrollment state " + e);
        }
        Iterator<StatusListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onStatusChanged(enrollmentStatus);
        }
    }
}
