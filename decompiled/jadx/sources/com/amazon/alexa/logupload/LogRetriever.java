package com.amazon.alexa.logupload;

import android.content.Context;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class LogRetriever {
    private static final int BUFFER_SIZE = 1024;
    private static final String LOG_FILE_PREFIX = "alexa_android_logs";
    private static final String TAG = "LogRetriever";
    private static final int TIMEOUT = 1500;
    private static final String TXT_FILE_SUFFIX = ".txt";
    private static final String ZIP_FILE_SUFFIX = ".zip";
    private Context context;
    private final LogStorageDirectory logStorageDirectory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum LogStorageDirectory {
        EXTERNAL,
        INTERNAL
    }

    public LogRetriever(Context context) {
        this.context = context;
        this.logStorageDirectory = LogStorageDirectory.INTERNAL;
    }

    private void cleanUpIfExists(File file) {
        if (file == null || file.delete()) {
            return;
        }
        Log.e(TAG, "Failed to delete log file " + file.getName());
    }

    private String encodeToBase64(File file) throws IOException {
        try {
            InputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            writeStream(byteArrayOutputStream, fileInputStream);
                            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                            byteArrayOutputStream.close();
                            fileInputStream.close();
                            return encodeToString;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            Log.e(TAG, "Unable to convert file to base64 encoded string", e);
            throw e;
        }
    }

    private File getStorageDirectory() {
        return this.logStorageDirectory == LogStorageDirectory.INTERNAL ? this.context.getFilesDir() : Environment.getExternalStorageDirectory();
    }

    private File writeLogFile() throws IOException, InterruptedException, IllegalThreadStateException {
        File file;
        Process process = null;
        try {
            file = File.createTempFile(LOG_FILE_PREFIX, TXT_FILE_SUFFIX, getStorageDirectory());
        } catch (IOException | IllegalThreadStateException | InterruptedException e) {
            e = e;
            file = null;
        }
        try {
            process = Runtime.getRuntime().exec("logcat -d -f " + file);
            Thread.sleep(1500L);
            if (process.exitValue() == 0) {
                return file;
            }
            throw new IOException("Logcat did not terminate succesfully");
        } catch (IOException | IllegalThreadStateException | InterruptedException e2) {
            e = e2;
            Log.e(TAG, "Unable write to log file using logcat", e);
            if (process != null) {
                process.destroy();
            }
            cleanUpIfExists(file);
            throw e;
        }
    }

    private void writeStream(OutputStream outputStream, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private File zipFile(File file) throws IOException {
        File createTempFile = File.createTempFile(LOG_FILE_PREFIX, ZIP_FILE_SUFFIX, getStorageDirectory());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile.getAbsolutePath());
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                try {
                    FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        writeStream(zipOutputStream, fileInputStream);
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                        zipOutputStream.close();
                        fileOutputStream.close();
                        return createTempFile;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            Log.e(TAG, "Unable to zip log file", e);
            throw e;
        }
    }

    public LogReport getDETReport(String str) throws LogUploadException {
        try {
            return new LogReportDET(str, getLogsAsBase64String());
        } catch (Exception e) {
            throw new LogUploadException("Unable to getDETReport", e);
        }
    }

    public String getLogsAsBase64String() throws IOException, InterruptedException, IllegalThreadStateException {
        File file;
        File file2 = null;
        try {
            File writeLogFile = writeLogFile();
            try {
                file2 = zipFile(writeLogFile);
                String encodeToBase64 = encodeToBase64(file2);
                cleanUpIfExists(writeLogFile);
                cleanUpIfExists(file2);
                return encodeToBase64;
            } catch (Throwable th) {
                th = th;
                file = file2;
                file2 = writeLogFile;
                cleanUpIfExists(file2);
                cleanUpIfExists(file);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
    }

    public LogRetriever() {
        this.logStorageDirectory = LogStorageDirectory.EXTERNAL;
    }
}
