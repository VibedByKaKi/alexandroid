package com.amazon.alexa.client.alexaservice.base.metrics.client;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class SqliteClientMetricsDao implements ClientMetricsDao {
    private static final String DIALOG_TURN_ID_EQUALS = "dialogTurnId == ?";
    private static final String ID_EQUALS = "eventId IN (%s)";
    private static final String TAG = "SqliteClientMetricsDao";
    private static volatile SqliteClientMetricsDao instance;
    private final ClientMetricDatabase database;

    public SqliteClientMetricsDao(ClientMetricDatabase clientMetricDatabase) {
        this.database = clientMetricDatabase;
    }

    private ContentValues createContentValues(ClientMetricData clientMetricData, MetricType metricType) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", clientMetricData.getEventId());
        contentValues.put("eventName", clientMetricData.getEventName());
        contentValues.put(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_SOURCE_PACKAGE_NAME, clientMetricData.getSourcePackageName());
        contentValues.put(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_CLIENT_PACKAGE_NAME, clientMetricData.getClientPackageName());
        contentValues.put("softwareVersion", clientMetricData.getSoftwareVersion());
        contentValues.put("eventTimestamp", Long.valueOf(clientMetricData.getEventTimestampMs()));
        contentValues.put(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_API_CALL_ID, clientMetricData.getApiCallId());
        contentValues.put(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_EVENT_VALUE, Integer.valueOf(clientMetricData.getEventValue() == null ? 0 : clientMetricData.getEventValue().intValue()));
        if (!isDialogInteraction(metricType)) {
            contentValues.put("latency", clientMetricData.getLatencyMs());
            return contentValues;
        }
        contentValues.put("invocationType", clientMetricData.getInvocationType());
        contentValues.put("dialogTurnId", clientMetricData.getDialogTurnId());
        return contentValues;
    }

    public static SqliteClientMetricsDao getInstance(ClientMetricDatabase clientMetricDatabase) {
        if (instance == null) {
            synchronized (SqliteClientMetricsDao.class) {
                try {
                    if (instance == null) {
                        instance = new SqliteClientMetricsDao(clientMetricDatabase);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private Integer getIntFromCursor(Cursor cursor, String str, Integer num) {
        int intValue = num.intValue();
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
            if (cursor.getType(columnIndexOrThrow) != 0) {
                intValue = cursor.getInt(columnIndexOrThrow);
            }
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Could not find " + str + " column");
        }
        return Integer.valueOf(intValue);
    }

    private Long getLongFromCursor(Cursor cursor, String str, Long l) {
        long longValue = l.longValue();
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
            if (cursor.getType(columnIndexOrThrow) != 0) {
                longValue = cursor.getLong(columnIndexOrThrow);
            }
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Could not find " + str + " column");
        }
        return Long.valueOf(longValue);
    }

    private String getStringFromCursor(Cursor cursor, String str, String str2) {
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
            if (cursor.getType(columnIndexOrThrow) != 0) {
                String string = cursor.getString(columnIndexOrThrow);
                if (string != null) {
                    return string;
                }
            }
            return str2;
        } catch (IllegalArgumentException unused) {
            Log.w(TAG, "Could not find " + str + " column");
            return str2;
        }
    }

    private String getTableForMetrics(MetricType metricType) {
        return MetricType.VOICE_INTERACTION.equals(metricType) ? ClientMetricsContract.ClientMetricsEntry.VOICE_INTERACTION_METRICS_TABLE_NAME : MetricType.TEXT_INTERACTION.equals(metricType) ? ClientMetricsContract.ClientMetricsEntry.TEXT_INTERACTION_METRICS_TABLE_NAME : ClientMetricsContract.ClientMetricsEntry.GENERIC_METRICS_TABLE_NAME;
    }

    private boolean isDialogInteraction(MetricType metricType) {
        return MetricType.VOICE_INTERACTION.equals(metricType) || MetricType.TEXT_INTERACTION.equals(metricType);
    }

    private synchronized List<ClientMetricData> removeDialogClientMetrics(MetricType metricType, DialogTurnIdentifier dialogTurnIdentifier) throws SQLException {
        ArrayList arrayList;
        arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            String str = MetricType.VOICE_INTERACTION.equals(metricType) ? ClientMetricsContract.ClientMetricsEntry.VOICE_INTERACTION_METRICS_TABLE_NAME : ClientMetricsContract.ClientMetricsEntry.TEXT_INTERACTION_METRICS_TABLE_NAME;
            Cursor query = writableDatabase.query(true, str, null, DIALOG_TURN_ID_EQUALS, new String[]{dialogTurnIdentifier.getValue()}, null, null, null, null);
            while (query.moveToNext()) {
                arrayList.add(createClientMetricData(query, metricType));
            }
            query.close();
            writableDatabase.delete(str, DIALOG_TURN_ID_EQUALS, new String[]{dialogTurnIdentifier.getValue()});
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } finally {
        }
        return arrayList;
    }

    private synchronized List<ClientMetricData> removeMetricsFromDatabase(MetricType metricType) throws SQLException {
        ArrayList arrayList;
        String tableForMetrics = getTableForMetrics(metricType);
        arrayList = new ArrayList();
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            Cursor query = writableDatabase.query(true, tableForMetrics, null, null, null, null, null, null, null);
            while (query.moveToNext()) {
                arrayList.add(createClientMetricData(query, metricType));
            }
            query.close();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String[] strArr = {((ClientMetricData) it2.next()).getEventId()};
                Locale locale = Locale.US;
                writableDatabase.delete(tableForMetrics, "eventId IN (?" + MarkdownConstants.RIGHT_PARENTHESIS, strArr);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } finally {
        }
        return arrayList;
    }

    @VisibleForTesting
    public ClientMetricData createClientMetricData(Cursor cursor, MetricType metricType) {
        String str;
        String str2;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("eventName"));
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("eventId"));
        } catch (SQLiteException unused) {
            str = new String(cursor.getBlob(cursor.getColumnIndexOrThrow("eventId")));
        }
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("eventTimestamp"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_SOURCE_PACKAGE_NAME));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_CLIENT_PACKAGE_NAME));
        long j2 = -1;
        String str3 = null;
        if (isDialogInteraction(metricType)) {
            str3 = getStringFromCursor(cursor, "invocationType", null);
            str2 = getStringFromCursor(cursor, "dialogTurnId", null);
        } else {
            j2 = getLongFromCursor(cursor, "latency", -1L).longValue();
            str2 = null;
        }
        return ClientMetricData.builder().setEventName(string).setEventId(str).setEventValue(getIntFromCursor(cursor, ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_EVENT_VALUE, 0)).setEventTimestampMs(j).setSourcePackageName(string2).setClientPackageName(string3).setInvocationType(str3).setDialogTurnId(str2).setSoftwareVersion(getStringFromCursor(cursor, "softwareVersion", "")).setLatencyMs(Long.valueOf(j2)).setApiCallId(getStringFromCursor(cursor, ClientMetricsContract.ClientMetricsEntry.COLUMN_NAME_API_CALL_ID, "")).build();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized List<ClientMetricData> removeAllGenericClientMetrics() throws SQLException {
        return removeMetricsFromDatabase(MetricType.GENERIC);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized List<ClientMetricData> removeAllTextClientMetrics() throws SQLException {
        return removeMetricsFromDatabase(MetricType.TEXT_INTERACTION);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized List<ClientMetricData> removeAllVoiceClientMetrics() throws SQLException {
        return removeMetricsFromDatabase(MetricType.VOICE_INTERACTION);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized List<ClientMetricData> removeTextClientMetrics(DialogTurnIdentifier dialogTurnIdentifier) throws SQLException {
        return removeDialogClientMetrics(MetricType.TEXT_INTERACTION, dialogTurnIdentifier);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized List<ClientMetricData> removeVoiceClientMetrics(DialogTurnIdentifier dialogTurnIdentifier) throws SQLException {
        return removeDialogClientMetrics(MetricType.VOICE_INTERACTION, dialogTurnIdentifier);
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized void storeClientMetricData(ClientMetricData clientMetricData, MetricType metricType) throws SQLException {
        String tableForMetrics = getTableForMetrics(metricType);
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        try {
            writableDatabase.insert(tableForMetrics, null, createContentValues(clientMetricData, metricType));
            writableDatabase.close();
        } finally {
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.base.metrics.client.ClientMetricsDao
    public synchronized void teardown() {
        this.database.close();
    }
}
