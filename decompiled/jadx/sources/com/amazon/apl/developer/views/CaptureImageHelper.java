package com.amazon.apl.developer.views;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.PixelCopy;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.work.impl.Schedulers$$ExternalSyntheticLambda1;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(24)
/* loaded from: classes20.dex */
public class CaptureImageHelper {
    private static final String TAG = "CaptureImageHelper";
    private final Bitmap mUnitBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    @NonNull
    @TargetApi(26)
    private Bitmap captureImage(View view, Activity activity) {
        final CompletableFuture completableFuture = new CompletableFuture();
        final Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        try {
            view.post(new Schedulers$$ExternalSyntheticLambda1(17, activity, new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: com.amazon.apl.developer.views.CaptureImageHelper$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i2) {
                    CaptureImageHelper.this.lambda$captureImage$0(completableFuture, createBitmap, i2);
                }
            }));
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Failed to capture screenshot because: ", e);
        }
        try {
            return (Bitmap) completableFuture.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e(TAG, "Failed to capture screenshot because: ", e2);
            return this.mUnitBitmap;
        }
    }

    @NonNull
    private Bitmap captureImageLegacy(@NonNull View view) {
        CompletableFuture completableFuture = new CompletableFuture();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.post(new Schedulers$$ExternalSyntheticLambda1(18, view, new Canvas(createBitmap), completableFuture, createBitmap));
        try {
            return (Bitmap) completableFuture.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return this.mUnitBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$captureImage$0(CompletableFuture completableFuture, Bitmap bitmap, int i) {
        if (i == 0) {
            completableFuture.complete(bitmap);
        } else {
            completableFuture.complete(this.mUnitBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureImage$1(Activity activity, Rect rect, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener) {
        PixelCopy.request(activity.getWindow(), rect, bitmap, onPixelCopyFinishedListener, new Handler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$captureImageLegacy$2(View view, Canvas canvas, CompletableFuture completableFuture, Bitmap bitmap) {
        view.draw(canvas);
        completableFuture.complete(bitmap);
    }

    @NonNull
    public Bitmap captureImage(View view) {
        if (view.getContext() instanceof Activity) {
            return captureImage(view, (Activity) view.getContext());
        }
        return captureImageLegacy(view);
    }
}
