package com.amazon.deecomms.common.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Scanner;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class FileUtils {
    private static final String E_FILE_WRITE_ERROR = "E_FILE_WRITE_ERROR";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, FileUtils.class);
    private static final String METRICS_LOG_FILE_PREFIX = "metrics-";
    private static final String METRICS_LOG_FILE_SUFFIX = ".csv";

    private FileUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ensureSafeFile(File file, File file2) throws IOException {
        String canonicalPath = file2.getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        if (canonicalPath2.startsWith(canonicalPath)) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("File ", canonicalPath2, " does not exist in the log directory: ", canonicalPath, "."));
    }

    public static String getMetricsLogFileName() {
        String uTCDateOnly = DateUtil.getUTCDateOnly(new Date());
        StringBuffer stringBuffer = new StringBuffer(METRICS_LOG_FILE_PREFIX);
        stringBuffer.append(uTCDateOnly);
        stringBuffer.append(METRICS_LOG_FILE_SUFFIX);
        return stringBuffer.toString();
    }

    public static JSONObject readJsonFile(@NonNull Context context, int i) {
        try {
            InputStream openRawResource = context.getResources().openRawResource(i);
            if (openRawResource == null) {
                if (openRawResource == null) {
                    return null;
                }
                openRawResource.close();
                return null;
            }
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                String str = new String(bArr, "UTF-8");
                openRawResource.close();
                try {
                    return new JSONObject(str);
                } catch (JSONException unused) {
                    return null;
                }
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static String readTextFile(AssetManager assetManager, String str) throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(assetManager.open(str)).useDelimiter("\\A");
            String next = scanner.hasNext() ? scanner.next() : "";
            scanner.close();
            return next;
        } catch (Throwable th) {
            if (scanner != null) {
                scanner.close();
            }
            throw th;
        }
    }

    public static void writeToFile(@NonNull final String str, final String str2, @NonNull final File file) {
        new AsyncTask<Void, Void, Void>() { // from class: com.amazon.deecomms.common.util.FileUtils.1
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                File file2 = new File(file, str);
                if (!file.exists() && !file.mkdir()) {
                    FileUtils.LOG.e("Error creating directory: '" + file2.getAbsolutePath());
                    return null;
                }
                try {
                    FileUtils.ensureSafeFile(file2, file);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, true));
                        try {
                            bufferedWriter.append((CharSequence) str2);
                            bufferedWriter.newLine();
                            bufferedWriter.close();
                            return null;
                        } finally {
                        }
                    } catch (IOException e) {
                        FileUtils.LOG.e("Error occurred writing data to file '" + file2.getAbsolutePath() + "'", e);
                        return null;
                    }
                } catch (IOException e2) {
                    FileUtils.LOG.e("Error occurred creating file: ", e2);
                    return null;
                }
            }
        }.execute(new Void[0]);
    }

    @Deprecated
    public static JSONObject readJsonFile(AssetManager assetManager, String str) throws IOException, JSONException {
        return new JSONObject(readTextFile(assetManager, str));
    }
}
