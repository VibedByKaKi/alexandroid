package com.amazon.alexa.api.compat.model;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/ConversationUiApiV2;", "", "buildConversationComposable", "", "context", "Landroid/content/Context;", "config", "Lcom/amazon/alexa/api/compat/model/ConversationLaunchConfig;", "(Landroid/content/Context;Lcom/amazon/alexa/api/compat/model/ConversationLaunchConfig;Landroidx/compose/runtime/Composer;I)V", "navigateBack", "", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ConversationUiApiV2 {
    @Composable
    void buildConversationComposable(@NotNull Context context, @NotNull ConversationLaunchConfig conversationLaunchConfig, @Nullable Composer composer, int i);

    boolean navigateBack();
}
