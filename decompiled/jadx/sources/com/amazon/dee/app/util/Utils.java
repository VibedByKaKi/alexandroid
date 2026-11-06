package com.amazon.dee.app.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Toast;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.dee.app.contacts.common.constants.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0005H\u0007J4\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00050$j\b\u0012\u0004\u0012\u00020\u0005`%2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010$j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`%H\u0007J \u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0005H\u0007J\u0012\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100H\u0007J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005H\u0007J\u0018\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0007J\u0018\u00106\u001a\u0002072\u0006\u0010)\u001a\u00020*2\u0006\u00108\u001a\u000207H\u0007J\u001a\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0007J\b\u0010=\u001a\u00020;H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/amazon/dee/app/util/Utils;", "", "<init>", "()V", Constants.LOG_TAG, "", "kotlin.jvm.PlatformType", "MAX_TAG_LENGTH", "", "BUFFER_SIZE", "SHA_256", "safeFormat", "format", ElementsRouteKeys.ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "isSafeLoggable", "", "tag", ModelTransformer.KEY_BATTERY_LEVEL, "safeTag", "copyStream", "", "input", "Ljava/io/InputStream;", ContactsModuleConstants.OUTPUT, "Ljava/io/OutputStream;", "readFromReader", "reader", "Ljava/io/Reader;", "showToast", "", "activity", "Landroid/app/Activity;", "toastMessage", "objectArrayToStringArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "objectArray", "copyContentStreamToStagingFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", CamerasRouteParameter.DISPLAY_NAME, "closeQuietly", "closeable", "Ljava/io/Closeable;", "sha256Hex", "text", "compareDottedStrings", "version1", "version2", "convertDPToPixels", "", "valueInDp", "setFinalStatic", "field", "Ljava/lang/reflect/Field;", "value", "getModifiersField", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/amazon/dee/app/util/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,316:1\n1#2:317\n1869#3,2:318\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/amazon/dee/app/util/Utils\n*L\n153#1:318,2\n*E\n"})
/* loaded from: classes5.dex */
public final class Utils {
    private static final int BUFFER_SIZE = 2048;
    public static final int MAX_TAG_LENGTH = 23;

    @NotNull
    private static final String SHA_256 = "SHA-256";

    @NotNull
    public static final Utils INSTANCE = new Utils();
    private static final String TAG = "Utils";

    private Utils() {
    }

    @JvmStatic
    public static final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @JvmStatic
    public static final int compareDottedStrings(@NotNull String version1, @NotNull String version2) {
        List split$default;
        List split$default2;
        version1.getClass();
        version2.getClass();
        split$default = StringsKt__StringsKt.split$default(version1, new String[]{"."}, false, 0, 6, (Object) null);
        split$default2 = StringsKt__StringsKt.split$default(version2, new String[]{"."}, false, 0, 6, (Object) null);
        int i = 0;
        while (true) {
            if (i >= split$default.size() && i >= split$default2.size()) {
                return 0;
            }
            int parseInt = i < split$default.size() ? Integer.parseInt((String) split$default.get(i)) : 0;
            int parseInt2 = i < split$default2.size() ? Integer.parseInt((String) split$default2.get(i)) : 0;
            if (parseInt < parseInt2) {
                return -1;
            }
            if (parseInt > parseInt2) {
                return 1;
            }
            i++;
        }
    }

    @JvmStatic
    public static final float convertDPToPixels(@NotNull Context context, float valueInDp) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return TypedValue.applyDimension(1, valueInDp, displayMetrics);
    }

    @JvmStatic
    @NotNull
    public static final File copyContentStreamToStagingFile(@NotNull Context context, @NotNull Uri uri, @NotNull String displayName) throws IOException {
        FileOutputStream fileOutputStream;
        File file;
        context.getClass();
        uri.getClass();
        displayName.getClass();
        InputStream inputStream = null;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new IOException("Failed to open input stream for " + uri);
            }
            try {
                String str = context.getCacheDir() + "/staged/";
                File file2 = new File(str);
                if (!file2.mkdirs()) {
                    Log.e(TAG, "Failed to creating staging directory ".concat(str));
                }
                file = new File(file2, displayName);
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
            try {
                copyStream(openInputStream, fileOutputStream);
                closeQuietly(openInputStream);
                closeQuietly(fileOutputStream);
                return file;
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                closeQuietly(inputStream);
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    @JvmStatic
    public static final long copyStream(@NotNull InputStream input, @NotNull OutputStream output) throws IOException {
        input.getClass();
        output.getClass();
        byte[] bArr = new byte[2048];
        long j = 0;
        while (true) {
            int read = input.read(bArr);
            if (read == -1) {
                return j;
            }
            output.write(bArr, 0, read);
            j += read;
        }
    }

    @JvmStatic
    @NotNull
    public static final Field getModifiersField() {
        try {
            Field declaredField = Field.class.getDeclaredField("modifiers");
            declaredField.getClass();
            return declaredField;
        } catch (NoSuchFieldException e) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredFields0", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(Field.class, Boolean.FALSE);
                invoke.getClass();
                for (Field field : (Field[]) invoke) {
                    if (Intrinsics.areEqual("modifiers", field.getName())) {
                        return field;
                    }
                }
            } catch (ReflectiveOperationException e2) {
                ExceptionsKt.addSuppressed(e, e2);
            }
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isSafeLoggable(@NotNull String tag, int level) {
        tag.getClass();
        return tag.length() >= 23 ? Log.isLoggable(tag.substring(0, 23), level) : Log.isLoggable(tag, level);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final ArrayList<String> objectArrayToStringArray(@Nullable ArrayList<Object> objectArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (objectArray != null) {
            for (Object obj : objectArray) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @JvmStatic
    @NotNull
    public static final String readFromReader(@NotNull Reader reader) {
        reader.getClass();
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[2048];
        while (true) {
            try {
                int read = reader.read(cArr, 0, 2048);
                if (read <= 0) {
                    break;
                }
                sb.append(cArr, 0, read);
            } catch (IOException e) {
                String str = TAG;
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                Log.e(str, message);
            }
        }
        reader.close();
        return sb.toString();
    }

    @JvmStatic
    @NotNull
    public static final String safeFormat(@NotNull String format, @NotNull Object... args) {
        format.getClass();
        args.getClass();
        if (args.length == 0) {
            return format;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        return String.format(format, Arrays.copyOf(copyOf, copyOf.length));
    }

    @JvmStatic
    @NotNull
    public static final String safeTag(@NotNull String tag) {
        tag.getClass();
        return tag.length() > 23 ? tag.substring(0, 23) : tag;
    }

    @JvmStatic
    public static final void setFinalStatic(@NotNull Field field, @Nullable Object value) {
        field.getClass();
        field.setAccessible(true);
        Field modifiersField = getModifiersField();
        try {
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & (-17));
        } catch (IllegalAccessException unused) {
        }
        try {
            field.set(null, value);
        } catch (IllegalAccessException unused2) {
        }
    }

    @JvmStatic
    @NotNull
    public static final String sha256Hex(@NotNull String text) {
        text.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            digest.getClass();
            return ArraysKt.joinToString$default(digest, "", null, null, 0, new Utils$$ExternalSyntheticLambda0(0), 30);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256Hex$lambda$4(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1));
    }

    @JvmStatic
    public static final void showToast(@Nullable Activity activity, @NotNull String toastMessage) {
        toastMessage.getClass();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Utils$$ExternalSyntheticLambda1(activity, 0, toastMessage));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showToast$lambda$2(Activity activity, String str) {
        Toast makeText = Toast.makeText(activity, str, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }
}
