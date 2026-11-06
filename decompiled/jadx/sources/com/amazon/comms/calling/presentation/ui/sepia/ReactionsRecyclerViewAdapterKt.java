package com.amazon.comms.calling.presentation.ui.sepia;

import androidx.recyclerview.widget.DiffUtil;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"diffCallBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "getDiffCallBack", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ReactionsRecyclerViewAdapterKt {

    @NotNull
    private static final DiffUtil.ItemCallback<SepiaIcon> diffCallBack = new DiffUtil.ItemCallback<SepiaIcon>() { // from class: com.amazon.comms.calling.presentation.ui.sepia.ReactionsRecyclerViewAdapterKt$diffCallBack$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(SepiaIcon oldSepiaIcon, SepiaIcon newSepiaIcon) {
            oldSepiaIcon.getClass();
            newSepiaIcon.getClass();
            return Intrinsics.areEqual(oldSepiaIcon, newSepiaIcon);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SepiaIcon oldSepiaIcon, SepiaIcon newSepiaIcon) {
            oldSepiaIcon.getClass();
            newSepiaIcon.getClass();
            return Intrinsics.areEqual(oldSepiaIcon.getId(), newSepiaIcon.getId());
        }
    };

    @NotNull
    public static final DiffUtil.ItemCallback<SepiaIcon> getDiffCallBack() {
        return diffCallBack;
    }
}
