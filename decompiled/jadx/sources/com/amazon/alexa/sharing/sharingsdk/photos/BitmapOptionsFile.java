package com.amazon.alexa.sharing.sharingsdk.photos;

import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BitmapOptionsFile {

    @NonNull
    private File file;

    @NonNull
    private BitmapFactory.Options options;

    public BitmapOptionsFile(@NonNull BitmapFactory.Options options, @NonNull File file) {
        this.options = options;
        this.file = file;
    }

    @NonNull
    public File getFile() {
        return this.file;
    }

    @NonNull
    public BitmapFactory.Options getOptions() {
        return this.options;
    }

    public void setFile(@NonNull File file) {
        this.file = file;
    }

    public void setOptions(@NonNull BitmapFactory.Options options) {
        this.options = options;
    }
}
