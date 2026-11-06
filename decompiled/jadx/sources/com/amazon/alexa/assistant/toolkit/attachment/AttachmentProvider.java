package com.amazon.alexa.assistant.toolkit.attachment;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/attachment/AttachmentProvider;", "", "getAttachment", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/amazon/alexa/assistant/toolkit/attachment/DirectiveAttachment;", CmcdConfiguration.KEY_CONTENT_ID, "", "attachmentChunks", "Lkotlinx/coroutines/flow/Flow;", "releaseAttachment", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AttachmentProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Flow<DirectiveAttachment> attachmentChunks(@NotNull AttachmentProvider attachmentProvider, @NotNull String str) {
            throw TableInfo$$ExternalSyntheticOutline0.m8108m(str, "attachmentChunks is not implemented by this AttachmentProvider");
        }

        public static void releaseAttachment(@NotNull AttachmentProvider attachmentProvider, @NotNull String str) {
            str.getClass();
        }
    }

    @NotNull
    Flow<DirectiveAttachment> attachmentChunks(@NotNull String cid);

    @NotNull
    CompletableDeferred<DirectiveAttachment> getAttachment(@NotNull String cid);

    void releaseAttachment(@NotNull String cid);
}
