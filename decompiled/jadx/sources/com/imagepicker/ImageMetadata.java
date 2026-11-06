package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class ImageMetadata extends Metadata {
    public ImageMetadata(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                String attribute = new ExifInterface(openInputStream).getAttribute(ExifInterface.TAG_DATETIME);
                if (attribute != null) {
                    this.datetime = getDateTimeInUTC(attribute, "yyyy:MM:dd HH:mm:ss");
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } finally {
            }
        } catch (Exception e) {
            Log.e("RNIP", "Could not load image metadata: " + e.getMessage());
        }
    }

    @Override // com.imagepicker.Metadata
    public String getDateTime() {
        return this.datetime;
    }

    @Override // com.imagepicker.Metadata
    public int getHeight() {
        return 0;
    }

    @Override // com.imagepicker.Metadata
    public int getWidth() {
        return 0;
    }
}
