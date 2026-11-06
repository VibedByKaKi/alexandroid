package com.amazon.alexa.sharing.sharingsdk.photos;

import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.sharing.api.exceptions.AlexaSharingSDKException;
import com.amazon.alexa.sharing.media.picker.util.ImageUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class CommonContentProperties {
    private static final String FILE_PREFIX = "file://";
    private HashMap<String, String> exif;
    private int height;
    private String mime;
    private String modificationDate;
    private int orientation;
    private String path;
    private int size;
    private int width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImageBuilder {
        public String path = null;
        public String mime = null;
        public String modificationDate = null;
        public int orientation = -1;
        public int size = -1;
        public int width = -1;
        public int height = -1;
        public HashMap<String, String> exif = null;

        public CommonContentProperties build() {
            if (this.path == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Builder requires a path to be provided");
                return null;
            }
            CommonContentProperties commonContentProperties = new CommonContentProperties();
            commonContentProperties.setExif(this.exif);
            commonContentProperties.setHeight(this.height);
            commonContentProperties.setMime(this.mime);
            commonContentProperties.setModificationDate(this.modificationDate);
            commonContentProperties.setOrientation(this.orientation);
            commonContentProperties.setPath(this.path);
            commonContentProperties.setSize(this.size);
            commonContentProperties.setWidth(this.width);
            return commonContentProperties;
        }

        @NonNull
        public ImageBuilder setExif(@Nullable HashMap<String, String> hashMap) {
            this.exif = hashMap;
            return this;
        }

        @NonNull
        public ImageBuilder setHeight(int i) {
            this.height = i;
            return this;
        }

        @NonNull
        public ImageBuilder setMime(@NonNull String str) {
            this.mime = str;
            return this;
        }

        @NonNull
        public ImageBuilder setModificationDate(@NonNull String str) {
            this.modificationDate = str;
            return this;
        }

        @NonNull
        public ImageBuilder setOrientation(int i) {
            this.orientation = i;
            return this;
        }

        @NonNull
        public ImageBuilder setPath(@NonNull String str) {
            this.path = str;
            return this;
        }

        @NonNull
        public ImageBuilder setSize(int i) {
            this.size = i;
            return this;
        }

        @NonNull
        public ImageBuilder setWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public static CommonContentProperties fromPath(@NonNull Uri uri, @NonNull ImageUtil imageUtil, @NonNull boolean z) throws AlexaSharingSDKException, IOException {
        String uri2 = uri.toString();
        if (uri2.startsWith("http://") || uri2.startsWith("https://")) {
            throw new AlexaSharingSDKException("Cannot select remote files");
        }
        BitmapOptionsFile prepareOptionsForFileURI = uri2.startsWith(FILE_PREFIX) ? imageUtil.prepareOptionsForFileURI(uri) : imageUtil.prepareOptionsForContentURI(uri);
        File file = prepareOptionsForFileURI.getFile();
        BitmapFactory.Options options = prepareOptionsForFileURI.getOptions();
        long lastModified = file.lastModified();
        return new ImageBuilder().setPath(uri2).setMime(options.outMimeType).setModificationDate(String.valueOf(lastModified)).setOrientation(imageUtil.getOrientationFromFile(uri2)).setSize((int) file.length()).setWidth(options.outWidth).setHeight(options.outHeight).setExif(z ? imageUtil.extractExifFromFile(uri2) : null).build();
    }

    public static String getMediaTypeFromMimeType(@Nullable String str) {
        if (str != null) {
            return str.split("/")[0].toLowerCase();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("mimeType is null");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CommonContentProperties commonContentProperties = (CommonContentProperties) obj;
            if (this.orientation == commonContentProperties.orientation && this.size == commonContentProperties.size && this.width == commonContentProperties.width && this.height == commonContentProperties.height && Objects.equals(this.path, commonContentProperties.path) && Objects.equals(this.mime, commonContentProperties.mime) && Objects.equals(this.modificationDate, commonContentProperties.modificationDate) && Objects.equals(this.exif, commonContentProperties.exif)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<String, String> getExif() {
        return this.exif;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMimeType() {
        return this.mime;
    }

    public String getModificationDate() {
        return this.modificationDate;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public String getPath() {
        return this.path;
    }

    public int getSize() {
        return this.size;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.path, this.mime, this.modificationDate, Integer.valueOf(this.orientation), Integer.valueOf(this.size), Integer.valueOf(this.width), Integer.valueOf(this.height), this.exif);
    }

    public void setExif(HashMap<String, String> hashMap) {
        this.exif = hashMap;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setModificationDate(String str) {
        this.modificationDate = str;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "CommonContentProperties{path='" + this.path + "', mime='" + this.mime + "', modificationDate='" + this.modificationDate + "', orientation=" + this.orientation + ", size=" + this.size + ", width=" + this.width + ", height=" + this.height + ", exif=" + this.exif + AbstractJsonLexerKt.END_OBJ;
    }
}
