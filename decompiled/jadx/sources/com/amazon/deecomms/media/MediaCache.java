package com.amazon.deecomms.media;

import android.text.TextUtils;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.media.model.MediaFileContent;
import com.amazon.deecomms.media.model.MediaStreamContent;
import com.bumptech.glide.disklrucache.DiskLruCache;
import java.io.File;
import java.io.IOException;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MediaCache implements IMediaCache {
    private static final int CACHE_CONTENT = 1;
    private static final int CACHE_CONTENT_TYPE = 0;
    private static final int CACHE_VALUE_LENGTH = 2;
    private static final int CACHE_VERSION = 1;
    private static final String DEFAULT_REPLACEMENT_CHAR = "_";
    private static final int KEY_MAX_LENGTH = 120;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MediaCache.class);
    private static final String REGEX_PATTERN = "[^\\w\\d_-]";
    private final File directory;
    private DiskLruCache mDiskCache;
    private final long size;

    public MediaCache(File file, long j) {
        this.directory = file;
        this.size = j;
        createDiskCache();
    }

    private void createDiskCache() {
        try {
            this.mDiskCache = DiskLruCache.open(this.directory, 1, 2, this.size);
        } catch (IOException e) {
            this.mDiskCache = null;
            LOG.e("Error occurred while initializing disk cache", e);
        }
    }

    private void ensureUsable() throws IOException {
        if (isInvalid()) {
            createDiskCache();
        }
    }

    private boolean isInvalid() throws IOException {
        DiskLruCache diskLruCache = this.mDiskCache;
        return diskLruCache == null || diskLruCache.isClosed();
    }

    private void put(String str, String str2, Source source, boolean z) throws IOException {
        if (exists(str)) {
            if (!z) {
                LOG.i("Media already in cache");
                return;
            }
            LOG.i("Overwriting content in cache");
        }
        if (str2 == null) {
            LOG.e("Content type is null");
            return;
        }
        ensureUsable();
        String sanitizeKey = sanitizeKey(str);
        CommsLogger commsLogger = LOG;
        commsLogger.d("Putting in cache, filteredKey: " + commsLogger.sensitive(sanitizeKey));
        DiskLruCache.Editor editor = null;
        try {
            editor = this.mDiskCache.edit(sanitizeKey);
            if (editor == null) {
                commsLogger.e("Editor is null for the key: " + str);
                if (editor != null) {
                    return;
                } else {
                    return;
                }
            }
            BufferedSink buffer = Okio.buffer(Okio.sink(editor.getFile(0)));
            try {
                buffer.writeUtf8(str2).writeByte(10);
                commsLogger.d("Setting media type to: " + commsLogger.sensitive(str2));
                buffer.close();
                buffer = Okio.buffer(Okio.sink(editor.getFile(1)));
                try {
                    try {
                        buffer.writeAll(source);
                        if (source != null) {
                            source.close();
                        }
                        buffer.close();
                        editor.commit();
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            if (editor != null) {
                editor.abort();
            }
        }
    }

    private String sanitizeKey(String str) {
        CommsLogger commsLogger = LOG;
        commsLogger.d("Before sanitizing, key: " + commsLogger.sensitive(str));
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Key cannot be of size 0");
            return null;
        }
        String replaceAll = str.replaceAll(REGEX_PATTERN, "_");
        String substring = replaceAll.toLowerCase().substring(0, Math.min(replaceAll.length(), 120));
        commsLogger.d("After sanitizing, result: " + commsLogger.sensitive(substring));
        return substring;
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public void clearAll() throws IOException {
        this.mDiskCache.delete();
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public boolean exists(String str) throws IOException {
        if (isInvalid()) {
            return false;
        }
        String sanitizeKey = sanitizeKey(str);
        CommsLogger commsLogger = LOG;
        commsLogger.d("In MediaCache exists, key: " + commsLogger.sensitive(sanitizeKey));
        return this.mDiskCache.get(sanitizeKey) != null;
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public MediaFileContent get(String str) throws IOException {
        if (isInvalid()) {
            return null;
        }
        String sanitizeKey = sanitizeKey(str);
        CommsLogger commsLogger = LOG;
        commsLogger.i("In MediaCache get, key: " + commsLogger.sensitive(sanitizeKey));
        DiskLruCache.Value value = this.mDiskCache.get(sanitizeKey);
        if (value == null) {
            commsLogger.i("Snapshot is null for key: ");
            return null;
        }
        MediaFileContent mediaFileContent = new MediaFileContent();
        mediaFileContent.setMediaId(str);
        BufferedSource buffer = Okio.buffer(Okio.source(value.getFile(0)));
        try {
            mediaFileContent.setContentType(buffer.readUtf8Line());
            commsLogger.i("MediaType is: " + commsLogger.sensitive(mediaFileContent.getContentType()));
            buffer.close();
            mediaFileContent.setFile(value.getFile(1));
            return mediaFileContent;
        } catch (Throwable th) {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public File getDirectory() {
        return this.mDiskCache.getDirectory();
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public boolean remove(String str) throws IOException {
        if (isInvalid()) {
            return false;
        }
        String sanitizeKey = sanitizeKey(str);
        CommsLogger commsLogger = LOG;
        commsLogger.d("In MediaCache remove, key: " + commsLogger.sensitive(sanitizeKey));
        return !exists(str) || this.mDiskCache.remove(sanitizeKey);
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public void put(String str, MediaFileContent mediaFileContent, boolean z) throws IOException {
        put(str, mediaFileContent.getContentType(), Okio.source(mediaFileContent.getFile()), z);
    }

    @Override // com.amazon.deecomms.media.IMediaCache
    public void put(String str, MediaStreamContent mediaStreamContent, boolean z) throws IOException {
        put(str, mediaStreamContent.getContentType(), Okio.source(mediaStreamContent.getInputStream()), z);
    }
}
