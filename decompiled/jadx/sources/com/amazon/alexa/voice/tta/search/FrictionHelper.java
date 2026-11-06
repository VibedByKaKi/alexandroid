package com.amazon.alexa.voice.tta.search;

import android.util.Log;
import com.amazon.alexa.api.TextResponse;
import com.amazon.alexa.api.TextResponseMetadata;
import com.amazon.alexa.simba.api.data.PromptData;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/voice/tta/search/FrictionHelper;", "", "<init>", "()V", "frictivePrompts", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getFrictivePrompts", "()Ljava/util/HashSet;", "setFrictivePrompts", "", "frictivePromptsList", "", "Lcom/amazon/alexa/simba/api/data/PromptData;", "isFrictive", "", "textResponse", "Lcom/amazon/alexa/api/TextResponse;", "Companion", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class FrictionHelper {

    @NotNull
    private static final String TAG = "FrictionHelper";

    @NotNull
    private final HashSet<String> frictivePrompts = new HashSet<>();

    @NotNull
    public final HashSet<String> getFrictivePrompts() {
        return this.frictivePrompts;
    }

    public final boolean isFrictive(@NotNull TextResponse textResponse) {
        textResponse.getClass();
        TextResponseMetadata metadata = textResponse.getMetadata();
        String promptId = metadata != null ? metadata.getPromptId() : null;
        TextResponseMetadata metadata2 = textResponse.getMetadata();
        String namespace = metadata2 != null ? metadata2.getNamespace() : null;
        return this.frictivePrompts.contains(namespace + "::" + promptId);
    }

    public final void setFrictivePrompts(@NotNull List<PromptData> frictivePromptsList) {
        frictivePromptsList.getClass();
        for (PromptData promptData : frictivePromptsList) {
            String promptId = promptData.getPromptId();
            String namespace = promptData.getNamespace();
            if (promptId.length() == 0 || namespace.length() == 0) {
                Log.e(TAG, "frictivePrompts API returned prompts with empty promptId OR namespace.");
            } else {
                this.frictivePrompts.add(namespace + "::" + promptId);
            }
        }
    }
}
