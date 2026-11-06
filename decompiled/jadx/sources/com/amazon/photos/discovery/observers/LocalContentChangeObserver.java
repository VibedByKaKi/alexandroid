package com.amazon.photos.discovery.observers;

import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/photos/discovery/observers/LocalContentChangeObserver;", "", "onContentAdded", "", "contentType", "Lcom/amazon/photos/discovery/observers/LocalContentType;", ContactsModuleConstants.CONTACT_IDS, "", "", "onContentDedupeComplete", "wasContentDeduped", "", "onContentDeduped", "onContentDeleted", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LocalContentChangeObserver {
    void onContentAdded(@NotNull LocalContentType contentType, @NotNull List<Long> ids);

    void onContentDedupeComplete(boolean wasContentDeduped);

    void onContentDeduped(@NotNull List<Long> ids);

    void onContentDeleted(@NotNull LocalContentType contentType, @NotNull List<Long> ids);
}
