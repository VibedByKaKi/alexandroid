package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import com.facebook.common.util.UriUtil;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    private static final String ANDROID_PACKAGE_NAME = "android";
    private static final int ID_PATH_SEGMENTS = 1;
    private static final int MISSING_RESOURCE_ID = 0;
    private static final int NAME_PATH_SEGMENT_INDEX = 1;
    private static final int NAME_URI_PATH_SEGMENTS = 2;
    private static final int RESOURCE_ID_SEGMENT_INDEX = 0;
    public static final Option<Resources.Theme> THEME = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private static final int TYPE_PATH_SEGMENT_INDEX = 0;
    private final Context context;

    public ResourceDrawableDecoder(Context context) {
        this.context = context.getApplicationContext();
    }

    @NonNull
    private Context findContextForPackage(Uri uri, @NonNull String str) {
        boolean equals = str.equals(this.context.getPackageName());
        Context context = this.context;
        if (equals) {
            return context;
        }
        try {
            return context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.context.getPackageName())) {
                return this.context;
            }
            Single$$ExternalSyntheticBUOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
            return null;
        }
    }

    @DrawableRes
    private int findResourceIdFromResourceIdUri(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            Single$$ExternalSyntheticBUOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unrecognized Uri format: "), e);
            return 0;
        }
    }

    @DrawableRes
    private int findResourceIdFromTypeAndNameResourceUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, ANDROID_PACKAGE_NAME);
        }
        if (identifier != 0) {
            return identifier;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Failed to find resource id for: "));
        return 0;
    }

    @DrawableRes
    private int findResourceIdFromUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return findResourceIdFromTypeAndNameResourceUri(context, uri);
        }
        if (pathSegments.size() == 1) {
            return findResourceIdFromResourceIdUri(uri);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Unrecognized Uri format: "));
        return 0;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Drawable> decode(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m(uri, "Package name for ", " is null or empty"));
            return null;
        }
        Context findContextForPackage = findContextForPackage(uri, authority);
        int findResourceIdFromUri = findResourceIdFromUri(findContextForPackage, uri);
        Resources.Theme theme = ((String) Preconditions.checkNotNull(authority)).equals(this.context.getPackageName()) ? (Resources.Theme) options.get(THEME) : null;
        Context context = this.context;
        return NonOwnedDrawableResource.newInstance(theme == null ? DrawableDecoderCompat.getDrawable(context, findContextForPackage, findResourceIdFromUri) : DrawableDecoderCompat.getDrawable(context, findResourceIdFromUri, theme));
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals(UriUtil.QUALIFIED_RESOURCE_SCHEME);
    }
}
