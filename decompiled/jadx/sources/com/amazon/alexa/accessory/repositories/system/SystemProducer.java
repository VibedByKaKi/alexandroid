package com.amazon.alexa.accessory.repositories.system;

import com.amazon.alexa.accessory.davs.DavsI18nConfig;
import com.amazon.alexa.accessory.internal.repositories.CompletableResult;
import com.amazon.alexa.accessory.internal.repositories.MaybeResult;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.System;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface SystemProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleConnectUser(String str, Producer.Result<Common.ErrorCode> result);

        void handleDavsLocaleTransfer(System.Locale locale, System.Wakewords wakewords, Producer.Result<Common.ErrorCode> result);

        void handleDavsWakewordsTransfer(System.Locale locale, System.Wakewords wakewords, Producer.Result<Common.ErrorCode> result);

        void handleDisconnectUser(String str, Producer.Result<Common.ErrorCode> result);

        void handleGetCurrentUser(Producer.Result<System.User> result);

        void handleGetI18nConfig(Producer.Result<MaybeResult.MaybeValue<DavsI18nConfig>> result);

        void handleGetUsers(Producer.Result<System.Users> result);

        void handleRemoveDevice(Producer.Result<Common.ErrorCode> result);

        void handleResetConnection(int i, boolean z, Producer.Result<Common.ErrorCode> result);

        void handleResetDevice(System.ResetDevice.ResetType resetType, Producer.Result<System.ResetDeviceResponse> result);

        void handleSendProfileInfo(String str, Producer.Result<CompletableResult.Value> result);

        void handleSetLocale(System.Locale locale, Producer.Result<Common.ErrorCode> result);

        void handleSetWakewords(System.Wakewords wakewords, Producer.Result<Common.ErrorCode> result);

        void handleSwitchUser(int i, Producer.Result<Common.ErrorCode> result);

        void handleUnpairUser(String str, Producer.Result<Common.ErrorCode> result);
    }
}
