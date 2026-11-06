package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ImageAssetManager {
    private static final Object bitmapHashLock = new Object();

    @Nullable
    private final Context context;

    @Nullable
    private ImageAssetDelegate delegate;
    private final Map<String, LottieImageAsset> imageAssets;
    private final String imagesFolder;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        if (TextUtils.isEmpty(str) || AppLaunchChecker$$ExternalSyntheticOutline0.m(1, str) == '/') {
            this.imagesFolder = str;
        } else {
            this.imagesFolder = str.concat("/");
        }
        this.imageAssets = map;
        setDelegate(imageAssetDelegate);
        if (callback instanceof View) {
            this.context = ((View) callback).getContext().getApplicationContext();
        } else {
            this.context = null;
        }
    }

    private Bitmap putBitmap(String str, @Nullable Bitmap bitmap) {
        synchronized (bitmapHashLock) {
            this.imageAssets.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap bitmapForId(String str) {
        LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = this.delegate;
        if (imageAssetDelegate != null) {
            Bitmap fetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (fetchBitmap != null) {
                putBitmap(str, fetchBitmap);
            }
            return fetchBitmap;
        }
        Context context = this.context;
        if (context == null) {
            return null;
        }
        String fileName = lottieImageAsset.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                try {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    if (decodeByteArray != null) {
                        return putBitmap(str, Utils.resizeBitmapIfNeeded(decodeByteArray, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                    }
                    Logger.warning("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e) {
                    Logger.warning("Unable to decode image `" + str + "`.", e);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                Logger.warning("data URL did not have correct base64 format.", e2);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.imagesFolder)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.imagesFolder + fileName), null, options);
                if (decodeStream != null) {
                    return putBitmap(str, Utils.resizeBitmapIfNeeded(decodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                }
                Logger.warning("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e3) {
                Logger.warning("Unable to decode image `" + str + "`.", e3);
                return null;
            }
        } catch (IOException e4) {
            Logger.warning("Unable to open asset.", e4);
            return null;
        }
    }

    @Nullable
    public LottieImageAsset getImageAssetById(String str) {
        return this.imageAssets.get(str);
    }

    public boolean hasSameContext(Context context) {
        Context context2 = this.context;
        if (context == null) {
            return context2 == null;
        }
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.context;
    }

    public void setDelegate(@Nullable ImageAssetDelegate imageAssetDelegate) {
        this.delegate = imageAssetDelegate;
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        Map<String, LottieImageAsset> map = this.imageAssets;
        if (bitmap != null) {
            Bitmap bitmap2 = map.get(str).getBitmap();
            putBitmap(str, bitmap);
            return bitmap2;
        }
        LottieImageAsset lottieImageAsset = map.get(str);
        Bitmap bitmap3 = lottieImageAsset.getBitmap();
        lottieImageAsset.setBitmap(null);
        return bitmap3;
    }
}
