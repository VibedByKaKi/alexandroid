package com.amazon.apl.android.providers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.ExtensionCommandDefinition;
import com.amazon.apl.android.ExtensionEventHandler;
import com.amazon.apl.android.ExtensionFilterDefinition;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import com.amazon.apl.android.dependencies.IExtensionImageFilterCallback;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IExtension {
    @Nullable
    default IExtensionEventCallback getCallback() {
        return null;
    }

    @NonNull
    default List<ExtensionCommandDefinition> getCommandDefinitions() {
        return Collections.EMPTY_LIST;
    }

    @Nullable
    default Object getEnvironment() {
        return null;
    }

    @NonNull
    default List<ExtensionEventHandler> getEventHandlers() {
        return Collections.EMPTY_LIST;
    }

    @Nullable
    default IExtensionImageFilterCallback getFilterCallback() {
        return null;
    }

    @NonNull
    default List<ExtensionFilterDefinition> getFilterDefinitions() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    String getUri();
}
