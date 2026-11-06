package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class FileExistsException extends IOException {
    private static final long serialVersionUID = 1;

    public FileExistsException(File file) {
        super("File " + file + " exists");
    }

    public FileExistsException(String str) {
        super(str);
    }

    public FileExistsException() {
    }
}
