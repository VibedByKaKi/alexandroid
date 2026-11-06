package androidx.webkit.internal;

import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebStorageBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class WebStorageAdapter implements WebStorageBoundaryInterface {
    final WebStorageBoundaryInterface mImpl;

    public WebStorageAdapter(WebStorageBoundaryInterface webStorageBoundaryInterface) {
        this.mImpl = webStorageBoundaryInterface;
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public void deleteBrowsingData(Executor executor, Runnable runnable) {
        this.mImpl.deleteBrowsingData(executor, runnable);
    }

    @Override // org.chromium.support_lib_boundary.WebStorageBoundaryInterface
    public String deleteBrowsingDataForSite(String str, Executor executor, Runnable runnable) {
        return this.mImpl.deleteBrowsingDataForSite(str, executor, runnable);
    }
}
