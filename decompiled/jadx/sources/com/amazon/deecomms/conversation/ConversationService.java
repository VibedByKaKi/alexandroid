package com.amazon.deecomms.conversation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.calling.model.VoxCallInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ConversationService {
    void acceptCall(@NonNull String str);

    void beginCall(@NonNull VoxCallInfo voxCallInfo);

    void enableVideoStreamInVideoCall(@NonNull boolean z);

    void endActiveCallIfAny(@NonNull String str);

    void ensureInitialized();

    @Nullable
    CharSequence getProfileName();

    void initialize();

    boolean isUserProvisioned();

    void passDirectivePayload(@NonNull String str, @NonNull String str2, @NonNull String str3);
}
