package com.amazon.alexa.redesign.utils.verifier;

import com.amazon.alexa.redesign.entity.CardModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/redesign/utils/verifier/ConditionCallback;", "", "isTrueWhen", "", "model", "Lcom/amazon/alexa/redesign/entity/CardModel;", "doThis", "", "onComplete", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface ConditionCallback {
    void doThis(@NotNull CardModel model);

    boolean isTrueWhen(@NotNull CardModel model);

    void onComplete();
}
