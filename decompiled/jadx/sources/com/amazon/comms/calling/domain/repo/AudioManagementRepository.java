package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.AudioRoutes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH&J\u001c\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\nH&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u001c\u0010\u0012\u001a\u00020\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\u0014H&J\b\u0010\u0016\u001a\u00020\u0005H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/AudioManagementRepository;", "", "toggleMicState", "", "toggleSpeaker", "", "setDefaultAudioRoute", "isVideoCall", "getAudioRoutes", "", "", "setAudioRoute", "audioRoute", "bluetoothDeviceName", "getActiveBluetoothDeviceName", "getCurrentRoute", "resetAudioStates", "isSpeakerOn", "subscribeAudioRouteChanged", "observer", "Lkotlin/Function1;", "Lcom/amazon/comms/calling/domain/model/AudioRoutes;", "removeAudioRouteChangeObservers", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AudioManagementRepository {
    @Nullable
    String getActiveBluetoothDeviceName();

    @NotNull
    Map<String, String> getAudioRoutes();

    @Nullable
    String getCurrentRoute();

    boolean isSpeakerOn();

    void removeAudioRouteChangeObservers();

    void resetAudioStates();

    void setAudioRoute(@Nullable String audioRoute, @Nullable String bluetoothDeviceName);

    void setDefaultAudioRoute(boolean isVideoCall);

    void subscribeAudioRouteChanged(@NotNull Function1<? super AudioRoutes, Unit> observer);

    boolean toggleMicState();

    void toggleSpeaker();
}
