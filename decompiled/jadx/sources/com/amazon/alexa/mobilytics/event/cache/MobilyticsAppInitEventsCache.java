package com.amazon.alexa.mobilytics.event.cache;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.mobilytics.MobilyticsConfiguration;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.adapters.EventAdapter;
import com.amazon.alexa.mobilytics.util.Log;
import com.amazon.alexa.mobilytics.util.Utils;
import com.google.common.base.Preconditions;
import com.google.gson.JsonSyntaxException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.inject.Inject;
import org.apache.commons.io.IOUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsAppInitEventsCache implements EventsCache {
    public static final String FILE_NAME = "app-init-events";

    @VisibleForTesting
    protected File cache;

    @VisibleForTesting
    protected OutputStream cacheStream;

    @VisibleForTesting
    protected long count = 0;
    private final EventAdapter eventAdapter;
    private MobilyticsConfiguration mobilyticsConfiguration;
    private static final String TAG = Log.tag((Class<?>) MobilyticsAppInitEventsCache.class);
    public static final String DIRECTORY_PATH = a$$ExternalSyntheticOutline0.m(new StringBuilder("mobilytics"), File.separator, "cache");

    @Inject
    public MobilyticsAppInitEventsCache(@NonNull EventAdapter eventAdapter) {
        this.eventAdapter = (EventAdapter) Preconditions.checkNotNull(eventAdapter);
    }

    private boolean cacheToDisk(String str) {
        try {
        } catch (IOException e) {
            Log.e(TAG, e, "Error writing to cache file", new Object[0]);
        }
        if (this.cache == null || this.cacheStream == null) {
            Log.e(TAG, "Cache not yet initialized");
            return false;
        }
        long j = this.count;
        if (j != 0 && j % 10 == 0 && size() > 20000000) {
            Log.e(TAG, "Cache size greater than 20 MB, dropping new events");
            return false;
        }
        this.cacheStream.write((str + "\n").getBytes(StandardCharsets.UTF_8));
        this.cacheStream.flush();
        return true;
    }

    private void createCache(MobilyticsConfiguration mobilyticsConfiguration) {
        if (mobilyticsConfiguration.context() == null) {
            return;
        }
        try {
            OutputStream outputStream = this.cacheStream;
            if (outputStream != null) {
                outputStream.flush();
                IOUtils.closeQuietly(this.cacheStream);
            }
            File createDirectory = Utils.createDirectory(mobilyticsConfiguration.context(), DIRECTORY_PATH);
            if (createDirectory == null) {
                return;
            }
            initializeCache(createDirectory.getAbsolutePath() + File.separator + FILE_NAME);
        } catch (IOException e) {
            Log.e(TAG, e, "IOException while using cache file", new Object[0]);
        } catch (NullPointerException e2) {
            Log.e(TAG, e2, "NullPointerException while creating the cache", new Object[0]);
        } catch (SecurityException e3) {
            Log.e(TAG, e3, "Do not have access to write to the cache", new Object[0]);
        }
    }

    private void initializeCache(String str) throws IOException {
        File file = new File(str);
        this.cache = file;
        if (file.exists() || this.cache.createNewFile()) {
            if (this.cache.canWrite() || this.cache.setWritable(true, true)) {
                this.cacheStream = new FileOutputStream(this.cache, true);
            }
        }
    }

    @Override // com.amazon.alexa.mobilytics.event.cache.EventsCache
    public boolean clear() {
        File file = this.cache;
        if (file != null) {
            return file.delete();
        }
        return true;
    }

    @Override // com.amazon.alexa.mobilytics.event.cache.EventsCache
    public List<MobilyticsEvent> events() {
        Log.i(TAG, "Reading events from the cache");
        if (this.cache == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Scanner scanner = new Scanner(this.cache);
            while (scanner.hasNextLine()) {
                try {
                    arrayList.add(this.eventAdapter.deserialize(scanner.nextLine()));
                } catch (JsonSyntaxException | IllegalStateException e) {
                    Log.e(TAG, e, "Error while deserializing the data", new Object[0]);
                }
            }
            scanner.close();
            try {
                this.cacheStream.close();
            } catch (IOException e2) {
                Log.e(TAG, e2, "Exception while closing cache stream", new Object[0]);
            }
        } catch (FileNotFoundException e3) {
            Log.e(TAG, e3, "Error reading cached data from file", new Object[0]);
        }
        return arrayList;
    }

    @Override // com.amazon.alexa.mobilytics.event.cache.EventsCache
    public void onInitialize(@NonNull MobilyticsConfiguration mobilyticsConfiguration) {
        this.mobilyticsConfiguration = mobilyticsConfiguration;
        createCache(mobilyticsConfiguration);
    }

    @Override // com.amazon.alexa.mobilytics.event.cache.EventsCache
    public long size() {
        File file = this.cache;
        if (file != null) {
            return file.length();
        }
        return 0L;
    }

    @Override // com.amazon.alexa.mobilytics.event.cache.EventsCache
    public boolean store(@NonNull MobilyticsEvent mobilyticsEvent) {
        mobilyticsEvent.setEventId(UUID.randomUUID().toString());
        mobilyticsEvent.setAppForegrounded(Utils.isAppOnForeground(this.mobilyticsConfiguration.context()));
        mobilyticsEvent.appInitEvent();
        try {
            String serialize = this.eventAdapter.serialize(mobilyticsEvent);
            Log.d(TAG, "Json event while caching %s", serialize);
            if (serialize == null || !cacheToDisk(serialize)) {
                return false;
            }
            this.count++;
            return true;
        } catch (RuntimeException | StackOverflowError e) {
            Log.e(TAG, e, "Error serializing event while caching, dropping it", new Object[0]);
            return false;
        }
    }
}
