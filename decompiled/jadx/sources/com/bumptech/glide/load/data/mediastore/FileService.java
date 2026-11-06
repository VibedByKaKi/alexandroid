package com.bumptech.glide.load.data.mediastore;

import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class FileService {
    public boolean exists(File file) {
        return file.exists();
    }

    public File get(String str) {
        return new File(str);
    }

    public long length(File file) {
        return file.length();
    }
}
