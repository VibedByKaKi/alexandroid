package com.amazon.alexa.assistant.foundation.attentionsystem;

import com.amazon.alexa.assistant.foundation.attentionsystem.model.AttentionState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/attentionsystem/AttentionSystemDelegate;", "", "attentionStateDidChange", "", "attentionState", "Lcom/amazon/alexa/assistant/foundation/attentionsystem/model/AttentionState;", "inputSoundLevelDidChange", "inputSoundLevel", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AttentionSystemDelegate {
    void attentionStateDidChange(@NotNull AttentionState attentionState);

    void inputSoundLevelDidChange(double inputSoundLevel);
}
