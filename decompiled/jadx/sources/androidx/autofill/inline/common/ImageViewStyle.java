package androidx.autofill.inline.common;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.autofill.inline.common.ViewStyle;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 30)
/* loaded from: classes.dex */
public final class ImageViewStyle extends ViewStyle {
    private static final String KEY_IMAGE_MAX_HEIGHT = "image_max_height";
    private static final String KEY_IMAGE_MAX_WIDTH = "image_max_width";
    private static final String KEY_IMAGE_SCALE_TYPE = "image_scale_type";
    private static final String KEY_IMAGE_TINT_LIST = "image_tint_list";
    private static final String KEY_IMAGE_VIEW_STYLE = "image_view_style";
    private static final String TAG = "ImageViewStyle";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ImageViewStyle(@NonNull Bundle bundle) {
        super(bundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void applyStyleOnImageViewIfValid(@NonNull ImageView imageView) {
        String string;
        ColorStateList colorStateList;
        if (isValid()) {
            super.applyStyleOnViewIfValid(imageView);
            if (this.mBundle.containsKey(KEY_IMAGE_MAX_WIDTH)) {
                imageView.setMaxWidth(this.mBundle.getInt(KEY_IMAGE_MAX_WIDTH));
                imageView.setAdjustViewBounds(true);
            }
            if (this.mBundle.containsKey(KEY_IMAGE_MAX_HEIGHT)) {
                imageView.setMaxHeight(this.mBundle.getInt(KEY_IMAGE_MAX_HEIGHT));
                imageView.setAdjustViewBounds(true);
            }
            if (this.mBundle.containsKey(KEY_IMAGE_TINT_LIST) && (colorStateList = (ColorStateList) this.mBundle.getParcelable(KEY_IMAGE_TINT_LIST)) != null) {
                imageView.setImageTintList(colorStateList);
            }
            if (!this.mBundle.containsKey(KEY_IMAGE_SCALE_TYPE) || (string = this.mBundle.getString(KEY_IMAGE_SCALE_TYPE)) == null) {
                return;
            }
            try {
                imageView.setScaleType(ImageView.ScaleType.valueOf(string));
            } catch (IllegalArgumentException unused) {
                Log.w(TAG, "Cannot recognize the scale type: ".concat(string));
            }
        }
    }

    @Override // androidx.autofill.inline.common.ViewStyle, androidx.autofill.inline.common.BundledStyle
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getStyleKey() {
        return KEY_IMAGE_VIEW_STYLE;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends ViewStyle.BaseBuilder<ImageViewStyle, Builder> {
        public Builder() {
            super(ImageViewStyle.KEY_IMAGE_VIEW_STYLE);
        }

        @Override // androidx.autofill.inline.common.BundledStyle.Builder
        @NonNull
        public ImageViewStyle build() {
            return new ImageViewStyle(this.mBundle);
        }

        @NonNull
        public Builder setMaxHeight(int i) {
            this.mBundle.putInt(ImageViewStyle.KEY_IMAGE_MAX_HEIGHT, i);
            return this;
        }

        @NonNull
        public Builder setMaxWidth(int i) {
            this.mBundle.putInt(ImageViewStyle.KEY_IMAGE_MAX_WIDTH, i);
            return this;
        }

        @NonNull
        public Builder setScaleType(@NonNull ImageView.ScaleType scaleType) {
            Preconditions.checkNotNull(scaleType, "scaleType should not be null");
            this.mBundle.putString(ImageViewStyle.KEY_IMAGE_SCALE_TYPE, scaleType.name());
            return this;
        }

        @NonNull
        public Builder setTintList(@NonNull ColorStateList colorStateList) {
            Preconditions.checkNotNull(colorStateList, "imageTintList should not be null");
            this.mBundle.putParcelable(ImageViewStyle.KEY_IMAGE_TINT_LIST, colorStateList);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.autofill.inline.common.ViewStyle.BaseBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder getThis() {
            return this;
        }
    }
}
