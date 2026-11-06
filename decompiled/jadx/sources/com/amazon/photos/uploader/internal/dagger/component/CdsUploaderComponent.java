package com.amazon.photos.uploader.internal.dagger.component;

import com.amazon.photos.uploader.cds.CdsUploader;
import com.amazon.photos.uploader.cds.multipart.MultipartDatabaseModule;
import com.amazon.photos.uploader.cds.nodecache.NodeCacheDatabaseModule;
import com.amazon.photos.uploader.internal.dagger.PerAccount;
import com.amazon.photos.uploader.internal.dagger.module.CdsUploaderConfigurationModule;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {CdsUploaderConfigurationModule.class, MultipartDatabaseModule.class, NodeCacheDatabaseModule.class})
@PerAccount
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/amazon/photos/uploader/internal/dagger/component/CdsUploaderComponent;", "", "inject", "", "cdsUploader", "Lcom/amazon/photos/uploader/cds/CdsUploader;", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CdsUploaderComponent {
    void inject(@NotNull CdsUploader cdsUploader);
}
