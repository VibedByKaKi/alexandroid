package com.amazon.alexa.sharing.util;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.sharing.Constants;
import com.amazon.comms.log.CommsLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FileUtil {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, FileUtil.class);

    public BitmapFactory.Options createBitmapOptions() {
        return new BitmapFactory.Options();
    }

    public ExifInterface createExifInterface(String str) throws IOException {
        return new ExifInterface(str);
    }

    public File createFile(String str) {
        return new File(str);
    }

    public FileOutputStream createFileOutputStream(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File createTempFile(String str, String str2, File file) throws IOException {
        return File.createTempFile(str, str2, file);
    }

    public Uri createUriFromFile(File file) {
        return Uri.fromFile(file);
    }

    public Uri createUriFromString(String str) {
        return Uri.parse(str);
    }

    public void decodeFileUsingBitmapFactory(String str, BitmapFactory.Options options) {
        BitmapFactory.decodeFile(str, options);
    }

    public String getFileNameFromUri(Uri uri, Context context) {
        try {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("_display_name"));
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query == null) {
                return "";
            }
            query.close();
            return "";
        } catch (Exception e) {
            LOG.e("getFileNameFromUri failed", e);
            return "";
        }
    }

    public String getPathToNonPrimaryVolume(Context context, String str) {
        String absolutePath;
        int indexOf;
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs == null) {
            return null;
        }
        for (File file : externalCacheDirs) {
            if (file != null && (indexOf = (absolutePath = file.getAbsolutePath()).indexOf(str)) != -1) {
                return absolutePath.substring(0, indexOf) + str;
            }
        }
        return null;
    }

    public File writeToFile(Context context, String str, String str2, InputStream inputStream) {
        String str3 = context.getCacheDir() + "/" + str;
        new File(str3).mkdir();
        File createFile = createFile(createFile(str3), str2.substring(str2.lastIndexOf(47) + 1));
        writeWithFileOutputStream(createFile, inputStream);
        return createFile;
    }

    public void writeWithFileOutputStream(File file, InputStream inputStream) {
        try {
            FileOutputStream createFileOutputStream = createFileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        break;
                    }
                    createFileOutputStream.write(bArr, 0, read);
                    createFileOutputStream.flush();
                }
                if (createFileOutputStream != null) {
                    createFileOutputStream.close();
                }
            } finally {
            }
        } catch (Exception e) {
            LOG.e("writeWithFileOutputStream failed", e);
        }
    }

    public File createFile(File file, String str) {
        return new File(file, str);
    }
}
