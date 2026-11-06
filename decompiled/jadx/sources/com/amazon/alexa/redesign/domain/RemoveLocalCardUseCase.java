package com.amazon.alexa.redesign.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.repository.LocalCardsRepository;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/domain/RemoveLocalCardUseCase;", "", "localCardsRepository", "Lcom/amazon/alexa/redesign/repository/LocalCardsRepository;", "<init>", "(Lcom/amazon/alexa/redesign/repository/LocalCardsRepository;)V", BulkOperationType.remove, "", "id", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class RemoveLocalCardUseCase {
    public static final int $stable = 8;

    @NotNull
    private final LocalCardsRepository localCardsRepository;

    public RemoveLocalCardUseCase(@NotNull LocalCardsRepository localCardsRepository) {
        localCardsRepository.getClass();
        this.localCardsRepository = localCardsRepository;
    }

    public final void remove(@NotNull String id) {
        id.getClass();
        this.localCardsRepository.removeLocalCard(id);
    }
}
