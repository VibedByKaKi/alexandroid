package com.amazon.clouddrive.auth;

import com.amazon.clouddrive.exceptions.CloudDriveException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface AuthenticatedURLConnectionFactory {
    HttpURLConnection createHttpURLConnection(URL url) throws IOException, CloudDriveException, InterruptedException;
}
