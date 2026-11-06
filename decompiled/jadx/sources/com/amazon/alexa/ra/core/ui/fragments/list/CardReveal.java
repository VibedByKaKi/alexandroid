package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import com.amazon.alexa.ra.core.features.fragments.CardTranscriptState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\rJ\b\u0010#\u001a\u00020\rH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0007H\u0002J \u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/fragments/list/CardReveal;", "", "itemId", "", "screenKey", "transcriptState", "Landroidx/compose/runtime/State;", "Lcom/amazon/alexa/ra/core/features/fragments/CardTranscriptState;", "revealedAttempt", "Landroidx/compose/runtime/MutableIntState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableIntState;)V", "<set-?>", "", "coveredAttempt", "getCoveredAttempt", "()I", "setCoveredAttempt", "(I)V", "coveredAttempt$delegate", "Landroidx/compose/runtime/MutableIntState;", "isListHidden", "", "()Z", "pendingReveal", "Lcom/amazon/alexa/ra/core/ui/fragments/list/PendingCardReveal;", "getPendingReveal", "()Lcom/amazon/alexa/ra/core/ui/fragments/list/PendingCardReveal;", "ceilingAttempt", "getCeilingAttempt", "()Ljava/lang/Integer;", "holdSkeletonForReading", "", "reveal", "attempt", "readingAttempt", "ownAttempt", "state", "attemptIfOwn", "readItemId", "readScreenKey", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardReveal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardReveal.kt\ncom/amazon/alexa/ra/core/ui/fragments/list/CardReveal\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,422:1\n78#2:423\n111#2,2:424\n*S KotlinDebug\n*F\n+ 1 CardReveal.kt\ncom/amazon/alexa/ra/core/ui/fragments/list/CardReveal\n*L\n102#1:423\n102#1:424,2\n*E\n"})
/* loaded from: classes18.dex */
public final class CardReveal {
    public static final int $stable = 0;

    /* renamed from: coveredAttempt$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState coveredAttempt;

    @NotNull
    private final String itemId;

    @NotNull
    private final MutableIntState revealedAttempt;

    @NotNull
    private final String screenKey;

    @NotNull
    private final State<CardTranscriptState> transcriptState;

    /* JADX WARN: Multi-variable type inference failed */
    public CardReveal(@NotNull String str, @NotNull String str2, @NotNull State<? extends CardTranscriptState> state, @NotNull MutableIntState mutableIntState) {
        str.getClass();
        str2.getClass();
        state.getClass();
        mutableIntState.getClass();
        this.itemId = str;
        this.screenKey = str2;
        this.transcriptState = state;
        this.revealedAttempt = mutableIntState;
        this.coveredAttempt = SnapshotIntStateKt.mutableIntStateOf(0);
    }

    private final int attemptIfOwn(String readItemId, String readScreenKey, int attempt) {
        if (Intrinsics.areEqual(readItemId, this.itemId) && Intrinsics.areEqual(readScreenKey, this.screenKey)) {
            return attempt;
        }
        return 0;
    }

    private final int getCoveredAttempt() {
        return this.coveredAttempt.getIntValue();
    }

    private final int ownAttempt(CardTranscriptState state) {
        if (Intrinsics.areEqual(state, CardTranscriptState.None.INSTANCE)) {
            return 0;
        }
        if (state instanceof CardTranscriptState.Reading) {
            CardTranscriptState.Reading reading = (CardTranscriptState.Reading) state;
            return attemptIfOwn(reading.getItemId(), reading.getScreenKey(), reading.getAttempt());
        }
        if (state instanceof CardTranscriptState.Landed) {
            CardTranscriptState.Landed landed = (CardTranscriptState.Landed) state;
            return attemptIfOwn(landed.getItemId(), landed.getScreenKey(), landed.getAttempt());
        }
        if (state instanceof CardTranscriptState.Failed) {
            CardTranscriptState.Failed failed = (CardTranscriptState.Failed) state;
            return attemptIfOwn(failed.getItemId(), failed.getScreenKey(), failed.getAttempt());
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    private final int readingAttempt() {
        CardTranscriptState value = this.transcriptState.getValue();
        CardTranscriptState.Reading reading = value instanceof CardTranscriptState.Reading ? (CardTranscriptState.Reading) value : null;
        if (reading == null) {
            return 0;
        }
        return ownAttempt(reading);
    }

    private final void setCoveredAttempt(int i) {
        this.coveredAttempt.setIntValue(i);
    }

    @Nullable
    public final Integer getCeilingAttempt() {
        if (isListHidden()) {
            return Integer.valueOf(Math.max(ownAttempt(this.transcriptState.getValue()), this.revealedAttempt.getIntValue() + 1));
        }
        return null;
    }

    @Nullable
    public final PendingCardReveal getPendingReveal() {
        int ownAttempt;
        FragmentData landingRootFragment;
        CardTranscriptState value = this.transcriptState.getValue();
        String str = null;
        if ((value instanceof CardTranscriptState.Reading) || (ownAttempt = ownAttempt(value)) <= this.revealedAttempt.getIntValue()) {
            return null;
        }
        CardTranscriptState.Landed landed = value instanceof CardTranscriptState.Landed ? (CardTranscriptState.Landed) value : null;
        if (landed != null && (landingRootFragment = landed.getLandingRootFragment()) != null) {
            str = landingRootFragment.getUri();
        }
        return new PendingCardReveal(ownAttempt, str);
    }

    public final void holdSkeletonForReading() {
        int readingAttempt = readingAttempt();
        if (readingAttempt <= this.revealedAttempt.getIntValue()) {
            return;
        }
        setCoveredAttempt(readingAttempt);
    }

    public final boolean isListHidden() {
        int intValue = this.revealedAttempt.getIntValue();
        return intValue == 0 || Math.max(getCoveredAttempt(), readingAttempt()) > intValue;
    }

    public final void reveal(int attempt) {
        this.revealedAttempt.setIntValue(attempt);
    }
}
