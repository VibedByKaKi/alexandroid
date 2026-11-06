package com.amazon.deecomms.sharing.photos;

import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel$$ExternalSyntheticOutline0;
import com.amazon.deecomms.nativemodules.imagepicker.util.Compression;
import com.amazon.deecomms.nativemodules.imagepicker.util.ExifExtractor;
import com.amazon.deecomms.sharing.exceptions.SharingSDKException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommonContentProperties {
    private String base64;
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
        public String base64 = null;

        public CommonContentProperties build() {
            if (this.base64 == null && this.path == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("Builder requires a path or data to be provided");
                return null;
            }
            CommonContentProperties commonContentProperties = new CommonContentProperties();
            commonContentProperties.setBase64(this.base64);
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
        public ImageBuilder setBase64(@Nullable String str) {
            this.base64 = str;
            return this;
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

    public static CommonContentProperties fromPath(@NonNull Uri uri, @NonNull Compression compression, @Nullable ReadableMap readableMap, @NonNull boolean z, @NonNull boolean z2) throws SharingSDKException, IOException {
        String uri2 = uri.toString();
        if (uri2.startsWith("http://") || uri2.startsWith("https://")) {
            throw new SharingSDKException("Cannot select remote files");
        }
        BitmapOptionsFile prepareOptionsForFileURI = uri2.startsWith("file://") ? compression.prepareOptionsForFileURI(uri) : compression.prepareOptionsForContentURI(uri);
        File file = prepareOptionsForFileURI.getFile();
        BitmapFactory.Options options = prepareOptionsForFileURI.getOptions();
        if (readableMap != null) {
            file = compression.compressImage(readableMap, uri2, options);
            uri2 = file.getPath();
            options = compression.validateImage(uri2);
        }
        long lastModified = file.lastModified();
        int orientationFromFile = compression.getOrientationFromFile(uri2);
        return new ImageBuilder().setPath(uri2).setMime(options.outMimeType).setModificationDate(String.valueOf(lastModified)).setOrientation(orientationFromFile).setSize((int) prepareOptionsForFileURI.getFile().length()).setWidth(options.outWidth).setHeight(options.outHeight).setExif(z ? compression.extractExifFromFile(uri2) : null).setBase64(z2 ? compression.getBase64StringFromFile(uri2) : null).build();
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
            if (this.orientation == commonContentProperties.orientation && this.size == commonContentProperties.size && this.width == commonContentProperties.width && this.height == commonContentProperties.height && Objects.equals(this.path, commonContentProperties.path) && Objects.equals(this.mime, commonContentProperties.mime) && Objects.equals(this.modificationDate, commonContentProperties.modificationDate) && Objects.equals(this.exif, commonContentProperties.exif) && Objects.equals(this.base64, commonContentProperties.base64)) {
                return true;
            }
        }
        return false;
    }

    public String getMimeType() {
        return this.mime;
    }

    public int hashCode() {
        return Objects.hash(this.path, this.mime, this.modificationDate, Integer.valueOf(this.orientation), Integer.valueOf(this.size), Integer.valueOf(this.width), Integer.valueOf(this.height), this.exif, this.base64);
    }

    public void setBase64(String str) {
        this.base64 = str;
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
        StringBuilder sb = new StringBuilder("CommonContentProperties{path='");
        sb.append(this.path);
        sb.append("', mime='");
        sb.append(this.mime);
        sb.append("', modificationDate='");
        sb.append(this.modificationDate);
        sb.append("', orientation=");
        sb.append(this.orientation);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", exif=");
        sb.append(this.exif);
        sb.append(", base64='");
        return InCallCommandModel$$ExternalSyntheticOutline0.m(sb, this.base64, "'}");
    }

    public WritableMap toWritableMap() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("path", "file://" + this.path);
        writableNativeMap.putInt("width", this.width);
        writableNativeMap.putInt("height", this.height);
        writableNativeMap.putString("mime", this.mime);
        writableNativeMap.putString("sourceURL", "file://" + this.path);
        writableNativeMap.putInt("size", (int) new File(this.path).length());
        writableNativeMap.putString("modificationDate", String.valueOf(this.modificationDate));
        writableNativeMap.putInt(ModelSourceWrapper.ORIENTATION, this.orientation);
        String str = this.base64;
        if (str != null) {
            writableNativeMap.putString("data", str);
        }
        HashMap<String, String> hashMap = this.exif;
        if (hashMap != null) {
            writableNativeMap.putMap("exif", ExifExtractor.exifHashMapToWritableMap(hashMap));
        }
        return writableNativeMap;
    }
}
