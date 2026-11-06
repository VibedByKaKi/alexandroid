package com.amazon.apl.android.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.apl.android.content.ContentRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.utils.FileUtils;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LocalAssetRequestHandler implements ContentRetriever.RequestHandler<String> {
    private final WeakReference<Context> mContextRef;

    public LocalAssetRequestHandler(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    /* renamed from: fetch, reason: avoid collision after fix types in other method */
    public void fetch2(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback<Uri, String> successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        Context context = this.mContextRef.get();
        if (context == null) {
            failureCallback.onFailure(uri, "Context is null, cannot fetch: " + uri);
        }
        try {
            String authority = uri.getAuthority();
            try {
                InputStream open = (TextUtils.isEmpty(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority)).getAssets().open(uri.getPath().substring(1));
                try {
                    successCallback.onSuccess(uri, FileUtils.readString(uri.getPath(), open));
                    if (open != null) {
                        open.close();
                    }
                } catch (Throwable th) {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                failureCallback.onFailure(uri, "Unable to open file: " + uri + ". " + e.getMessage());
            }
        } catch (PackageManager.NameNotFoundException e2) {
            failureCallback.onFailure(uri, "Package name not found for: " + uri + ". " + e2.getMessage());
        }
    }

    @Override // com.amazon.apl.android.content.ContentRetriever.RequestHandler
    @NonNull
    public List<String> supportedSchemes() {
        return Arrays.asList("android_asset", "");
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public /* bridge */ /* synthetic */ void fetch(@NonNull Uri uri, @NonNull IContentRetriever.SuccessCallback successCallback, @NonNull IContentRetriever.FailureCallback<Uri> failureCallback) {
        fetch2(uri, (IContentRetriever.SuccessCallback<Uri, String>) successCallback, failureCallback);
    }
}
