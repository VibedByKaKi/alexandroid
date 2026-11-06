package com.amazon.alexa.accessory.notificationpublisher.batch;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BatchCollector {
    private static final String TAG = "BatchCollector";
    private final Object lock = new Object();
    private final List<JSONObject> queue = new ArrayList();

    public void add(@NonNull JSONObject jSONObject) {
        synchronized (this.lock) {
            this.queue.add(jSONObject);
            Log.i(TAG, "add - uuid: %s, queue size: %d", jSONObject.optString("uuid"), Integer.valueOf(this.queue.size()));
        }
    }

    public void clear() {
        synchronized (this.lock) {
            int size = this.queue.size();
            this.queue.clear();
            Log.i(TAG, "clear - queue cleared, previous size: %d", Integer.valueOf(size));
        }
    }

    @NonNull
    public List<JSONObject> getAndClear() {
        ArrayList arrayList;
        synchronized (this.lock) {
            arrayList = new ArrayList(this.queue);
            int size = this.queue.size();
            this.queue.clear();
            Log.i(TAG, "getAndClear - returned %d entries, queue cleared", Integer.valueOf(size));
        }
        return arrayList;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.lock) {
            isEmpty = this.queue.isEmpty();
        }
        return isEmpty;
    }

    public boolean remove(@NonNull String str) {
        synchronized (this.lock) {
            try {
                Iterator<JSONObject> it2 = this.queue.iterator();
                while (it2.hasNext()) {
                    if (str.equals(it2.next().optString("uuid"))) {
                        it2.remove();
                        Log.i(TAG, "remove - uuid: %s removed, queue size: %d", str, Integer.valueOf(this.queue.size()));
                        return true;
                    }
                }
                Log.i(TAG, "remove - uuid: %s not found, queue size: %d", str, Integer.valueOf(this.queue.size()));
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int size() {
        int size;
        synchronized (this.lock) {
            size = this.queue.size();
        }
        return size;
    }
}
