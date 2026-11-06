package com.amazon.apl.android.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.amazon.apl.android.RootContext$$ExternalSyntheticLambda2;
import com.amazon.apl.android.RuntimeConfig;
import com.amazon.apl.android.utils.ConcurrencyUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class TypefaceResolver {
    private static final String DEFAULT_TYPEFACE_FONT_FAMILY = "sans-serif";
    private static final String TAG = "TypefaceResolver";
    Context mContext;
    private IFontResolver mEmbeddedFontResolver;
    private boolean mEnableEmbeddedFontResolver;
    private InitializationState mInitializationState = InitializationState.UNINITIALIZED;
    private Future<Boolean> mInitializeResolvers;
    private IFontResolver mRuntimeFontResolver;
    private static final TypefaceResolver sInstance = new TypefaceResolver();
    private static final Typeface DEFAULT_TYPEFACE = Typeface.SANS_SERIF;
    static final LruCache<FontKey, Typeface> FONT_CACHE = new LruCache<>(150);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class FontTypeFace {
        private final String fontFamily;
        private final Typeface typeface;

        public FontTypeFace(String str, Typeface typeface) {
            this.fontFamily = str;
            this.typeface = typeface;
        }

        public String getFontFamily() {
            return this.fontFamily;
        }

        public Typeface getTypeface() {
            return this.typeface;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum InitializationState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZED
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class InitializeResolvers implements Callable<Boolean> {
        private final boolean mShouldPreloadFonts;

        private InitializeResolvers(boolean z) {
            this.mShouldPreloadFonts = z;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            TypefaceResolver.this.mRuntimeFontResolver.initialize();
            if (this.mShouldPreloadFonts) {
                TypefaceResolver.this.preloadFonts();
            }
            TypefaceResolver.this.mInitializationState = InitializationState.INITIALIZED;
            return Boolean.TRUE;
        }
    }

    private TypefaceResolver() {
    }

    private ArrayList<FontKey> getCommonlyUsedFontKeys() {
        ArrayList<FontKey> arrayList = new ArrayList<>();
        String[] strArr = {"amazon-ember-display", "bookerly"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            for (int i2 = 100; i2 <= 900; i2 += 100) {
                arrayList.add(FontKey.build(str, i2).build());
                arrayList.add(FontKey.build(str, i2).italic(true).build());
            }
        }
        return arrayList;
    }

    private FontTypeFace getDefaultTypeface(boolean z, boolean z2) {
        return new FontTypeFace("sans-serif", Typeface.create(z ? null : DEFAULT_TYPEFACE, z2 ? 2 : 0));
    }

    private IFontResolver getEmbeddedResolver() {
        if (this.mEmbeddedFontResolver == null) {
            this.mEmbeddedFontResolver = new EmbeddedFontResolver(this.mContext);
        }
        return this.mEmbeddedFontResolver;
    }

    public static TypefaceResolver getInstance() {
        return sInstance;
    }

    private IFontResolver getRuntimeResolver() {
        return this.mRuntimeFontResolver;
    }

    @Nullable
    private Typeface getTypefaceFromFontFamily(FontKey fontKey, IFontResolver iFontResolver) {
        Typeface typeface = FONT_CACHE.get(fontKey);
        return typeface != null ? typeface : iFontResolver.findFont(fontKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$preloadFonts$0(FontKey fontKey) {
        getTypeface(new String[]{fontKey.getFamily()}, fontKey.getWeight(), fontKey.isItalic(), fontKey.getLanguage(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void preloadFonts() {
        Iterator<FontKey> it2 = getCommonlyUsedFontKeys().iterator();
        while (it2.hasNext()) {
            FontUtil.SEQUENTIAL_EXECUTOR.execute(new RootContext$$ExternalSyntheticLambda2(this, it2.next(), 4));
        }
    }

    public static void putTypeface(FontKey fontKey, Typeface typeface) {
        FONT_CACHE.put(fontKey, typeface);
    }

    private boolean waitUntilFontsAvailable() {
        try {
            return this.mInitializeResolvers.get(ConcurrencyUtils.SMALL_TIMEOUT_SECONDS, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e) {
            Log.e(TAG, "System fonts loading interrupted", e);
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e2) {
            Log.e(TAG, "System fonts failed to load", e2);
            return false;
        } catch (TimeoutException e3) {
            Log.wtf(TAG, String.format("System fonts failed to load with a %d timeout", Integer.valueOf(ConcurrencyUtils.SMALL_TIMEOUT_SECONDS)), e3);
            return false;
        }
    }

    @NonNull
    public FontTypeFace getFontTypeface(String[] strArr, int i, boolean z, String str, boolean z2) {
        Typeface typefaceFromFontFamily;
        if (!waitUntilFontsAvailable()) {
            return null;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = new String[]{"sans-serif"};
        }
        try {
            for (String str2 : strArr) {
                FontKey build = FontKey.build(str2, i).italic(z).language(str).build();
                LruCache<FontKey, Typeface> lruCache = FONT_CACHE;
                Typeface typeface = lruCache.get(build);
                if (typeface != null) {
                    return new FontTypeFace(str2, typeface);
                }
                if (FontUtil.isArabicFontKey(build) && this.mEnableEmbeddedFontResolver) {
                    typefaceFromFontFamily = getTypefaceFromFontFamily(build, getEmbeddedResolver());
                } else {
                    typefaceFromFontFamily = getTypefaceFromFontFamily(build, getRuntimeResolver());
                    if (typefaceFromFontFamily == null && this.mEnableEmbeddedFontResolver) {
                        typefaceFromFontFamily = getTypefaceFromFontFamily(build, getEmbeddedResolver());
                    }
                }
                if (typefaceFromFontFamily != null) {
                    lruCache.put(build, typefaceFromFontFamily);
                    return new FontTypeFace(str2, typefaceFromFontFamily);
                }
            }
            return getDefaultTypeface(z2, z);
        } catch (RuntimeException e) {
            Log.e(TAG, "FileFontKey file " + String.join(", ", strArr) + " not found on the device", e);
            return null;
        }
    }

    @NonNull
    public Typeface getTypeface(String[] strArr, int i, boolean z, String str, boolean z2) {
        FontTypeFace fontTypeface = getFontTypeface(strArr, i, z, str, z2);
        if (fontTypeface != null) {
            return fontTypeface.getTypeface();
        }
        return null;
    }

    public synchronized void initialize(Context context, RuntimeConfig runtimeConfig) {
        if (runtimeConfig.getFontResolver() == null) {
            return;
        }
        if (this.mInitializationState == InitializationState.UNINITIALIZED) {
            this.mInitializationState = InitializationState.INITIALIZING;
            this.mRuntimeFontResolver = runtimeConfig.getFontResolver();
            this.mContext = context;
            this.mEnableEmbeddedFontResolver = runtimeConfig.isEmbeddedFontResolverEnabled();
            this.mInitializeResolvers = FontUtil.SEQUENTIAL_EXECUTOR.submit(new InitializeResolvers(runtimeConfig.isPreloadingFontsEnabled()));
        }
    }

    @VisibleForTesting
    public void reset() {
        this.mInitializationState = InitializationState.UNINITIALIZED;
        FONT_CACHE.evictAll();
        FontUtil.SEQUENTIAL_EXECUTOR.clearTaskQueue();
    }
}
