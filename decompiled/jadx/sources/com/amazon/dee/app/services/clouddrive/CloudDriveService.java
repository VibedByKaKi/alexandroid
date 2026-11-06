package com.amazon.dee.app.services.clouddrive;

import android.net.Uri;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.dee.app.services.photos.PhotoService;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.client.utils.CacheControl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0010H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/clouddrive/CloudDriveService;", "Lcom/amazon/dee/app/services/photos/PhotoService;", "rootNodeId", "", "getRootNodeId", "()Ljava/lang/String;", "alexaFolderId", "getAlexaFolderId", "init", "", "initListener", "Lcom/amazon/dee/app/services/clouddrive/CloudDriveService$InitCompletedListener;", "uploadSingleFile", "sourceUri", "Landroid/net/Uri;", "uploadListener", "Lcom/amazon/dee/app/services/clouddrive/CloudDriveService$CloudDriveFileActionListener;", "removeSingleFile", "nodeID", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "InitCompletedListener", "CloudDriveFileActionListener", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CloudDriveService extends PhotoService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0014\u0010\u0007\u001a\u00020\u00032\n\u0010\b\u001a\u00060\tj\u0002`\nH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/clouddrive/CloudDriveService$CloudDriveFileActionListener;", "", "onSuccess", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "", "extra", "onError", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CloudDriveFileActionListener {
        void onError(@NotNull Exception exception);

        void onSuccess(@NotNull String nodeId, @Nullable String extra);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u00020\u00032\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/amazon/dee/app/services/clouddrive/CloudDriveService$InitCompletedListener;", "", "onSuccess", "", "onError", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InitCompletedListener {
        void onError(@NotNull Exception exception);

        void onSuccess();
    }

    @Nullable
    String getAlexaFolderId();

    @Nullable
    String getRootNodeId();

    void init(@NotNull InitCompletedListener initListener);

    void removeSingleFile(@NotNull String nodeID, @NotNull CloudDriveFileActionListener listener);

    void uploadSingleFile(@NotNull Uri sourceUri, @NotNull CloudDriveFileActionListener uploadListener);
}
