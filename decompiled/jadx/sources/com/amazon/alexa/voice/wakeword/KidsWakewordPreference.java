package com.amazon.alexa.voice.wakeword;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class KidsWakewordPreference implements WakewordPreference {
    private static final String COLUMN_WAKE_WORD_SUPPORTED = "wakeWordSupported";
    private static final String TAG = "KidsWakewordPreference";
    private final Context context;
    private final ContentObserver wakeWordObserver;
    private final BehaviorSubject<Boolean> wakewordEnabled = BehaviorSubject.createDefault(Boolean.FALSE);
    private static final String AUTHORITY = "com.amazon.tahoe.child.alexa.WakeWordContentProvider";
    private static final String PATH = "wake-word";
    private static final Uri CONTENT_URI = new Uri.Builder().scheme("content").authority(AUTHORITY).path(PATH).build();

    @Inject
    public KidsWakewordPreference(Context context) {
        ContentObserver contentObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.amazon.alexa.voice.wakeword.KidsWakewordPreference.1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                KidsWakewordPreference.this.wakewordEnabled.onNext(Boolean.valueOf(KidsWakewordPreference.this.isWakeWordSupported()));
            }
        };
        this.wakeWordObserver = contentObserver;
        this.context = context;
        context.getContentResolver().registerContentObserver(CONTENT_URI, false, contentObserver);
        contentObserver.onChange(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isWakeWordSupported() {
        try {
            Cursor query = this.context.getContentResolver().query(CONTENT_URI, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && query.getColumnIndex(COLUMN_WAKE_WORD_SUPPORTED) != -1) {
                        boolean z = query.getInt(query.getColumnIndex(COLUMN_WAKE_WORD_SUPPORTED)) == 1;
                        query.close();
                        return z;
                    }
                } finally {
                }
            }
            Log.e(TAG, "Invalid response from Kids wake word ContentProvider; disabling wake word");
            if (query != null) {
                query.close();
            }
            return false;
        } catch (Exception e) {
            Log.e(TAG, "Exception querying Kids wake word ContentProvider; disabling wake word", e);
            return false;
        }
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public boolean isWakewordEnabled() {
        return this.wakewordEnabled.getValue().booleanValue();
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public Observable<Boolean> onChanged() {
        return this.wakewordEnabled;
    }

    @Override // com.amazon.alexa.voice.wakeword.WakewordPreference
    public void enableWakeword(boolean z) {
    }
}
