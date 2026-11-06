package com.amazon.clouddrive.internal;

import com.amazon.clouddrive.exceptions.CloudDriveException;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
interface ResponseReader<T> {
    T read(HttpURLConnection httpURLConnection) throws IOException, CloudDriveException;
}
