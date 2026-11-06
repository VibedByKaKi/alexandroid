package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.enums.DisplayState;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IAPLController {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExecuteCommandsCallback {
        void onExecuteCommands(@Nullable Action action);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExtensionEventHandlerCallback {
        void onExtensionEventInvoked(@NonNull Action action);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InflationErrorCallback {
        void onError(Exception exc);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UpdateDataSourceCallback {
        void onDataSourceUpdate(boolean z);
    }

    void cancelExecution();

    void executeCommands(@NonNull String str, @Nullable ExecuteCommandsCallback executeCommandsCallback);

    default void executeOnCoreThread(Runnable runnable) {
        runnable.run();
    }

    void finishDocument();

    int getDocVersion();

    DocumentState getDocumentState();

    boolean hasSetting(String str);

    @Nullable
    @Deprecated
    Action invokeExtensionEventHandler(@NonNull String str, @NonNull String str2, Map<String, Object> map, boolean z) throws IllegalStateException;

    void invokeExtensionEventHandler(@NonNull String str, @NonNull String str2, Map<String, Object> map, boolean z, @Nullable ExtensionEventHandlerCallback extensionEventHandlerCallback);

    default boolean isFinished() {
        return false;
    }

    <K> K optSetting(String str, K k);

    void pauseDocument();

    void resumeDocument();

    void updateDataSource(@NonNull String str, @NonNull String str2, @Nullable UpdateDataSourceCallback updateDataSourceCallback);

    void updateDisplayState(DisplayState displayState);
}
