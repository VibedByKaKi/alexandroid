package com.caverock.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Log;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.media3.common.MimeTypes;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SimpleAssetResolver extends SVGExternalFileResolver {
    private static final String TAG = "SimpleAssetResolver";
    private static final Set<String> supportedFormats;
    private AssetManager assetManager;

    static {
        HashSet hashSet = new HashSet(8);
        supportedFormats = hashSet;
        hashSet.add("image/svg+xml");
        hashSet.add("image/jpeg");
        hashSet.add("image/png");
        hashSet.add("image/pjpeg");
        hashSet.add("image/gif");
        hashSet.add(MimeTypes.IMAGE_BMP);
        hashSet.add("image/x-windows-bmp");
        hashSet.add(MimeTypes.IMAGE_WEBP);
    }

    public SimpleAssetResolver(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    private String getAssetAsString(String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = this.assetManager.open(str);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            char[] cArr = new char[4096];
            StringBuilder sb = new StringBuilder();
            for (int read = inputStreamReader.read(cArr); read > 0; read = inputStreamReader.read(cArr)) {
                sb.append(cArr, 0, read);
            }
            String sb2 = sb.toString();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return sb2;
        } catch (IOException unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public boolean isFormatSupported(String str) {
        return supportedFormats.contains(str);
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public String resolveCSSStyleSheet(String str) {
        TableInfo$$ExternalSyntheticOutline0.m8110m("resolveCSSStyleSheet(", str, MarkdownConstants.RIGHT_PARENTHESIS, TAG);
        return getAssetAsString(str);
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Typeface resolveFont(String str, int i, String str2) {
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(i, "resolveFont(", str, ",", ",");
        m.append(str2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        Log.i(TAG, m.toString());
        try {
            try {
                return Typeface.createFromAsset(this.assetManager, str + ".ttf");
            } catch (RuntimeException unused) {
                return Typeface.createFromAsset(this.assetManager, str + ".otf");
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Bitmap resolveImage(String str) {
        TableInfo$$ExternalSyntheticOutline0.m8110m("resolveImage(", str, MarkdownConstants.RIGHT_PARENTHESIS, TAG);
        try {
            return BitmapFactory.decodeStream(this.assetManager.open(str));
        } catch (IOException unused) {
            return null;
        }
    }
}
