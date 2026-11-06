package com.amazon.alexa.client.alexaservice.base.componentstate;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateContract;
import com.amazon.alexa.client.core.componentstate.ExternalComponentStateEntity;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.PackageName;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SqliteExternalComponentStateDao implements ExternalComponentStateDao {
    private static final String COMMA_SPACE = ",";

    @VisibleForTesting
    static final String MULTIPLE_SELECTION_IN = "%s in (%s)";
    private static final String QUESTION_MARK = "?";
    private static final String TAG = "SqliteExternalComponentStateDao";
    private static final String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String TIME_ZONE = "UTC";
    private final ExternalComponentStateDatabase database;
    private final DateFormat formatter;

    @Inject
    public SqliteExternalComponentStateDao(ExternalComponentStateDatabase externalComponentStateDatabase) {
        this.database = externalComponentStateDatabase;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(TIME_FORMAT, Locale.US);
        this.formatter = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private ExternalComponentStateCachingPreference createExternalComponentStateCachingPreference(Cursor cursor) {
        Date date;
        String string = cursor.getString(cursor.getColumnIndex("namespace"));
        boolean z = cursor.getInt(cursor.getColumnIndex(ExternalComponentStateContract.ExternalComponentStateCachingPreferenceEntry.COLUMN_NAME_IS_CACHING_ENABLED)) != 0;
        try {
            date = this.formatter.parse(cursor.getString(cursor.getColumnIndex(ExternalComponentStateContract.ExternalComponentStateEntry.COLUMN_NAME_DATE_UPDATED)));
        } catch (ParseException e) {
            Log.e(TAG, e.getMessage());
            date = null;
        }
        return ExternalComponentStateCachingPreference.create(Namespace.create(string), z, date);
    }

    private ExternalComponentStateEntity createExternalComponentStateEntity(Cursor cursor) {
        Date date;
        String string = cursor.getString(cursor.getColumnIndex("namespace"));
        String string2 = cursor.getString(cursor.getColumnIndex("name"));
        String string3 = cursor.getString(cursor.getColumnIndex("payload"));
        String string4 = cursor.getString(cursor.getColumnIndex("packageName"));
        int i = cursor.getInt(cursor.getColumnIndex(ExternalComponentStateContract.ExternalComponentStateEntry.COLUMN_NAME_PACKAGE_VERSION_CODE));
        try {
            date = this.formatter.parse(cursor.getString(cursor.getColumnIndex(ExternalComponentStateContract.ExternalComponentStateEntry.COLUMN_NAME_DATE_UPDATED)));
        } catch (ParseException e) {
            Log.e(TAG, e.getMessage());
            date = null;
        }
        return ExternalComponentStateEntity.builder().setNamespace(Namespace.create(string)).setName(Name.create(string2)).setPayload(string3).setPackageName(PackageName.create(string4)).setPackageVersionCode(i).setDateUpdated(date).build();
    }

    private String createMultiSelectionStatement(String str, int i) {
        return TableInfo$$ExternalSyntheticOutline0.m$1(str, " in (", generateQuestionsMark(i), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    private String[] createSelectionArgument(Set<? extends StronglyTypedString> set) {
        String[] strArr = new String[set.size()];
        Iterator<? extends StronglyTypedString> it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = it2.next().getValue();
            i++;
        }
        return strArr;
    }

    private String generateQuestionsMark(int i) {
        StringBuilder sb = new StringBuilder();
        while (i > 0) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append("?");
            i--;
        }
        return sb.toString();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void deleteExternalComponentStateByNamespace(Set<Namespace> set) {
        this.database.getWritableDatabase().delete(ExternalComponentStateContract.ExternalComponentStateEntry.EXTERNAL_COMPONENT_STATE_TABLE_NAME, createMultiSelectionStatement("namespace", set.size()), createSelectionArgument(set));
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void deleteExternalComponentStateByPackageName(Set<PackageName> set) {
        this.database.getWritableDatabase().delete(ExternalComponentStateContract.ExternalComponentStateEntry.EXTERNAL_COMPONENT_STATE_TABLE_NAME, createMultiSelectionStatement("packageName", set.size()), createSelectionArgument(set));
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void deleteExternalComponentStateCachingPreference(Set<Namespace> set) {
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        writableDatabase.beginTransaction();
        writableDatabase.delete(ExternalComponentStateContract.ExternalComponentStateCachingPreferenceEntry.EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE_NAME, createMultiSelectionStatement("namespace", set.size()), createSelectionArgument(set));
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public Set<ExternalComponentStateEntity> getAllExternalComponentState() {
        SQLiteDatabase readableDatabase = this.database.getReadableDatabase();
        HashSet hashSet = new HashSet();
        Cursor query = readableDatabase.query(ExternalComponentStateContract.ExternalComponentStateEntry.EXTERNAL_COMPONENT_STATE_TABLE_NAME, null, null, null, null, null, null);
        query.moveToFirst();
        while (!query.isAfterLast()) {
            hashSet.add(createExternalComponentStateEntity(query));
            query.moveToNext();
        }
        query.close();
        return hashSet;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public Set<ExternalComponentStateEntity> getExternalComponentState(Set<Namespace> set) {
        SQLiteDatabase readableDatabase = this.database.getReadableDatabase();
        HashSet hashSet = new HashSet();
        Cursor query = readableDatabase.query(ExternalComponentStateContract.ExternalComponentStateEntry.EXTERNAL_COMPONENT_STATE_TABLE_NAME, null, createMultiSelectionStatement("namespace", set.size()), createSelectionArgument(set), null, null, null);
        query.moveToFirst();
        while (!query.isAfterLast()) {
            hashSet.add(createExternalComponentStateEntity(query));
            query.moveToNext();
        }
        query.close();
        return hashSet;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public Set<ExternalComponentStateCachingPreference> getExternalComponentStateCachingPreference(Set<Namespace> set) {
        SQLiteDatabase readableDatabase = this.database.getReadableDatabase();
        HashSet hashSet = new HashSet();
        Cursor query = readableDatabase.query(ExternalComponentStateContract.ExternalComponentStateCachingPreferenceEntry.EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE_NAME, null, createMultiSelectionStatement("namespace", set.size()), createSelectionArgument(set), null, null, null);
        query.moveToFirst();
        while (!query.isAfterLast()) {
            hashSet.add(createExternalComponentStateCachingPreference(query));
            query.moveToNext();
        }
        query.close();
        return hashSet;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void putExternalComponentState(Set<ExternalComponentStateEntity> set) {
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        writableDatabase.beginTransaction();
        for (ExternalComponentStateEntity externalComponentStateEntity : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("namespace", externalComponentStateEntity.getNamespace().getValue());
            contentValues.put("name", externalComponentStateEntity.getName().getValue());
            contentValues.put("packageName", externalComponentStateEntity.getPackageName().getValue());
            contentValues.put("payload", externalComponentStateEntity.getPayload());
            contentValues.put(ExternalComponentStateContract.ExternalComponentStateEntry.COLUMN_NAME_PACKAGE_VERSION_CODE, Integer.valueOf(externalComponentStateEntity.getPackageVersionCode()));
            writableDatabase.insertWithOnConflict(ExternalComponentStateContract.ExternalComponentStateEntry.EXTERNAL_COMPONENT_STATE_TABLE_NAME, null, contentValues, 5);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void putExternalComponentStateCachingPreference(Set<ExternalComponentStateCachingPreference> set) {
        SQLiteDatabase writableDatabase = this.database.getWritableDatabase();
        writableDatabase.beginTransaction();
        for (ExternalComponentStateCachingPreference externalComponentStateCachingPreference : set) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("namespace", externalComponentStateCachingPreference.getNamespace().getValue());
            contentValues.put(ExternalComponentStateContract.ExternalComponentStateCachingPreferenceEntry.COLUMN_NAME_IS_CACHING_ENABLED, Boolean.valueOf(externalComponentStateCachingPreference.isCachingEnabled()));
            writableDatabase.insertWithOnConflict(ExternalComponentStateContract.ExternalComponentStateCachingPreferenceEntry.EXTERNAL_COMPONENT_STATE_CACHING_PREFERENCE_TABLE_NAME, null, contentValues, 5);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateDao
    public void teardown() {
        this.database.close();
    }
}
