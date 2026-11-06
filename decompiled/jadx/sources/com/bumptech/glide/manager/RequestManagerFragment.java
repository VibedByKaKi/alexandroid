package com.bumptech.glide.manager;

import android.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
public class RequestManagerFragment extends Fragment {
    @Nullable
    @Deprecated
    public RequestManager getRequestManager() {
        return null;
    }

    @NonNull
    @Deprecated
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return new RequestManagerTreeNode() { // from class: com.bumptech.glide.manager.RequestManagerFragment.1
            @Override // com.bumptech.glide.manager.RequestManagerTreeNode
            @NonNull
            public Set<RequestManager> getDescendants() {
                return Collections.EMPTY_SET;
            }
        };
    }

    @Deprecated
    public void setRequestManager(@Nullable RequestManager requestManager) {
    }
}
