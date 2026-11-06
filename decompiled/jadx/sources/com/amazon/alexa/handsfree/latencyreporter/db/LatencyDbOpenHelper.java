package com.amazon.alexa.handsfree.latencyreporter.db;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class LatencyDbOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "timestamp.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TAG = "LatencyDbOpenHelper";
    private final Context mContext;
    private final Initializer mInitializer;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    @VisibleForTesting
    public LatencyDbOpenHelper(@NonNull Context context, @NonNull Initializer initializer, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.mContext = context;
        this.mInitializer = initializer;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NonNull SQLiteDatabase sQLiteDatabase) {
        String str = TAG;
        Log.d(str, "onCreate: creating database");
        this.mInitializer.initialize(this.mContext);
        MetricsBuilder newBuilder = this.mMetricsBuilderProvider.newBuilder();
        sQLiteDatabase.beginTransaction();
        try {
            try {
                sQLiteDatabase.execSQL(TimestampTable.TABLE_CREATE);
                sQLiteDatabase.setTransactionSuccessful();
                newBuilder.withPercentileMetricSuccess(str, LatencyDbMetricType.DATABASE_CREATION.getValue());
            } catch (SQLException e) {
                String str2 = TAG;
                Log.e(str2, "onCreate: database creation failed!", e, new Object[0]);
                newBuilder.withPercentileMetricFailure(str2, LatencyDbMetricType.DATABASE_CREATION.getValue());
            }
        } finally {
            sQLiteDatabase.endTransaction();
            newBuilder.emit(this.mContext);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NonNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = TAG;
        Log.d(str, "Upgrading database from version " + i + " to " + i2);
        this.mInitializer.initialize(this.mContext);
        if (i2 != i) {
            MetricsBuilder newBuilder = this.mMetricsBuilderProvider.newBuilder();
            sQLiteDatabase.beginTransaction();
            try {
                try {
                    sQLiteDatabase.execSQL(TimestampTable.TABLE_DELETE);
                    sQLiteDatabase.setTransactionSuccessful();
                    newBuilder.withPercentileMetricSuccess(str, LatencyDbMetricType.DATABASE_UPDATE.getValue());
                } catch (SQLException e) {
                    String str2 = TAG;
                    Log.e(str2, "onUpgrade: database deletion failed!", e, new Object[0]);
                    newBuilder.withPercentileMetricFailure(str2, LatencyDbMetricType.DATABASE_UPDATE.getValue());
                }
                onCreate(sQLiteDatabase);
            } finally {
                sQLiteDatabase.endTransaction();
                newBuilder.emit(this.mContext);
            }
        }
    }

    public LatencyDbOpenHelper(@NonNull Context context) {
        this(context, InitializerProvider.getInitializer(), MetricsBuilderProvider.getInstance(context));
    }
}
