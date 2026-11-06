package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ConversationMetadataState;", "", "<init>", "()V", "_title", "Landroidx/compose/runtime/MutableState;", "", "title", "Lkotlin/Function0;", "getTitle", "()Lkotlin/jvm/functions/Function0;", "_liveModeTitle", "liveModeTitle", "getLiveModeTitle", "_userFirstName", "userFirstName", "getUserFirstName", "setConversationTitle", "", "setLiveModeTitle", "setUserFirstName", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConversationMetadataState {
    public static final int $stable = 0;

    @NotNull
    private final Function0<MutableState<String>> liveModeTitle;

    @NotNull
    private final Function0<MutableState<String>> title;

    @NotNull
    private final Function0<MutableState<String>> userFirstName;

    @NotNull
    private final MutableState<String> _title = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    @NotNull
    private final MutableState<String> _liveModeTitle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    @NotNull
    private final MutableState<String> _userFirstName = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    public ConversationMetadataState() {
        final int i = 0;
        this.title = new Function0(this) { // from class: com.amazon.alexa.ra.core.data.model.ConversationMetadataState$$ExternalSyntheticLambda0
            public final /* synthetic */ ConversationMetadataState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                int i2 = i;
                ConversationMetadataState conversationMetadataState = this.f$0;
                switch (i2) {
                    case 0:
                        mutableState = conversationMetadataState._title;
                        return mutableState;
                    case 1:
                        mutableState2 = conversationMetadataState._liveModeTitle;
                        return mutableState2;
                    default:
                        mutableState3 = conversationMetadataState._userFirstName;
                        return mutableState3;
                }
            }
        };
        final int i2 = 1;
        this.liveModeTitle = new Function0(this) { // from class: com.amazon.alexa.ra.core.data.model.ConversationMetadataState$$ExternalSyntheticLambda0
            public final /* synthetic */ ConversationMetadataState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                int i22 = i2;
                ConversationMetadataState conversationMetadataState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = conversationMetadataState._title;
                        return mutableState;
                    case 1:
                        mutableState2 = conversationMetadataState._liveModeTitle;
                        return mutableState2;
                    default:
                        mutableState3 = conversationMetadataState._userFirstName;
                        return mutableState3;
                }
            }
        };
        final int i3 = 2;
        this.userFirstName = new Function0(this) { // from class: com.amazon.alexa.ra.core.data.model.ConversationMetadataState$$ExternalSyntheticLambda0
            public final /* synthetic */ ConversationMetadataState f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MutableState mutableState;
                MutableState mutableState2;
                MutableState mutableState3;
                int i22 = i3;
                ConversationMetadataState conversationMetadataState = this.f$0;
                switch (i22) {
                    case 0:
                        mutableState = conversationMetadataState._title;
                        return mutableState;
                    case 1:
                        mutableState2 = conversationMetadataState._liveModeTitle;
                        return mutableState2;
                    default:
                        mutableState3 = conversationMetadataState._userFirstName;
                        return mutableState3;
                }
            }
        };
    }

    @NotNull
    public final Function0<MutableState<String>> getLiveModeTitle() {
        return this.liveModeTitle;
    }

    @NotNull
    public final Function0<MutableState<String>> getTitle() {
        return this.title;
    }

    @NotNull
    public final Function0<MutableState<String>> getUserFirstName() {
        return this.userFirstName;
    }

    public final void setConversationTitle(@NotNull String title) {
        title.getClass();
        this._title.setValue(title);
    }

    public final void setLiveModeTitle(@NotNull String title) {
        title.getClass();
        this._liveModeTitle.setValue(title);
    }

    public final void setUserFirstName(@NotNull String userFirstName) {
        userFirstName.getClass();
        this._userFirstName.setValue(userFirstName);
    }
}
