package com.amazon.clouddrive.cdasdk.cdp;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.clouddrive.cdasdk.ProgressUpdate;
import io.reactivex.rxjava3.subjects.Subject;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface CDPUtil {
    @NonNull
    RequestBody requestBodyFromByteArray(@NonNull MediaType mediaType, @NonNull byte[] bArr);

    @NonNull
    RequestBody requestBodyFromByteArray(@NonNull MediaType mediaType, @NonNull byte[] bArr, @NonNull Subject<ProgressUpdate> subject);

    @NonNull
    RequestBody requestBodyFromContentUri(@NonNull MediaType mediaType, @NonNull Uri uri, long j, @Nullable Subject<ProgressUpdate> subject);

    @NonNull
    RequestBody requestBodyFromFile(@NonNull MediaType mediaType, @NonNull File file);

    @NonNull
    RequestBody requestBodyFromFile(@NonNull MediaType mediaType, @NonNull File file, @NonNull Subject<ProgressUpdate> subject);

    @NonNull
    RequestBody requestBodyFromJson(@NonNull String str);
}
