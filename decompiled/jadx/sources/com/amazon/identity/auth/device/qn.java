package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.DeviceDataStoreException;
import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class qn {

    /* renamed from: a, reason: collision with root package name */
    public final Context f904a;
    public final ContentResolver b;

    public qn(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        this.f904a = context;
        this.b = contentResolver;
    }

    public final Object a(Uri uri, m8 m8Var) {
        try {
            rn.a(this.f904a, uri);
            int i = 0;
            while (true) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                ContentProviderClient contentProviderClient = null;
                try {
                    contentProviderClient = this.b.acquireUnstableContentProviderClient(uri);
                    Object a2 = m8Var.a(contentProviderClient);
                    if (contentProviderClient != null) {
                        contentProviderClient.release();
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return a2;
                } catch (DeviceDataStoreException e) {
                    throw new RemoteMAPException(e);
                } catch (Exception e2) {
                    if (i >= 1) {
                        yf.a("SecureContentResolver", "Got exception querying " + uri + ". Failing after " + i + " retries.", e2, "ContentProviderFailure");
                        throw new RemoteMAPException(e2);
                    }
                    try {
                        yf.c("SecureContentResolver", "Got exception querying " + uri + ". Retrying." + e2.getMessage(), "ContentProviderRetry");
                        if (contentProviderClient != null) {
                            contentProviderClient.release();
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        if (i < 1) {
                            try {
                                Thread.sleep(10L);
                            } catch (InterruptedException e3) {
                                Log.e(yf.a("SecureContentResolver"), ErrorUtils$$ExternalSyntheticOutline0.m(uri, "Got an InterruptedException while retrying calling "), e3);
                                Thread.currentThread().interrupt();
                            }
                        }
                        i++;
                    } catch (Throwable th) {
                        if (contentProviderClient != null) {
                            contentProviderClient.release();
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            throw new RemoteMAPException(e4);
        }
    }
}
