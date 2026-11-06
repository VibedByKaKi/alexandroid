package com.amazon.clouddrive.cdasdk.prompto;

import androidx.annotation.NonNull;
import com.amazon.clouddrive.cdasdk.prompto.collections.GroupsCollectionsCalls;
import com.amazon.clouddrive.cdasdk.prompto.groups.PromptoGroupsCalls;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PromptoCalls {
    @NonNull
    GroupsCollectionsCalls getCollectionCalls();

    @NonNull
    PromptoGroupsCalls getGroupsCalls();
}
