package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery;

import android.util.Log;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.FileManager;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class FileEventStore implements EventStore {
    static final double ERROR_LENGTH_THRESHOLD_PERCENTAGE = 1.1d;
    static final String EVENTS_DIRECTORY = "events";
    static final String EVENT_FILE_NAME = "eventsFile";
    static final String KEY_MAX_STORAGE_SIZE = "maxStorageSize";
    static long MAX_STORAGE_SIZE = 5242880;
    private static final String TAG = "FileEventStore";
    private final ReentrantLock accessLock = new ReentrantLock(true);
    private final AnalyticsContext context;
    private File eventsFile;

    public FileEventStore(AnalyticsContext analyticsContext) {
        this.context = analyticsContext;
        tryCreateEventsFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        if (r14 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00cc, code lost:
    
        if (r14 != null) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.PrintWriter] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.io.PrintWriter] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.File deleteReadEvents(int r17) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.FileEventStore.deleteReadEvents(int):java.io.File");
    }

    public static FileEventStore newInstance(AnalyticsContext analyticsContext) {
        return new FileEventStore(analyticsContext);
    }

    private void tryCloseWriter(Writer writer) throws EventStoreException {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                Log.e(TAG, "Unable to close writer for events file", e);
            }
        }
    }

    private boolean tryCreateEventsFile() {
        File file = this.eventsFile;
        if (file != null && file.exists()) {
            return true;
        }
        synchronized (this) {
            File file2 = this.eventsFile;
            if (file2 != null && file2.exists()) {
                return true;
            }
            try {
                FileManager fileManager = this.context.getSystem().getFileManager();
                this.eventsFile = fileManager.createFile(new File(fileManager.createDirectory("events"), EVENT_FILE_NAME));
                return true;
            } catch (IOException e) {
                Log.e(TAG, "Unable to open events file");
                Log.e(TAG, "An error occurred while attempting to create/open the events file", e);
                return false;
            }
        }
    }

    private BufferedWriter tryInitializeWriter() throws EventStoreException {
        try {
            if (tryCreateEventsFile()) {
                return new BufferedWriter(new OutputStreamWriter(this.context.getSystem().getFileManager().newOutputStream(this.eventsFile, true), StringUtils.UTF8));
            }
            throw new EventStoreException("Unable to create eventsFile");
        } catch (EventStoreException e) {
            throw e;
        } catch (FileNotFoundException e2) {
            Log.e(TAG, "Events file not found to persist event to", e2);
            throw new EventStoreException("Unable to open events file writer", e2);
        } catch (Exception e3) {
            Log.e(TAG, "Unexpected exception", e3);
            throw new EventStoreException("Unexpected error while creating eventsFile writer", e3);
        }
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore
    public EventStore.EventIterator iterator() {
        return new EventStore.EventIterator() { // from class: com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.FileEventStore.1
            int linesRead = 0;
            String nextBuffer = null;
            BufferedReader reader = null;
            boolean isEndOfFile = false;

            private void resetReader() {
                tryCloseReader();
                this.linesRead = 0;
                this.nextBuffer = null;
            }

            private void tryCloseReader() {
                BufferedReader bufferedReader = this.reader;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        Log.e(FileEventStore.TAG, "Unable to close reader for events file", e);
                    } finally {
                        this.reader = null;
                    }
                }
            }

            private boolean tryOpenReader() {
                InputStreamReader inputStreamReader;
                if (this.reader != null) {
                    return true;
                }
                if (this.isEndOfFile) {
                    return false;
                }
                try {
                    inputStreamReader = new InputStreamReader(FileEventStore.this.context.getSystem().getFileManager().newInputStream(FileEventStore.this.eventsFile), StringUtils.UTF8);
                } catch (FileNotFoundException e) {
                    Log.e(FileEventStore.TAG, "Could not open the events file", e);
                    inputStreamReader = null;
                }
                if (inputStreamReader == null) {
                    return false;
                }
                this.reader = new BufferedReader(inputStreamReader);
                return true;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                FileEventStore.this.accessLock.lock();
                try {
                    boolean z = true;
                    if (this.nextBuffer == null) {
                        if (!tryOpenReader()) {
                            return false;
                        }
                        try {
                            this.nextBuffer = this.reader.readLine();
                        } catch (IOException unused) {
                            this.nextBuffer = null;
                        }
                        if (this.nextBuffer == null) {
                            this.isEndOfFile = true;
                            tryCloseReader();
                            z = false;
                        }
                    }
                    return z;
                } finally {
                    FileEventStore.this.accessLock.unlock();
                }
            }

            @Override // java.util.Iterator
            public String next() {
                String str;
                FileEventStore.this.accessLock.lock();
                try {
                    String str2 = this.nextBuffer;
                    if (str2 != null) {
                        this.linesRead++;
                        this.nextBuffer = null;
                    } else {
                        if (!tryOpenReader()) {
                            FileEventStore.this.accessLock.unlock();
                            return null;
                        }
                        boolean z = false;
                        loop0: while (true) {
                            str = null;
                            while (!z) {
                                try {
                                    str = this.reader.readLine();
                                    z = true;
                                } catch (IOException unused) {
                                    z = true;
                                }
                            }
                            break loop0;
                        }
                        if (str != null) {
                            this.linesRead++;
                        } else {
                            this.isEndOfFile = true;
                            tryCloseReader();
                        }
                        str2 = str;
                    }
                    FileEventStore.this.accessLock.unlock();
                    return str2;
                } catch (Throwable th) {
                    FileEventStore.this.accessLock.unlock();
                    throw th;
                }
            }

            @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore.EventIterator
            public String peek() {
                FileEventStore.this.accessLock.lock();
                try {
                    hasNext();
                    return this.nextBuffer;
                } finally {
                    FileEventStore.this.accessLock.unlock();
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("The remove() operation is not supported for this iterator");
            }

            @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore.EventIterator
            public void removeReadEvents() {
                FileEventStore.this.accessLock.lock();
                try {
                    FileEventStore.this.deleteReadEvents(this.linesRead);
                    resetReader();
                } finally {
                    FileEventStore.this.accessLock.unlock();
                }
            }
        };
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.EventStore
    public boolean put(String str) throws EventStoreException {
        this.accessLock.lock();
        boolean z = false;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                bufferedWriter = tryInitializeWriter();
                if (bufferedWriter != null) {
                    if (this.eventsFile.length() + str.length() <= this.context.getConfiguration().optLong(KEY_MAX_STORAGE_SIZE, Long.valueOf(MAX_STORAGE_SIZE)).longValue()) {
                        bufferedWriter.write(str);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                        z = true;
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "Failed to persist the event", e);
            }
            return z;
        } finally {
            tryCloseWriter(bufferedWriter);
            this.accessLock.unlock();
        }
    }
}
