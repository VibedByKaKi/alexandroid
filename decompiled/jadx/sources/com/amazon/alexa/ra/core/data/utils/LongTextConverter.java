package com.amazon.alexa.ra.core.data.utils;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.data.model.MediaType;
import com.dee.app.contacts.common.constants.Constants;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\t8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/LongTextConverter;", "", "<init>", "()V", "MAX_TEXT_LENGTH", "", Constants.LOG_TAG, "", "MAX_TEXT_BYTE_SIZE", "", "getMAX_TEXT_BYTE_SIZE$ui_ingress_release$annotations", "convertToFile", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "context", "Landroid/content/Context;", "text", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class LongTextConverter {
    public static final int $stable = 0;

    @NotNull
    public static final LongTextConverter INSTANCE = new LongTextConverter();
    public static final long MAX_TEXT_BYTE_SIZE = 1048576;
    public static final int MAX_TEXT_LENGTH = 900;

    @NotNull
    private static final String TAG = "LongTextConverter";

    private LongTextConverter() {
    }

    @Nullable
    public final LocalMediaInfo convertToFile(@NotNull Context context, @NotNull String text) {
        String str;
        context.getClass();
        text.getClass();
        if (text.length() > 1048576) {
            Log.w(TAG, "Text char length " + text.length() + " exceeds max byte size 1048576, skipping conversion");
            return null;
        }
        String str2 = "pasted-text-" + UUID.randomUUID() + ".txt";
        File file = new File(context.getCacheDir(), str2);
        try {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStream, Charsets.UTF_8);
                    str = text;
                    try {
                        try {
                            outputStreamWriter.write(str);
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStreamWriter, null);
                            CloseableKt.closeFinally(bufferedOutputStream, null);
                            if (file.length() <= 1048576) {
                                return new LocalMediaInfo(Uri.fromFile(file), str2, file.length(), "txt", MediaType.FILE, null, null, null, 224, null);
                            }
                            Log.w(TAG, "Written file size " + file.length() + " exceeds max 1048576, deleting");
                            file.delete();
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedOutputStream, th2);
                                throw th3;
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str = text;
                }
            } catch (IOException e) {
                e = e;
                str = text;
                Log.e(TAG, "Error writing pasted text to cache file, length=" + str.length(), e);
                file.delete();
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e(TAG, "Error writing pasted text to cache file, length=" + str.length(), e);
            file.delete();
            return null;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getMAX_TEXT_BYTE_SIZE$ui_ingress_release$annotations() {
    }
}
