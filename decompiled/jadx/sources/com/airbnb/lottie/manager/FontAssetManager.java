package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FontAssetManager {
    private final AssetManager assetManager;

    @Nullable
    private FontAssetDelegate delegate;
    private final MutablePair<String> tempPair = new MutablePair<>();
    private final Map<MutablePair<String>, Typeface> fontMap = new HashMap();
    private final Map<String, Typeface> fontFamilies = new HashMap();
    private String defaultFontFileExtension = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
        if (callback instanceof View) {
            this.assetManager = ((View) callback).getContext().getAssets();
        } else {
            Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.assetManager = null;
        }
    }

    private Typeface getFontFamily(Font font) {
        Typeface typeface;
        String family = font.getFamily();
        Typeface typeface2 = this.fontFamilies.get(family);
        if (typeface2 != null) {
            return typeface2;
        }
        String style = font.getStyle();
        String name = font.getName();
        FontAssetDelegate fontAssetDelegate = this.delegate;
        if (fontAssetDelegate != null) {
            typeface = fontAssetDelegate.fetchFont(family, style, name);
            if (typeface == null) {
                typeface = this.delegate.fetchFont(family);
            }
        } else {
            typeface = null;
        }
        FontAssetDelegate fontAssetDelegate2 = this.delegate;
        if (fontAssetDelegate2 != null && typeface == null) {
            String fontPath = fontAssetDelegate2.getFontPath(family, style, name);
            if (fontPath == null) {
                fontPath = this.delegate.getFontPath(family);
            }
            if (fontPath != null) {
                typeface = Typeface.createFromAsset(this.assetManager, fontPath);
            }
        }
        if (font.getTypeface() != null) {
            return font.getTypeface();
        }
        if (typeface == null) {
            StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m("fonts/", family);
            m3869m.append(this.defaultFontFileExtension);
            typeface = Typeface.createFromAsset(this.assetManager, m3869m.toString());
        }
        this.fontFamilies.put(family, typeface);
        return typeface;
    }

    private Typeface typefaceForStyle(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface getTypeface(Font font) {
        this.tempPair.set(font.getFamily(), font.getStyle());
        Typeface typeface = this.fontMap.get(this.tempPair);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceForStyle = typefaceForStyle(getFontFamily(font), font.getStyle());
        this.fontMap.put(this.tempPair, typefaceForStyle);
        return typefaceForStyle;
    }

    public void setDefaultFontFileExtension(String str) {
        this.defaultFontFileExtension = str;
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
        this.delegate = fontAssetDelegate;
    }
}
