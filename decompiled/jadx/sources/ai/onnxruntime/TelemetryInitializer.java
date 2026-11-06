package ai.onnxruntime;

import ai.onnxruntime.telemetry.HttpClient;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class TelemetryInitializer extends ContentProvider {
    private static final String TAG = "ORTTelemetry";
    private static HttpClient client;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        try {
            System.loadLibrary("onnxruntime");
            synchronized (TelemetryInitializer.class) {
                try {
                    if (client == null) {
                        client = new HttpClient(context.getApplicationContext());
                    }
                } finally {
                }
            }
            return true;
        } catch (LinkageError | RuntimeException e) {
            Log.w(TAG, "Unable to initialize telemetry", e);
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
