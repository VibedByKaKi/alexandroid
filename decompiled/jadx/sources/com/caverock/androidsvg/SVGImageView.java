package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SVGImageView extends ImageView {
    private static Method setLayerTypeMethod;
    private RenderOptions renderOptions;
    private SVG svg;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LoadResourceTask extends AsyncTask<Integer, Integer, SVG> {
        private Context context;
        private int resourceId;

        public LoadResourceTask(Context context, int i) {
            this.context = context;
            this.resourceId = i;
        }

        @Override // android.os.AsyncTask
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.getFromResource(this.context, this.resourceId);
            } catch (SVGParseException e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.resourceId), e.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(SVG svg) {
            SVGImageView.this.svg = svg;
            SVGImageView.this.doRender();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LoadURITask extends AsyncTask<InputStream, Integer, SVG> {
        private LoadURITask() {
        }

        @Override // android.os.AsyncTask
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                try {
                    return SVG.getFromInputStream(inputStreamArr[0]);
                } catch (SVGParseException e) {
                    Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                    try {
                        inputStreamArr[0].close();
                        return null;
                    } catch (IOException unused) {
                        return null;
                    }
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(SVG svg) {
            SVGImageView.this.svg = svg;
            SVGImageView.this.doRender();
        }
    }

    static {
        try {
            setLayerTypeMethod = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.svg = null;
        this.renderOptions = new RenderOptions();
        init(attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRender() {
        SVG svg = this.svg;
        if (svg == null) {
            return;
        }
        Picture renderToPicture = svg.renderToPicture(this.renderOptions);
        setSoftwareLayerType();
        setImageDrawable(new PictureDrawable(renderToPicture));
    }

    private void init(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SVGImageView, i, 0);
        try {
            String string = obtainStyledAttributes.getString(R.styleable.SVGImageView_css);
            if (string != null) {
                this.renderOptions.css(string);
            }
            int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SVGImageView_svg, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                obtainStyledAttributes.recycle();
                return;
            }
            String string2 = obtainStyledAttributes.getString(R.styleable.SVGImageView_svg);
            if (string2 != null) {
                if (internalSetImageURI(Uri.parse(string2))) {
                    obtainStyledAttributes.recycle();
                    return;
                } else {
                    if (internalSetImageAsset(string2)) {
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    setFromString(string2);
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean internalSetImageAsset(String str) {
        try {
            new LoadURITask().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private boolean internalSetImageURI(Uri uri) {
        try {
            new LoadURITask().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    private void setFromString(String str) {
        try {
            this.svg = SVG.getFromString(str);
            doRender();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    private void setSoftwareLayerType() {
        if (setLayerTypeMethod == null) {
            return;
        }
        try {
            setLayerTypeMethod.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
        }
    }

    public void setCSS(String str) {
        this.renderOptions.css(str);
        doRender();
    }

    public void setImageAsset(String str) {
        if (internalSetImageAsset(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new LoadResourceTask(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (internalSetImageURI(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(SVG svg, String str) {
        if (svg == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null value passed to setSVG()");
            return;
        }
        this.svg = svg;
        this.renderOptions.css(str);
        doRender();
    }

    public SVGImageView(Context context) {
        super(context);
        this.svg = null;
        this.renderOptions = new RenderOptions();
    }

    public void setSVG(SVG svg) {
        if (svg != null) {
            this.svg = svg;
            doRender();
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Null value passed to setSVG()");
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.svg = null;
        this.renderOptions = new RenderOptions();
        init(attributeSet, i);
    }
}
