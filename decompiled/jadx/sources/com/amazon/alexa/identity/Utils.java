package com.amazon.alexa.identity;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class Utils {
    private static final int BUFFER_SIZE = 2048;
    private static final int MAX_TAG_LENGTH = 23;
    public static final String MOBILYTICS_IDENTIFIER = "e71ec482-0a7b-4d7b-8448-56400f4e8bd9";
    public static final String OWNER_IDENTIFIER_KEY = "ownerIdentifier";
    private static final String SHA_256 = "SHA-256";
    public static final String V2_LOG_PREFIX = "IdentityV2 : ";
    private static final String TAG = tag(Utils.class);
    public static final Map<String, Object> CUSTOM_ENTRIES = Collections.singletonMap("ownerIdentifier", "e71ec482-0a7b-4d7b-8448-56400f4e8bd9");

    private Utils() {
    }

    public static long calculateDurationInHours(@NonNull DateTime dateTime, @NonNull DateTime dateTime2) {
        return new Duration(dateTime, dateTime2).getStandardHours();
    }

    public static long calculateDurationInMinutes(@NonNull DateTime dateTime, @NonNull DateTime dateTime2) {
        return new Duration(dateTime, dateTime2).getStandardMinutes();
    }

    public static long calculateDurationInSeconds(@NonNull DateTime dateTime, @NonNull DateTime dateTime2) {
        return new Duration(dateTime, dateTime2).getStandardSeconds();
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static int compareDottedStrings(String str, String str2) {
        String[] split = str.split(ArcusConfig.PATH_SEPARATOR);
        String[] split2 = str2.split(ArcusConfig.PATH_SEPARATOR);
        int i = 0;
        while (true) {
            if (i >= split.length && i >= split2.length) {
                return 0;
            }
            if (i >= split.length || i >= split2.length) {
                if (i < split.length) {
                    if (Integer.parseInt(split[i]) != 0) {
                        return 1;
                    }
                } else if (i < split2.length && Integer.parseInt(split2[i]) != 0) {
                    return -1;
                }
            } else {
                if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                    return -1;
                }
                if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                    return 1;
                }
            }
            i++;
        }
    }

    public static File copyContentStreamToStagingFile(Context context, Uri uri, String str) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                String str2 = context.getCacheDir() + "/staged/";
                File file = new File(str2);
                if (!file.mkdirs()) {
                    Log.e(TAG, safeFormat("Failed to creating staging directory %s", str2));
                }
                File file2 = new File(file, str);
                fileOutputStream = new FileOutputStream(file2);
                try {
                    copyStream(openInputStream, fileOutputStream);
                    if (openInputStream != null) {
                        closeQuietly(openInputStream);
                    }
                    closeQuietly(fileOutputStream);
                    return file2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                        closeQuietly(inputStream);
                    }
                    if (fileOutputStream != null) {
                        closeQuietly(fileOutputStream);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static long copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[2048];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static boolean isBetween(int i, int i2, int i3) {
        return i2 <= i && i <= i3;
    }

    public static boolean isSafeLoggable(String str, int i) {
        return Log.isLoggable(safeTag(str), i);
    }

    public static byte[] md5(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(str.getBytes(StandardCharsets.UTF_8));
    }

    public static ArrayList<String> objectArrayToStringArray(ArrayList<Object> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Object> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof String) {
                    arrayList2.add((String) next);
                }
            }
        }
        return arrayList2;
    }

    public static void publishCookieEvent(@NonNull String str, EventBus eventBus, String str2) {
        publishIdentityEventInternal(str, eventBus, str2, null);
    }

    public static void publishDelegationUpdateEvent(@NonNull String str, @NonNull EventBus eventBus, @NonNull String str2, @NonNull String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", str3);
            publishIdentityEvent(str, eventBus, str2, jSONObject.toString());
        } catch (JSONException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid input supplied.");
        }
    }

    public static void publishIdentityEvent(@NonNull String str, EventBus eventBus, String str2, @Nullable UserIdentity userIdentity) {
        Message.Builder m = Automotive$$ExternalSyntheticOutline0.m(str2);
        if (userIdentity != null) {
            m.setPayload(userIdentity.toString());
        }
        eventBus.publish(m.build());
        StringBuilder sb = new StringBuilder("Identity event ");
        sb.append(str2);
        sb.append(" published by ");
        sb.append(str);
    }

    private static void publishIdentityEventInternal(@NonNull String str, EventBus eventBus, String str2, @Nullable String str3) {
        Message.Builder m = Automotive$$ExternalSyntheticOutline0.m(str2);
        if (str3 != null) {
            m.setPayload(str3);
        }
        eventBus.publish(m.build());
        StringBuilder sb = new StringBuilder("Identity event ");
        sb.append(str2);
        sb.append(" published by ");
        sb.append(str);
    }

    public static String readFromReader(Reader reader) {
        int read;
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[2048];
        do {
            try {
                read = reader.read(cArr, 0, 2048);
                if (read > 0) {
                    sb.append(cArr, 0, read);
                }
            } catch (IOException e) {
                Log.e(TAG, e.getMessage());
            }
        } while (read > 0);
        reader.close();
        return sb.toString();
    }

    public static String safeFormat(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException unused) {
            return "Formatting error";
        }
    }

    public static String safeTag(String str) {
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static String sha256Hex(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static void showToast(final Activity activity, final String str) {
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.amazon.alexa.identity.Utils.1
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(activity, str, 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        });
    }

    public static Integer sum(Integer[] numArr) {
        Integer num = 0;
        for (Integer num2 : numArr) {
            num = TableInfo$$ExternalSyntheticOutline0.m(num.intValue(), num2);
        }
        return num;
    }

    public static String tag(@NonNull Class cls) {
        return safeTag(cls.getSimpleName());
    }

    public static long toLong(@NonNull byte[] bArr, @IntRange(from = 0, to = 8) int i) throws IllegalArgumentException {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Byte array must not be null when converting to long");
            return 0L;
        }
        if (!isBetween(i, 0, 8)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Number of taken bytes must be from 0 to 8when converting to long");
            return 0L;
        }
        long j = 0;
        for (int max = Math.max(bArr.length - i, 0); max < bArr.length; max++) {
            j = (j << 8) | (bArr[max] & 255);
        }
        return j;
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static String tag(@NonNull String str) {
        return safeTag(str);
    }

    public static void publishIdentityEvent(@NonNull String str, EventBus eventBus, String str2, @NonNull String str3) {
        publishIdentityEventInternal(str, eventBus, str2, str3);
    }
}
