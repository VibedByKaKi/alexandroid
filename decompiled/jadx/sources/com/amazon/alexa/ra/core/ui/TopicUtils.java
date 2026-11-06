package com.amazon.alexa.ra.core.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.model.Topic;
import com.dee.app.contacts.common.constants.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/TopicUtils;", "", "<init>", "()V", Constants.LOG_TAG, "", "logTopics", "", "topics", "", "Lcom/amazon/alexa/ra/core/data/model/Topic;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TopicUtils {
    public static final int $stable = 0;

    @NotNull
    public static final TopicUtils INSTANCE = new TopicUtils();

    @NotNull
    private static final String TAG = "TopicUtils";

    private TopicUtils() {
    }

    public final void logTopics(@NotNull List<Topic> topics) {
        topics.getClass();
        for (Topic topic : topics) {
            topic.getId();
            topic.getTitle();
            topic.getStartTime();
            topic.getImageURL();
        }
    }
}
