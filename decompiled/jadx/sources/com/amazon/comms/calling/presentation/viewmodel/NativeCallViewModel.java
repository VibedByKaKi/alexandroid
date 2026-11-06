package com.amazon.comms.calling.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.amazon.comms.calling.domain.usecase.RecordPccMetricsUseCase;
import com.amazon.comms.calling.domain.usecase.pcc.AcceptNativeCallUseCase;
import com.amazon.comms.calling.domain.usecase.pcc.EndNativeCallUseCase;
import com.amazon.comms.calling.domain.usecase.pcc.MakeNativeCallUseCase;
import com.amazon.comms.calling.domain.usecase.pcc.SendNoCallPermissionUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/presentation/viewmodel/NativeCallViewModel;", "Landroidx/lifecycle/ViewModel;", "acceptNativeCallUseCase", "Lcom/amazon/comms/calling/domain/usecase/pcc/AcceptNativeCallUseCase;", "endNativeCallUseCase", "Lcom/amazon/comms/calling/domain/usecase/pcc/EndNativeCallUseCase;", "makeNativeCallUseCase", "Lcom/amazon/comms/calling/domain/usecase/pcc/MakeNativeCallUseCase;", "sendNoCallPermissionUseCase", "Lcom/amazon/comms/calling/domain/usecase/pcc/SendNoCallPermissionUseCase;", "recordPccMetricsUseCase", "Lcom/amazon/comms/calling/domain/usecase/RecordPccMetricsUseCase;", "<init>", "(Lcom/amazon/comms/calling/domain/usecase/pcc/AcceptNativeCallUseCase;Lcom/amazon/comms/calling/domain/usecase/pcc/EndNativeCallUseCase;Lcom/amazon/comms/calling/domain/usecase/pcc/MakeNativeCallUseCase;Lcom/amazon/comms/calling/domain/usecase/pcc/SendNoCallPermissionUseCase;Lcom/amazon/comms/calling/domain/usecase/RecordPccMetricsUseCase;)V", "onPermissionGranted", "", "action", "", "phoneNumber", "", "onShowPermissionRationaleMessage", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class NativeCallViewModel extends ViewModel {

    @NotNull
    private final AcceptNativeCallUseCase acceptNativeCallUseCase;

    @NotNull
    private final EndNativeCallUseCase endNativeCallUseCase;

    @NotNull
    private final MakeNativeCallUseCase makeNativeCallUseCase;

    @NotNull
    private final RecordPccMetricsUseCase recordPccMetricsUseCase;

    @NotNull
    private final SendNoCallPermissionUseCase sendNoCallPermissionUseCase;

    @Inject
    public NativeCallViewModel(@NotNull AcceptNativeCallUseCase acceptNativeCallUseCase, @NotNull EndNativeCallUseCase endNativeCallUseCase, @NotNull MakeNativeCallUseCase makeNativeCallUseCase, @NotNull SendNoCallPermissionUseCase sendNoCallPermissionUseCase, @NotNull RecordPccMetricsUseCase recordPccMetricsUseCase) {
        acceptNativeCallUseCase.getClass();
        endNativeCallUseCase.getClass();
        makeNativeCallUseCase.getClass();
        sendNoCallPermissionUseCase.getClass();
        recordPccMetricsUseCase.getClass();
        this.acceptNativeCallUseCase = acceptNativeCallUseCase;
        this.endNativeCallUseCase = endNativeCallUseCase;
        this.makeNativeCallUseCase = makeNativeCallUseCase;
        this.sendNoCallPermissionUseCase = sendNoCallPermissionUseCase;
        this.recordPccMetricsUseCase = recordPccMetricsUseCase;
    }

    public final void onPermissionGranted(int action, @Nullable String phoneNumber) {
        if (action == 1) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NativeCallViewModel$onPermissionGranted$1(phoneNumber, this, null), 3, null);
        } else if (action == 2) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NativeCallViewModel$onPermissionGranted$2(this, null), 3, null);
        } else {
            if (action != 3) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NativeCallViewModel$onPermissionGranted$3(this, null), 3, null);
        }
    }

    public final void onShowPermissionRationaleMessage() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NativeCallViewModel$onShowPermissionRationaleMessage$1(this, null), 3, null);
    }
}
