package com.amazon.apl.android.content;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.apl.android.content.ContentRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.utils.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LocalContentRequestHandler<T> implements ContentRetriever.RequestHandler<T> {
    private final ContentResolver mContentResolver;

    public LocalContentRequestHandler(ContentResolver contentResolver) {
        this.mContentResolver = contentResolver;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, T> successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        try {
            InputStream openInputStream = this.mContentResolver.openInputStream(uri);
            try {
                successCallback.onSuccess(uri, getResponse(openInputStream, uri));
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } finally {
            }
        } catch (IOException e) {
            failureCallback.onFailure(uri, e.getMessage());
        }
    }

    public <T> T getResponse(InputStream inputStream, Uri uri) throws IOException {
        return (T) FileUtils.readString(uri.getPath(), inputStream);
    }

    @Override // com.amazon.apl.android.content.ContentRetriever.RequestHandler
    @NonNull
    public List<String> supportedSchemes() {
        return Arrays.asList("content", "file");
    }
}
