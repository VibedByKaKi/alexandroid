package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bugsnag.android.JsonStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class FileStore {
    private final Comparator<File> comparator;
    private final Delegate delegate;
    protected final Logger logger;
    private final int maxStoreCount;
    private final File storageDir;
    private final Lock lock = new ReentrantLock();
    private final Collection<File> queuedFiles = new ConcurrentSkipListSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Delegate {
        void onErrorIOFailure(Exception exc, File file, String str);
    }

    public FileStore(@NonNull File file, int i, Comparator<File> comparator, Logger logger, Delegate delegate) {
        this.maxStoreCount = i;
        this.comparator = comparator;
        this.logger = logger;
        this.delegate = delegate;
        this.storageDir = file;
        isStorageDirValid(file);
    }

    private boolean isStorageDirValid(@NonNull File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e) {
            this.logger.e("Could not prepare file storage directory", e);
            return false;
        }
    }

    public void cancelQueuedFiles(Collection<File> collection) {
        this.lock.lock();
        if (collection != null) {
            try {
                this.queuedFiles.removeAll(collection);
            } finally {
                this.lock.unlock();
            }
        }
    }

    public void deleteStoredFiles(Collection<File> collection) {
        this.lock.lock();
        if (collection != null) {
            try {
                this.queuedFiles.removeAll(collection);
                for (File file : collection) {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    public void discardOldestFileIfNeeded() {
        File[] listFiles;
        if (!isStorageDirValid(this.storageDir) || (listFiles = this.storageDir.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
        if (arrayList.size() >= this.maxStoreCount) {
            Collections.sort(arrayList, this.comparator);
            int i = 0;
            while (i < arrayList.size() && arrayList.size() >= this.maxStoreCount) {
                File file = (File) arrayList.get(i);
                if (!this.queuedFiles.contains(file)) {
                    this.logger.w("Discarding oldest error as stored error limit reached: '" + file.getPath() + '\'');
                    deleteStoredFiles(Collections.singleton(file));
                    arrayList.remove(i);
                    i += -1;
                }
                i++;
            }
        }
    }

    public void enqueueContentForDelivery(String str, String str2) {
        Logger logger;
        StringBuilder sb;
        BufferedWriter bufferedWriter;
        if (isStorageDirValid(this.storageDir)) {
            discardOldestFileIfNeeded();
            this.lock.lock();
            String absolutePath = new File(this.storageDir, str2).getAbsolutePath();
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                } catch (Exception e2) {
                    e = e2;
                    logger = this.logger;
                    sb = new StringBuilder("Failed to close unsent payload writer: ");
                    sb.append(str2);
                    logger.w(sb.toString(), e);
                    this.lock.unlock();
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                File file = new File(absolutePath);
                Delegate delegate = this.delegate;
                if (delegate != null) {
                    delegate.onErrorIOFailure(e, file, "NDK Crash report copy");
                }
                IOUtils.deleteFile(file, this.logger);
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e4) {
                        e = e4;
                        logger = this.logger;
                        sb = new StringBuilder("Failed to close unsent payload writer: ");
                        sb.append(str2);
                        logger.w(sb.toString(), e);
                        this.lock.unlock();
                    }
                }
                this.lock.unlock();
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e5) {
                        this.logger.w("Failed to close unsent payload writer: " + str2, e5);
                    }
                }
                this.lock.unlock();
                throw th;
            }
            this.lock.unlock();
        }
    }

    public List<File> findStoredFiles() {
        File[] listFiles;
        this.lock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (isStorageDirValid(this.storageDir) && (listFiles = this.storageDir.listFiles()) != null) {
                for (File file : listFiles) {
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.queuedFiles.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.queuedFiles.addAll(arrayList);
            this.lock.unlock();
            return arrayList;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @NonNull
    public abstract String getFilename(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public String write(@NonNull JsonStream.Streamable streamable) {
        JsonStream jsonStream;
        Closeable closeable = null;
        if (!isStorageDirValid(this.storageDir) || this.maxStoreCount == 0) {
            return null;
        }
        discardOldestFileIfNeeded();
        String absolutePath = new File(this.storageDir, getFilename(streamable)).getAbsolutePath();
        Lock lock = this.lock;
        lock.lock();
        try {
            try {
                jsonStream = new JsonStream(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                try {
                    jsonStream.value(streamable);
                    this.logger.i("Saved unsent payload to disk: '" + absolutePath + '\'');
                    IOUtils.closeQuietly(jsonStream);
                    this.lock.unlock();
                    return absolutePath;
                } catch (FileNotFoundException e) {
                    e = e;
                    this.logger.w("Ignoring FileNotFoundException - unable to create file", e);
                    IOUtils.closeQuietly(jsonStream);
                    this.lock.unlock();
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    File file = new File(absolutePath);
                    Delegate delegate = this.delegate;
                    if (delegate != null) {
                        delegate.onErrorIOFailure(e, file, "Crash report serialization");
                    }
                    IOUtils.deleteFile(file, this.logger);
                    IOUtils.closeQuietly(jsonStream);
                    this.lock.unlock();
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable = lock;
                IOUtils.closeQuietly(closeable);
                this.lock.unlock();
                throw th;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            jsonStream = null;
        } catch (Exception e4) {
            e = e4;
            jsonStream = null;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(closeable);
            this.lock.unlock();
            throw th;
        }
    }
}
