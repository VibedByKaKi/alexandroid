package com.amazon.alexa.assistant.transport.multipart;

import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.transport.multipart.util.AlexaMultipartStream;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/AlexaMultipartStreamBuilder;", "", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/assistant/transport/multipart/util/AlexaMultipartStream;", "inputStream", "Ljava/io/InputStream;", "boundary", "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlexaMultipartStreamBuilder {

    @NotNull
    private final Logger logger;

    public AlexaMultipartStreamBuilder(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    @NotNull
    public final AlexaMultipartStream build(@Nullable InputStream inputStream, @Nullable byte[] boundary) {
        return new AlexaMultipartStream(inputStream, boundary, this.logger);
    }
}
